package homeWork.practise.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

    public Frame() {
        initFrame();
        buttons();
    }

    public void initFrame() {
        setTitle("Moja ramka");
        setSize(400,300);
        //setLocation(300,300);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        //pack();
        setLayout(new GridLayout(2,3,50,50));
        setVisible(true);
    }

    public void buttons(){
        add(new JButton("Przycisk 1"));
        add(new JButton("Przycisk 2"));
        add(new JButton("Przycisk 3"));
        add(new )

        JButton quitButton = new JButton("Quit");
        //add(quickButton);

        quitButton.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });
    }




}
