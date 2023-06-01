import java.util.Scanner;

/*Shkruani një program Java që lexon një numër
dhe printon katrorin, kubin dhe fuqinë e katërt*/
public class Ushtrimi7 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Shkruani bazen");
        b= sc.nextInt();

        System.out.println("shkruNI EKSPONENTIN");
        a = sc.nextInt();
        double fuqia = Math.pow(b,a);
        System.out.println(b + " ne fuqi " + a + " eshte " + fuqia);

    }
}
