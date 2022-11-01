import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Anunturi.Anunt;
public class AnunturiPage {
    private static AnunturiPage instance;
    JFrame frame = new JFrame();
    MyButton btnInapoi = new MyButton("Inapoi");
    MyButton btnAnuntDeschidere = new MyButton("Deschidere");
    MyButton btnAnuntInchidere = new MyButton("Inchidere");
    MyButton btnAnuntLei = new MyButton("Lei noi");
    MyButton btnAnuntPesti = new MyButton("Pesti noi");
    Anunt anunt = new Anunt();

  private AnunturiPage(){
        frame.setTitle("Fereastra anunturi");
        frame.setResizable(false);
        frame.setSize(600,300);
        frame.setLayout(new BorderLayout(10,0));
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(null);

        btnInapoi.setBounds(190,200,220,50);
        frame.add(btnInapoi);
        btnInapoi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                deleteInstance();
            }
        });

      btnAnuntDeschidere.setBounds(10,20,280,40);
      frame.add(btnAnuntDeschidere);
      btnAnuntDeschidere.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              anunt.AnuntDeschidere();
          }
      });

      btnAnuntInchidere.setBounds(300,20,280,40);
      frame.add(btnAnuntInchidere);
      btnAnuntInchidere.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              anunt.AnuntInchidere();
          }
      });

      btnAnuntLei.setBounds(10,80,280,40);
      frame.add(btnAnuntLei);
      btnAnuntLei.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              anunt.AnuntLeiNoi();
          }
      });

      btnAnuntPesti.setBounds(300,80,280,40);
      frame.add(btnAnuntPesti);
      btnAnuntPesti.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              anunt.AnuntPestiNoi();
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
