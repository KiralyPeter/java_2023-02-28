public class App {
    public static void main(String[] args) throws Exception {
        
        Szakacs szakacs = new Szakacs();
        Etterem etterem01 = new Etterem(szakacs);

        etterem01.deliverFood();
        etterem01.prepareFood();

        System.out.println();

        Pincer pincer = new Pincer();
        Etterem etterem02 = new Etterem(pincer);

        etterem02.deliverFood();
        etterem02.prepareFood();

    }
}
