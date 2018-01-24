import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;
import static java.lang.Math.*;
import java.math.BigInteger;
public class Task9 {

    public static void main(String[] args) {
        System.out.print("Vvedite stroky: ");
        Scanner sc = new Scanner(System.in);
        String s = String.valueOf(sc.nextLine());
        String s1 = new String(s);
       // String s1 = s.toUpperCase();
        if (s.equals(s1)) {
            System.out.println("Stroki ravny");
        }
        if (s!=s1) {
            System.out.println("Stroki vse taki neravny");
        }
    }
}
