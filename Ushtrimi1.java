import java.util.Scanner;
/* Krijoni nje program qe llogarit pjesetimin e dy numrave. KUJDES! emeruesi jo 0 */
public class Ushtrimi1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Vendosni numeruesin");
        double a=sc.nextDouble();
        System.out.println("Vendosni emeruesin");
        double b=sc.nextDouble();
        while(b==0){
            System.out.println("Vlera 0 nuk lejohet, vendosni nje vlere tjeter");
            b=sc.nextDouble();
        }
        double rez = pjesetim(a, b);
        System.out.println("Rezultati i pjestimit eshte= "+rez);
    }

    private static double pjesetim(double a, double b) {
        return a / b;
    }
}
