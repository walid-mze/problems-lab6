package Problem3;

public class Novel extends Book{
    public double price;
    public Novel(String title,String author, int  nbrPages, double price){
        super(nbrPages,author,title);
        this.price=price;
    }
    public  double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "Novel{"+price+"$}";
    }
}
