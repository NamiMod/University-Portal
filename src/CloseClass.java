/**
 * --Close Class--
 * in this class we create window to close class for professors
 * @since 2020
 * @version 1.0
 * @author Seyed Nami Modarressi
 */

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class CloseClass {

    private JFrame closeFrame;
    private JTextField name;
    private JButton close;

    Color outBlue = new Color(0, 128, 255);
    Color text = new Color(43, 62, 100);
    Color lightBlue_1 = new Color(69, 162, 255);
    Color lightBlue_2 = new Color(208, 237, 255);
    Color background = new Color(237, 237, 237);

    /**
     * creat window to show contents
     */
    public CloseClass() {
        closeFrame = new JFrame("حذف کلاس");
        closeFrame.setSize(400, 250);
        closeFrame.setLocationRelativeTo(null);
        closeFrame.setLayout(null);
        closeFrame.setResizable(false);
        closeFrame.getContentPane().setBackground(Color.white);
        closeFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Close_element();
        showClose();
    }

    /**
     * add elements to close class window
     */
    public void Close_element() {

        Border textBlue = new BevelBorder(BevelBorder.LOWERED, outBlue,background);

        name = new JTextField("nameٔ");
        name.setLocation(75,20);
        name.setSize(250,50);
        name.setForeground(text);
        name.setBorder(textBlue);
        name.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        name.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        name.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        name.setBackground(Color.white);
        closeFrame.add(name);

        close = new JButton("حذف");
        close.setLocation(110,150);
        close.setSize(200,70);
        close.setForeground(text);
        close.setFont(new Font("Arial", Font.PLAIN, 20));
        close.setBounds(close.getX(),close.getY(), 180, 30);
        close.setBorder(new RoundedBorder(10));
        closeFrame.add(close);
    }

    /**
     * show close class window
     */
    public void showClose() {
        closeFrame.setVisible(true);
    }
}
