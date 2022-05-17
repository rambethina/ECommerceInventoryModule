import com.inventory.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListSample {

    public static void main(String[] args) {
        List bookList = new ArrayList<Book>();

        bookList.add(
                new Book("ISBN001", "How to program in java", "John Doe", "Educational", 29.2, new String[]{
                        "first review for how to program in java"}));
        bookList.add(
                new Book("ISBN002", "How to program in cPlusPlus", "John Doe", "Educational", 19.2, new String[]{
                        "first review"}));
        bookList.add(
                new Book("ISBN002", "How to program in cPlusPlus", "John Doe", "Educational", 19.2, new String[]{
                        "first review"}));

        Iterator<Book> iterator = bookList.iterator();
        while(iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.toString());
        }
    }
}
