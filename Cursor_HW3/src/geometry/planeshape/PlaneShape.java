package geometry.planeshape;

import geometry.interfaces.AreaMeasurable;
import geometry.interfaces.PerimeterMeasurable;
import geometry.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {
    private final List<TwoDimensionalShape> listVertices= new ArrayList<>();

    public PlaneShape(TwoDimensionalShape... arrayVertices) {
        listVertices.addAll(Arrays.asList(arrayVertices));
    }

    public List<TwoDimensionalShape> getArrayBetweenVertices () {
        return listVertices;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() +" vertex= "+ getArrayBetweenVertices ().toString() +"; perimeter= "+ getPerimeter()
                + "; area= " + getArea();
    }
}
