/**
 * --reserve Food--
 * in this class we create window to reserve food
 * @since 2020
 * @version 1.0
 * @author Seyed Nami Modarressi
 */

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalTime;

public class FoodReservation {

    private JFrame food;
    private JCheckBox shanbe_t;
    private JCheckBox yekshanbe_t;
    private JCheckBox doshanbe_t;
    private JCheckBox seshanbe_t;
    private JCheckBox chaharshanbe_t;
    private JButton add;
    private JLabel shanbe;
    private JLabel yekshanbe;
    private JLabel doshanbe;
    private JLabel seshanbe;
    private JLabel chaharshanbe;
    private JLabel p1;
    private JLabel p2;
    private JLabel p3;
    private JLabel p4;
    private JLabel p5;
    private String name;
    private LocalTime l;

    Color outBlue = new Color(0, 128, 255);
    Color text = new Color(43, 62, 100);
    Color lightBlue_1 = new Color(69, 162, 255);
    Color lightBlue_2 = new Color(208, 237, 255);
    Color background = new Color(237, 237, 237);

    /**
     * creat window to reserve foods
     */
    public FoodReservation(String name, LocalTime l) {
        this.name=name;
        this.l=l;
        food = new JFrame("رزرو غذا");
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
     * add elements to window in order to reserve food
     */
    public void food_element() {

        Border textBlue = new BevelBorder(BevelBorder.LOWERED, outBlue,background);

        shanbe = new JLabel("شنبه");
        shanbe.setLocation(40,0);
        shanbe.setSize(100,50);
        shanbe.setFont(new Font("Arial",Font.BOLD,15));
        shanbe.setForeground(text);
        food.add(shanbe);

        shanbe_t = new JCheckBox("food 1");
        shanbe_t.setLocation(160,0);
        shanbe_t.setSize(100,50);
        food.add(shanbe_t);

        p1 = new JLabel("10,000 T");
        p1.setLocation(300,0);
        p1.setSize(100,50);
        p1.setForeground(lightBlue_1);
        food.add(p1);


        yekshanbe = new JLabel("یک شنبه");
        yekshanbe.setLocation(40,50);
        yekshanbe.setSize(100,50);
        yekshanbe.setFont(new Font("Arial",Font.BOLD,15));
        yekshanbe.setForeground(text);
        food.add(yekshanbe);

        yekshanbe_t = new JCheckBox("food 2");
        yekshanbe_t.setLocation(160,50);
        yekshanbe_t.setSize(100,50);
        food.add(yekshanbe_t);

        p2 = new JLabel("15,000 T");
        p2.setLocation(300,50);
        p2.setSize(100,50);
        p2.setForeground(lightBlue_1);
        food.add(p2);

        doshanbe = new JLabel("دو شنبه");
        doshanbe.setLocation(40,100);
        doshanbe.setSize(100,50);
        doshanbe.setFont(new Font("Arial",Font.BOLD,15));
        doshanbe.setForeground(text);
        food.add(doshanbe);

        doshanbe_t = new JCheckBox("food 3");
        doshanbe_t.setLocation(160,100);
        doshanbe_t.setSize(100,50);
        food.add(doshanbe_t);

        p3 = new JLabel("7,000 T");
        p3.setLocation(300,100);
        p3.setSize(100,50);
        p3.setForeground(lightBlue_1);
        food.add(p3);

        seshanbe = new JLabel("سه شنبه");
        seshanbe.setLocation(40,150);
        seshanbe.setSize(100,50);
        seshanbe.setFont(new Font("Arial",Font.BOLD,15));
        seshanbe.setForeground(text);
        food.add(seshanbe);

        seshanbe_t = new JCheckBox("food 4");
        seshanbe_t.setLocation(160,150);
        seshanbe_t.setSize(100,50);
        food.add(seshanbe_t);

        p4 = new JLabel("9,500 T");
        p4.setLocation(300,150);
        p4.setSize(100,50);
        p4.setForeground(lightBlue_1);
        food.add(p4);

        chaharshanbe = new JLabel("چهار شنبه");
        chaharshanbe.setLocation(40,200);
        chaharshanbe.setSize(100,50);
        chaharshanbe.setFont(new Font("Arial",Font.BOLD,15));
        chaharshanbe.setForeground(text);
        food.add(chaharshanbe);

        chaharshanbe_t = new JCheckBox("food 5");
        chaharshanbe_t.setLocation(160,200);
        chaharshanbe_t.setSize(100,50);
        food.add(chaharshanbe_t);

        p5 = new JLabel("12,500 T");
        p5.setLocation(300,200);
        p5.setSize(100,50);
        p5.setForeground(lightBlue_1);
        food.add(p5);

        add = new JButton("رزرو");
        add.setLocation(110,300);
        add.setSize(200,70);
        add.setForeground(text);
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setBounds(add.getX(),add.getY(), 180, 30);
        add.setBorder(new RoundedBorder(30));
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                food.hide();
                try {
                    int x=0;
                    Student p = new Student();
                    if (shanbe_t.isSelected()){
                        x=x+Integer.parseInt(p1.getText());
                    }
                    if (yekshanbe_t.isSelected()){
                        x=x+Integer.parseInt(p2.getText());
                    }
                    if (doshanbe_t.isSelected()){
                        x=x+Integer.parseInt(p3.getText());
                    }
                    if (seshanbe_t.isSelected()){
                        x=x+Integer.parseInt(p4.getText());
                    }
                    if (chaharshanbe_t.isSelected()){
                        x=x+Integer.parseInt(p5.getText());
                    }
                    p.foodReserve(name,x);
                    Student_Home_GUI s = new Student_Home_GUI(name,l);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        food.add(add);

    }

    /**
     * show window to reserve foods
     */
    public void showfood() {
        food.setVisible(true);
    }

}
