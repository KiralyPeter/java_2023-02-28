public class Szakacs implements Konyha {
 
    public void prepareFood(){
        System.out.println("Szakács készíti az ételt");

    }

    @Override
    public void deliverFood() {
        System.out.println("Szakács viszi az ételt");
    }
}
