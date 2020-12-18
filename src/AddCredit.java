/**
 * --AddCredit--
 * in this class we create window to add credit to account for students
 * @since 2020
 * @version 1.0
 * @author Seyed Nami Modarressi
 */

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class AddCredit {
    private JFrame changeFrame;
    private JTextField card1;
    private JTextField card2;
    private JTextField card3;
    private JTextField card4;
    private JTextField password;
    private JTextField value;
    private JButton add;

    Color outBlue = new Color(0, 128, 255);
    Color text = new Color(43, 62, 100);
    Color lightBlue_1 = new Color(69, 162, 255);
    Color lightBlue_2 = new Color(208, 237, 255);
    Color background = new Color(237, 237, 237);

    /**
     * create adding credit frame
     */
    public AddCredit() {
        changeFrame = new JFrame("افزایش اعتبار");
        changeFrame.setSize(400, 360);
        changeFrame.setLocationRelativeTo(null);
        changeFrame.setLayout(null);
        changeFrame.setResizable(false);
        changeFrame.getContentPane().setBackground(Color.white);
        changeFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        add_element();
        showAdd();
    }

    /**
     * add adding credit elements
     */
    public void add_element() {

        Border textBlue = new BevelBorder(BevelBorder.LOWERED, outBlue,background);

        card1 = new JTextField("XXXX");
        card1.setLocation(100,40);
        card1.setSize(33,30);
        card1.setForeground(text);
        card1.setBorder(textBlue);
        card1.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        card1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        card1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        card1.setBackground(Color.white);
        changeFrame.add(card1);

        card2 = new JTextField("XXXX");
        card2.setLocation(150,40);
        card2.setSize(33,30);
        card2.setForeground(text);
        card2.setBorder(textBlue);
        card2.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        card2.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        card2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        card2.setBackground(Color.white);
        changeFrame.add(card2);

        card3 = new JTextField("XXXX");
        card3.setLocation(200,40);
        card3.setSize(33,30);
        card3.setForeground(text);
        card3.setBorder(textBlue);
        card3.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        card3.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        card3.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        card3.setBackground(Color.white);
        changeFrame.add(card3);

        card4 = new JTextField("XXXX");
        card4.setLocation(250,40);
        card4.setSize(33,30);
        card4.setForeground(text);
        card4.setBorder(textBlue);
        card4.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, lightBlue_1));
        card4.setBorder(BorderFactory.createMatteBorder(0, 2, 0, 0, lightBlue_1));
        card4.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, lightBlue_1));
        card4.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        card4.setBackground(Color.white);
        changeFrame.add(card4);

        password = new JTextField("Password");
        password.setLocation(100,80);
        password.setSize(185,50);
        password.setForeground(text);
        password.setBorder(textBlue);
        password.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        password.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        password.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        password.setBackground(Color.white);
        changeFrame.add(password);

        value = new JTextField("Price(Rial)");
        value.setLocation(100,140);
        value.setSize(185,50);
        value.setForeground(text);
        value.setBorder(textBlue);
        value.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        value.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        value.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        value.setBackground(Color.white);
        changeFrame.add(value);

        add = new JButton("افزایش اعتبار");
        add.setLocation(104,260);
        add.setSize(185,70);
        add.setForeground(text);
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setBounds(add.getX(),add.getY(), 180, 30);
        add.setBorder(new RoundedBorder(30));
        changeFrame.add(add);

    }

    /**
     * show adding credit window
     */
    public void showAdd() {
        changeFrame.setVisible(true);
    }

}
