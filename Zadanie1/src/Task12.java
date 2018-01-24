import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;
import java.math.BigInteger;
public class Task12 {

public static void main(String[] args) {//с оператором break
    int [] arr = { 1, 1, 2, 1 };
    int i;
    for ( i = 0; i < arr.length; ++i )
        if ( ( arr[i] & 1 ) == 0 )
            break;
    System.out.println((( i == arr.length ) ? "Have" : "No") + " even elements.");

    int [] arr1 = { 1, 1, 2, 1 }; //без него
    int i1;
    boolean flag = true;
    for(i1=0; i1<arr1.length && flag; i1++)
        if ( ( arr1[i1] & 1 ) == 0 )
            flag = false;
    System.out.println((( i1 == arr.length ) ? "Have" : "No") + " even elements.");
}}