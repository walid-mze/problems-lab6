package Problem3;

public class Dictionary extends Document{
    private String language;
    public Dictionary(String language ,String title){
        super( title);
        this.language = language;
    }
    public String getLanguage(){
        return language;
    }
    public void setLanguage(String language){
        this.language=language;
    }
    @Override
    public String toString(){
        return "Dictionary{"+language+"}";
    }

}
