package geometry.spaceshape.shape3D;

import geometry.spaceshape.SpaceShape;
import geometry.spaceshape.ThreeDimensionalShape;

public class Cuboid extends SpaceShape {
    private final double width;
    private final double height;
    private final double depth;

    public Cuboid(ThreeDimensionalShape vertex, double width, double height, double depth) {
        super(vertex);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * (width * height) + 2 * (width * depth) + 2 * (height * depth);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }
}
