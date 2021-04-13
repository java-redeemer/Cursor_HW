package geometry.planeshape.shape2D;

import geometry.interfaces.AreaMeasurable;
import geometry.interfaces.PerimeterMeasurable;
import geometry.planeshape.PlaneShape;
import geometry.planeshape.TwoDimensionalShape;

public class Triangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private final double bottomSide;
    private final double leftSide;
    private final double rightSide;

    public Triangle(TwoDimensionalShape firstVertex, TwoDimensionalShape secondVertex, TwoDimensionalShape thirdVertex) {
        super(firstVertex, secondVertex, thirdVertex);

        bottomSide = firstVertex.getDistance (secondVertex);
        leftSide = secondVertex.getDistance (thirdVertex);
        rightSide = thirdVertex.getDistance (firstVertex);
    }

    @Override
    public double getArea() {
        return Math.sqrt(getPerimeter() / 2 * (getPerimeter() / 2 - bottomSide) * (getPerimeter() / 2 - leftSide)
                * (getPerimeter() / 2 - rightSide));
    }

    @Override
    public double getPerimeter() {
        return bottomSide + leftSide + rightSide;
    }
}