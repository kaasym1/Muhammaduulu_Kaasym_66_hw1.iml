import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      String myAge;
      final int NUM = 18;
      String word = "мой возраст";
      myAge = NUM + word;
      System.out.println(myAge);

      if (NUM < 0){
          System.out.println("вы сохранили отрицательное число");

      }else if (NUM > 0){
          System.out.println("вы сохранили положительное число");

      }else{
          System.out.println("вы сохранили ноль");
      }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();
        System.out.println(" Привет, " +  name +  "!");


      
    }
}
