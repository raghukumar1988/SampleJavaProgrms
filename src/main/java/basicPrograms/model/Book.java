package basicPrograms.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private int bookId;
    private String author;
    private String title;
}
