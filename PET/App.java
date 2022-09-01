public class App {
    public static void main(String[] args) {

        Pet dog = new Pet("Seth", 9.7F, 9, true);
        dog.petDialouge();

        Pet cat = new Pet("Carl", 8.5F, 9, true);
        cat.petDialouge();

        Pet bird = new Pet("Ralph", 83.1F, 8, true);
        bird.petDialouge();
    }
}
