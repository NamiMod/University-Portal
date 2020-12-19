/**
 * --Student Home GUI--
 * in this class we create and show home page ui for students
 * @author Seyed Nami Modarressi
 * @since 2020
 * @version 1.0
 */

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.time.LocalTime;
import java.util.Date;

public class Student_Home_GUI {

    private JFrame Home;
    private JMenuBar menu;
    private JMenu menu_inside;
    private JLabel image;
    private JLabel AccessLevel;
    private JLabel username;
    private JLabel loginDate;
    private JLabel credit;
    private JLabel classCounter;
    private JLabel grade;
    private JLabel kind;
    private JButton change;
    private JButton food;
    private JButton addCredit;
    private JButton addClass;
    private JButton seeClass;
    private String name;

    Color outBlue = new Color(0,128,255);
    Color text = new Color(43,62,100);
    Color lightBlue_1 = new Color(69,162,255);
    Color lightBlue_2 = new Color(208,237,255);
    Color background = new Color(237,237,237);

    /**
     * create student home page
     */
    public Student_Home_GUI(String name , LocalTime l) {

        this.name = name;
        Home = new JFrame();
        Home = new JFrame("پنل مدیریت دانشجو");
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
     * add menu to student home page
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
     * add elements to student homepage
     */
    public void adminHomeElements() {

        // admin avatar
        image = new JLabel();
        image.setIcon(new ImageIcon("studentpic.png"));
        image.setSize(350,300);
        image.setLocation(20,5);
        Border button = new BevelBorder(BevelBorder.LOWERED, text,text);
        // image.setBorder(button);
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

        AccessLevel = new JLabel("Access Level : Student");
        AccessLevel.setLocation(400 , 50);
        AccessLevel.setSize(200,50);
        username = new JLabel("User : Seyed Nami Modarressi");
        username.setLocation(400,80);
        username.setSize(200,50);
        loginDate = new JLabel("Login : HH : MM : SS");
        loginDate.setLocation(400,110);
        loginDate.setSize(200,50);
        credit = new JLabel("Credit : 20 $");
        credit.setLocation(400,140);
        credit.setSize(200,50);
        classCounter = new JLabel("class counter : 7");
        classCounter.setLocation(400,170);
        classCounter.setSize(200,50);
        grade = new JLabel("Grade : 18.13");
        grade.setLocation(400,200);
        grade.setSize(200,50);
        kind= new JLabel("kind : normal");
        kind.setLocation(400,230);
        kind.setSize(200,50);

        Home.add(AccessLevel);
        Home.add(username);
        Home.add(loginDate);
        Home.add(credit);
        Home.add(classCounter);
        Home.add(kind);
        Home.add(grade);
        Home.add(info);


        // adding buttons for student
        change = new JButton("تغییر مشخصات");
        change.setLocation(20,340);
        change.setSize(350,20);
        change.setForeground(text);
        change.setFont(new Font("Arial", Font.PLAIN, 18));
        change.setBounds(change.getX(),change.getY(), 180, 30);
        change.setBorder(new RoundedBorder(30));
        //--
        food = new JButton("رزرو غذا");
        food.setLocation(250,340);
        food.setSize(200,20);
        food.setForeground(text);
        food.setFont(new Font("Arial", Font.PLAIN, 18));
        food.setBounds(food.getX(),food.getY(), 180, 30);
        food.setBorder(new RoundedBorder(30));
        //--
        addCredit = new JButton("افزایش اعتبار");
        addCredit.setLocation(480,340);
        addCredit.setSize(200,20);
        addCredit.setForeground(text);
        addCredit.setFont(new Font("Arial", Font.PLAIN, 18));
        addCredit.setBounds(addCredit.getX(),addCredit.getY(), 180, 30);
        addCredit.setBorder(new RoundedBorder(30));
        //--
        addClass = new JButton("اخذ کلاس");
        addClass.setLocation(20,390);
        addClass.setSize(200,20);
        addClass.setForeground(text);
        addClass.setFont(new Font("Arial", Font.PLAIN, 18));
        addClass.setBounds(addClass.getX(),addClass.getY(), 180, 30);
        addClass.setBorder(new RoundedBorder(30));
        //--
        seeClass = new JButton("کلاس های اخذ شده");
        seeClass.setLocation(250,390);
        seeClass.setSize(200,20);
        seeClass.setForeground(text);
        seeClass.setFont(new Font("Arial", Font.PLAIN, 18));
        seeClass.setBounds(seeClass.getX(),seeClass.getY(), 180, 30);
        seeClass.setBorder(new RoundedBorder(30));

        Home.add(change);
        Home.add(addClass);
        Home.add(food);
        Home.add(addCredit);
        Home.add(seeClass);

    }

    /**
     * show student home page
     */
    public void showAdminHome() {
        Home.setVisible(true);
    }


}
