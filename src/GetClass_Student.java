/**
 * --GetClass_Student--
 * in this class we create window to add class to student
 * @since 2020
 * @version 1.0
 * @author Seyed Nami Modarressi
 */

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class GetClass_Student {

    private JFrame getClassFrame;
    private JTextField name;
    private JButton add;

    Color outBlue = new Color(0, 128, 255);
    Color text = new Color(43, 62, 100);
    Color lightBlue_1 = new Color(69, 162, 255);
    Color lightBlue_2 = new Color(208, 237, 255);
    Color background = new Color(237, 237, 237);

    /**
     * creat window to show contents
     */
    public GetClass_Student() {
        getClassFrame = new JFrame("اخذ درس");
        getClassFrame.setSize(400, 250);
        getClassFrame.setLocationRelativeTo(null);
        getClassFrame.setLayout(null);
        getClassFrame.setResizable(false);
        getClassFrame.getContentPane().setBackground(Color.white);
        getClassFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Close_element();
        showClose();
    }

    /**
     * add elements to get class window
     */
    public void Close_element() {

        Border textBlue = new BevelBorder(BevelBorder.LOWERED, outBlue,background);

        name = new JTextField("name");
        name.setLocation(75,20);
        name.setSize(250,50);
        name.setForeground(text);
        name.setBorder(textBlue);
        name.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        name.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        name.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        name.setBackground(Color.white);
        getClassFrame.add(name);

        add = new JButton("اخذ");
        add.setLocation(110,150);
        add.setSize(200,70);
        add.setForeground(text);
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setBounds(add.getX(),add.getY(), 180, 30);
        add.setBorder(new RoundedBorder(10));
        getClassFrame.add(add);
    }

    /**
     * show get class window
     */
    public void showClose() {
        getClassFrame.setVisible(true);
    }
}
