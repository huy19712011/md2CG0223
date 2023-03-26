package org.example;

public class Main {

    public static void main(String[] args) {
        int num, i;
        for (i = 0; i < 100; i++){
            if (check_pre(i) == true){
                System.out.println(i);
            }
        }
    }


    public static boolean check_pre(int number){
        int  i;
        if (number < 2){
            return false;
        } else {
            boolean check = true;
            i = 2;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                return true;
            } else {
                return false;
            }
        }
    }

    public static class Arrays {
    }
}