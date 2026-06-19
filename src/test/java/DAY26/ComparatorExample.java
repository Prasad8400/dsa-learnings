package DAY26;

import java.util.Arrays;
import java.util.Comparator;

class Student1 {

  int marks;
  String name;

  Student1(int marks, String name) {
    this.marks = marks;
    this.name = name;
  }
}

public class ComparatorExample {

  public static void main(String[] args) {

    Student1[] Student1s = {
        new Student1(90, "Naruto"),
        new Student1(75, "Luffy"),
        new Student1(85, "Goku")
    };

    Comparator<Student1> byName = new Comparator<Student1>() {

      @Override
      public int compare(Student1 s1, Student1 s2) {

        return s1.name.compareTo(s2.name);

      }
    };

    Arrays.sort(Student1s, byName);

    for (Student1 s : Student1s) {
      System.out.println(s.name + " " + s.marks);
    }
  }
}