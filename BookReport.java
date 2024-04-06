public class BookReport{

    public BookReport(){
        
        AuthorDA authorDA = new AuthorDA();
        new BookDA(authorDA);

    }
    public static void main(String[] args){
        new BookReport();
    }
}