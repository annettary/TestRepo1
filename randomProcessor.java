import java.util.Random;

public class randomProcessor {
    public static void main(String[] args) {
         Random random = new Random();
         int[] numbers = new int[10];

         for (int i = 0; i < numbers.length; i++) {
             numbers[i] = random.nextInt(100);
         }
         System.out.printLn("Generated numbers");
         for (int n : numbers) {
             System.out.print(n + " ");
         }
         System.out.printLn();

         System.out.printLn("Even numbers:");
         for (int n : numbers) {
             if (n % 2 == 0) {
                 System.out.print(n + " ");
             }
         }
    }
}