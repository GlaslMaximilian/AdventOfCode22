package src.Day2;

/*
* A = ROCK = X      Score: 1
* B = PAPER = Y     Score: 2
* C = SCISSORS = Z  Score: 3
*
* loss = 0, draw = 3, win = 6
* */

import java.io.*;


public class AOCD2_1_2 {
    public static int getPoints() throws IOException {
        int pts = 0;
        File file = new File(
                "C:\\Users\\glasl\\IdeaProjects\\AdventOfCode22\\src\\Day2\\input"
        );
        BufferedReader br = new BufferedReader(new FileReader(file));

        for (String str = br.readLine(); str != null; str = br.readLine())
            pts += determineGameOutcome_2(str.split(" ")[0], str.split(" ")[1]);

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

    /* Part 2
    *  A = ROCK       Score: 1     X = lose
    *  B = PAPER      Score: 2     Y = draw
    *  C = SCISSORS   Score: 3     Z = win
    *
    * */

    private static int determineGameOutcome_2(String p1, String p2) {
        int points = 0;
        switch (p1) {
            case "A":
                switch (p2) {
                    case "X" -> points = 3;
                    case "Y" -> points = 4;
                    case "Z" -> points = 8;
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
                    case "X" -> points = 2;
                    case "Y" -> points = 6;
                    case "Z" -> points = 7;
                }
                break;
        }
        return points;
    }
}