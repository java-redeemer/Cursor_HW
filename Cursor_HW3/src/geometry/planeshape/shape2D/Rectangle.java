package geometry.planeshape.shape2D;

import geometry.interfaces.AreaMeasurable;
import geometry.interfaces.PerimeterMeasurable;
import geometry.planeshape.TwoDimensionalShape;
import geometry.planeshape.PlaneShape;

public class Rectangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private final double width;
    private final double height;

    public Rectangle(TwoDimensionalShape vertex, double width, double height) {
        super(vertex);
        this.width = width;
        this.height = height;

    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
