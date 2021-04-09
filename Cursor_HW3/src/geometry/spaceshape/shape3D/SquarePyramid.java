package geometry.spaceshape.shape3D;

import geometry.spaceshape.SpaceShape;
import geometry.spaceshape.ThreeDimensionalShape;

public class SquarePyramid extends SpaceShape {
    private final double width;
    private final double height;

    public SquarePyramid(ThreeDimensionalShape vertex, double width, double height) {
        super(vertex);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * Math.sqrt(4 * Math.pow(height, 2) + Math.pow(width, 2)) + Math.pow(width, 2);
    }

    @Override
    public double getVolume() {
        return (Math.pow(width, 2) * height) / 3;
    }
}
