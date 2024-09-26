package nivell1.exercise1.com.modules;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class LibraryTest {
    final String book1Title = "El petit príncep";
    final String book2Title = "Guerra i Pau";
    final String book3Title = "The Da Vinci Code";

    @DisplayName(
            "La llista de llibres no és nul·la després de crear un nou objecte.")
    @Test
    public void notNullLibrary() {
        Library library = new Library();
        assertNotNull(library);
    }

    @DisplayName("Comprovar que la llista té una mida de 3 després d'inserir 3 llibres diferents.")
    @Test
    public void correctSizeLibrary() {
        Library library = new Library();
        library.addBook(new Book(book1Title));
        library.addBook(new Book(book2Title));
        library.addBook(new Book(book3Title));
        Assert.assertEquals(3, library.getBookList().size());
    }

    @DisplayName("Comprovar que la llista té un títol en la posició esperada.")
    @Test
    public void LibraryContainsTitleInRightPosition() {
        Library library = new Library();
        library.addBook(new Book(book1Title));
        library.addBook(new Book(book2Title));
        library.addBook(new Book(book3Title));
        int index = library.getBookList().indexOf(new Book(book2Title));
        Assert.assertEquals(1, index);
    }

    @DisplayName("Comprovar que la llista no conté duplicats.")
    @Test
    public void noDuplicatesInList() {
        Library library = new Library();
        library.addBook(new Book(book1Title));
        library.addBook(new Book(book1Title));
        assertEquals(1, library.getBookList().size());
        assertEquals(new Book(book1Title), library.getBookList().getFirst());
    }

    @DisplayName("Comprovar que es pot recuperar el titol d'un llibre d'una posició donada.")
    @Test
    public void getBookTitleByPos() {
        Library library = new Library();
        library.addBook(new Book(book1Title));
        library.addBook(new Book(book2Title));
        library.addBook(new Book(book3Title));
        assertEquals(book2Title, library.getTitleByPos(1));
    }

    @DisplayName("Assegurar que afegir un llibre modifica correctament la llista.")
    @Test
    public void checkListAfterAddingBook(){
        Library library = new Library();
        library.addBook(new Book(book1Title));
        int size = library.getBookList().size();
        library.addBook(new Book(book2Title));
        assertEquals(size + 1, library.getBookList().size());
        assertEquals(new Book(book2Title), library.getBookList().getLast());
    }
    @DisplayName("Comprovar que la llista disminueix al treure un llibre.")
    @Test
    public void checkListSizeAfterRemovingBook(){
        Library library = new Library();
        library.addBook(new Book(book1Title));
        library.addBook(new Book(book2Title));
        library.addBook(new Book(book3Title));
        int size = library.getBookList().size();
        library.delBookByTitle(book2Title);
        assertEquals(size - 1, library.getBookList().size());
    }
    @DisplayName("Comprovar que la llista roman ordenada alfabèticament després d'inserir o eliminar llibre.")
    @Test
    public void checkOrderListAfterInsertOrRemove(){
        Library library = new Library();
        library.addBook(new Book(book1Title));
        library.addBook(new Book(book3Title));
        assertEquals(new Book(book1Title), library.getBookList().getFirst());
        assertEquals(new Book(book3Title), library.getBookList().getLast());

        library.addBook(new Book(book2Title));
        assertEquals(new Book(book1Title), library.getBookList().getFirst());
        assertEquals(new Book(book3Title), library.getBookList().getLast());

        library.delBookByTitle(book3Title);
        assertEquals(new Book(book1Title), library.getBookList().getFirst());
        assertEquals(new Book(book2Title), library.getBookList().getLast());

        library.addBookToPos(new Book(book3Title), 1);
        assertEquals(new Book(book1Title), library.getBookList().getFirst());
        assertEquals(new Book(book2Title), library.getBookList().getLast());
    }
}