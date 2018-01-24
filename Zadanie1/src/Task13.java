import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;
import java.math.BigInteger;
public class Task13 {

public static void main(String[] args) {
    int mas[];
    int pol[];
    mas = new int[49];
    pol = new int[6];
    int i = 0;

    for (i = 1;i<7;i++) {
        int rand = (int) Math.floor(Math.random() * mas.length);
        pol[i]=rand;
    }
    Arrays.sort(pol);
    System.out.println(pol[0]);
    System.out.println(pol[1]);
    System.out.println(pol[2]);
    System.out.println(pol[3]);
    System.out.println(pol[4]);
    System.out.println(pol[5]);

}}