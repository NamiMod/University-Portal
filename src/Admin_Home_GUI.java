import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class Admin_Home_GUI {

    private JFrame Home;
    private JMenuBar menu;
    private JMenu menu_inside;
    private JLabel image;
    private JLabel AccessLevel;
    private JLabel username;
    private JLabel lastLogin;
    private JLabel loginDate;
    private JButton change;
    private JButton food;
    private JButton addStudent;
    private JButton addProfessor;
    private JButton list;

    Color outBlue = new Color(0,128,255);
    Color text = new Color(43,62,100);
    Color lightBlue_1 = new Color(69,162,255);
    Color lightBlue_2 = new Color(208,237,255);
    Color background = new Color(237,237,237);

    public Admin_Home_GUI() {

        Home = new JFrame();
        Home = new JFrame("پنل مدیریت ادمین");
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

    public void addMenu() {
        menu = new JMenuBar();
        menu_inside = new JMenu("...");
        JMenuItem Help = new JMenuItem("Help");
        JMenuItem Report = new JMenuItem("Report Bug");
        menu_inside.add(Help);
        menu_inside.add(Report);
        menu.add(menu_inside);
        menu.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));
        Home.setJMenuBar(menu);
    }

    public void adminHomeElements() {

        // admin avatar
        image = new JLabel();
        image.setIcon(new ImageIcon("loginpic.png"));
        image.setSize(300,300);
        image.setLocation(20,5);
        Border button = new BevelBorder(BevelBorder.LOWERED, text,text);
        // image.setBorder(button);
        Home.add(image);

        // adding information
        JLabel info = new JLabel(" مشخصات کاربر");
        info.setLocation(380,0);
        info.setSize(180,50);
        info.setForeground(text);
        info.setFont(new Font("Arial", Font.BOLD,20));
        info.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.white));
        info.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.white));
        info.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, outBlue));

        AccessLevel = new JLabel("Access Level : Admin");
        AccessLevel.setLocation(380 , 50);
        AccessLevel.setSize(200,50);
        username = new JLabel("User : admin ");
        username.setLocation(380,80);
        username.setSize(200,50);
        lastLogin = new JLabel("Last Login : DD / MM / YYYY");
        lastLogin.setLocation(380,110);
        lastLogin.setSize(200,50);
        loginDate = new JLabel("Login : HH : MM : SS");
        loginDate.setLocation(380,140);
        loginDate.setSize(200,50);
        Home.add(AccessLevel);
        Home.add(username);
        Home.add(lastLogin);
        Home.add(loginDate);
        Home.add(info);


        // adding buttons for admin
        change = new JButton("تغییر نام کاربری یا رمز عبور");
        change.setLocation(20,340);
        change.setSize(200,20);
        food = new JButton("ثبت برنامه غذا");
        food.setLocation(250,340);
        food.setSize(200,20);
        addStudent = new JButton("اضافه کردن دانشجو");
        addStudent.setLocation(480,340);
        addStudent.setSize(200,20);
        addProfessor = new JButton("اضافه کردن استاد");
        addProfessor.setLocation(20,390);
        addProfessor.setSize(200,20);

        Home.add(change);
        Home.add(food);
        Home.add(addStudent);
        Home.add(addProfessor);

    }

    public void showAdminHome() {
        Home.setVisible(true);
    }


}
