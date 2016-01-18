import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of Order here.
 * 
 * This is a class example
 * 
 * @author Bernice 
 * @version 2016-01-18
 */
public class Order {
    
    private static int nextOrderNumber = 0;
    
    private String customerName;
    private int orderNumber;
    private boolean toGo;
    private ArrayList products;
    
    public Order(String customerName, boolean toGo)
    {
        this.orderNumber = nextOrderNumber;
        nextOrderNumber++;
        this.customerName = customerName;
        this.toGo = toGo;
        products = new ArrayList();
    }
    public int getOrderNumber()
    {
        return orderNumber;
    }
    public void add(Product item)
    {
        products.add(item);
    }
    public ArrayList getItems()
    {
        return products;
    }
    public double calculateOrder()
    {
        double total = 0;
        Iterator iter = products.iterator();
        while(iter.hasNext()){
            Product p = (Product) iter.next();
            total = total + p.getPrice();
        }
        return total;
    }

}
