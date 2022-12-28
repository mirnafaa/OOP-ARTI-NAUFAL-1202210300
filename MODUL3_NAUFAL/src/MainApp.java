import java.util.*;

public class MainApp{
    public static void main(String[] args) throws InterruptedException {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        Calculation calc = new Calculation();

        do {
            try {
System.out.println("=== Menu Program ==");
System.out.println("1. Square");
System.out.println("2. Circle");
System.out.println("3. Trapoized");
System.out.println("0. Exit");
System.out.print("Select menu : ");

int menu = input.nextInt();

                switch (menu) {
                    case 1:
                        System.out.print("Enter the length of the side of the square : ");
                        double side = input.nextDouble();
                        calc.setSquare(side);
                        calc.run();
                        System.out.println("\nThe calculation result : "+calc.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter the radius of the circle : ");
                        double r = input.nextDouble();
                        calc.setCircle(r);;;
                        calc.run();
                        System.out.println("\nThe calculation result : "+calc.getCircle());
                        break;
                    case 3:
                        System.out.print("Enter the side of the base of trapezoid : ");
                        double a = input.nextDouble();
                        System.out.println();

                        System.out.print("Enter the upperside of trapezoid : ");
                        double b = input.nextDouble();
                        System.out.println();

                        System.out.print("Enter the height trapezoid : ");
                        double t = input.nextDouble();
                        System.out.println();
                        calc.setTrapezoid(a, b, t);
                        calc.run();
                        System.out.println("\nThe calculation result : "+calc.getTrapezoid());
                    case 0:
                        System.out.println("Program Ended");
                        repeat = false;
                        break;
                    default:
                        System.out.println("Opsi tidak tersedia");
                        continue;
                }
            } 
            catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        } 
        while (repeat);
        input.close();
    }
}
