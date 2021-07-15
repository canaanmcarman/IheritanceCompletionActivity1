public class Product {
    private String code;
    private String description;
    private double price;
    protected static int count = 0;

    public Product() {
        code = "";
        description = "";
        price = 0;
    }
    //Get and set accessors for the code, description, and price instance variables

    public void setCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return this.code;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return  "Code:             " + this.code + "\n" +
                "Description:      " + this.description + "\n" +
                "Price:            " + this.getFormattedPrice(this.price) + "\n";

    }
    private String getFormattedPrice(double price) {
        //Use the StringFormat class to format the price to 2 decimal places
        String formattedPrice = String.format("%.2f", price);
        return formattedPrice;


    }
    //create public access for the count variable
    public static int getCount() {
        return count;
    }
}
