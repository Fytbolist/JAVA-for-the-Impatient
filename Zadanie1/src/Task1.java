import java.util.Scanner;

public class Task1 {


        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int i= sc.nextInt();
            String s2 = Integer.toString(i, 2);
            System.out.println(s2);
            String s3 = Integer.toString(i, 8);
            System.out.println(s3);
            String s4 = Integer.toString(i, 16);
            System.out.println(s4);
            double d = Double.parseDouble(s4);
            System.out.println(d);
        }
    }
