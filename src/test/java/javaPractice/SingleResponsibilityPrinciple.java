package javaPractice;

class Employee {
  int id;
  String name;
}

class SalaryService {
  public void calculateSalary(Employee emp) {
    System.out.println("Calculating salary for " + emp.name);
  }
}

class ReportService {
  public void generateReport(Employee emp) {
    System.out.println("Generating report for " + emp.name);
  }
}

/*
 * SRP states that a class should have only one responsibility and therefore
 * only one reason to change.
 */
public class SingleResponsibilityPrinciple {
  /*
   * One class should have only one reason to change.
   * Simple meaning: one class = one responsibility
   */
  public static void main(String[] args) {
    Employee emp = new Employee();
    emp.id = 1;
    emp.name = "John";

    SalaryService salaryService = new SalaryService();
    salaryService.calculateSalary(emp);

    ReportService reportService = new ReportService();
    reportService.generateReport(emp);
  }
}
