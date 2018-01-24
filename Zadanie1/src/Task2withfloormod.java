import java.io.*;
import static java.lang.Math.*;
import java.awt.*;
import java.util.Scanner;
public class Task2withfloormod {
    public static void main(String[] args) {
        int b = 360;
        int c;
        System.out.print("Your angle: ");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
       System.out.println( Math.abs(Math.floorMod(age , b) ));
    }


}