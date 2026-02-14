package lesson3;

public class HomeworkL3 {
    public static void main(String[] args) {
        System.out.println("Задача 10");
        int[] numbers = new int[29];
        for (int i = 0; i < 29; i++) {
            numbers[i] = i + 1;
        }
        System.out.println("Есть массив чисел от 1 до 30: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nВывести в консоль все четные числа кроме 6,10,14. После 23 остановить вывод");
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            if (value == 23) {
                System.out.println("Достигнуто целевое число !");
                break;
            }
            if (value % 2 == 0) {
                if (value == 6 || value == 10 || value == 14) {
                    continue;
                }
                System.out.print(value + " ");
            }

        }
        System.out.println("\nЗадача 2");
        System.out.println("Есть предложение, которое нужно вывести наоборот: ");
        String phrase = "Я Java разработчик";
        System.out.println(phrase);
        char[] charPhrase = phrase.toCharArray();
        for (int i = 0; i < charPhrase.length / 2; i++) {
            char temporary = charPhrase[i];
            charPhrase[i] = charPhrase[charPhrase.length - i - 1];
            charPhrase[charPhrase.length - i - 1] = temporary;
        }
        String newPhrase = new String(charPhrase);
        System.out.println("Предложение наоборот: ");
        System.out.println(newPhrase);
    }
}
