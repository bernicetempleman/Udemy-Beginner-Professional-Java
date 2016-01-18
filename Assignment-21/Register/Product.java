
/**
 * Write a description of Product here.
 * 
 * this is a class example
 * 
 * @author Bernice 
 * @version 2016-01-18
 */
public class Product {
    
    private String name;
    private double price;
    private boolean cone;
    
    public Product(String name, double price, boolean cone)
    {
        this.name = name;
        this.price = price;
        this.cone = cone;
    }
    
    public String getDescription()
    {
        return name + " " + cone + ": $" + price;
    }
    
    public double getPrice()
    {
        return price;
    }

}
