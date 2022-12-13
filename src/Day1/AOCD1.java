package src.Day1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/***
 * Day 1: Calorie Counting
 */
public class AOCD1 {
    // public static int maxCalories = 0;
    public static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public static int max = 0;
    public static void readInput() throws IOException {
        int tmp = 0;
        // Dummy values for map
        map.put(1, 0); map.put(2, 0); map.put(3, 0);

        File file = new File(
                "C:\\Users\\glasl\\IdeaProjects\\AdventOfCode22\\src\\Day1\\input"
        );

        BufferedReader br = new BufferedReader(new FileReader(file));

        for (String str = br.readLine(); str != null; str = br.readLine()) {
            if (str.isEmpty()) {
                if (map.get(1) < tmp) map.put(1, tmp);
                else if (map.get(2) < tmp) map.put(2, tmp);
                else if (map.get(3) < tmp) map.put(3, tmp);
                tmp = 0;
            } else tmp += Integer.parseInt(str);
        }

        // Add up values of map
        for (Map.Entry<Integer, Integer> me : map.entrySet())
            max += me.getValue();
    }
}

/*
 * FIXED!! --> Placed dummy value at the end of 'input' file
 * there's still a bug, cause the last elf is skipped.
 * Not relevant for this example but should be fixed ...
 *
 * atm: 68442 - 68218 - 66355
 * part 2 not working
 * */