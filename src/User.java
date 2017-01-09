/**
 * Objects bundle related (data) state and behavior together
 * Classes are recipie for creating a given object
 * OBJECT ORIENTED PROGRAMMING
 * Approach to programming where we represent real word object
 * all the nouns in a real world process
 *
 *
 */
public class User {
    String username;
    String password;
    String email;
    boolean isAdmin;
    boolean isLoggedIn;

    public void login(String attempedUsername, String attemptedPassword) {
        if(username.equals(attempedUsername) && password.equals(attemptedPassword)) {
            isLoggedIn = true;
        }
    }

    public void changePassword(String newPassword) {
        password = newPassword;
    }
}
