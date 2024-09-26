
package nivell1.exercise1.com.modules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private ArrayList<Book> bookList;

    public Library(){
        this.bookList = new ArrayList<>();
    }
    public void addBook (Book book){
        if(!bookList.contains(book)){bookList.add(book);}
        Collections.sort(bookList);
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }
    public String getTitleByPos(int pos){
        return bookList.get(pos).getTitle();
    }
    public void addBookToPos(Book book, int pos) throws IndexOutOfBoundsException{
        try {
            if(!bookList.contains(book)){
                bookList.add(pos, book);
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public void delBookByTitle (String title){
        int index = bookList.indexOf(new Book(title));
        if(index != -1){
            bookList.remove(index);
            Collections.sort(bookList);
        }
    }
}
