package com.gioco.Alessandro.Gioco;

import javax.swing.*;
import java.awt.*;

public class LabelTitolo extends JLabel {

    LabelTitolo(){
        this.setText("SUDOKU");   //Titolo
        this.setForeground(new Color(227, 227, 250));    //Imposto il colore rgb
        this.setFont(new Font("MV Boli",Font.BOLD,40));   //Imposto font, grassetto e grandezza
        this.setHorizontalAlignment(JLabel.CENTER);   //Centro la label in orizzontale
        this.setVerticalAlignment(JLabel.TOP);   //Metto la label in alto
        this.setBounds(0,17,1000,50);  //imposto la posizione del titolo nel frame

    }

}
