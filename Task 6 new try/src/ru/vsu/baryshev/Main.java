package ru.vsu.baryshev;

public class Main {

    public static void hiperbolicSin(int x, double e, int n) {

        final double EPS = 1E-9; // Т.к. каждый элемент стремится к 0, то с его помощью мы будем проверять, не стал ли el пренебрежимо мал

        double sum = 0; // сам sh
        double el = x; // элемент
        double sumOfMoreThenE = 0; // Сумма элементов больше чем e
        double sumOfMoreThenEseg10 = 0; // Аналогично с е/10
        double sumFrom1ToN = 0; // Сумма элементов от 1 до n
        int counter = 0; // Счетчик элементов, потребуется для суммы 1->n

        for (int j = 1; el > EPS; j += 2) {


            if (j == 1) {
                el = x;
            } else el = el * x * x / (j * (j - 1));

            sum = sum + el;
            counter++;

            if (counter <= n) sumFrom1ToN = sumFrom1ToN + el;
            if (Math.abs(el) > e) sumOfMoreThenE = sumOfMoreThenE + el;
            if (Math.abs(el) > e / 10) sumOfMoreThenEseg10 = sumOfMoreThenEseg10 + el;
        }

        System.out.println("sum = " + sum);
        System.out.println("sunOfMoreThenE = " + sumOfMoreThenE);
        System.out.println("sunOfMoreThenE/10 = " + sumOfMoreThenEseg10);
        System.out.println("sumFrom1ToN = " + sumFrom1ToN);
        System.out.println("sumFrom1ToN check = "+ Math.sinh(x));


    }


    public static void main(String[] args) {

        hiperbolicSin(7, 0.01, 5000);
    }
}
