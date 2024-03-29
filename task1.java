import java.util.Scanner;

public class task1 {
  public static void guessnumber() {
    Scanner in = new Scanner(System.in);
    int number = 1 + (int) (100 * Math.random());
    int trail = 5;
    int guess;
    System.out.println("a number is chosen by the system (between 1 and 100) and total guesses are 5. Good luck!");
    for (int i = 0; i < trail; i++) {
      System.out.println("guess the number");
      guess = in.nextInt();
      if (number == guess) {
        System.out.println("Congratulations! You have guessed the correct number.");
        break;
      }

      if (number > guess) {
        System.out.println("the guessed number is lower than the system number");
      }
      if (number < guess) {
        System.out.println("the guessed number is higher than the system number");
      }
      if (i == trail - 1) {
        System.out.println("you have exceeded the number of guesses");
        System.out.println("the number is " + number);
      }
    }
  }

  public static void main(String[] args) {
    guessnumber();
  }
}
