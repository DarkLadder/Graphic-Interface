import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by Dmitrii on 03.03.2017.
 */
public class Main {

    Main(){

        JPanel window = new JPanel();
        window.setLayout(new BorderLayout());

        JPanel TextField = new JPanel();
        TextField.setLayout(new GridLayout());
        JTextField textField = new JTextField();

        JPanel P1 = new JPanel();
        P1.setLayout(new GridLayout(4, 5));
        JButton seven  = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton del = new JButton("/");
        JButton sqrt = new JButton("sqrt");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton mult = new JButton("*");
        JButton per = new JButton("%");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton min = new JButton("-");
        JButton oneX = new JButton("1/x");
        JButton nule = new JButton("0");
        JButton pm = new JButton("+/-");
        JButton dot = new JButton(".");
        JButton plus = new JButton("+");
        JButton ravno = new JButton("=");

        JPanel P2 = new JPanel();
        P2.setLayout(new GridLayout(4, 1));
        JButton MC = new JButton("MC");
        JButton MR = new JButton("MR");
        JButton MS = new JButton("MS");
        JButton MP = new JButton("M+");

        TextField.add(textField);

        P1.add(seven);
        P1.add(eight);
        P1.add(nine);
        P1.add(del);
        P1.add(sqrt);
        P1.add(four);
        P1.add(five);
        P1.add(six);
        P1.add(mult);
        P1.add(per);
        P1.add(one);
        P1.add(two);
        P1.add(three);
        P1.add(min);
        P1.add(oneX);
        P1.add(nule);
        P1.add(pm);
        P1.add(dot);
        P1.add(plus);
        P1.add(ravno);

        P2.add(MC);
        P2.add(MR);
        P2.add(MS);
        P2.add(MP);

        window.add("North",TextField);
        window.add("East",P1);
        window.add("West",P2);


        JFrame frame = new JFrame("Калькулятор");
        frame.setContentPane(window);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
