package nivell1.exercise1.com.modules;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;

    public Book(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titol= '" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    @Override
    public int compareTo(Book o) {
        if (title.equals(o.getTitle())){
            return 0;
        }
        else{
            return title.compareTo(o.getTitle());
        }
    }
}
