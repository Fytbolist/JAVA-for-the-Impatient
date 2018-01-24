import java.io.*;
import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;
import java.math.BigInteger;
public class Task11 {
    public static void main(String[] args) {
        System.out.print("Vvedite stroky: ");
        Scanner sc = new Scanner(System.in);
        String s = String.valueOf(sc.nextLine());
        int l = 0;
        int n = s.length();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if (String.valueOf(s.charAt(i)).matches("[^\\p{ASCII}]")){
                sb.append("[CODE #").append((int)s.charAt(i)).append("]");
            }else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
        }
    }
   /* ^ - Not
            \\x20 - Hex value representing space which is first writable ASCII character.
            - - Represent to, ie x20 to x7E
            \\x7E - Hex value representing ~ which is the last writable ASCII character*/