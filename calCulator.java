import java.util.Scanner;

public class calCulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;

        System.out.println("Welcome to the Almighty calCulator.....");

        do {
            System.out.print("Enter your first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Please enter a number: ");
                scanner.next();        
               }
           num = scanner.nextDouble();
        } while (num <= 0);

        scanner.nextLine();
        double num1;
        do {
            System.out.print("Enter your first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Please enter a number: ");
                scanner.next();        
               }
           num1 = scanner.nextDouble();
        } while (num1 <= 0);

        scanner.nextLine();
        System.out.print("Enter operation you want to perform: ");
        String operand = scanner.nextLine();

        

        if(operand.equals("add")) {
            System.out.printf("%f + %f = %f", num, num1, num + num1);
        }else if(operand.equals("sub")){
            System.out.printf("%f - %f = %f", num, num1, num - num1);
        }else if(operand.equals("mul")){
            System.out.printf("%f * %f = %f", num, num1, num * num1);
        }else if(operand.equals("div")){
            if (num1 == 0){
                System.out.print("Divisor can not be zero");
            }else{
                System.out.printf("%f / %f = %f", num, num1, num / num1);
            }
        }else{
            System.out.printf("%s operation is not a supported...Sorry!", operand);
        }

        scanner.close();
    }
}
