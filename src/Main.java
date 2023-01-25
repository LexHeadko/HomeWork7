public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        //task8();
        //task9();
        //task10();
        //task11();
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
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int people = 12_000_000;
        int birth = 17;
        int death = 8;
        for (int i = 0; i < 10; i++) {
            people += (people / 1000 * (birth - death));
            System.out.println("Год " + (i + 1) + " численность населениясостовляет " + people + " человек.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int contribution = 15_000;
        int total = 12_000_000;
        int mouth = 0;
        while (contribution < total) {
            mouth++;
            contribution += contribution * 0.07;
            System.out.println("Месяц " + mouth + ", сумма накоплений равна " + contribution);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int contribution = 15_000;
        int total = 12_000_000;
        int mouth = 0;
        while (contribution < total) {
            mouth++;
            contribution += contribution * 0.07;
            if (mouth % 6 == 0) {
                System.out.println("Месяц " + mouth + ", сумма накоплений равна " + contribution);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 15_000;
        int allMouth = 12 * 9;
        int mouth = 0;
        while (mouth <= allMouth) {
            mouth++;
            contribution += contribution * 0.07;
            if (mouth % 6 == 0) {
                System.out.println("Месяц " + mouth + ", сумма накоплений равна " + contribution);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 6;
        while (friday < 32) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет!");
            friday += 7;
        }
    }
}
