import java.util.Scanner;

/* Gjeni mesataren e numrave te nje array */
public class Ushtrimi9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mes;
        int b=sc.nextInt();
        int shuma= 0;
        int[] a= new int[b];
        for (int i=0; i<a.length;i++) {
            a[i]= sc.nextInt();
            shuma = shuma + a[i];
        }
        mes= (double) shuma/a.length;
        System.out.println(mes);
    }
}
