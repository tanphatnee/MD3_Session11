package bt.bt7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student(1, "Long", true, "11/11/1994"));
        listStudent.add(new Student(2, "Hoa", false, "10/10/2002"));
        listStudent.add(new Student(3, "Giang", true, "17/10/1996"));
        listStudent.add(new Student(4, "Phát", true, "24/4/2004"));
        listStudent.add(new Student(5, "Hằng", false, "15/5/2001"));
        listStudent.add(new Student(6, "Híu", true, "9/9/1999"));

        for (Student s : listStudent) {
            System.out.println(s);
        }
        listStudent.sort(Comparator.comparing(Student::getDob));

        Queue<Student> queueMale = new ArrayDeque<>();
        Queue<Student> queueFeMale = new ArrayDeque<>();

        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).isGender()) {
                queueMale.offer(listStudent.get(i));
            } else {
                queueFeMale.offer(listStudent.get(i));
            }
        }

        System.out.println("Danh sách học sinh nũ: " + queueFeMale);
        System.out.println("Danh sách học sinh nam: " + queueMale);
    }

}

