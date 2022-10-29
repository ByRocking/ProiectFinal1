import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {
    MyButton(String name) {
        this.setText(name);
        this.setFocusable(false);
        this.setHorizontalAlignment(JButton.CENTER);
        this.setVerticalAlignment(JButton.CENTER);
        this.setFont(new Font("Times New Roman", Font.PLAIN,30));
        this.setForeground(Color.black);
        this.setBackground((Color.white));
    }
}