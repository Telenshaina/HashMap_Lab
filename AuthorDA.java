
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class AuthorDA {
    private HashMap<String, Author> authorMap;

    public AuthorDA() {
        authorMap = new HashMap<>();
        try {
            Scanner authorFile = new Scanner(new FileReader("Author.csv"));
            while (authorFile.hasNext()) {
                String authorLineData = authorFile.nextLine();
                String[] authorLineDataSpecific = authorLineData.split(",");
                Author author = new Author(authorLineDataSpecific[0].trim(), authorLineDataSpecific[1].trim());
                authorMap.put(author.getName(), author);
            }
            authorFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, Author> getAuthorMap() {
        return authorMap;
    }
}