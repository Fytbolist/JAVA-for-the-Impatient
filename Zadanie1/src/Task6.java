import java.io.*;
import java.util.Scanner;
import static java.lang.Math.*;
import java.math.BigInteger;
public class Task6 {
    public static void main(String[] args) {
        BigInteger r = BigInteger.ONE;
        BigInteger n = BigInteger.ZERO;
        for (int i = 1; i <= 1000; ++i) {
            n = n.add(BigInteger.ONE);
            r = r.multiply(n);
        }
        System.out.println("1000! => " + r);
    }
}