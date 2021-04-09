package geometry;

import geometry.planeshape.TwoDimensionalShape;
import geometry.planeshape.shape2D.Circle;
import geometry.planeshape.shape2D.Rectangle;
import geometry.planeshape.shape2D.Triangle;
import geometry.spaceshape.ThreeDimensionalShape;
import geometry.spaceshape.shape3D.Cuboid;
import geometry.spaceshape.shape3D.Sphere;
import geometry.spaceshape.shape3D.SquarePyramid;

import java.util.Arrays;

public class Results {


    public static void main(String[] args) {

        Shape triangle = new Triangle(new TwoDimensionalShape (0, 0), new TwoDimensionalShape (4, 0), new TwoDimensionalShape (2, 2));
        Shape circle = new Circle(new TwoDimensionalShape (0, 0), 4);
        Shape rectangle = new Rectangle(new TwoDimensionalShape (0, 0), 8, 4);
        Shape sphere = new Sphere(new ThreeDimensionalShape (0, 0, 0), 4);
        Shape cuboid = new Cuboid(new ThreeDimensionalShape (0, 0, 0), 8, 4, 2);
        Shape squarePyramid = new SquarePyramid(new ThreeDimensionalShape (2, 2, 3), 6, 4);

        Shape[] shapes = {triangle, circle, rectangle, sphere, cuboid, squarePyramid};
        Arrays.stream(shapes).forEach(System.out::println);
    }
}