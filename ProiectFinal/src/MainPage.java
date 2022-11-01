import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainPage {
    MainPage(){
        ArrayList<Leu> leu = new ArrayList<Leu>();
        ArrayList<Peste> peste = new ArrayList<Peste>();

        MyFrame frame = new MyFrame();
        MyPanelLei panouLeu = new MyPanelLei();
        MyPanelPesti panouPesti = new MyPanelPesti();

        MyLabel labelLeu = new MyLabel("Zona lei");
        MyLabel labelPesti = new MyLabel("Zona pesti");

        MyButton btnAnunturi = new MyButton("Catre anunturi");
        frame.add(panouLeu, BorderLayout.WEST);
        frame.add(panouPesti,BorderLayout.EAST);
        frame.add(btnAnunturi,BorderLayout.SOUTH);

        panouLeu.add(labelLeu);
        labelLeu.setBounds(175,0,210,60);
        panouPesti.add(labelPesti);
        labelPesti.setBounds(175,0,210,60);

        JList<Leu> listaLei = new JList<Leu>();
        DefaultListModel<Leu> modelLei = new DefaultListModel<Leu>();
        listaLei.setBounds(10,300,460,220);
        panouLeu.add(listaLei);

        JList<Peste> listaPeste = new JList<Peste>();
        DefaultListModel<Peste> modelPesti = new DefaultListModel<Peste>();
        listaPeste.setBounds(10,300,460,220);
        panouPesti.add(listaPeste);

        //---------------------------------------------------------------------------------- leu
        //------------------------ labels
        MyLabel lbLeuId = new MyLabel("Id:");
        lbLeuId.setFont(new Font("Times New Roman",Font.PLAIN,30));
        panouLeu.add(lbLeuId);
        lbLeuId.setBounds(10,60,140,40);

        MyLabel lbLeuNume = new MyLabel("Nume:");
        lbLeuNume.setFont(new Font("Times New Roman",Font.PLAIN,30));
        panouLeu.add(lbLeuNume);
        lbLeuNume.setBounds(10,100,140,40);

        MyLabel lbLeuVarsta = new MyLabel("Varsta:");
        lbLeuVarsta.setFont(new Font("Times New Roman",Font.PLAIN,30));
        panouLeu.add(lbLeuVarsta);
        lbLeuVarsta.setBounds(10,140,140,40);

        MyLabel lbLeuGreutate = new MyLabel("Greutate:");
        lbLeuGreutate.setFont(new Font("Times New Roman",Font.PLAIN,30));
        panouLeu.add(lbLeuGreutate);
        lbLeuGreutate.setBounds(10,180,140,40);

        //------------------------ textboxuri
        MyTextField txtLeuId = new MyTextField();
        panouLeu.add(txtLeuId);
        txtLeuId.setBounds(150,60,300,40);

        MyTextField txtLeuNume = new MyTextField();
        panouLeu.add(txtLeuNume);
        txtLeuNume.setBounds(150,100,300,40);

        MyTextField txtLeuVarsta = new MyTextField();
        panouLeu.add(txtLeuVarsta);
        txtLeuVarsta.setBounds(150,140,300,40);

        MyTextField txtLeuGreutate = new MyTextField();
        panouLeu.add(txtLeuGreutate);
        txtLeuGreutate.setBounds(150,180,300,40);

        //------------------------ butoane
        MyButton btnLeuAdauga = new MyButton("Salveaza");
        panouLeu.add(btnLeuAdauga);
        btnLeuAdauga.setBounds(10,230,220,50);
        btnLeuAdauga.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(!txtLeuId.getText().isEmpty() && !txtLeuVarsta.getText().isEmpty() && !txtLeuGreutate.getText().isEmpty() && txtLeuNume.getText().isEmpty())
                            if(txtLeuId.getText().matches("[1-9]+") && txtLeuVarsta.getText().matches("[1-9]+") && txtLeuGreutate.getText().matches("[0-9]+")) {
                                int id = Integer.parseInt(txtLeuId.getText());
                                int varsta = Integer.parseInt(txtLeuVarsta.getText());
                                double greutate = Double.parseDouble(txtLeuGreutate.getText());

                                boolean ok = true;
                                for(int i = 0; i < leu.size(); i++) {
                                    if(id == leu.get(i).getID())
                                        ok = false;
                                }
                                if(ok) {
                                    leu.add(new Leu(id,varsta,greutate));
                                }
                                else
                                    JOptionPane.showMessageDialog(null,"Id ul exista deja","Eroare introducere leu", JOptionPane.WARNING_MESSAGE);
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Toate campurile trebuie sa corespunda cu standarde normale","Eroare introducere leu", JOptionPane.ERROR_MESSAGE);
                            }
                        if(!txtLeuId.getText().isEmpty() && !txtLeuVarsta.getText().isEmpty() && !txtLeuGreutate.getText().isEmpty() && !txtLeuNume.getText().isEmpty())
                            if(txtLeuId.getText().matches("[1-9]+") && txtLeuVarsta.getText().matches("[1-9]+") && txtLeuGreutate.getText().matches("[0-9]+") && txtLeuNume.getText().matches(("[A-Z][a-z]+"))) {
                                int id = Integer.parseInt(txtLeuId.getText());
                                String nume = txtLeuNume.getText();
                                int varsta = Integer.parseInt(txtLeuVarsta.getText());
                                double greutate = Double.parseDouble(txtLeuGreutate.getText());

                                boolean ok = true;
                                for(int i = 0; i < leu.size(); i++) {
                                    if(id == leu.get(i).getID())
                                        ok = false;
                                }
                                if(ok) {
                                    leu.add(new Leu(id,nume,varsta,greutate));
                                }
                                else
                                    JOptionPane.showMessageDialog(null,"Id ul exista deja","Eroare introducere leu", JOptionPane.WARNING_MESSAGE);
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Toate campurile trebuie sa corespunda cu standarde normale","Eroare introducere leu", JOptionPane.ERROR_MESSAGE);
                            }
                    }
                }
        );

        MyButton btnLeuAfisare = new MyButton("Afiseaza");
        panouLeu.add(btnLeuAfisare);
        btnLeuAfisare.setBounds(250,230,220,50);
        btnLeuAfisare.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        listaLei.setModel(modelLei);
                        modelLei.clear();
                        for(int i = 0; i < leu.size(); i++){
                            modelLei.addElement(leu.get(i));
                        }
                    }
                }
        );


        //------------------------------------------------------------------------ peste
        //------------------------ labels
        MyLabel lbPesteId = new MyLabel("Id:");
        lbPesteId.setFont(new Font("Times New Roman",Font.PLAIN,30));
        panouPesti.add(lbPesteId);
        lbPesteId.setBounds(10,60,140,40);

        MyLabel lbPesteNume = new MyLabel("Nume:");
        lbPesteNume.setFont(new Font("Times New Roman",Font.PLAIN,30));
        panouPesti.add(lbPesteNume);
        lbPesteNume.setBounds(10,100,140,40);

        MyLabel lbPesteVarsta = new MyLabel("Varsta:");
        lbPesteVarsta.setFont(new Font("Times New Roman",Font.PLAIN,30));
        panouPesti.add(lbPesteVarsta);
        lbPesteVarsta.setBounds(10,140,140,40);

        MyLabel lbPesteGreutate = new MyLabel("Greutate:");
        lbPesteGreutate.setFont(new Font("Times New Roman",Font.PLAIN,30));
        panouPesti.add(lbPesteGreutate);
        lbPesteGreutate.setBounds(10,180,140,40);

        //------------------------ textboxuri
        MyTextField txtPesteId = new MyTextField();
        panouPesti.add(txtPesteId);
        txtPesteId.setBounds(150,60,300,40);

        MyTextField txtPesteNume = new MyTextField();
        panouPesti.add(txtPesteNume);
        txtPesteNume.setBounds(150,100,300,40);

        MyTextField txtPesteVarsta = new MyTextField();
        panouPesti.add(txtPesteVarsta);
        txtPesteVarsta.setBounds(150,140,300,40);

        MyTextField txtPesteGreutate = new MyTextField();
        panouPesti.add(txtPesteGreutate);
        txtPesteGreutate.setBounds(150,180,300,40);

        //------------------------ butoane
        MyButton btnPesteAdauga = new MyButton("Salveaza");
        panouPesti.add(btnPesteAdauga);
        btnPesteAdauga.setBounds(10,230,220,50);
        btnPesteAdauga.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(!txtPesteId.getText().isEmpty() && !txtPesteVarsta.getText().isEmpty() && !txtPesteGreutate.getText().isEmpty() && txtPesteNume.getText().isEmpty())
                            if(txtPesteId.getText().matches("[1-9]+") && txtPesteVarsta.getText().matches("[1-9]+") && txtPesteGreutate.getText().matches("[0-9]+")) {
                                int id = Integer.parseInt(txtPesteId.getText());
                                int varsta = Integer.parseInt(txtPesteVarsta.getText());
                                double greutate = Double.parseDouble(txtPesteGreutate.getText());

                                boolean ok = true;
                                for(int i = 0; i < peste.size(); i++) {
                                    if(id == peste.get(i).getID())
                                        ok = false;
                                }
                                if(ok) {
                                    peste.add(new Peste(id,varsta,greutate));
                                }
                                else
                                    JOptionPane.showMessageDialog(null,"Id ul exista deja","Eroare introducere peste", JOptionPane.WARNING_MESSAGE);
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Toate campurile trebuie sa corespunda cu standarde normale","Eroare introducere peste", JOptionPane.ERROR_MESSAGE);
                            }
                        if(!txtPesteId.getText().isEmpty() && !txtPesteVarsta.getText().isEmpty() && !txtPesteGreutate.getText().isEmpty() && !txtPesteNume.getText().isEmpty())
                            if(txtPesteId.getText().matches("[1-9]+") && txtPesteVarsta.getText().matches("[1-9]+") && txtPesteGreutate.getText().matches("[0-9]+") && txtPesteNume.getText().matches("[A-Z][a-z]+")) {
                                int id = Integer.parseInt(txtPesteId.getText());
                                String nume = txtPesteNume.getText();
                                int varsta = Integer.parseInt(txtPesteVarsta.getText());
                                double greutate = Double.parseDouble(txtPesteGreutate.getText());

                                boolean ok = true;
                                for(int i = 0; i < peste.size(); i++) {
                                    if(id == peste.get(i).getID())
                                        ok = false;
                                }
                                if(ok) {
                                    peste.add(new Peste(id,nume,varsta,greutate));
                                }
                                else
                                    JOptionPane.showMessageDialog(null,"Id ul exista deja","Eroare introducere peste", JOptionPane.WARNING_MESSAGE);
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Toate campurile trebuie sa corespunda cu standarde normale","Eroare introducere peste", JOptionPane.ERROR_MESSAGE);
                            }
                    }
                }
        );

        MyButton btnPesteAfisare = new MyButton("Afiseaza");
        panouPesti.add(btnPesteAfisare);
        btnPesteAfisare.setBounds(250,230,220,50);
        btnPesteAfisare.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        listaPeste.setModel(modelPesti);
                        modelPesti.clear();
                        for(int i = 0; i < peste.size(); i++){
                            modelPesti.addElement(peste.get(i));
                        }
                    }
                }
        );

        btnAnunturi.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        AnunturiPage.getInstance();
                    }
                }
        );

        frame.pack();
    }
}
