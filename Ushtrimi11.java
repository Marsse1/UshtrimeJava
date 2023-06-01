public class Ushtrimi11 {
    public static void main(String[] args) {
        int[] numrat = new int[3];
        numrat[0] = 1;
        numrat[1] = 45;
        numrat[2] = 36;

        int countCift = 0;
        int countTek = 0;

        for(int i : numrat) {
            if(i % 2 == 0) {
                countCift++;
            } else {
                countTek++;
            }
        }

        System.out.println("Numra cift jane: " + countCift);
        System.out.println("Numra tek jane: " + countTek);
    }
}
