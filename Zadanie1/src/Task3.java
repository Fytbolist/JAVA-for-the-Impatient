import java.io.*;
import java.util.Scanner;
import static java.lang.Math.*;
public class Task3 {
    public static void main(String[] args) {

        System.out.print("Vvedite pervoye chislo: ");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.print("Vvedite vtoroye chislo: ");
        Scanner sl= new Scanner(System.in);
        int b= sc.nextInt();
        System.out.print("Vvedite tretye chislo: ");
        Scanner st= new Scanner(System.in);
        int c= sc.nextInt();
        sravn(5,6,7);

    }


    private static void sravn(int a, int b, int c) {
        if ((a > c) & (a > b)) {
            System.out.printf("Samoye bolshoe chislo %d \n ", a);
        }
        if ((b > c) & (b > a)) {
            System.out.printf("Samoye bolshoe chislo %d \n ", b);
        }
        if ((c > a) & (c > b)) {
            System.out.printf("Samoye bolshoe chislo %d \n ", c);
    }
}}
