public class Interfaces {
    public static void main(String[] args) throws Exception {
        
        Cat cat = new Cat();
        Garden garden01 = new Garden(cat);
        
        garden01.speakAnimal();
        garden01.playAnimal();

        System.out.println();

        Dog dog = new Dog();
        Garden garden02 = new Garden(dog);

        garden02.playAnimal();
        garden02.speakAnimal();

    }
}
