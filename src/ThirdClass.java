import java.util.Scanner;

public class ThirdClass {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter number of seconds to convert :");
        int seconds = convertStringToInteger(scanner.nextLine());
        System.out.println("================================");
        System.out.println("It is :" +convertSecondsToTime(seconds)); ;

    }

    public static int convertStringToInteger(String userInput) {
        try {
            int seconds = Integer.parseInt(userInput);
            return seconds;

        } catch (Exception e) {
            System.out.println("Please enter only whole numbers!");
            return convertStringToInteger(scanner.nextLine());
        }
    }
    public  static String convertSecondsToTime(int seconds){
        int hours =  seconds / 3600;
        int minutes = (seconds % 3600)/60;
        int sec = seconds % 60 ;
       return String.format("%s:%s:%2s", hours, minutes, sec);
    }
}

