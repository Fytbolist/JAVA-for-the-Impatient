import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;
import java.math.BigInteger;
public class Task15 {

    public static void main(String[] args) {
        triangle (5);}


    private static void triangle(int a) {
        int LINES = 0;
        System.out.println("Enter number of lines for Pascal Triangle:");
        Scanner reader = new Scanner(System.in);
        LINES = reader.nextInt();// здесь вверху только ввод, считали это ЛАЙНС количество строк
        reader.close();
        int [][] p = new int [LINES][];// обьявляем массив двумерный
        p[0] = new int [1];// обьявляем что в первой строке у нас всегда один элемент
        p[1] = new int [2];//обьявляем что во второй строке у нас всегда 2 элемента
        p[1][0] = p[1][1] = 1;//говорим что во второй строке у нас всегда будет 1 и 1 числа
        System.out.println(p[0][0] = 1);// говорим что первый элемент первой строки всегда 1 и пишем его
        System.out.println(p[1][0] + " " + p[1][1]);//пишем вторую строку
        for (int i = 2; i < LINES; i++)//делаем цикл для последующих строк со 2-й по ЛАЙНС
        {
            p[i] = new int [i+1];//добавляем количество элементов в нашей строке то есть например на 3 строке у нас должно быть 3 элемента
            System.out.print((p[i][0] = 1) + " ");//на 3 строке заполняем первый элемент - он всегда "1"
            for (int j = 1; j < i; j++)
            {
                System.out.print((p[i][j] = p[i-1][j-1] + p[i-1][j]) + " ");//этим циклом заполняем внутренность, то есть
                // например на место [3, 1] = [2,0]+[2,1] элемент  = 1+1 = 2 и так далее
            }
            System.out.println( p[i][i]=1);//заполняем последний элемент он всегда "1"
        }
    }
    }




