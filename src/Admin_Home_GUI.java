/**
 * --Admin Home GUI--
 * in this class we create and show home page ui for admin
 * @author Seyed Nami Modarressi
 * @since 2020
 * @version 1.0
 */

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.Date;

public class Admin_Home_GUI {

    private JFrame Home;
    private JMenuBar menu;
    private JMenu menu_inside;
    private JLabel image;
    private JLabel AccessLevel;
    private JLabel username;
    private JLabel loginDate;
    private JButton change;
    private JButton food;
    private JButton addStudent;
    private JButton addProfessor;
    private JButton studentsList;
    private JButton professorsList;
    private JButton classesList;
    private String name;
    private LocalTime d;

    Color outBlue = new Color(0,128,255);
    Color text = new Color(43,62,100);
    Color lightBlue_1 = new Color(69,162,255);
    Color lightBlue_2 = new Color(208,237,255);
    Color background = new Color(237,237,237);

    /**
     * create admin home page
     * @param d
     */
    public Admin_Home_GUI(String name,LocalTime d) {
        this.name=name;
        this.d=d;
        Home = new JFrame();
        Home = new JFrame("پنل مدیریت ادمین");
        Home.setSize(700, 550);
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
     * add menu to admin home page
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
     * add elements to admin homepage
     */
    public void adminHomeElements() {

        // admin avatar
        image = new JLabel();
        image.setIcon(new ImageIcon("adminpic.png"));
        image.setSize(300,300);
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

        AccessLevel = new JLabel("Access Level : Admin");
        AccessLevel.setLocation(400 , 50);
        AccessLevel.setSize(200,50);
        username = new JLabel();
        username.setText("User : "+ name );
        username.setLocation(400,80);
        username.setSize(200,50);
        loginDate = new JLabel();
        loginDate.setText("Login : "+ d.getHour()+':'+d.getMinute()+':'+d.getSecond());
        loginDate.setLocation(400,110);
        loginDate.setSize(200,50);
        Home.add(AccessLevel);
        Home.add(username);
        Home.add(loginDate);
        Home.add(info);

        // adding buttons for admin
        change = new JButton("تغییر مشخصات");
        change.setLocation(20,340);
        change.setSize(350,20);
        change.setToolTipText("تغییر نام کاربری یا رمز عبور");
        change.setForeground(text);
        change.setFont(new Font("Arial", Font.PLAIN, 18));
        change.setBounds(change.getX(),change.getY(), 180, 30);
        change.setBorder(new RoundedBorder(30));
        change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Change_User_Pass p = new Change_User_Pass();
                Home.hide();
            }
        });
        //--
        food = new JButton("ثبت برنامه غذا");
        food.setLocation(250,340);
        food.setToolTipText("اضافه کردن برنامه غذایی");
        food.setSize(200,20);
        food.setForeground(text);
        food.setFont(new Font("Arial", Font.PLAIN, 18));
        food.setBounds(food.getX(),food.getY(), 180, 30);
        food.setBorder(new RoundedBorder(30));
        food.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetFood s = new SetFood();
                Home.hide();
            }
        });
        //--
        addStudent = new JButton("اضافه کردن دانشجو");
        addStudent.setLocation(480,340);
        addStudent.setSize(200,20);
        addStudent.setForeground(text);
        addStudent.setToolTipText("اضافه کردن یک دانشجو جدید به سیستم");
        addStudent.setFont(new Font("Arial", Font.PLAIN, 18));
        addStudent.setBounds(addStudent.getX(),addStudent.getY(), 180, 30);
        addStudent.setBorder(new RoundedBorder(30));
        addStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Add_Student p = new Add_Student();
                Home.hide();
            }
        });
        //--
        addProfessor = new JButton("اضافه کردن استاد");
        addProfessor.setLocation(20,390);
        addProfessor.setSize(200,20);
        addProfessor.setForeground(text);
        addProfessor.setToolTipText("اضافه کردن یک استاد جدید به سیستم");
        addProfessor.setFont(new Font("Arial", Font.PLAIN, 18));
        addProfessor.setBounds(addProfessor.getX(),addProfessor.getY(), 180, 30);
        addProfessor.setBorder(new RoundedBorder(30));
        addProfessor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Add_Professor p = new Add_Professor();
                Home.hide();
            }
        });
        //--
        studentsList = new JButton("لیست دانشجویان");
        studentsList.setLocation(250,390);
        studentsList.setSize(200,20);
        studentsList.setForeground(text);
        studentsList.setToolTipText("مشاهده لیست دانشجویان");
        studentsList.setFont(new Font("Arial", Font.PLAIN, 18));
        studentsList.setBounds(studentsList.getX(),studentsList.getY(), 180, 30);
        studentsList.setBorder(new RoundedBorder(30));
        studentsList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowStudents p = new ShowStudents();
                Home.hide();
            }
        });
        //--
        professorsList = new JButton("لیست اساتید");
        professorsList.setLocation(480,390);
        professorsList.setSize(200,20);
        professorsList.setToolTipText("مشاهده لیست اساتید");
        professorsList.setForeground(text);
        professorsList.setFont(new Font("Arial", Font.PLAIN, 18));
        professorsList.setBounds(professorsList.getX(),professorsList.getY(), 180, 30);
        professorsList.setBorder(new RoundedBorder(30));
        professorsList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowProfessors p = new ShowProfessors();
                Home.hide();
            }
        });
        //--
        classesList = new JButton("لیست کلاس ها");
        classesList.setLocation(20,440);
        classesList.setSize(200,20);
        classesList.setToolTipText("مشاهده لیست کلاس ها");
        classesList.setForeground(text);
        classesList.setFont(new Font("Arial", Font.PLAIN, 18));
        classesList.setBounds(classesList.getX(),classesList.getY(), 180, 30);
        classesList.setBorder(new RoundedBorder(30));
        classesList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowClasses_Admin p = new ShowClasses_Admin();
                Home.hide();
            }
        });

        Home.add(change);
        Home.add(studentsList);
        Home.add(food);
        Home.add(professorsList);
        Home.add(addStudent);
        Home.add(classesList);
        Home.add(addProfessor);

    }

    /**
     * show admin home page
     */
    public void showAdminHome() {
        Home.setVisible(true);
    }


}
