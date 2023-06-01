import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        for(int i = 0; i < students.length; i++) {
            System.out.println("Vendosni id: ");
            String id = sc.next();
            System.out.println("Vendosni emrin: ");
            String emri = sc.next();
            System.out.println("Vendosni moshen: ");
            int mosha = sc.nextInt();
            while(mosha < 0 || mosha > 130) {
                System.out.println("Mosha nuk eshte e sakte");
                mosha = sc.nextInt();
            }
            students[i] = new Student(id, emri, mosha);
        }
        //printimi i emrave
        for(Student s : students) {
            System.out.println(s.getEmri());
        }

        //gjetja e moshes max
        int max = 0;
        for(Student s : students) {
            if(s.getMosha() > max) {
                max = s.getMosha();
            }
        }

        System.out.println("Mosha max eshte: " + max);

        //gjetja e mesatares se moshes
        double shuma = 0;
        for(Student st : students) {
            shuma += st.getMosha(); //shuma + st.getMosha();
        }

        double avg = shuma / students.length;

        System.out.println("Mesatarja e moshes eshte: " + avg);
    }
}
