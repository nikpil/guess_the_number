import java.util.Random;
import java.util.Scanner;

public class Game
{
    private static int maxTryCount = 3; // максимальное кол-во попыток
    private static int tryCount;        // номер попытки

    public static void main(String[] args)
    {
        playGame();
        rePlayGame();
    }
    public static void playGame()
    {
        Random rand = new Random();                  //Генерируется случайное число от 0 до 9
        int hiddenNumber = rand.nextInt(10);  //и присваивается переменой hiddenNumber
        System.out.println("скрытое чило = " + hiddenNumber);
        for (tryCount = 2; tryCount <= maxTryCount; tryCount--)
        {
            System.out.println("Введите целое число от 0 до 9"); //Просим ввести в консоли число от 0 до 9,
            Scanner number = new Scanner(System.in);             //считываем его и
            int userNumb = number.nextInt();                     //присваеваем переменной userNumb
            System.out.println("введено число " + userNumb);

            if (userNumb == hiddenNumber) {
                System.out.println("число угадано!");
                break;
            } else if (userNumb < hiddenNumber) {
                System.out.println("введенное число, меньше загаданного");
                System.out.println("осталось попыток " + tryCount);
            } else {  //(userNumb > hiddenNumber)
                System.out.println("введенное число, больше загаданного");
                System.out.println("осталось попыток " + tryCount);
            }
            if (tryCount == 0) {
                System.out.println("вы проиграли");
                System.out.println();
                break;
            }
        }
    }
        public static void rePlayGame()
        {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner number = new Scanner(System.in);
            int userNumb = number.nextInt();
            System.out.println("начинаем игру заного");
            System.out.println();

            if (userNumb ==1)
            {
                main(null);  //вызаваю метод main, передачей в него аргумента.
            }
            else
            {
                System.out.println("игра закончена!");
            }
        }
}

