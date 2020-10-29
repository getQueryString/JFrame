package jframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jframemain {

    public static void main(String[] args) {

        JFrame frm = new JFrame();
        frm.setTitle("JFrame");

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frm.setSize(1280, 720);
        frm.setLocation(270, 200);
        frm.setVisible(true);

        JButton button;
        frm.add(button = new JButton("Beenden"));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frm.dispose();

            }
        });
    }

}
