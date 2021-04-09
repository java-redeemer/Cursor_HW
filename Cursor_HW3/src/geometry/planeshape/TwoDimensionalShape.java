package geometry.planeshape;

public class TwoDimensionalShape {
   private double x;
   private double y;

    public TwoDimensionalShape (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(TwoDimensionalShape b) {
        return Math.sqrt(Math.pow(this.getX() - b.getX(), 2) + Math.pow(this.getY() - b.getY(), 2));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", (" + "x=" + x + ", y=" + y + ')';
    }
}
