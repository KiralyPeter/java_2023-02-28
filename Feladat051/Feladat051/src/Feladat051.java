// http://szit.hu/doku.php?id=oktatas:programozas:feladatok:specialis:oop_feladatok#feladat_051

class Employee {
    String name;
    String id;
    String birthDate;
    int salary;
    String city;
    String address;
    String startedWorking;
}

class OfficeEmployee extends Employee {
    String gradeNo;
    boolean typingWithTenFingers;
}

public class Feladat051 {
    public static void main(String[] args) throws Exception {
        
        Employee emp = new Employee();
        OfficeEmployee officeEmp = new OfficeEmployee();

        emp.name = "Peti";
        emp.id = "123456";
        emp.birthDate = "1974.06.11";
        emp.salary = 50000;
        emp.city = "Szigetszentmiklós";
        emp.address = "Iskola utca";
        emp.startedWorking = "2007";

        officeEmp.gradeNo = "12364N";
        officeEmp.typingWithTenFingers = true;

        System.out.println(officeEmp.typingWithTenFingers);
    }
}
