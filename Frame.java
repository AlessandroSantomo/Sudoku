package com.gioco.Alessandro.Gioco;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    Frame(){
        this.setTitle("SUDOKU!");   //Imposto il titolo

        ImageIcon imageIcon = new ImageIcon("ImmagineSudoku.png"); //Creo l'mmagine da mettere per il frame
        this.setTitle("SUDOKU!");   //Imposto il titolo
        this.setIconImage(imageIcon.getImage()); //La sostituisco a quella di default
        this.getContentPane().setBackground(new Color(0xFF171666, true));   //Cambio il colore allo sfondo
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Assegna alla x il compito di chiudere il programma
        this.setSize(1000,700);   //Imposto la grandezza
        this.setLayout(null);   //Non metto nessun layout pre-configurato
        this.setResizable(false);//Non permetto il cambiamento della grandezza del frame
        this.setLocation(175,0);   //Imposto il luogo dove compare il frame
        this.setVisible(true);//Rendo la finestra visibile*/
    }
}
