/**
 * --Show Classes for Student--
 * in this class we create window show classes for students
 * @since 2020
 * @version 1.0
 * @author Seyed Nami Modarressi
 */

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

public class ShowClasses_Student {
    private JFrame show;
    private JTextArea list;
    private JLabel title;
    private String name;

    Color outBlue = new Color(0, 128, 255);
    Color text = new Color(43, 62, 100);
    Color lightBlue_1 = new Color(69, 162, 255);
    Color lightBlue_2 = new Color(208, 237, 255);
    Color background = new Color(237, 237,237);

    /**
     * creat new window to show list of classes
     */
    public ShowClasses_Student(String name) throws FileNotFoundException {
        this.name=name;
        show = new JFrame("لیست کلاس ها");
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
    public void show_element() throws FileNotFoundException {

        title = new JLabel("کلاس های شما در این ترم");
        title.setLocation(125,0);
        title.setFont(new Font("Arial",Font.BOLD,18));
        title.setSize(200,50);
        title.setForeground(text);
        show.add(title);

        Student p = new Student();
        list = new JTextArea();
        list.setLocation(10,50);
        list.setSize(380,300);
        list.setEditable(false);
        list.setText(p.listOfClasses(name));
        list.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, lightBlue_1));
        show.add(list);
    }

    /**
     * show list of classes window
     */
    public void show(){
        show.setVisible(true);
    }
}
