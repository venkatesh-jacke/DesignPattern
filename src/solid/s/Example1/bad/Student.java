package solid.s.Example1.bad;

public class Student {
    int id;
    String firstName;
    String lastName;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public long calculateFee() {
        return 10;
    }


    public void save() {
    }


    public String reportAttendance() {
        return "";
    }


}
