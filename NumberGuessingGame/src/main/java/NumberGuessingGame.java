import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public void main(String[] args) {
        Random r = new Random();
        int answer = r.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        boolean result = false;
        int min = 0;
        int max = 100;

        System.out.print("請輸入你想猜的數字（0~100）：");

        do {
            int userInput = scanner.nextInt();
            System.out.println("你輸入的數字為： " + userInput);
            if (userInput > answer) {
                max = userInput;
                System.out.print("太大了，再猜一次（" + min + "~" + max + "）：");
            }
            else if (userInput < answer) {
                min = userInput;
                System.out.print("太小了，再猜一次（" + min + "~" + max + "）：");
            } else {
                System.out.println("恭喜猜對，正確答案為：" + answer);
                result = true;
            }
        } while (!result);

        scanner.close();
    }
}