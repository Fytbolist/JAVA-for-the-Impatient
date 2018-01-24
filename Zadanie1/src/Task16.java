import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        System.out.print("Vvedite odno chislo: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Vvedite vtoroe chislo: ");
        Scanner sl = new Scanner(System.in);
        int c = sl.nextInt();
        double b = ariphm(a,c);
        System.out.println(b);
    }


    private static double ariphm(int a, int c) {
        double b = (a+c)/2;
        return (b);
    }


}