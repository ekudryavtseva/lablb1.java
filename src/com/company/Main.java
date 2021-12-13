package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Введите размерность массива.");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        float sum = 0;
        float t;
        float a[] = new float[n];
        System.out.println("Введите элементы массива.");
        for (int i = 0; i<n;i++){
            a[i]=scn.nextFloat();
        }
        System.out.println("Исходный массив и результат сглаживания:");
        for (int i = 0;i<n;i++){
            t = a[i];
            if (i!=0) a[i]=sum/i;
            else a[i]=0;
            sum+=t;
            System.out.println(t+"  "+a[i]);
        }
    }
}

