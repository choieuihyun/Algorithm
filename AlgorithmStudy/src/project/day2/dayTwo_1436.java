package project.dayTwo;

import java.util.Scanner;

public class dayTwo_1436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int count = 0;
        int answer = 0;

        int i = 666;
        while (count < number) {
            if (String.valueOf(i).contains("666"))
                count++;

            if (count == number)
                break;

            i++;
        }
        
        answer = i;
        System.out.println(answer);
    }
}
