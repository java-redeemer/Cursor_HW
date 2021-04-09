package geometry.planeshape.shape2D;

import geometry.interfaces.AreaMeasurable;
import geometry.interfaces.PerimeterMeasurable;
import geometry.planeshape.TwoDimensionalShape;
import geometry.planeshape.PlaneShape;

public class Circle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {

    private final double radius;

    public Circle(TwoDimensionalShape vertex, double radius) {
        super(vertex);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
