import java.util.Scanner;
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> list = new ArrayList<>();

    public void inputStudents() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên #" + (i+1));
            System.out.print("Tên: ");
            sc.nextLine(); // bỏ dòng thừa
            String name = sc.nextLine();
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Điểm: ");
            double score = sc.nextDouble();

            Student s = new Student(name, id, score);
            list.add(s);
        }
    }

    public void printAll() {
        for (Student s : list) {
            s.printinfo();
        }
    }
}