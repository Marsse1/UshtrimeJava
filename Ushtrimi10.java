import java.util.Scanner;

public class Ushtrimi10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        String[] a = new String[b];
        String str = sc.next();
        for (int i=0; i<a.length;i++) {
            a[i] = sc.next();
        }

//        for (int i=0; i<a.length;i++) {
//            if(str.equals(a[i])) {
//                System.out.println("Vlera e kerkuar gjendet: "+ str);
//            }
//            else { continue;}
//        }

        boolean gjendet = isFound(a, str);
        if(gjendet) {
            System.out.println("Vlera e kerkuar u gjet");
        } else {
            System.out.println("Vlera e kerkuar nuk u gjet");
        }

    }

    private static boolean isFound(String[] arr, String vlera)
    {
        for (String s : arr) {
            if (s.equals(vlera)) {
                return true;
            }
        }
        return false;
    }
}
