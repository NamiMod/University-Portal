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
    public int login(String username, String password) throws IOException {
        try {
            FileReader fileReader = new FileReader(login);
            Scanner getString = new Scanner(fileReader);
            String username_temp;
            String password_temp;
            String kind="";

            while (getString.hasNextLine()) {

                username_temp = getString.nextLine();
                password_temp = getString.nextLine();
                kind = getString.nextLine();

                if (username.equals(username_temp) && password.equals(password_temp)) {
                    fileReader.close();
                    getString.close();
                    break;
                }
            }
            if (kind.equals("admin")){
                return 0;
            }
            if (kind.equals("student")){
                return 1;
            }
            if (kind.equals("professor")){
                return 2;
            }

            return -1;

        } catch (IOException e) {
            System.out.println("File Not Found !");
            return -1;
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

            FileWriter fw = new FileWriter("temp.txt", true);
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


            FileWriter copy = new FileWriter(login, false);
            FileReader fileReader2 = new FileReader(temp);
            Scanner getString2 = new Scanner(fileReader2);

            while (getString2.hasNextLine()){
                copy.write(getString2.nextLine()+'\n');
            }

            copy.close();
            fileReader2.close();
            getString2.close();

            return true;

        }catch (IOException e){
            System.out.println("file not found !");
            return false;
        }
    }

}
