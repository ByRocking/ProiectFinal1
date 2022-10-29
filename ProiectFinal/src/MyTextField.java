import javax.swing.*;
import java.awt.*;

public class MyTextField extends JTextField {
    MyTextField(){
        this.setForeground(Color.black);
        this.setFont(new Font("Times New Roman",Font.PLAIN,30));
        this.setCaretColor(Color.black);
    }
}