/**
 * --Students Grades--
 * in this class we create window show students for professor
 * @since 2020
 * @version 1.0
 * @author Seyed Nami Modarressi
 */

import javax.swing.*;
import java.awt.*;

public class Students_Grades {
    private JFrame show;
    private JTextArea list;
    private JTextArea grades;
    private JButton add;
    private JLabel stu;
    private JLabel gra;

    Color outBlue = new Color(0, 128, 255);
    Color text = new Color(43, 62, 100);
    Color lightBlue_1 = new Color(69, 162, 255);
    Color lightBlue_2 = new Color(208, 237, 255);
    Color background = new Color(237, 237,237);

    /**
     * creat new window to show list of students
     */
    public Students_Grades(){
        show = new JFrame("لیست دانشجویان و نمرات");
        show.setSize(510, 500);
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

        stu = new JLabel("دانشجویان");
        stu.setLocation(170,0);
        stu.setFont(new Font("Arial",Font.BOLD,20));
        stu.setForeground(text);
        stu.setSize(100,50);
        show.add(stu);

        gra = new JLabel("نمرات");
        gra.setLocation(430,0);
        gra.setForeground(text);
        gra.setFont(new Font("Arial",Font.BOLD,20));
        gra.setSize(100,50);
        show.add(gra);


        list = new JTextArea();
        list.setLocation(10,50);
        list.setSize(380,350);
        list.setEditable(false);
        list.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, lightBlue_1));
        show.add(list);

        grades = new JTextArea();
        grades.setLocation(400,50);
        grades.setSize(100,350);
        grades.setEditable(true);
        grades.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, lightBlue_1));
        show.add(grades);


        add = new JButton("ثبت نمرات");
        add.setLocation(170,420);
        add.setSize(200,70);
        add.setForeground(text);
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setBounds(add.getX(),add.getY(), 180, 30);
        add.setBorder(new RoundedBorder(10));
        show.add(add);
    }

    /**
     * show list of students window
     */
    public void show(){
        show.setVisible(true);
    }
}
