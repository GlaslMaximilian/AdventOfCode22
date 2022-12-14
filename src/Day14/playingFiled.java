package src.Day14;

import kotlin.Pair;

import java.util.ArrayList;

public class playingFiled {
    int minX = 1000000; // <-- Dummy value;
    int maxX;
    int maxY;
    int minY = 0;
    public ArrayList<Pair<Integer, Integer>> stones = new ArrayList<>();
    public ArrayList<Pair<Integer, Integer>> sand = new ArrayList<>();
    public void setStones(int fstX, int fstY, int sndX, int sndY) {
        if (fstX == sndX) {
            int distance = Math.abs(fstY - sndY);
            for (int i = 0; i <=  distance; i++) {
                Pair<Integer, Integer> tmp = new Pair<>(fstX, Math.min(fstY, sndY)+i);
                stones.add(tmp);
            }
        } else if (fstY == sndY) {
            int distance = Math.abs(fstX - sndX);
            for (int i = 0; i <= distance; i++){
                Pair<Integer, Integer> tmp = new Pair<>(Math.min(fstX, sndX)+i, fstY);
                stones.add(tmp);
            }
        }
    }

    @Override
    public String toString() {
        for (int y = minY; y <= maxY; y++) {
            System.out.print(y + "| ");
            for (int x = minX; x <= maxX; x++) {
                    if (check(x,y))
                        System.out.print("#");
                    else if (check(x,y, 0))
                        System.out.print("o");
                    else if (x == 500 && y == 0)
                        System.out.print("+");
                    else
                        System.out.print(".");
                }
            System.out.println();
            }
        return "";
    }

    public boolean check(int x, int y) {
        for (Pair<Integer, Integer> stone : stones)
            if (stone.getFirst() == x && stone.getSecond() == y)
                return true;
        return false;
    }

    public boolean check(int x, int y, int __obj) {
        for (Pair<Integer, Integer> e : sand)
            if (e.getFirst() == x && e.getSecond() == y)
                return true;
        return false;
    }

}
