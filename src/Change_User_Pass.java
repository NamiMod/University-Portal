/**
 * --Change username and password--
 * in this class we create window to change username and password
 * @since 2020
 * @version 1.0
 * @author Seyed Nami Modarressi
 */

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class Change_User_Pass {
    private JFrame changeFrame;
    private JTextField oldUsername;
    private JTextField newUsername;
    private JTextField oldPassword;
    private JTextField newPassword;
    private JButton change;

    Color outBlue = new Color(0, 128, 255);
    Color text = new Color(43, 62, 100);
    Color lightBlue_1 = new Color(69, 162, 255);
    Color lightBlue_2 = new Color(208, 237, 255);
    Color background = new Color(237, 237, 237);

    /**
     * create login frame
     */
    public Change_User_Pass() {
        changeFrame = new JFrame("تغییر نام کاربری یا رمزعبور");
        changeFrame.setSize(400, 400);
        changeFrame.setLocationRelativeTo(null);
        changeFrame.setLayout(null);
        changeFrame.setResizable(false);
        changeFrame.getContentPane().setBackground(Color.white);
        changeFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        change_element();
        showChange();
    }

    /**
     * add change username or password
     */
    public void change_element() {
        Border textBlue = new BevelBorder(BevelBorder.LOWERED, outBlue,background);
        oldUsername = new JTextField("OLD Username");
        oldUsername.setLocation(75,10);
        oldUsername.setSize(250,50);
        oldUsername.setForeground(text);
        oldUsername.setBorder(textBlue);
        oldUsername.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        oldUsername.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        oldUsername.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        oldUsername.setBackground(Color.white);
        changeFrame.add(oldUsername);

        newUsername = new JTextField("NEW Username");
        newUsername.setLocation(75,70);
        newUsername.setSize(250,50);
        newUsername.setForeground(text);
        newUsername.setBorder(textBlue);
        newUsername.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        newUsername.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        newUsername.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        newUsername.setBackground(Color.white);
        changeFrame.add(newUsername);

        oldPassword = new JTextField("OLD Password");
        oldPassword.setLocation(75,170);
        oldPassword.setSize(250,50);
        oldPassword.setForeground(text);
        oldPassword.setBorder(textBlue);
        oldPassword.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        oldPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        oldPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        oldPassword.setBackground(Color.white);
        changeFrame.add(oldPassword);

        newPassword = new JTextField("NEW Password");
        newPassword.setLocation(75,230);
        newPassword.setSize(250,50);
        newPassword.setForeground(text);
        newPassword.setBorder(textBlue);
        newPassword.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        newPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        newPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        newPassword.setBackground(Color.white);
        changeFrame.add(newPassword);


        change = new JButton("انجام تغییرات");
        change.setLocation(110,320);
        change.setSize(200,70);
        change.setForeground(text);
        change.setFont(new Font("Arial", Font.PLAIN, 20));
        change.setBounds(change.getX(),change.getY(), 180, 30);
        change.setBorder(new RoundedBorder(10));
        changeFrame.add(change);
    }

    /**
     * show change username or password window
     */
    public void showChange() {
        changeFrame.setVisible(true);
    }

}
