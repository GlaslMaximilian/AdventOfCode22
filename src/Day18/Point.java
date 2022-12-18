package src.Day18;

public class Point{
    final int x;
    final int y;
    final int z;

    int exposedSides;
    public Point(int x, int y, int z, int exposedSides) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.exposedSides = exposedSides;
    }

    public void setExposedSides(int expSides) {
        this.exposedSides = expSides;
    }

    public void subtractOne() {
        this.exposedSides -= 1;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", exposedSides=" + exposedSides +
                '}';
    }
}
