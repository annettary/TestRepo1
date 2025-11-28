import java.util.Random;

public class randomProcessor {
    public static void main(String[] args) {
         Random random = new Random();
         int[] numbers = new int[10];

         for (int i = 0; i < numbers.length; i++) {
             numbers[i] = random.nextInt(100);
         }

         for (int n : numbers) {
             System.out.print(n + " ");
         }
         System.out.printLn();

         System.out.printLn("Even numbers:");
         for (int n : numbers) {
             if (isEven(n)) {
                 System.out.print(n + " ");
             }
         }
    }
}
   private static boolean isEven(int n) {
    return(n % 2 == 0);
   }
}