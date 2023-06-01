import java.util.Scanner;
/*Shkruani një program Java për të marrë një numër
nga përdoruesi dhe printoni nëse ai është pozitiv apo negativ.*/
public class Ushtrimi6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni numrin");
        double a = sc.nextDouble();

        if (a > 0){
            System.out.println("NUmri eshte pozitiv");
        }else if(a == 0){
            System.out.println("Numri eshte 0");
        }else{
            System.out.println("Numri eshte negativ");
        }
    }
}
