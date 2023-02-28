// Az interfészeket implementáljuk...

public class Dog implements Animal{

    // Kötelező az interfészben deklarált metódusokatr megvalósítani!!!

    // @Override nem kötelező... Dokumentálás és átláthatóság miatt szükséges
    // Üresen is maradhat a metódus, de meg kell valósítani...
    @Override
    public void play() {
        System.out.println("Rágom a papucsot");
    }

    @Override
    public void speak() {
        System.out.println("Vau...");
    }

}
