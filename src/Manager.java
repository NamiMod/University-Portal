/**
 * --Manager--
 * in this class we can login users or change username of password for users
 * University Portal
 * @since 2020
 * @author Seyed Nami Modarressi
 * @version 1.0
 */

import java.io.*;
import java.util.Scanner;

public class Manager {

    private File login;
    private File temp;

    /**
     * create new manager
     *
     * @throws FileNotFoundException
     */
    public Manager() throws FileNotFoundException {
        login = new File("login_data.txt");
        temp = new File("temp.txt");
    }

    /**
     * login user
     *
     * @param username username of user
     * @param password password of user
     * @return possible or not
     * @throws IOException file not found
     */
    public boolean login(String username, String password) throws IOException {
        try {
            FileReader fileReader = new FileReader(login);
            Scanner getString = new Scanner(fileReader);
            String username_temp;
            String password_temp;
            String kind;

            while (getString.hasNextLine()) {

                username_temp = getString.nextLine();
                password_temp = getString.nextLine();
                kind = getString.nextLine();

                if (username.equals(username_temp) && password.equals(password_temp)) {
                    fileReader.close();
                    getString.close();
                    return true;
                }
            }
            fileReader.close();
            getString.close();
            return false;
        } catch (IOException e) {
            System.out.println("File Not Found !");
            return false;
        }
    }

    /**
     * change username or password of user
     * @param username old username
     * @param password old password
     * @param new_username new username
     * @param new_password new password
     * @throws IOException file not found
     */
    public boolean change(String username,String password , String new_username , String new_password) throws IOException {
        try {
            FileWriter fww = new FileWriter("temp.txt", false);
            fww.write("");
            fww.close();

            FileWriter fw = new FileWriter("temp.txt", false);
            FileReader fileReader = new FileReader(login);
            Scanner getString = new Scanner(fileReader);

            String username_temp;
            String password_temp;
            String kind;

            while (getString.hasNextLine()) {

                username_temp = getString.nextLine();
                password_temp = getString.nextLine();
                kind = getString.nextLine();

                if (username.equals(username_temp) && password.equals(password_temp)) {
                    fw.write(new_username + "\n");
                    fw.write(new_password + "\n");
                    fw.write(kind + "\n");
                } else {
                    fw.write(username_temp + "\n");
                    fw.write(password_temp + "\n");
                    fw.write(kind + "\n");
                }
            }
            fw.close();
            getString.close();
            fileReader.close();
            return true;

        }catch (IOException e){
            System.out.println("file not found !");
            return false;
        }
    }

}
