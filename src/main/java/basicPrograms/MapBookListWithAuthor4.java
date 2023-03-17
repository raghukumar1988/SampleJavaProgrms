package basicPrograms;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapBookListWithAuthor4 {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "Sean", "Book 1"));
        bookList.add(new Book(2, "Sean", "Book 72"));
        bookList.add(new Book(3, "Carlier", "Book 88"));
        bookList.add(new Book(7, "Jaber", "Book 7"));
        bookList.add(new Book(88, "Raghu", "Book 3"));
        bookList.add(new Book(22, "Raghu", "Book 22"));
        bookList.add(new Book(121, "Raghu", "Book 121"));

        Map<String, List<Book>> accountMap = new HashMap<>();
        for (Book book : bookList) {
            if (accountMap.containsKey(book.getAuthor())) {
                List<Book> accountList = accountMap.get(book.getAuthor());
                accountList.add(book);
                accountMap.put(book.getAuthor(), accountList);
            } else {
                List<Book> accountList = new ArrayList<>();
                accountList.add(book);
                accountMap.put(book.getAuthor(), accountList);
            }
        }
        accountMap.forEach((s, books) -> System.out.println(s + "  " + books));

    }

}

@Data
@AllArgsConstructor
class Book {
    private int bookId;
    private String author;
    private String title;
}
