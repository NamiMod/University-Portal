/**
 * --Professor Home GUI--
 * in this class we create and show home page ui for professors
 * @author Seyed Nami Modarressi
 * @since 2020
 * @version 1.0
 */

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class Professor_Home_GUI {

    private JFrame Home;
    private JMenuBar menu;
    private JMenu menu_inside;
    private JLabel image;
    private JLabel AccessLevel;
    private JLabel username;
    private JLabel loginDate;
    private JLabel classCounter;
    private JButton change;
    private JButton addClass;
    private JButton setGrade;
    private JButton seeClasses;
    private JButton closeClass;

    Color outBlue = new Color(0,128,255);
    Color text = new Color(43,62,100);
    Color lightBlue_1 = new Color(69,162,255);
    Color lightBlue_2 = new Color(208,237,255);
    Color background = new Color(237,237,237);

    /**
     * create professor home page
     */
    public Professor_Home_GUI() {

        Home = new JFrame();
        Home = new JFrame("پنل مدیریت استاد");
        Home.setSize(700, 500);
        Home.setLocationRelativeTo(null);
        Home.setLayout(null);
        Home.setResizable(false);
        Home.getContentPane().setBackground(Color.white);
        Home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMenu();
        adminHomeElements();
        showAdminHome();

    }

    /**
     * add menu to professor home page
     */
    public void addMenu() {
        menu = new JMenuBar();
        menu_inside = new JMenu("Help");
        JMenuItem Help = new JMenuItem("How to use");
        JMenuItem Report = new JMenuItem("Report Bug");
        JMenuItem About = new JMenuItem("About software");
        menu_inside.add(Help);
        menu_inside.add(Report);
        menu_inside.add(About);
        menu.add(menu_inside);
        menu.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));
        Home.setJMenuBar(menu);
    }

    /**
     * add elements to professor homepage
     */
    public void adminHomeElements() {

        // professor avatar
        image = new JLabel();
        image.setIcon(new ImageIcon("professorpic.png"));
        image.setSize(350,300);
        image.setLocation(20,10);
        Border button = new BevelBorder(BevelBorder.LOWERED, text,text);
        Home.add(image);

        // adding information
        JLabel info = new JLabel(" مشخصات کاربر");
        info.setLocation(400,0);
        info.setSize(180,50);
        info.setForeground(text);
        info.setFont(new Font("Arial", Font.BOLD,20));
        info.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.white));
        info.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.white));
        info.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, lightBlue_1));

        AccessLevel = new JLabel("Access Level : Professor");
        AccessLevel.setLocation(400 , 50);
        AccessLevel.setSize(200,50);
        username = new JLabel("User : MR Professor");
        username.setLocation(400,80);
        username.setSize(200,50);
        loginDate = new JLabel("Login : HH : MM : SS");
        loginDate.setLocation(400,110);
        loginDate.setSize(200,50);
        classCounter = new JLabel("class counter : 7");
        classCounter.setLocation(400,140);
        classCounter.setSize(200,50);

        Home.add(AccessLevel);
        Home.add(username);
        Home.add(loginDate);
        Home.add(classCounter);
        Home.add(info);


        // adding buttons for professor
        change = new JButton("تغییر مشخصات");
        change.setLocation(20,340);
        change.setSize(350,20);
        change.setForeground(text);
        change.setFont(new Font("Arial", Font.PLAIN, 18));
        change.setBounds(change.getX(),change.getY(), 180, 30);
        change.setBorder(new RoundedBorder(30));
        //--
        addClass = new JButton("اضافه کردن کلاس");
        addClass.setLocation(250,340);
        addClass.setSize(200,20);
        addClass.setForeground(text);
        addClass.setFont(new Font("Arial", Font.PLAIN, 18));
        addClass.setBounds(addClass.getX(),addClass.getY(), 180, 30);
        addClass.setBorder(new RoundedBorder(30));
        //--
        setGrade = new JButton("دانشجویان و نمرات");
        setGrade.setLocation(480,340);
        setGrade.setSize(200,20);
        setGrade.setForeground(text);
        setGrade.setFont(new Font("Arial", Font.PLAIN, 18));
        setGrade.setBounds(setGrade.getX(),setGrade.getY(), 180, 30);
        setGrade.setBorder(new RoundedBorder(30));
        //--
        seeClasses = new JButton("لیست کلاس ها");
        seeClasses.setLocation(20,390);
        seeClasses.setSize(200,20);
        seeClasses.setForeground(text);
        seeClasses.setFont(new Font("Arial", Font.PLAIN, 18));
        seeClasses.setBounds(seeClasses.getX(),seeClasses.getY(), 180, 30);
        seeClasses.setBorder(new RoundedBorder(30));
        //--
        closeClass = new JButton("بستن کلاس");
        closeClass.setLocation(250,390);
        closeClass.setSize(200,20);
        closeClass.setForeground(text);
        closeClass.setFont(new Font("Arial", Font.PLAIN, 18));
        closeClass.setBounds(closeClass.getX(),closeClass.getY(), 180, 30);
        closeClass.setBorder(new RoundedBorder(30));

        Home.add(change);
        Home.add(addClass);
        Home.add(seeClasses);
        Home.add(setGrade);
        Home.add(closeClass);

    }

    /**
     * show professor home page
     */
    public void showAdminHome() {
        Home.setVisible(true);
    }


}
