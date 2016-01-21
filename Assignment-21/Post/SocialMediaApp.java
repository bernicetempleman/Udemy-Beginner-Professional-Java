
/**
 * Write a description of SocialMediaApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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

    }
}
