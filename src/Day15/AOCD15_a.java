package src.Day15;

import java.awt.geom.Point2D;
import java.io.*;

public class AOCD15_a {
    public static playingFiled_15 field = new playingFiled_15();
    public static void readInput_15() throws IOException {
        File file = new File(
                "C:\\Users\\glasl\\IdeaProjects\\AdventOfCode22\\src\\Day15\\input"
        );
        BufferedReader br = new BufferedReader(new FileReader(file));
        for (String str = br.readLine(); str != null; str = br.readLine())
            parser(str);


        field.getDistance();
    }

    public static void parser(String str) {
        String sensorX = str.substring(12).split(":")[0].split(",")[0];
        String sensorY = str.substring(12).split(":")[0].split(",")[1].substring(3);
        String beaconX = str.split(":")[1].substring(24).split(",")[0];
        String beaconY = str.split(":")[1].substring(24).split(",")[1].substring(3);
        double bcX = Double.parseDouble(beaconX);
        double bcY = Double.parseDouble(beaconY);
        double ssX = Double.parseDouble(sensorX);
        double ssY = Double.parseDouble(sensorY);

        checkMaxValues(bcX, bcY);
        checkMaxValues(ssX, ssY);

        field.setBeacons(new Point2D.Double(bcX, bcY));
        field.setSensors(new Point2D.Double(ssX, ssY));
    }


    public static void checkMaxValues(double x, double y) {
        field.setMaxX(Math.max(field.maxX, x));
        field.setMinX(Math.min(field.minX, x));
        field.setMaxY(Math.max(field.maxY, y));
        field.setMinY(Math.min(field.minY, y));
    }
}
