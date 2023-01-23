public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i < 11; i++) {
            System.out.println("Итерация цикла " + i);
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

    }

    public static void task3() {
        System.out.println("Задача 3");

        for (int i = 0; i < 18; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i += 4) {
            System.out.println(i + " god iavliaetsia visokostnim");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i < 99; i += 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i < 513; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salary = 29_000;
        int total = 0;
        for (int i = 0; i < 13; i++) {
            total = total + salary;
            System.out.println("Month " + i + " salary in bank equally " + total);
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int salary = 29_000;
        int total = 0;
        for (int i = 0; i < 13; i++) {
            total = total / 100 + total;
            total = total + salary;
            System.out.println("Month " + i + " salary in bank equally " + total);
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        int two = 2;
        for (int i = 1; i < 11; i++) {
            int two1 = two * i;
            System.out.println(two + "*" + i + "=" + two * i);
        }
    }

    public static void task11() {
        System.out.println("Задача 11");
        int salary = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + salary;
            System.out.println("Month " + i + " salary in bank equally " + total);
        }

    }

    public static void task12() {
        System.out.println("Задача 12");
        int i = 0;
        int b = 10;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task13() {
        System.out.println("Задача 13");
        int populationCountryY = 12_000_000;
        for (int i = 1; i < 11; i++) {
            int fertility = (populationCountryY / 1000) * 17;
            int mortality = (populationCountryY / 1000) * 8;
            populationCountryY = populationCountryY + (fertility - mortality);
            System.out.println("Год " + i + " , численность населения составляет " + populationCountryY);
        }
    }

    public static void task14() {
        System.out.println("Задача 14");
        int salary = 15_000;
        int total = 15000;
        int i = 1;
        for (; total < 12_600_001; total += (total + salary) / 100 * 7) {
            i++;
            System.out.println("Month " + i + " salary in bank equally " + total);

        }
    }

    public static void task15() {
        System.out.println("Задача 15");
        int salary = 15_000;
        int total = 15000;
        int i = 1;
        for (; total < 12_600_001; total += (total + salary) / 100 * 7) {
            i++;
            if (i % 6 == 0) {
                System.out.println("Month " + i + " salary in bank equally " + total);
            }

        }
    }

    public static void task16() {
        System.out.println("Задача 16");
        int salary = 15_000;
        int total = 15000;
        int i = 1;
        for (; i < 109; total += (total + salary) / 100 * 7) {
            i++;
            if (i % 6 == 0) {
                System.out.println("Month " + i + " salary in bank equally " + total);
            }

        }
    }

    public static void task17() {
        System.out.println("Задача 17");
        int friday = 5;
        for (int day = 1; day < 32; day++) {
            if ((day + 2) % 7 == 0) {
                System.out.println("Today " + day + " day friday. Have to make report.");
            }
        }
    }

    public static void task18() {
        System.out.println("Задача 18");
        var year1 = 1823;
        var yearEnd = 2123;
        for (var y = 79; y < yearEnd; y++) {
            if (y % 79 == 0 && y > year1) {
                System.out.println(y);
            }
        }
    }
}





