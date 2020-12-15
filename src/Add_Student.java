/**
 * --Add student to system--
 * in this class we create window to add student to system
 * @since 2020
 * @version 1.0
 * @author Seyed Nami Modarressi
 */

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class Add_Student {
    private JFrame addFrame;
    private JTextField username;
    private JTextField password;
    private JButton add;
    private JCheckBox kind;

    Color outBlue = new Color(0, 128, 255);
    Color text = new Color(43, 62, 100);
    Color lightBlue_1 = new Color(69, 162, 255);
    Color lightBlue_2 = new Color(208, 237, 255);
    Color background = new Color(237, 237, 237);

    /**
     * create add student frame
     */
    public Add_Student() {
        addFrame = new JFrame("اضافه کردن دانشجو به سیستم");
        addFrame.setSize(400, 300);
        addFrame.setLocationRelativeTo(null);
        addFrame.setLayout(null);
        addFrame.setResizable(false);
        addFrame.getContentPane().setBackground(Color.white);
        addFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        ADDStudent_element();
        showADDStudent();
    }

    /**
     * add student username and password elements
     */
    public void ADDStudent_element() {
        Border textBlue = new BevelBorder(BevelBorder.LOWERED, outBlue,background);
        username = new JTextField("Username");
        username.setLocation(75,20);
        username.setSize(250,50);
        username.setForeground(text);
        username.setBorder(textBlue);
        username.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        username.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        username.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        username.setBackground(Color.white);
        addFrame.add(username);

        password = new JTextField("Password");
        password.setLocation(75,70);
        password.setSize(250,50);
        password.setForeground(text);
        password.setBorder(textBlue);
        password.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        password.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        password.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        password.setBackground(Color.white);
        addFrame.add(password);


        kind = new JCheckBox("ممتاز ورودی");
        kind.setLocation(70,130);
        kind.setSize(100,50);
        addFrame.add(kind);

        add = new JButton("اضافه کردن");
        add.setLocation(110,200);
        add.setSize(200,70);
        add.setForeground(text);
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setBounds(add.getX(),add.getY(), 180, 30);
        add.setBorder(new RoundedBorder(10));
        addFrame.add(add);
    }

    /**
     * show add student window
     */
    public void showADDStudent() {
        addFrame.setVisible(true);
    }

}
