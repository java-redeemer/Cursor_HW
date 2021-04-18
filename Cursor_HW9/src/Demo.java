import middleware.Mediator;
import middleware.PermissionChecker;
import middleware.RequestHandler;
import middleware.UserExistsChecker;
import server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");


        Mediator mediator = new RequestHandler (5);
        mediator.linkWith(new UserExistsChecker (server))
                .linkWith(new PermissionChecker ());

        server.setMediator (mediator);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}