public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    private static void task1() {
        int number = 1000;
        int divider = 4;
        int quantity = 5;
        int iter = 0;
        while (iter < quantity) {
            if (number % divider == 0) {
                System.out.print(number + " ");
                iter++;
            }
            number++;
        }
        System.out.println();
    }

    private static void task2() {
        int number = 1;
        int divider = 2;
        int quantity = 10;
        int iter = 0;
        while (iter < quantity) {
            if (number % divider != 0) {
                System.out.print(number + " ");
                iter++;
            }
            number++;
        }
        System.out.println();
    }

    private static void task3() {
        int number = 90;
        int divider = 5;
        while (number > 0) {
            if (number % divider == 0) {
                System.out.print(number + " ");
            }
            number--;
        }
        System.out.println();
    }

    private static void task4() {
        int number = 4;
        int multiplier = 2;
        int quantity = 10;
        int iter = 0;
        while (iter < quantity) {
            System.out.print(number + " ");
            number *= multiplier;
            iter++;
        }
        System.out.println();
    }

    private static void task5() {
        int monthDuration = 31;
        int weekend = 1;
        while (weekend <= monthDuration) {
            System.out.print(weekend + " " + ++weekend + " ");
            weekend += 6;
        }
        System.out.println();
    }

    private static void task6() {
        int luckyTicketsCount = 0;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int d1 = 0; d1 < 10; d1++) {
            for (int d2 = 0; d2 < 10; d2++) {
                for (int d3 = 0; d3 < 10; d3++) {
                    for (int d4 = 0; d4 < 10; d4++) {
                        for (int d5 = 0; d5 < 10; d5++) {
                            for (int d6 = 0; d6 < 10; d6++) {
                                firstHalfSum = d6 + d5 + d4;
                                secondHalfSum = d3 + d2 + d1;
                                if (firstHalfSum == secondHalfSum) {
                                    luckyTicketsCount++;
                                }
                            }
                        }
                    }
                }
            }
        }
        luckyTicketsCount--; //ignoring ticket number 000000
        System.out.println("Number of lucky tickets per roll " + luckyTicketsCount);
    }

}
