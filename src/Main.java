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
        for (int i = 0; i < quantity;) {
            if (number % divider == 0) {
                System.out.print(number + " ");
                i++;
            }
            number++;
        }
        System.out.println();
    }

    private static void task2() {
        int number = 1;
        int divider = 2;
        int quantity = 10;
        for (int i = 0; i < quantity;) {
            if (number % divider != 0) {
                System.out.print(number + " ");
                i++;
            }
            number++;
        }
        System.out.println();
    }

    private static void task3() {
        int number = 90;
        int deductible = 5;
        while (number > 0) {
            System.out.print(number + " ");
            number -= deductible;
        }
        System.out.println();
    }

    private static void task4() {
        int number = 4;
        int multiplier = 2;
        int quantity = 10;
        for (int i = 0; i < quantity; i++) {
            System.out.print(number + " ");
            number *= multiplier;
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
        int firstHalf;
        int secondHalf;
        int elementFirst;
        int elementSecond;
        for (int i = 1; i < 1000000; i++) {
            firstHalf = i / 1000;
            secondHalf = i - firstHalf * 1000;
            elementFirst = firstHalf;
            elementSecond = secondHalf;
            int firstHalfSum = 0;
            int secondHalfSum = 0;
            while (elementFirst != 0) {
                firstHalfSum += elementFirst % 10;
                elementFirst /= 10;
            }
            while (elementSecond !=0) {
                secondHalfSum += elementSecond % 10;
                elementSecond /= 10;
            }
            if (firstHalfSum == secondHalfSum) {
                luckyTicketsCount++;
            }
        }
        System.out.println("Number of lucky tickets per roll " + luckyTicketsCount);
    }

}
