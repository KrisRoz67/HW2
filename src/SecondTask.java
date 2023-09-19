import java.util.Scanner;

public class SecondTask {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    System.out.println("Please enter your weight:");
    double weight = convertStringToDouble(scanner.nextLine());
    System.out.println("Please enter your height:");
    double height = convertStringToDouble(scanner.nextLine());
    System.out.println("Your body mass ibdex is " + countBMI(height,weight) + ".");
  }

  public  static  double convertStringToDouble (String userInput){
        double parameter = 0.0;
      try {
          parameter = Double.parseDouble(userInput);
          if (parameter > 0.0 ){
              return parameter;
          }else {
              System.out.println("Your parameter could not be negative!");
              return convertStringToDouble(scanner.nextLine());
          }
      } catch (Exception e) {
          System.out.println("You have to enter only numbers and separated with dot!Please try again!");
          return  convertStringToDouble (scanner.nextLine());
      }
    }
    public  static  double countBMI(double height,double weight){
       double bmindex = weight / (height * height);
        return bmindex;
    }
}
