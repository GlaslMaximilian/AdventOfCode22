package src.Day15;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class playingFiled_15 {
    public double minX;
    public double maxX;
    public double minY;
    public double maxY;
    ArrayList<Point2D> sensors = new ArrayList<>();
    ArrayList<Point2D> beacons = new ArrayList<>();
    ArrayList<Double> distances = new ArrayList<>();

    public playingFiled_15(){
        this.minX = 0;
        this.maxX = 0;
        this.minY = 0;
        this.maxY = 0;
    }

    public void setSensors(Point2D sensor) {
        this.sensors.add(sensor);
    }

    public void setBeacons(Point2D beacon) {
        this.beacons.add(beacon);
    }

    public void setDistances(double distance) {
        this.distances.add(distance);
    }

    public void setMaxY(double maxY) {
        this.maxY = maxY;
    }

    public void setMinY(double minY) {
        this.minY = minY;
    }

    public void setMinX(double minX) {
        this.minX = minX;
    }

    public void setMaxX(double maxX) {
        this.maxX = maxX;
    }

    public void getDistance() {
        for (int i = 0; i < sensors.size(); i++)
            setDistances(calculateDistance(sensors.get(i), beacons.get(i)));
    }

    private double calculateDistance(Point2D fst, Point2D snd) {
        return Math.abs(fst.getX() - snd.getX()) + Math.abs(fst.getY() - snd.getY());
    }
}
