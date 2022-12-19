package src.Day18;

import java.util.ArrayList;

public class Grid {
    public ArrayList<Point> points = new ArrayList<>();

    public void addPoints(int x, int y, int z) {
        this.points.add(new Point(x,y,z, 6));
    }

    public void addPoints(Point p) {
        this.points.add(p);
    }

    public void printPoints() {
        for (Point p : points) {
            System.out.println(p);
        }
    }

    public int getSides() {
        int sides = 0;
        for (Point p : points)
            sides += p.exposedSides;
        return sides;
    }

    public void setSides() {
        for (Point p1 : points) {
            for (Point p2 : points) {
                if (!p1.equals(p2)) {
                    if (p1.x + 1 == p2.x && p1.y == p2.y && p1.z == p2.z) {
                        p2.subtractOne(); p1.subtractOne();
                    }
                    if (p1.x == p2.x && p1.y + 1 == p2.y && p1.z == p2.z) {
                        p2.subtractOne(); p1.subtractOne();
                    }
                    if (p1.x == p2.x && p1.y == p2.y && p1.z + 1 == p2.z) {
                        p2.subtractOne(); p1.subtractOne();
                    }
                }
            }
        }
    }
}
