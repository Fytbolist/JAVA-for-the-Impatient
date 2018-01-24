import java.io.*;
import java.util.Scanner;
import static java.lang.Math.*;
import java.math.BigInteger;
public class Task7 {
    public static void main(String[] args) {
        System.out.print("Vvedite pervoe chislo: ");
        Scanner sc= new Scanner(System.in);
        short a= (short) sc.nextInt();
        System.out.print("Vvedite vtoroe chislo: ");
        Scanner st= new Scanner(System.in);
        short b= (short) st.nextInt();
        short c = (short) (a + b);
        System.out.println(c);
        short d = (short) (a - b);
        System.out.println(d);
        short e = (short) (a / b);
        System.out.println(e);
        short l = (short) (a * b);
        System.out.println(e);
        short m = (short) (a % b);
        System.out.println(m);

}}
