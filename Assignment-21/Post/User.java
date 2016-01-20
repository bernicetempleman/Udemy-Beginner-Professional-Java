
/**
 * Write a description of User here.
 * 
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
 * Later you will learn how to use the Date and Time helper APIs, but for now, a String is fine.
 * 
 * @author Bernice
 * @version 2016-01-19
 */
public class User {

    private String pictureUrl;
    private String userName;
    private String realName;
    private String emailAddress;

    public User(String pictureUrl, String userName, String realName, String emailAddress)
    {
        this.pictureUrl = pictureUrl;
        this.userName = userName;
        this.realName = realName;
        this.emailAddress = emailAddress;   
    }

    public String getPictureUrl()
    {
        return pictureUrl;
    }

    public String getUserName()
    { 
        return userName;
    }

    public String getRealName()
    {
        return realName;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public static void displayUsers(User[] usersArray)
    {
        for(int counter = 0; counter < usersArray.length; counter++)
        {
            System.out.println(counter + ". " 
                + usersArray[counter].getPictureUrl() + " "
                + usersArray[counter].getUserName() + " "
                + usersArray[counter].getRealName() + " "
                + usersArray[counter].getEmailAddress());
        }

    }
}
