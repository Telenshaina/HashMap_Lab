import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class BookDA {
    private HashMap<String, Author> authorMap;

    public BookDA(AuthorDA authorDA) {
        authorMap = authorDA.getAuthorMap();
        try {
            Scanner bookFile = new Scanner(new FileReader("Book.csv"));
            while (bookFile.hasNext()) {
                String bookLineData = bookFile.nextLine();
                String[] bookLineDataSpecific = bookLineData.split(",");
                String isbn = bookLineDataSpecific[0].trim();
                String title = bookLineDataSpecific[1].trim();
                String authorName = bookLineDataSpecific[2].trim();
                Author author = authorMap.get(authorName);
                if (author != null) {
                    Book book = new Book();
                    book.setIsbn(isbn);
                    book.setTitle(title);
                    book.setAuthor(author);
                    printReport(book);
                }
            }
            bookFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void printReport(Book book) {
        System.out.println(book.getIsbn() + " " + book.getTitle());
        Author author = book.getAuthor();
        System.out.println("\t" + author.getName() + " - " + author.getBio());
        System.out.println();
    }
}