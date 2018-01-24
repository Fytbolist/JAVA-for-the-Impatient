import java.io.*;
import java.util.Scanner;
import static java.lang.Math.*;
import java.math.BigInteger;
public class Task8 {
    public static void main(String[] args) {
        int l;
        int n;
        System.out.print("Vvedite stroky: ");
        Scanner sc= new Scanner(System.in);
        String s= String.valueOf(sc.nextLine());
        l = 0;
        n = s.length();
        int x = 1;
        for( x=1 ; x<=n; x++)
        {
        for (int k = x ; n >=k; k++)
        {
            String substred= s.substring(l, k);
            System.out.println(substred);
            l++;

        }
        l=0;

        }
    }}
