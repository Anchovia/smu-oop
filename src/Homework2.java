import java.util.Scanner;

class Student {
    // variables
    private int studentId;
    private String name;
    private String major;
    private long phoneNumber;

    // studentId getter, setter
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // name getter, setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // major getter, setter
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    // phoneNumber getter, setter
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();

            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            students[i].setStudentId(scanner.nextInt());
            students[i].setName(scanner.next());
            students[i].setMajor(scanner.next());
            students[i].setPhoneNumber(scanner.nextLong());
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];

            String phone = "0" + Long.toString(student.getPhoneNumber());
            String formattedPhone = phone.substring(0, 3) + "-"
                    + phone.substring(3, 7) + "-"
                    + phone.substring(7);

            System.out.println((i + 1) + "번째 학생: "
                    + student.getStudentId() + " "
                    + student.getName() + " "
                    + student.getMajor() + " "
                    + formattedPhone);
        }

        scanner.close();
    }
}