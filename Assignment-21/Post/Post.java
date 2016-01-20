
/**
 * Write a description of Post here.
 * 
 * Learning Goals
 * 1. Recognize member variables
 * 2. Recognize distinct classes
 * 3. Begin thinking about separation of concerns / separation of responsibilities
 * 
 * Business Goal
 * You'll be building a micro-blogging app, 
 * where users can post short updates to a private social media site. 
 * We won't worry about the user interface yet; first we are working on the data structure.
 * 
 * A post will show the following information:
 * 1. The user who posted it
 * 2. The date and time it was posted
 * 3. The contents of the post
 * 4. Optionally, a web address to a site they linked
 * 
 * Regarding the users who post, they have the following information:
 * 1. The web address (url) to their avatar picture
 * 2. The username
 * 3. The person's real first name and last name
 * 4. The person's email address
 * 
 * For this first version, you won't have to worry about whether a user follows another user and
 * sees their posts. 
 * Every user sees all posts on this private site.
 * This practice assignment only requires you to create the classes, 
 * and create a main() that constructs them with some test data. 
 * In a future practice assignment, 
 * you will use these classes to set up several posts from various users and interact with them. 
 * Right now, just focus on the class definitions for these two classes.
 * It's fine to use String for every data type here. 
 * Later you will learn how to use the Date and Time helper APIs, but for now, 
 * a String is fine.
 * 
 * Behavior
 * Your main() method should construct at least 
 * 3 users and at least 
 * 5 social media posts. 
 * Make the content somewhat realistic. 
 * To help yourself out, 
 * consider writing the test data in comments or in Notepad 
 * so you can copy-paste the URLs and names instead of retyping them as you work.
 * The classes you create for users and posts do not need any special behavior of their own yet.
 * They just take the data and hold onto it for you. 
 * 
 * Your primary task is to work through the
 * syntax of how to create classes and define the data that they hold.
 * When you've created the users and the posts, you should have an array of posts in your main()
 * method. Loop through the posts and print each one to screen. 
 * After the posts are all printed, 
 * then loop through the users and print what you know about each user. 
 * The formatting is up toyou; 
 * this is just a troubleshooting step to ensure your code is behaving as you expect.
 * 
 * @author Bernice
 * @version 2016-01-19
 */
public class Post {

    private String user;
    private String postDateTime;
    private String postContents;
    private String webAddress;

    public Post(String user, String postDateTime, String postContents)
    {
        this.user = user;
        this.postDateTime = postDateTime;
        this.postContents = postContents;
        this.webAddress = " ";
    }

    public Post(String user, String postDateTime, String postContents, String webAddress)
    {
        this.user = user;
        this.postDateTime = postDateTime;
        this.postContents = postContents;
        this.webAddress = webAddress;
    }

    public String getUser()
    {
        return user;
    }

    public String getPostDateTime()
    {
        return postDateTime;
    }

    public String getPostContents()
    {
        return postContents;
    }

    public String getWebAddress()
    {
        return webAddress;
    }

    public static void displayPosts(Post[] postsArray)
    {
        for(int counter = 0; counter < postsArray.length;  counter++)
        {
            System.out.println( postsArray[counter].getPostDateTime()
            + " "
            + postsArray[counter].getUser() 
            + " ("+ postsArray[counter].getWebAddress()+ "):  " 
            + postsArray[counter].getPostContents());
        }

    }

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
        displayPosts(posts);

        System.out.println("\nThese are the current users::");
        // Display Users
        User.displayUsers(users);

    }
}
