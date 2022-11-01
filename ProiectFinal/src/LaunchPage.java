import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class LaunchPage {

    private final String ID = "POO1234";
    private final String PAROLA = "POO12345";

    JFrame frame = new JFrame();
    MyButton btnLogare = new MyButton("Logheaza");
    MyTextField txtId = new MyTextField();
    MyTextField txtParola = new MyTextField();
    LaunchPage(){
        frame.setTitle("Fereastra de logare");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(600,400);
        frame.setLayout(new BorderLayout(10,0));
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(null);

        frame.add(txtId);
        txtId.setBounds(150,60,300,40);

        frame.add(txtParola);
        txtParola.setBounds(150,110,300,40);

        btnLogare.setBounds(190,230,220,50);
        frame.add(btnLogare);
        btnLogare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtId.getText().isEmpty() && !txtParola.getText().isEmpty()) {
                    if(ID.equals(txtId.getText()) && PAROLA.equals(txtParola.getText())) {
                        frame.dispose();
                        MainPage page = new MainPage();
                        try {
                            MyLogging.scrieLogging("Cineva s a logat");
                        } catch (IOException f) {

                        }
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Id/parola gresita","Eroare logare", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Campurile sunt goale","Eroare logare", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
