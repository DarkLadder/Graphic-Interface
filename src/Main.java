import javax.swing.*;
import java.awt.*;

/**
 * Created by Dmitrii on 03.03.2017.
 */
public class Main {
    Main(){
        JPanel window = new JPanel();
        window.setLayout(new BoxLayout(window, BoxLayout.Y_AXIS));
        JLabel label1 = new JLabel("Число 1");
        JTextField field1 = new JTextField(5);
        JLabel label2 = new JLabel("Число 2");
        JTextField field2 = new JTextField(5);
        JLabel label3 = new JLabel("Сумма");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Добавить");

        window.add(label1);
        window.add(field1);
        window.add(label2);
        window.add(field2);
        window.add(label3);
        window.add(result);
        window.add(go);

        JFrame frame = new JFrame("Калькулятор");
        frame.setContentPane(window);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
