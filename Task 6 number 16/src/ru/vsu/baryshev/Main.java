package ru.vsu.baryshev;

public class Main {
    //public static
    public static long factorial(int i){
        long znam = 1;
        for (int n=1;n<=i; n++){
            znam = znam*n;
        }
        return znam;
    }
    public static double func(int x){
        final double EPS = 1E-6;
        double sum =x;
        double el =x;
        long znam = 1;

        double sunOfMoreThenE =0;
        if(el>EPS) {


            for (int j = 3; el > EPS; j = j + 2) {

                el = Math.pow(x, j) / factorial(j);
                System.out.println("el" + j + "numb" + el);
                if (el > EPS) {sum = sum + el;sunOfMoreThenE=sunOfMoreThenE+el;}
                System.out.println("sum" + sum);

            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("factorial of 3 ="+factorial(15));
        func(6);
    }
}
