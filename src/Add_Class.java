/**
 * --Add Class--
 * in this class we create window to add class
 * @since 2020
 * @version 1.0
 * @author Seyed Nami Modarressi
 */

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class Add_Class {

    private JFrame addClass;
    private JTextField name;
    private JTextField counter;
    private JTextField capacity;

    private JCheckBox time11;
    private JCheckBox time12;
    private JCheckBox time13;

    private JCheckBox time21;
    private JCheckBox time22;
    private JCheckBox time23;

    private JCheckBox time31;
    private JCheckBox time32;
    private JCheckBox time33;

    private JCheckBox time41;
    private JCheckBox time42;
    private JCheckBox time43;

    private JCheckBox time51;
    private JCheckBox time52;
    private JCheckBox time53;

    private JButton add;

    Color outBlue = new Color(0, 128, 255);
    Color text = new Color(43, 62, 100);
    Color lightBlue_1 = new Color(69, 162, 255);
    Color lightBlue_2 = new Color(208, 237, 255);
    Color background = new Color(237, 237, 237);

    /**
     * creat window to show contents
     */
    public Add_Class() {
        addClass = new JFrame("اضافه کردن کلاس");
        addClass.setSize(400, 600);
        addClass.setLocationRelativeTo(null);
        addClass.setLayout(null);
        addClass.setResizable(false);
        addClass.getContentPane().setBackground(Color.white);
        addClass.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Close_element();
        showClose();
    }

    /**
     * add elements to add class window
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
        addClass.add(name);

        counter = new JTextField("counter");
        counter.setLocation(75,80);
        counter.setSize(250,50);
        counter.setForeground(text);
        counter.setBorder(textBlue);
        counter.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        counter.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        counter.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        counter.setBackground(Color.white);
        addClass.add(counter);

        capacity = new JTextField("capacity");
        capacity.setLocation(75,140);
        capacity.setSize(250,50);
        capacity.setForeground(text);
        capacity.setBorder(textBlue);
        capacity.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, background));
        capacity.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, background));
        capacity.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        capacity.setBackground(Color.white);
        addClass.add(capacity);

        time11 = new JCheckBox("شنبه 10 - 8");
        time11.setLocation(30,200);
        time11.setSize(100,50);

        time12 = new JCheckBox("شنبه 12 - 10");
        time12.setLocation(140,200);
        time12.setSize(120,50);

        time13 = new JCheckBox("شنبه 16 - 14");
        time13.setLocation(260,200);
        time13.setSize(120,50);

        addClass.add(time11);
        addClass.add(time12);
        addClass.add(time13);

        time21 = new JCheckBox("یک شنبه 10 - 8");
        time21.setLocation(30,250);
        time21.setSize(120,50);

        time22 = new JCheckBox("یک شنبه 12 - 10");
        time22.setLocation(140,250);
        time22.setSize(130,50);

        time23 = new JCheckBox("یک شنبه 16 - 14");
        time23.setLocation(260,250);
        time23.setSize(130,50);

        addClass.add(time21);
        addClass.add(time22);
        addClass.add(time23);

        time31 = new JCheckBox("دو شنبه 10 - 8");
        time31.setLocation(30,300);
        time31.setSize(120,50);

        time32 = new JCheckBox("دو شنبه 12 - 10");
        time32.setLocation(140,300);
        time32.setSize(130,50);

        time33 = new JCheckBox("دو شنبه 16 - 14");
        time33.setLocation(260,300);
        time33.setSize(130,50);

        addClass.add(time31);
        addClass.add(time32);
        addClass.add(time33);

        time41 = new JCheckBox("سه شنبه 10 - 8");
        time41.setLocation(30,350);
        time41.setSize(120,50);

        time42 = new JCheckBox("سه شنبه 12 - 10");
        time42.setLocation(140,350);
        time42.setSize(130,50);

        time43 = new JCheckBox("سه شنبه 16 - 14");
        time43.setLocation(260,350);
        time43.setSize(130,50);

        addClass.add(time41);
        addClass.add(time42);
        addClass.add(time43);

        time51 = new JCheckBox("چهارشنبه 10 - 8");
        time51.setLocation(30,400);
        time51.setSize(130,50);

        time52 = new JCheckBox("چهارشنبه 12 - 10");
        time52.setLocation(150,400);
        time52.setSize(140,50);

        time53 = new JCheckBox("چهارشنبه 16 - 14");
        time53.setLocation(275,400);
        time53.setSize(140,50);

        addClass.add(time51);
        addClass.add(time52);
        addClass.add(time53);

        add = new JButton("اخذ");
        add.setLocation(110,500);
        add.setSize(200,70);
        add.setForeground(text);
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setBounds(add.getX(),add.getY(), 180, 30);
        add.setBorder(new RoundedBorder(10));
        addClass.add(add);


    }

    /**
     * show add class window
     */
    public void showClose() {
        addClass.setVisible(true);
    }
}
