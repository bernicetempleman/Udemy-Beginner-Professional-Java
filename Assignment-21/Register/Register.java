import java.util.Scanner;

/**
 * Write a description of Register here.
 * This is a class example 
 * 
 * @author Bernice 
 * @version 2016-01-18
 */
public class Register {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        boolean on = true;
        while(on)
        {
            System.out.println("Welcome to Ice Cream Treats, "
                + "Who is ordering?");
            String name = keyboard.nextLine();
            System.out.println("Is this order to go?");
            boolean togo = ("y".equals(keyboard.nextLine()));
            Order myorder = new Order(name, togo);
            askForItems(myorder);
            System.out.println("The total cost is " 
                + myorder.calculateOrder());
            System.out.println("Do you want to continue y n?");
            on = ("y".equals(keyboard.nextLine()));

        }
    }


    // Ice cream cone, ice cream bowl, chocolate-dipped cone, fruit sorbet cone, fruit sorbet bowl
    public static Product[] createMenu()
    {
        Product[] products = new Product[5];
        // Product constructor takes name, price, cone true/false

        products[0] = new Product("Ice Cream", 1.75, true);
        products[1] = new Product("Ice Cream", 1.60, false);
        products[2] = new Product("Chocolate-Dipped", 2.10, true);
        products[3] = new Product("Fruit Sorbet", 1.65, true);
        products[4] = new Product("Fruit Sorbet", 1.50, false);

        return products;     
    }

    public static void printMenu(Product[] products)
    {
        for(int counter = 0; counter < products.length; counter++)
        {
            System.out.println(counter + ". " + products[counter].getDescription());
        }
    }

    public static void askForItems(Order order)
    {
        Product[] menuItems = Register.createMenu();
        System.out.println("Enter the number of an item " +
            "to order it, or 9 to end.");

        int item;
        do{
            Register.printMenu(menuItems);
            item = keyboard.nextInt();
            if (item != 9)
            {
                order.add(menuItems[item]);
                }
                keyboard.skip("\n"); //eat the newline
            } while(item != 9);
        }

    }
