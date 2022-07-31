public class Main {
    public static void main(String[] args) {

        //Задание 1

        int[] arr = generateRandomArray();
        int amountOfPayments = 0;
        for (int i = 0; i < arr.length; i++) {
            amountOfPayments += arr[i];
        }
        System.out.println("Сумма затрат за месяц составляет " + amountOfPayments + " рублей");

        //Задание 2

        int minAmount = arr[0];
        int maxAmount = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (minAmount > arr[j]) {
                minAmount = arr[j];
            } else if (maxAmount < arr[j]) {
                maxAmount = arr[j];
            }
        }
        System.out.println("Максимальная сумма за день составляет " + maxAmount + " рублей");
        System.out.println("Минимальная сумма за день составляет " + minAmount + " рублей");

        //Задание 3

        double averageAmount = amountOfPayments / arr.length;

        System.out.println("Средняя сумма трат за месяц составляет " + averageAmount + " рублей");

        //Задание 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int l = reverseFullName.length - 1; l >= 0; l--) {
            System.out.print(reverseFullName[l] + " ");
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}