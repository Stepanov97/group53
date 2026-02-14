package lesson2;

public class HomeworkL2 {
    public static void main(String[] args) {
        System.out.println("/Вы хотите разместить вклад в банке на сумму 1 миллион 200 тысяч рублей\n" +
                "//Срок вклада 1 год\n" +
                "//Вам предложено 2 варианта\n" +
                "//Вариант 1 - с ежемесячной капитализацией по ставке 22%\n" +
                "//Вариант 2 - с начислением процентов в конце срока по ставке 22,5%\n" +
                "//1) Определить, какая сумма у вас накопится к концу сроку вклада по обоим вариантам\n" +
                "//2) Выбрать наиболее выгодный\n" +
                "//3) Вывести результаты в консоль\n");

        double depositAmount = 1_200_000;
        System.out.println("Вариант 1 (с ежемесячной капитализацией по ставке 22%):");
        double calculationCoefficient = 0.22 / 12;
        double totalAmountOption1 = depositAmount;
        System.out.println("Начальная сумма: " + totalAmountOption1);
        for (int month = 1; month <= 12; month++) {
            totalAmountOption1 = totalAmountOption1 + (totalAmountOption1 * calculationCoefficient);
        }
        System.out.print("Итоговая сумма: ");
        System.out.printf("%.2f", totalAmountOption1);

        System.out.println("\nВариант 2 (с начислением процентов в конце срока по ставке 22,5%):");
        double totalAmountOption2 = depositAmount;
        System.out.println("Начальная сумма: " + totalAmountOption2);
        totalAmountOption2 = totalAmountOption2 + (totalAmountOption2 / 100 * 22.5);
        System.out.print("Итоговаая сумма: ");
        System.out.printf("%.2f", totalAmountOption2);

        System.out.println("\nИтоговое сравнение 2 вариантов хранения денег в банке: ");
        if (totalAmountOption1 == totalAmountOption2) {
            System.out.println("Вариант 1 и Вариант 2 одинаково выгодны!");
        } else if (totalAmountOption1 > totalAmountOption2) {
            System.out.println("Вариант 1 более выгодный!");
        } else System.out.println("Вариант 2 более выгодный!");

    }
}
