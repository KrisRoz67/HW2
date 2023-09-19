import java.util.Scanner;

public class FirstTask {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please enter length of your rectangle:");
        double length = convertLineToString(scanner.nextLine());
        System.out.println("Please enter width of your rectangle:");
        double width = convertLineToString(scanner.nextLine());

    System.out.println("Let me count perimeter and area of your rectangle....");
    System.out.println("====================");
        countPerimeter(length,width);
        countArea(length,width);
    }

    public static double convertLineToString(String userInput) {
            double input = 0.0;
        try {
            input = Double.parseDouble(userInput);
        } catch (Exception e) {
            System.out.println("You have to enter only numbers and separated with dot!Please try again!");
            return convertLineToString(scanner.nextLine());
        }
            return input;
    }
    public static void countPerimeter(double length, double width){
        double perimeter = 2*(length+width);
        System.out.println("The perimeter of your rectangle equals: " + perimeter + ".");
    }
    public static void countArea(double length, double width){
        double area = length*width;
        System.out.println("The area of your rectangle equals: " + area + ".");
    }
}
