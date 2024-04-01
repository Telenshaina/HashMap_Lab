import java.util.HashMap;

public class Book{
    private String isbn, title;
     private HashMap<String, Author> authorMap;

    
    public void setIsbn (String isbn){
        this.isbn= isbn;
    }
    public void setTitle (String title){
        this.title= title;
    }
    
    
    public String getIsbn(){
        return isbn;
    }

    public String getTitle(){
        return title;
    }
    
    public void setAuthorMap(HashMap<String, Author> authorMap){
        this.authorMap = authorMap;
    }
    public HashMap<String, Author> getAuthorMap(){
        return authorMap;
    }

}