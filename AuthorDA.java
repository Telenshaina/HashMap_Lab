import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class AuthorDA {
    private HashMap<String, Author> authorMap;
    public HashMap<String, Author> getAuthorMap() {
        return authorMap;
    }



    /**
     * 
     */
    public AuthorDA(){
        try{
            Scanner authorFile = new Scanner (new FileReader("/workspaces/HashMap_Lab/Author.csv"));
            
            while (authorFile.hasNext()){
                
                authorMap = new HashMap<>();
                String authorLineData = new String();
                authorLineData = authorFile.nextLine();

                String [] authorLineDataSpecific = new String[2];
                authorLineDataSpecific = authorLineData.split(",");

                Author author = new Author();
                author.setName(authorLineDataSpecific[0].trim());
                author.setBio(authorLineDataSpecific[1].trim());

                authorMap.put(author.getName(),author);
                authorMap.put(author.getBio(),author);

                

            }authorFile.close();
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
   



}