package Problem3;


public class TextBook extends Book{
    public String  level;
    public TextBook(String title,String author, int  nbrPages, String  level){
        super(nbrPages,author,title);
        this.level =level ;
    }
    public  String  getlevel () {
        return level ;
    }
    public void setlevel (String  level ) {
        this.level  = level ;
    }

    @Override
    public String toString(){
        return "TextBook{"+level+"}";
    }
}
