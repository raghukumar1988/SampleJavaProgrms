package basicPrograms;


import basicPrograms.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapBookListWithAuthor4 {

    public static void main(String[] args) {
        mapbookNameWithAuthorInOldStupidWay();
        mapbookNameWithAuthorInSmartWay();

    }

    private static void mapbookNameWithAuthorInSmartWay() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "Sean", "Book 1"));
        bookList.add(new Book(2, "Sean", "Book 72"));
        bookList.add(new Book(3, "Carlier", "Book 88"));
        bookList.add(new Book(7, "Jaber", "Book 7"));
        bookList.add(new Book(88, "Raghu", "Book 3"));
        bookList.add(new Book(22, "Raghu", "Book 22"));
        bookList.add(new Book(121, "Raghu", "Book 121"));
        Map<String, String> collectedMap = bookList.stream()
                .collect(Collectors.toMap(Book::getAuthor, Book::getTitle, (oldVal, newVal) -> oldVal));
        System.out.println("After replacing duplicate keys" + collectedMap);

        Map<String, String> collectedMap1 = bookList.stream()
                .collect(Collectors.toMap(Book::getTitle, Book::getAuthor)); // No need of extra arguments
        System.out.println("After swapping keys with unique values" + collectedMap1);

        Map<String, List<String>> collectedMap2 = bookList.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.mapping(Book::getTitle, Collectors.toList())));
        System.out.println("Map with grouping the duplicate keys " + collectedMap2);


    }

    private static void mapbookNameWithAuthorInOldStupidWay() {
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

