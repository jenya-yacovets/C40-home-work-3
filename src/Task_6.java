import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите целое число больше 3-х: ");

        int number = 0;

        while (number == 0) {
            if (!scanner.hasNextInt()) {
                System.out.println("Ты ввел не целое число :-( \nПовтори попытку:");
                scanner.next();
                continue;
            }

            number = scanner.nextInt();

            if (number <= 3) {
                System.out.println("Необходимо ввести число больше 3-х :-( \nПовтори попытку:");
                number = 0;
            }
        }

        int evenNumbers = 0;

        int[] mass = new int[number];
        int[] massEven;

        for (int i=0; i<mass.length; i++) {
            mass[i] = random.nextInt(number+1);

            if (mass[i] != 0 && mass[i] % 2 == 0) {
                evenNumbers++;
            }
        }

        System.out.println(Arrays.toString(mass));

        int nextIndex = 0;

        if (evenNumbers > 0) {
            massEven = new int[evenNumbers];

            for (int i=0; i<mass.length; i++) {
                if (mass[i] != 0 && mass[i] % 2 == 0) {
                    massEven[nextIndex] = mass[i];
                    nextIndex++;
                }
            }

            System.out.println(Arrays.toString(massEven));
        } else {
            System.out.println("В масиве нет четных чисел");
        }

        // Задание 7
        boolean unique = true;

        for (int i=0; i<mass.length; i++) {

            for (int c=0; c<mass.length; c++) {
                if (mass[i] == mass[c] && i != c) {
                    unique = false;
                    break;
                }
            }

            if (!unique) break;
        }

        if (unique) {
            System.out.println("В массиве все элементы уникальны");
        } else {
            System.out.println("В массиве не все элементы уникальны");
        }

        // Задание 8
        int maxNumber = mass[0];
        int maxNumberIndex = 0;

        for (int i=1; i<mass.length; i++) {
            if (mass[i] > maxNumber) {
                maxNumber = mass[i];
                maxNumberIndex = i;
            }
        }

        if (maxNumberIndex != 0) {
            mass[maxNumberIndex] = mass[0];
            mass[0] = maxNumber;
        }

        System.out.println(Arrays.toString(mass));

        // Задание 9
        int c = 3;
        int result = 0;
        int countNumber = 0;

        for (int i=0; i<mass.length; i++) {
            if (mass[i] > c) {
                result += mass[i];
                countNumber++;
            }
        }

        if (countNumber > 0) {
            System.out.println("Среднее арифмитическое: " + (result/countNumber));
        } else {
            System.out.println("Не возможно посчитать среднее арифмитическое");
        }

        // Задание 9
        int maxNumber2 = 0;

        for (int i=1; i<mass.length; i++) {
            if (mass[i] > maxNumber2 && mass[i] < mass[0]) {
                maxNumber2 = mass[i];
            }
        }

        System.out.println("Второй по велечине элемент в масиве: " + maxNumber2);
    }
}