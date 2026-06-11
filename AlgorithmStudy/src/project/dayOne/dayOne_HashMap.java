package project.dayOne;

import java.util.Scanner;
import java.util.*;

public class dayOne_HashMap {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Map<Integer, Integer> dayOne_HashMap = new HashMap<Integer, Integer>(); 

        for(int i = 0; i < n; i++) {
            int s = scanner.nextInt();
            dayOne_HashMap.put(s, dayOne_HashMap.getOrDefault(s, 0) + 1);
        }


        int m = scanner.nextInt();

        System.out.print(dayOne_HashMap.getOrDefault(m, 0));
    }
}
