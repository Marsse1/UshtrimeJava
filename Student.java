import java.util.Objects;

public class Student {
    private String id;
    private String emri;
    private int mosha;

    public Student() { }

    public Student(String id, String emri, int mosha) {
        this.id = id;
        this.emri = emri;
        this.mosha = mosha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", emri='" + emri + '\'' +
                ", mosha=" + mosha +
                '}';
    }
}
