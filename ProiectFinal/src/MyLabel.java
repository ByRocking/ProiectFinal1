import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

public class MyLabel extends JLabel {
    MyLabel(String nume){
        this.setText(nume);
        //this.setVerticalAlignment(JLabel.TOP);
        //this.setHorizontalAlignment(JLabel.CENTER);
        this.setForeground(Color.black);
        this.setFont(new Font("Times New Roman",Font.BOLD,30));
        //this.setBorder(new LineBorder(Color.YELLOW,10));
        //this.setHorizontalTextPosition(JLabel.CENTER);
        //this.setBackground(Color.RED);
        //this.setOpaque(true);
        //this.setBounds(135,0,210,60);
    }
}
