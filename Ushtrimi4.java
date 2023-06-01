import java.util.Scanner;

/* Shkruani nje String mbrapsht (perdorni for loop) */
public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Vendosni stringun qe doni ti beni reverse: ");
        String str=sc.nextLine();

        System.out.println(reverse(str));
    }

    //This is a -> a si sihT ['T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a']
    private static String reverse(String strToReverse){
        String str2="";
        for(int i=strToReverse.length()-1; i>=0; i--){
            str2 = str2 + strToReverse.charAt(i);
        }
        return str2;
    }
}
