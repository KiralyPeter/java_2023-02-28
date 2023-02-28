class Animal {
    int magassag;
    String color;

    public void talk( String talk){
        System.out.println(talk);
    }
}

class HouseAnimal extends Animal {
    int lenght;
}

class Dog extends HouseAnimal {
    String name;
}

public class Allatok {
    public static void main(String[] args) throws Exception {

        Dog kutya = new Dog();
        kutya.magassag = 20;
        kutya.color = "gray";
        kutya.lenght = 20;
        kutya.name = "Bodri";

        

        kutya.talk("vau");

        


    }
}
