package src.Day14;

import kotlin.Pair;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AOCD14_a {

    public static playingFiled field = new playingFiled();
    public static void readInput_14() throws IOException {
        File file = new File(
                "C:\\Users\\glasl\\IdeaProjects\\AdventOfCode22\\src\\Day14\\input.txt"
        );
        BufferedReader br = new BufferedReader(new FileReader(file));

        for (String str = br.readLine(); str != null; str = br.readLine()) {
            ArrayList<String> tmp = new ArrayList<String>(List.of(str.split(" -> ")));
            for (int i = 0; i < tmp.size()-1; i++)
                parser(tmp.get(i), tmp.get(i+1));
        }

        parser("0,171", "2000,171");

        field.stones
                .forEach( entry -> {
                    field.maxX = entry.getFirst()  > field.maxX ? entry.getFirst() : field.maxX;
                    field.maxY = entry.getSecond() > field.maxY ? entry.getSecond() : field.maxY;
                    field.minX = entry.getFirst()  < field.minX ? entry.getFirst() : field.minX;
                }
        );

    }

    private static void parser(String fst, String snd) {
        String[] fstKoo = fst.split(",");
        String[] sndKoo = snd.split(",");
        field.setStones(Integer.parseInt(fstKoo[0]), Integer.parseInt(fstKoo[1]), Integer.parseInt(sndKoo[0]), Integer.parseInt(sndKoo[1]));
    }


    public static void simulation() {
        int x = 500;
        int y = 1;
        boolean make = true;
        int[][] directions = {{0,1}, {-1,1}, {1,1}};
        int counter = 0;
        while (make) {
            //if (counter > 3_000_000) break;
            if (field.check(x, y+directions[0][1]) || field.check(x, y+directions[0][1], 0)) {
                if (field.check(x+directions[1][0], y+directions[1][1]) || field.check(x+directions[1][0], y+directions[1][1], 0)) {
                    if (field.check(x+directions[2][0], y+directions[2][1]) || field.check(x+directions[2][0], y+directions[2][1], 0)) {
                        field.sand.add(new Pair<>(x,y));
                        if (x == 500 && y == 1) break;
                        x = 500;
                        y = 1;
                    } else {y++; x++;}
                } else {y++; x--;}
            } else y++;
            counter++;
        }
        field.toString();
        System.out.println(field.sand.size());
    }
}
