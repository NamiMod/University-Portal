/**
 * --Show Students--
 * in this class we create window show students for admin
 * @since 2020
 * @version 1.0
 * @author Seyed Nami Modarressi
 */

import javax.swing.*;
import java.awt.*;

public class ShowStudents {
    private JFrame show;
    private JTextArea list;

    Color outBlue = new Color(0, 128, 255);
    Color text = new Color(43, 62, 100);
    Color lightBlue_1 = new Color(69, 162, 255);
    Color lightBlue_2 = new Color(208, 237, 255);
    Color background = new Color(237, 237,237);

    /**
     * creat new window to show list of students
     */
    public ShowStudents(){
        show = new JFrame("لیست دانشجویان");
        show.setSize(400, 400);
        show.setLocationRelativeTo(null);
        show.setLayout(null);
        show.setResizable(false);
        show.getContentPane().setBackground(Color.white);
        show.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        show_element();
        show();
    }

    /**
     * add list elements
     */
    public void show_element(){
        list = new JTextArea();
        list.setLocation(10,10);
        list.setSize(380,350);
        list.setEditable(false);
        list.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, lightBlue_1));
        show.add(list);
    }

    /**
     * show list of students window
     */
    public void show(){
        show.setVisible(true);
    }
}