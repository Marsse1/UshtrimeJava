import java.util.Scanner;
/* Shkruani nje program qe merr 3 numra (int) nga perdoruesi (Scanner) dhe llogarit mesataren e tyre (krijoni metode qe kthen mesataren) */
public class Ushtrimi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        float c= sc.nextFloat();
        System.out.println(mesatarja(a,b,c));
    }

    public static float mesatarja(float a, float b , float c) {
        float sh = a + b + c;
        float pjesetimi = sh/3;
        return pjesetimi;
    }
}
