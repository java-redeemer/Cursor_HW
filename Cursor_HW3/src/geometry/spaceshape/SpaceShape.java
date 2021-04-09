package geometry.spaceshape;

import geometry.interfaces.AreaMeasurable;
import geometry.Shape;
import geometry.interfaces.VolumeMeasurable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    private final List<ThreeDimensionalShape> listVertices = new ArrayList<>();

    public SpaceShape(ThreeDimensionalShape... arrayVertices) {
        listVertices.addAll(Arrays.asList(arrayVertices));
    }

    public List<ThreeDimensionalShape> getArrayBetweenVertices () {
        return listVertices;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() +" vertex= "+ getArrayBetweenVertices () +"; volume= "+ getVolume()
                + "; area= " + getArea();
    }
}
