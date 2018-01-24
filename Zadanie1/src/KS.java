import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;
import java.math.BigInteger;
public class KS {
    public static void main(String[] args) {
        System.out.print("Vvedite chislo: ");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();

        int OUTPUT_STRING_LENGTH = a;
        StringBuilder sbRandomString = new StringBuilder(OUTPUT_STRING_LENGTH);
        for(int i = 0 ; i < OUTPUT_STRING_LENGTH; i++){
            Random generator = new Random();
            long b = generator.nextLong();
            String str3 = Long.toString(abs(b), 36);
            String s1 = str3.substring(0,1);

            sbRandomString.append(s1);

        }
        System.out.println(sbRandomString);
    }
}