import java.util.Scanner;
/* Shkruani nje program qe llogarit numrin e shkronjave, numrave,
hapesirave ne nje String (perdorni metodat e wrapper class Character)
mos harroni String kthehet ne nje char array */
public class Ushtrimi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        int countChar = 0;
        int countSpace = 0;
        int countNr = 0;
        int countOthers = 0;

       // char[] arraySt = src.toCharArray();

        for (int i =0; i<src.length();i++){
            if(Character.isLetter(src.charAt(i))){
                countChar++;
            } else if(Character.isDigit(src.charAt(i))) {
                countNr++;
            } else if(Character.isSpaceChar(src.charAt(i))) {
                countSpace++;
            } else {
                countOthers++;
            }

        }

        System.out.println("Numri space: " +countSpace +
                " Numri i char: "+ countChar+
                " Numri i Nr: " +countNr);

    }
}
