import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookDA {
     private HashMap<String, Author> authorMap;
    // public HashMap<String, Book> getBookMap() {
    //     return bookMap;
    // }



    public BookDA(String name) throws FileNotFoundException{

        try{
            Scanner bookFile = new Scanner (new FileReader("/workspaces/HashMap_Lab/Book.csv"));
            authorMap = new HashMap<>();

            while (bookFile.hasNext()){
                
                authorMap = new HashMap<>();
                String bookLineData = new String();
                bookLineData = bookFile.nextLine();

                String[] bookLineDataSpecific = new String[3];
                bookLineDataSpecific = bookLineData.split(",");

               
                Book book = new Book();
                AuthorDA authorDA = new AuthorDA = new AuthorDA(authorDA(book.get));
                book.setAuthorMap(AuthorDA.getAuthorMap());
                if(name.equals(bookLineDataSpecific[2].trim())){
                   
                    book.setIsbn(bookLineDataSpecific[0].trim());
                    book.setTitle(bookLineDataSpecific[1].trim());
                

                };
                printReport(book);
            } bookFile.close();
        } catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }

    }

    public BookDA() {
      
    }

    private void printReport(Book book) {
        System.out.println(book.getIsbn()+" "+ book.getTitle());
        for (Map.Entry<String, Author> entryMap : book.getAuthorMap().entrySet()) {
            System.out.println(entryMap.getValue().getName()+" "+ entryMap.getValue().getBio());
        }

        System.out.println();
    }

    
}

    





