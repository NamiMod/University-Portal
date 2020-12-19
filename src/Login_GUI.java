/**
 * --Login Class--
 * this is UI For login
 * University Portal
 * @since 2020
 * @author Seyed Nami Modarressi
 * @version 1.0
 */

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import static javax.swing.JOptionPane.showMessageDialog;

public class Login_GUI {

    private JFrame loginFrame;
    private JLabel image;
    private JTextField username;
    private JPasswordField password;
    private JButton login;

    Color outBlue = new Color(0,128,255);
    Color text = new Color(43,62,100);
    Color lightBlue_1 = new Color(69,162,255);
    Color lightBlue_2 = new Color(208,237,255);
    Color background = new Color(237,237,237);

    /**
     * create login frame
     */
    public Login_GUI() {
        loginFrame = new JFrame("ورود");
        loginFrame.setSize(700, 400);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setLayout(null);
        loginFrame.setResizable(false);
        loginFrame.getContentPane().setBackground(Color.white);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login_element();
        showLogin();
    }

    /**
     * add login elements like password field , username field , ...
     */
    public void login_element() {
        Border textBlue = new BevelBorder(BevelBorder.LOWERED, outBlue,background);
        Border button = new BevelBorder(BevelBorder.LOWERED, text,text);
        image = new JLabel(new ImageIcon("loginpic.png"));
        image.setSize(350,350);
        image.setLocation(10,10);
        loginFrame.add(image);
        // ********************************************************
        // add login elements ( username - password - login button )
        username = new JTextField("username");
        username.setLocation(400,80);
        username.setSize(250,50);
        username.setForeground(text);
        username.setBorder(textBlue);
        username.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        username.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        username.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        username.setBackground(Color.white);

        password = new JPasswordField("password");
        password.setLocation(400,140);
        password.setSize(250,50);
        password.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        password.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        password.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        password.setForeground(text);
        password.setBackground(Color.white);

        login = new JButton("ورود به سامانه");
        login.setLocation(435,250);
        login.setSize(200,70);
        login.setForeground(text);
        login.setFont(new Font("Arial", Font.PLAIN, 20));
        login.setBounds(login.getX(),login.getY(), 180, 30);
        login.setBorder(new RoundedBorder(30));
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (username.getText().length() == 0){
                    showMessageDialog(null, "username in empty !");
                }
                else if (password.getText().length() == 0){
                    showMessageDialog(null, "password in empty !");
                }
                else {
                    try {
                        Manager m = new Manager();
                        int c;
                        c = m.login(username.getText() , password.getText());
                        if (c == -1){
                            showMessageDialog(null, "Username or Password is incorrect");
                        }else {
                            if (c == 0) {
                                Admin_Home_GUI p = new Admin_Home_GUI(username.getText(),java.time.LocalTime.now());
                                loginFrame.hide();
                            }
                            if (c == 1) {
                                Student_Home_GUI q = new Student_Home_GUI(username.getText(), java.time.LocalTime.now());
                                loginFrame.hide();
                            }
                            if (c == 2) {
                                Professor_Home_GUI n = new Professor_Home_GUI(username.getText(),java.time.LocalTime.now());
                                loginFrame.hide();
                            }
                        }
                    } catch (IOException fileNotFoundException) {
                        System.out.println("Cant login !");
                    }

                }

            }
        });

        loginFrame.add(login);
        loginFrame.add(password);
        loginFrame.add(username);

    }

    /**
     * show login frame
     */
    public void showLogin() {
        loginFrame.setVisible(true);
    }

}

