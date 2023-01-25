public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        /*task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();*/
    }

    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 15_000;
        int total = 0;
        int mouth = 0;
            while (total < 2_459_000) {
            total += contribution;
            mouth++;
            System.out.println("Месяц " + mouth + ", сумма накоплений равна " + total + "рублей.");
            }
        }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10 ; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}