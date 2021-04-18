package server;

import middleware.Mediator;

import java.util.HashMap;
import java.util.Map;


public class Server {
    private Map<String, String> users = new HashMap<>();
    private Mediator mediator;

    public void setMediator (Mediator mediator) {
        this.mediator = mediator;
    }


    public boolean logIn(String email, String password) {
        if (mediator.check(email, password)) {
            System.out.println("Authorization have been successful!");
            return true;
        } else
            return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
