public class BibliotekMain {
    public static void main(String[] args) {
        Bibliotek bibban = new Bibliotek();

        Bok b1 = new Bok("Den förlorade sonen ", "9789100804978", "Caroline Ringskog Ferrada-Noli");

        bibban.addBook(b1);

        bibban.interact();

    }

}
