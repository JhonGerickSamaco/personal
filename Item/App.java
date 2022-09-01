public class App {
    public static void main(String[] args) {

        Item ballpen = new Item("Ballpen", 20, 1.5F, 1, "This ballpen is one of a kind.", true);
        ballpen.itemDialouge();

        Item notebook = new Item("Notebook", 50, 453.5F, 2, "This notebook is high quality and you can but 1 take 1 if you buy now.", true);
        notebook.itemDialouge();

        Item pencil = new Item("Pencil", 60, 20.2F, 12,  "This pencil is so strong and you can by it in a pack.", true);
        pencil.itemDialouge();
    }
}
