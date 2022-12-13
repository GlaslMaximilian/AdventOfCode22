package src.Day2;

/*
* A = ROCK = X      Score: 1
* B = PAPER = Y     Score: 2
* C = SCISSORS = Z  Score: 3
*
* loss = 0, draw = 3, win = 6
* */

import java.io.*;


public class AOCD2_1 {
    public static int getPoints() throws IOException {
        int pts = 0;
        File file = new File(
                "C:\\Users\\glasl\\IdeaProjects\\AdventOfCode22\\src\\Day2\\input"
        );
        BufferedReader br = new BufferedReader(new FileReader(file));

        for (String str = br.readLine(); str != null; str = br.readLine())
            pts += determineGameOutcome(str.split(" ")[0], str.split(" ")[1]);

        return pts;
    }

    private static int determineGameOutcome(String p1, String p2) {
        int points = 0;
        switch (p1) {
            case "A":
                switch (p2) {
                    case "X" -> points = 4;
                    case "Y" -> points = 8;
                    case "Z" -> points = 3;
                }
                break;
            case "B":
                switch (p2) {
                    case "X" -> points = 1;
                    case "Y" -> points = 5;
                    case "Z" -> points = 9;
                }
                break;
            case "C":
                switch (p2) {
                    case "X" -> points = 7;
                    case "Y" -> points = 2;
                    case "Z" -> points = 6;
                }
                break;
        }
        return points;
    }
}