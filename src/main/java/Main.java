
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1-dodawanie, 2-odejmowanie, 3-mnożenie, 4-dzielenie");
    int operation = scanner.nextInt();

    System.out.println("Podaj pierwszą liczbę");
    int a = scanner.nextInt();

    System.out.println("Podaj drugą liczbę");
    int b = scanner.nextInt();

    double result = 0;

    switch (operation) {
      case 1:
        result = a + b;
        break;
      case 2:
        result = a - b;
        break;
      case 3:
        result = a * b;
        break;
      case 4:
        if (b != 0)
          result = a / b;
        else
          System.out.println("Nie można dzielić przez zero");
        break;
      default:
        System.out.println("Nieprawidłowa operacja");
    }

    if (operation >= 1 && operation <= 4) {
      System.out.println("Wynik: " + result);
    }

    scanner.close();
  }
}