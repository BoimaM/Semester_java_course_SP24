package chapter8_datatypes_strings;

/*
 * Validate the complexity of a proposed password
 * by assuring it meets these rules:
 *      At least 8 character long
 *      contains an uppercase letter
 *      contains a special character
 *      not contain the username
 *      not the same as the old password.

 */


import java.util.Scanner;

public class PasswordValidatorChapterChallenge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("New passwords must contain: \n8 characters\none upper & lowercase letter\n" +
                "one special character\n");

        System.out.println("Please enter your username: ");
        String username = input.next();
        System.out.println("Please enter your current password: ");
        String oldPassword = input.next();
        System.out.println("Please enter a new password: ");
        String newPassword = input.next();

        input.close();


        if (validateLength(newPassword) && validateUpperCase(newPassword) && validateUpperCase(newPassword)
                && validateSpecialCharacter(newPassword) && validateNoUsername(newPassword, username)
                && validateNoOldPassword(newPassword, oldPassword)){
            System.out.println("Valid input. Password is now updated");
        }else{
            System.out.println("Invalid password input. Please try again");
        }
    }


    private static boolean validateLength(String password){
        return password.length() >=8;
    }

    /**
     * This checks to make sure that the password contains,
     * an upperLetter.
     * @param password user input
     * @return true if upperLetter is found.
     */
    private static boolean validateUpperCase(String password){
        for (int i = 0; i< password.length(); i++){
            char j = password.charAt(i);
            if (Character.isUpperCase(j)){
                return true;
            }
        }
        return false;
    }

    /**
     * This checks to make sure that the password contains,
     * a special char based of the string variable within the method.
     * @param password user input
     * @return true if special char is found
     */
    private static boolean validateSpecialCharacter(String password){
        String specialChars = "!@#$%^&*()_+{}[]|'?/><:;''";
        for(int i=0; i < password.length(); i++){
            char j = password.charAt(i);
            if (specialChars.indexOf(j) != -1){
                return true;
            }
        }
        return false;
    }

    /**
     * This checks to make sure that the password does not == username
     * @param password user input
     * @param username user input
     * @return true is different from username
     */
    private static boolean validateNoUsername(String password, String username){
        return !password.contains(username);

    }

    /**
     * This checks to make sure that the New password does not == Old password
     * @param newPassword user input
     * @param oldPassword user input
     * @return true if different from old password.
     */
    private static boolean validateNoOldPassword( String newPassword, String oldPassword){
            return !newPassword.contains(oldPassword);
    }
}