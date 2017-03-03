import javax.swing.*;
import java.awt.*;

/**
 * Created by Dmitrii on 03.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        JPanel window = new JPanel();
        FlowLayout f1 = new FlowLayout();
        window.setLayout(f1);
        JLabel label1 = new JLabel("Число 1");
        JTextField field1 = new JTextField(5);
        JLabel label2 = new JLabel("Число 2");
        JTextField field2 = new JTextField(5);


        window.add(label1);
        window.add(field1);
        window.add(label2);
        window.add(field2);


        JPanel window1 = new JPanel();
        JLabel label3 = new JLabel("Сумма");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Добавить");
        window1.add(label3);
        window1.add(result);
        window1.add(go);

        JFrame frame = new JFrame("Калькулятор");
        frame.setContentPane(window);
        frame.add(window1);
        frame.setSize(400, 100);
        frame.setVisible(true);
    }
}
