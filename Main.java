import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? A");
        String name = scanner.nextLine();

        System.out.printf("Hey %s. How old are you? ", name);
        int age = scanner.nextInt();

        System.out.printf("%d is a nice age to start learnig programming.", age);
        scanner.close();





     }
}
