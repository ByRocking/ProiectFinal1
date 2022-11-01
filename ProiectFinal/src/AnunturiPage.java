import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnunturiPage {
    private static AnunturiPage instance;
    JFrame frame = new JFrame();
    MyButton btnInapoi = new MyButton("Inapoi");

  private AnunturiPage(){
        frame.setTitle("Fereastra anunturi");
        frame.setResizable(false);
        frame.setSize(600,400);
        frame.setLayout(new BorderLayout(10,0));
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(null);

        btnInapoi.setBounds(190,230,220,50);
        frame.add(btnInapoi);
        btnInapoi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                deleteInstance();
            }
        });
    }

    public static AnunturiPage getInstance(){
      if(null == instance){
          instance = new AnunturiPage();
      }
      return instance;
    }

    public void deleteInstance(){
      if(null != instance)
          instance = null;
    }
}
