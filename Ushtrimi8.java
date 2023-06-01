import java.util.Scanner;

/* Shkruani një program Java që merr një numër nga përdoruesi midis 1 dhe 7
dhe shfaq emrin e ditës së javës. (Psh: 1- e hene) */
public class Ushtrimi8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        switch(day) {
            case 1:
                System.out.println("E hene");
                break;
            case 2:
                System.out.println("E marte");
                break;
            case 3:
                System.out.println("E merkure");
                break;
            case 4:
                System.out.println("E ejne");
                break;
            case 5:
                System.out.println("E premte");
                break;
            case 6:
                System.out.println("E shtune");
                break;
            case 7:
                System.out.println("E diele");
                break;
            default:
                System.out.println("keni zgjedhur numer te gabuar");
        }
    }
}
