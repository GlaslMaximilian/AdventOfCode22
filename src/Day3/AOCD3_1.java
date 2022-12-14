package src.Day3;

import java.io.*;

public class AOCD3_1 {

    private final int LOWERCASE = 97;
    private final int UPPERCASE = 38;

    public static int readInput() throws IOException {
        int pts = 0;
        File file = new File(
                "C:\\Users\\glasl\\IdeaProjects\\AdventOfCode22\\src\\Day3\\test"
        );
        BufferedReader br = new BufferedReader(new FileReader(file));

        for (String str = br.readLine(); str != null; str = br.readLine()){
            int mid = str.length() / 2;
            pts += getPoints(str.substring(0, mid), str.substring(mid));
        }
        return pts;
    }

    private static int getPoints(String p1, String p2) {
        int count = 0;
        System.out.println(count);
        return 0;
    }
}
