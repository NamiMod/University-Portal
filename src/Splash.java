import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

/**
 * --splash screen--
 * @author Seyed Nami Modarressi
 * @since 2020
 * @version 1.0
 */
public class Splash {


    private JFrame frame;
    private JLabel logo;
    private JLabel text;
    Color text2 = new Color(43, 62, 100);
    Color lightBlue_1 = new Color(69, 162, 255);

    /**
     * create new splash screen
     */
    public Splash() throws InterruptedException {

        frame = new JFrame("دانشگاه امیر کبیر");
        frame.setSize(500, 750);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        logo = new JLabel();
        logo.setIcon(new ImageIcon("logo.png"));
        logo.setLocation(0,0);
        logo.setSize(600,600);

        text = new JLabel();
        text.setText("به سامانه امور دانشگاهیان دانشگاه امیرکبیر خوش آمدید");
        text.setFont(new Font("Arial",Font.BOLD,20));
        text.setLocation(70,620);
        text.setSize(600,50);
        text.setForeground(lightBlue_1);

        frame.add(logo);
        frame.add(text);
        frame.setVisible(true);

        TimeUnit.SECONDS.sleep(2);
        frame.hide();
        Login_GUI p = new Login_GUI();


    }


}
