import java.util.Scanner;
/**
 * Write a description of SocialMediaApp here.
 * 
 * Add a simple menu
 * 
 * Main Menu
 * 1) Create a new user
 * 2) Become an existing user
 * 3) Create a post as the current user
 * 4) Print all posts
 * 5) Print all users
 * You are currently user "pug". What would you like to do?
 * 
 * Behaviors should be fairly apparent from the names.
 * If the user asks to create a new user, you ask for the fields that make up the user 
 * (typed in from the keyboard) and create a new user instance from that.
 * You'll need to keep a list of users in an array. 
 * It's okay to make an array bigger than you expect to use,
 * so you don't need to use ArrayList yet (unless you want to).
 * Once they finish entering the user, go back to the main menu.
 * If the user asks to become an existing user, print a list of their names, 
 * and let the user pick which one to become. 
 * You can do this by number or by name, your choice. Then return to the main menu.
 * If the user asks to create a post, find the last post made by that user, and print it to the screen. 
 * Then ask the user to type in the next post (including the date, typed in).
 * When they're done entering it, and you've saved it in the posts array, go back to the main menu.
 * If the user asks to print all posts, go through the post array and print all the fields of all the posts.
 * You can skip the web link if it's empty (null).
 * Your posts won't be saved to a file yet, so they'll be forgotten between runs. 
 * We'll be addressing that in an upcoming lecture.
 * 
 * @author Bernice
 * @version 2016-01-23
 * */
public class SocialMediaApp {
    public static void main(String[] args)
    {
        //create arrayss
        Post[] posts = new Post[5];
        User[] users = new User[3];

        //create User objects
        users[0] = new User("pictureUrl1","User1", "Real Name1", "emailAddress1");
        users[1] = new User("pictureUrl2","User2", "Real Name2", "emailAddress2");
        users[2] = new User("pictureUrl3","User3", "Real Name3", "emailAddress3");

        //create Post objects
        posts[0] = new Post("User1","Jan 19, 2016 7:35PM", "This is my first post!");
        posts[1] = new Post("User2","Jan 19, 2016 7:36PM", "Welcome!", "abc.com");
        posts[2] = new Post("User3","Jan 19, 2016 7:37PM", "Keep posting", "123.com");
        posts[3] = new Post("User1", "Jan 19, 2016 7:38PM", "Do I need a web address?");
        posts[4] = new Post("User2","Jan 19, 2016 7:39PM", "Web addresses are optional :-)", "abc.com");

        //Display Welcome
        System.out.println("Welcome to the Social Media Posting Site\n");

        System.out.println("These are the current posts:");
        // Display Posts
        Post. displayPosts(posts);

        System.out.println("\nThese are the current users::");
        // Display Users
        User.displayUsers(users);

        String choice = "1";
        Scanner keyboard = new Scanner(System.in);

        //display Menu
        do{

            System.out.println("        Main Menu");
            System.out.println("1) Create a new user");
            System.out.println("2) Become an existing user");
            System.out.println("3) Create a post as the current user");
            System.out.println("4) Print all posts");
            System.out.println("5) Print all users");
            System.out.println("6) Exit");
            System.out.println("You are currently user \"pug\". What would you like to do?");
            
            choice = keyboard.nextLine();
          
        }while(!(choice.equals( "6")));
    }
}
