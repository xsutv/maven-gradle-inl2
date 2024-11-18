import java.util.*;

public class Bibliotek {

    private List<Bok> library = new ArrayList<>();

    public void interact() {
        Scanner input = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.printf(
                    "Vad vill du göra?%n 1.Lägga till en bok?%n 2.Ta bort en bok%n 3.Söka efter en bok%nTryck 0 för att avsluta%nVal:");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("Skriv in en titel:");
                String title = input.nextLine().toLowerCase();

                System.out.println("Skriv in författarens namn:");
                String author = input.nextLine().toLowerCase();

                System.out.println("Skriv in ISBN:");
                String isbn = input.nextLine().toUpperCase();

                Bok book = new Bok(title, isbn, author);
                library.add(book);

            } else if (choice == 2) {
                System.out.println("Skriv in ISBN:");
                String isbn = input.nextLine().toUpperCase();
                removeBook(isbn);

            } else if (choice == 3) {
                System.out.println("Skriv in titel:");
                String title = input.nextLine().toLowerCase();

                System.out.println("Skriv in författare: ");
                String author = input.nextLine().toLowerCase();

                Bok book = searchBook(title, author);
                if (book != null) {
                    System.out.println(book);
                } else {
                    System.out.println("Boken kunde inte hittas.");
                    System.out.println();
                }
            }
        }
        input.close();

    }

    public Bok searchBook(String title, String author) {
        for (Bok book : library) {
            if (book.getTitle().toLowerCase().contains(title) && book.getAuthor().toLowerCase().contains(author)) {
                return book;
            }

        }
        return null;
    }

    public void addBook(Bok book) {
        library.add(book);
    }

    public void removeBook(String isbn) {
        for (Bok book : library) {
            if (book.getIsbn().equals(isbn)) {
                library.remove(book);
                System.out.printf("%nBoken är borttagen!%n");
                System.out.println();
                return;
            }
        }
    }
}
