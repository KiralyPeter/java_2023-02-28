public class Etterem {

    Konyha konyha;

    public Etterem(Konyha konyha) {
        this.konyha = konyha;
    }

    public void prepareFood(){
        konyha.prepareFood();
    }
    
    public void deliverFood(){
        konyha.deliverFood();
    }
}
