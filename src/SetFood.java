/**
 * --Set Food--
 * in this class we create window to add food
 * @since 2020
 * @version 1.0
 * @author Seyed Nami Modarressi
 */

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class SetFood {

    private JFrame food;
    private JLabel shanbe;
    private JTextField shanbe_f;

    private JLabel yekshanbe;
    private JTextField yekshanbe_f;

    private JLabel doshanbe;
    private JTextField doshanbe_f;

    private JLabel seshanbe;
    private JTextField seshanbe_f;

    private JLabel chaharshanbe;
    private JTextField chaharshanbe_f;

    private JButton add;

    Color outBlue = new Color(0, 128, 255);
    Color text = new Color(43, 62, 100);
    Color lightBlue_1 = new Color(69, 162, 255);
    Color lightBlue_2 = new Color(208, 237, 255);
    Color background = new Color(237, 237, 237);

    /**
     * creat window to set foods
     */
    public SetFood(){
        food = new JFrame("ثبت برنامه غذایی");
        food.setSize(400, 400);
        food.setLocationRelativeTo(null);
        food.setLayout(null);
        food.setResizable(false);
        food.getContentPane().setBackground(Color.white);
        food.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        food_element();
        showfood();
    }

    /**
     * add elements to window
     */
    public void food_element(){

        Border textBlue = new BevelBorder(BevelBorder.LOWERED, outBlue,background);

        shanbe = new JLabel("شنبه");
        shanbe.setLocation(10,0);
        shanbe.setSize(100,50);
        shanbe.setFont(new Font("Arial",Font.BOLD,15));
        shanbe.setForeground(text);
        food.add(shanbe);

        shanbe_f = new JTextField("food");
        shanbe_f.setLocation(100,0);
        shanbe_f.setSize(250,50);
        shanbe_f.setForeground(text);
        shanbe_f.setBorder(textBlue);
        shanbe_f.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        shanbe_f.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        shanbe_f.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        shanbe_f.setBackground(Color.white);
        food.add(shanbe_f);

        yekshanbe = new JLabel("یک شنبه");
        yekshanbe.setLocation(10,50);
        yekshanbe.setSize(100,50);
        yekshanbe.setFont(new Font("Arial",Font.BOLD,15));
        yekshanbe.setForeground(text);
        food.add(yekshanbe);

        yekshanbe_f = new JTextField("food");
        yekshanbe_f.setLocation(100,50);
        yekshanbe_f.setSize(250,50);
        yekshanbe_f.setForeground(text);
        yekshanbe_f.setBorder(textBlue);
        yekshanbe_f.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        yekshanbe_f.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        yekshanbe_f.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        yekshanbe_f.setBackground(Color.white);
        food.add(yekshanbe_f);

        doshanbe = new JLabel("دو شنبه");
        doshanbe.setLocation(10,100);
        doshanbe.setSize(100,50);
        doshanbe.setFont(new Font("Arial",Font.BOLD,15));
        doshanbe.setForeground(text);
        food.add(doshanbe);

        doshanbe_f = new JTextField("food");
        doshanbe_f.setLocation(100,100);
        doshanbe_f.setSize(250,50);
        doshanbe_f.setForeground(text);
        doshanbe_f.setBorder(textBlue);
        doshanbe_f.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        doshanbe_f.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        doshanbe_f.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        doshanbe_f.setBackground(Color.white);
        food.add(doshanbe_f);

        seshanbe = new JLabel("سه شنبه");
        seshanbe.setLocation(10,150);
        seshanbe.setSize(100,50);
        seshanbe.setFont(new Font("Arial",Font.BOLD,15));
        seshanbe.setForeground(text);
        food.add(seshanbe);

        seshanbe_f = new JTextField("food");
        seshanbe_f.setLocation(100,150);
        seshanbe_f.setSize(250,50);
        seshanbe_f.setForeground(text);
        seshanbe_f.setBorder(textBlue);
        seshanbe_f.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        seshanbe_f.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        seshanbe_f.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        seshanbe_f.setBackground(Color.white);
        food.add(seshanbe_f);

        chaharshanbe = new JLabel("چهار شنبه");
        chaharshanbe.setLocation(10,200);
        chaharshanbe.setSize(100,50);
        chaharshanbe.setFont(new Font("Arial",Font.BOLD,15));
        chaharshanbe.setForeground(text);
        food.add(chaharshanbe);

        chaharshanbe_f = new JTextField("food");
        chaharshanbe_f.setLocation(100,200);
        chaharshanbe_f.setSize(250,50);
        chaharshanbe_f.setForeground(text);
        chaharshanbe_f.setBorder(textBlue);
        chaharshanbe_f.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        chaharshanbe_f.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        chaharshanbe_f.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        chaharshanbe_f.setBackground(Color.white);
        food.add(chaharshanbe_f);

        add = new JButton("ثبت");
        add.setLocation(110,300);
        add.setSize(200,70);
        add.setForeground(text);
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setBounds(add.getX(),add.getY(), 180, 30);
        add.setBorder(new RoundedBorder(10));
        food.add(add);

    }

    /**
     * show window to set foods
     */
    public void showfood(){
        food.setVisible(true);
    }

}
