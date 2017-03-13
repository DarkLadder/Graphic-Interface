import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dmitrii on 13.03.2017.
 */
public class Event implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    JButton clickedButton= (JButton)e.getSource();
    String clickedButtonLabel = clickedButton.getText();
    JOptionPane.showConfirmDialog(null,"You pressed " +
            clickedButtonLabel,"Just a test", JOptionPane.PLAIN_MESSAGE);
    }
}
