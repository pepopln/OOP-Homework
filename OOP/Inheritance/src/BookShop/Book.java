package BookShop;


public class Book {
String title;
    String author;
    double price;

    public Book( String author,String title, double price) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }

    private void setTitle(String title) {
        if (title==null||title.length()<3){
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    private void setAuthor(String author) {

        if(author==null||!this.isAuthorNameValid(author)){
            throw new IllegalArgumentException("Author not valid!");
        }
        this.author = author;
    }

    private boolean isAuthorNameValid(String author) {
       String[] authorParams = author.split("\\s+");
        if (authorParams.length>1 && Character.isDigit(authorParams[1].charAt(0))) {


            return false;
        }
        return true;
    }


    private void setPrice(Double price) {
        if (price<1){
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }
}
