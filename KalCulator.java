import java.util.Scanner;

public class KalCulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Simple kalCulator....");
        System.out.print("--------------------");

        System.out.print("Enter your first number: ");
        double num = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("Enter your second number: ");
        double num1 = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("Enter operation you want to perform: ");
        String operand = scanner.nextLine();

        switch (operand) {
            case "add":
            System.out.printf("%f + %f = %f", num, num1, num + num1);
             break;
            case "sub":
            System.out.printf("%f - %f = %f", num, num1, num - num1);
             break;
            case "mul":
             System.out.printf("%f * %f = %f", num, num1, num * num1);
             break;
             case "div":
            System.out.printf("%f / %f = %f", num, num1, num / num1);
                if (num1 == 0){
                    System.out.print("Divisor can not be zero");
                }else{
                    System.out.printf("%f / %f = %f", num, num1, num / num1);
                }
            break;
        
            default:
            System.out.printf("%s operation is not supported...Sorry!", operand);
             break;
        }



    

        scanner.close();

    
    }
    
}
