import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Игра в кости");
        System.out.printf("Введите свое имя: ");
        Scanner scanerTwo = new Scanner(System.in);
        String speakTwo = scanerTwo.nextLine();
        System.out.printf("Введите имя вашего аппонента: ");
        Scanner scanerThree = new Scanner(System.in);
        String speakThree = scanerThree.nextLine();
        boolean protectThree = speakTwo.matches("^[A-ZА-ЯЁ]{1}[a-zа-яё]{2,}");
        boolean projectFour = speakThree.matches("^[A-ZА-ЯЁ]{1}[a-zа-яё]{2,}");
        int cubeOne = 6;
        int cubeTwo = 6;
        int cubeThree = 6;
        int cubeFour = 6;
        int cubeFive = 6;
        int cubeSix = 6;
        int youAccount = 0;
        int botAccount = 0;
        if (protectThree == true && projectFour == true) {
            while (0 == 0) {
                System.out.printf("Хотите ли вы подбросить кости? [Да или Нет]: ");
                Scanner scaner = new Scanner(System.in);
                String speak = scaner.nextLine();
                boolean protect = speak.matches("^[Да]{2}$");
                boolean protectTwo = speak.matches("^[Нет]{3}$");
                if (protect == true) {
                    System.out.println("Подбрасываем кости игрока " + speakTwo + "...");
                    Thread.sleep(3000);
                    int yourRandom_number = youAccount + (int) (Math.random() * cubeOne) + (int) (Math.random() * cubeTwo) + (int) (Math.random() * cubeThree) + (int) (Math.random() * cubeFour) + (int) (Math.random() * cubeFive) + (int) (Math.random() * cubeSix);
                    System.out.println("Кости игрока " + speakTwo + " показали число " + yourRandom_number);
                    System.out.println("Подбрасываем кости игрока " + speakThree + "...");
                    Thread.sleep(3000);
                    int botRandom_number = botAccount + (int) (Math.random() * cubeOne) + (int) (Math.random() * cubeTwo) + (int) (Math.random() * cubeThree) + (int) (Math.random() * cubeFour) + (int) (Math.random() * cubeFive) + (int) (Math.random() * cubeSix);
                    System.out.println("Кости игрока " + speakThree + " показали число " + botRandom_number);
                    if (yourRandom_number > botRandom_number) {
                        System.out.println(speakTwo + " выиграл");
                        break;
                    } else if (yourRandom_number < botRandom_number) {
                        System.out.println(speakThree + " выиграл");
                        break;
                    } else {
                        System.out.println("И у " + speakTwo + ", и у " + speakThree + " одинаковый счет");
                        System.out.println("Сейчас вам предложат сыграть по новой.");
                        continue;
                    }
                } else if (protectTwo == true) {
                    System.out.println("Аривидерчи!");
                    break;
                } else if (protect == false && protectTwo == false) {
                    System.out.println("Вы ввели недопустимую команду. Повторите попытку.");
                    continue;
                }
            }
        }
    }
}