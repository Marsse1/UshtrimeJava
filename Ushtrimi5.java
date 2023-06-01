/* shkruani nje program qe printon numrat tek nga 1 ne 50 */
public class Ushtrimi5 {
    public static void main(String[] args) {
        System.out.println("Numrat tek");
        int k;

        for (k=1; k<=50; k++){
            if (k%2==1)
                System.out.print(k + " ");
        }
    }
}
