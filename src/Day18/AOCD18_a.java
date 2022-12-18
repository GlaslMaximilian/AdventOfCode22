package src.Day18;

import java.io.*;

public class AOCD18_a {
    public static Grid g = new Grid();
    public static void getInput_18() throws IOException {
        File file = new File(
                "C:\\Users\\glasl\\IdeaProjects\\AdventOfCode22\\src\\Day18\\input"
        );
        BufferedReader br = new BufferedReader(new FileReader(file));

        for (String str = br.readLine(); str != null; str = br.readLine())
            parser(str);

        g.setSides();
        g.printPoints();
        System.out.println(g.getSides());
    }

    public static void parser(String str){
        String[] arr = str.split(",");
        g.addPoints(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
    }
}
