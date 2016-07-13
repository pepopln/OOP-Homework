package BookShop;


public class GoldenEditionBook extends Book {

    public GoldenEditionBook(String title, String author, Double price) {
        super(title, author, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+super.getPrice()*0.3;
    }
}
