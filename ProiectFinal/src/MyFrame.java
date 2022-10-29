import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("Panou de comanda");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(960,540);
        this.setLayout(new BorderLayout(10,0));
        this.setVisible(true);
        ImageIcon image = new ImageIcon("icon.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.BLACK);

    }
}
