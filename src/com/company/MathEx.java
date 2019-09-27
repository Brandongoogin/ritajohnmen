package com.company;

public class MathEx {
    public static int swap(int x) {
        int y = x % 10;
        int a = x % 100 / 10;
        int b = x / 100;
        int c = b * 100 + y * 10 + a;

        return c;
    }

    public static void main(String[] args) {
        int z = swap(123);
        System.out.print(z);
       timeLeft(1, 15, 4, 36);
        }
     private static int timeLeft(int curHour, int curMin, int depHour, int depMin){
        int d = depHour * 60;
        d = d + depMin;
        int e = curHour * 60
        System.out.print(d + " hours ");
        System.out.println(e + " minutes ");


     }
    
}