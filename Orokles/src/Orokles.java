// import javax.print.attribute.standard.*;

class Employee {

    String name;
    int slary;

    public void working( String work ){

        System.out.println(work);

    }

}

// az Employee osztályt "örökli", kiterjeszti
class Engineer extends Employee {

    String gradeNumber;

}

class MainEngineer extends Engineer {

    int bonus; 

}

public class Orokles {
    public static void main(String[] args) throws Exception {

        // Emloyee példány
        Employee emp = new Employee();
        emp.name = "Pista";
        emp.slary = 600000;

        System.out.println(emp.name);
        System.out.println(emp.slary);
        emp.working("Dolgozom");
        
        System.out.println();

        // Engineer példány
        Engineer eng = new Engineer();
        eng.name = "Karcsi";
        eng.slary = 900000;
        eng.gradeNumber = "1234N";

        System.out.println(eng.name);
        System.out.println(eng.slary);
        System.out.println(eng.gradeNumber);
        eng.working("Tervezek");
        
        System.out.println();
        // MainEngineer példány
        MainEngineer mEng = new MainEngineer();
        mEng.name = "Géza";
        mEng.slary = 1000000;
        mEng.gradeNumber = "321K";
        mEng.bonus = 500000;

        System.out.println(mEng.name);
        System.out.println(mEng.slary);
        System.out.println(mEng.gradeNumber);
        System.out.println(mEng.bonus);
        mEng.working("Irányítok");


    }
}
