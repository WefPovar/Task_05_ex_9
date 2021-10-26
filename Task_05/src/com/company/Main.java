package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите НЕЧЁТНОЕ число >0 ");
            n=cs.nextInt();
        }
        while(n%2==0 | n<1);

        Picture(n);
    }
    static void Picture(int n){

        for(int i=0; i<n; i++)
            System.out.print("*");
        System.out.println();

        int nStr=(n-2)/2; // кол-во строк верхней (и нижней)части буквы Х
        int nSpace=n-4; //количество пробелов внутри в верхней строке
        for(int i=1; i<=nStr; i++){
            for(int j=0; j<i; j++)
                System.out.print(" "); //пробелы до
            System.out.print("*");
            for(int j=0; j<nSpace; j++)
                System.out.print(" "); // пробелы внутри
            System.out.println("*");
            nSpace-=2;
        }
        // средняя звёздочка
        for(int j=0; j<n/2; j++)
            System.out.print(" "); //пробелы до
        System.out.println("*");

        // обратно
        nSpace=1;
        for(int i=1; i<=nStr; i++){
            for(int j=0; j<nStr-i+1; j++)
                System.out.print(" "); //пробелы до
            System.out.print("*");
            for(int j=0; j<nSpace; j++)
                System.out.print(" "); // пробелы внутри
            System.out.println("*");
            nSpace+=2;
        }
        //последняя строка
        for(int i=0; i<n; i++)
            System.out.print("*");
        System.out.println();
    }
}
