package nivell1.exercise1.com.main;

import nivell1.exercise1.com.modules.Book;
import nivell1.exercise1.com.modules.Library;

public class Main {
    public static void main(String[] args){
        final String book1Title = "El petit príncep";
        final String book2Title = "Guerra i Pau";
        final String book3Title = "The Da Vinci Code";
        final String book4Title = "La Frontera";

        System.out.println("Creem una col·lecció de llibres i hi afegim 3 llibres diferents.");
        Library library = new Library();
        library.addBook(new Book(book1Title));
        library.addBook(new Book(book2Title));
        library.addBook(new Book(book3Title));
        System.out.println("La llista de llibres és: " + library.getBookList());
        System.out.println("Recuperem el títol del llibre en 2a posició: " + library.getTitleByPos(1));
        System.out.println("Afegim un 4t llibre en 2a posició.");
        library.addBookToPos(new Book(book4Title), 1);
        System.out.println("La llista de llibres és: " + library.getBookList());
        System.out.println("Eliminem el llibre amb títol " + book3Title);
        library.delBookByTitle(book3Title);
        System.out.println("La llista queda ara com segueix:" + library.getBookList());
    }
}
