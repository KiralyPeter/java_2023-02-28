public class Pincer implements Konyha{
    
    public void prepareFood(){
        System.out.println("Pincér készíti az ételt");

    }

    @Override
    public void deliverFood() {
        System.out.println("Pincár viszi az ételt");
    }


}
