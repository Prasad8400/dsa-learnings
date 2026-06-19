package DAY26;

import java.util.*;

class Student implements Comparable<Student> {
  int marks;
  String name;

  Student(int marks, String name) {
    this.marks = marks;
    this.name = name;
  }

  @Override
  public int compareTo(Student s) {
    return this.marks - s.marks;
  }
}

public class ComparableTest {
  public static void main(String[] args) {
    Student[] students = {
        new Student(90, "Naruto"),
        new Student(75, "Luffy"),
        new Student(85, "Goku")
    };

    Arrays.sort(students);

    for (Student s : students) {
      System.out.println(s.name + " " + s.marks);
    }
  }

}
