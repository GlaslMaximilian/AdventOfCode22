package src.Day20;

import java.io.*;
import java.util.LinkedList;

public class AOCD20_a {
    static LinkedList<Integer> ints = new LinkedList<>();
    public static int indexOfZero;
    private static final int FST = 1000;
    private static final int SND = 2000;
    private static final int TRD = 3000;

    public static void InputReader_20() throws IOException {
        File file = new File(
        "C:\\Users\\glasl\\IdeaProjects\\AdventOfCode22\\src\\Day20\\test"
        );
        int counter = 0;
        BufferedReader br = new BufferedReader(new FileReader(file));

        for (String str = br.readLine(); str != null; str = br.readLine()) {
            ints.add(Integer.parseInt(str));
            if (str.equals("0"))
                indexOfZero = counter;
            else
                counter++;
        }
        System.out.println(mixing());
   }

   public static LinkedList<Integer> mixing() {
        LinkedList<Integer> ints_two = new LinkedList<>(ints);
        int counter = 0;
        int i = 0;
        boolean isITRD = true;
        while (isITRD) {
            if (counter == 2) break;
            if (i > ints.size()-1) i = 0;
            int toMove = ints.get(i);
            if (i+toMove>ints.size()-1) {
                int j = toMove - ((ints.size()-1)-i); // <-- new Dummy index;
                int toBeReplaced = ints_two.get(j);
                ints_two.set(j, toMove);
                ints_two.set(i, toBeReplaced);
            } else {
                int j = i+toMove;
                int toBeReplaced = ints_two.get(i+toMove);
                ints_two.set(j, toMove);
                ints_two.set(i, toBeReplaced);
            }
            i++;
            counter++;
        }
        return ints_two;
   }
}
