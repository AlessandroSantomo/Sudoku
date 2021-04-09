package com.gioco.Alessandro.Gioco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridPanel extends JPanel implements ActionListener {


    JButton casella12 =new JButton();
    static int valCasella;

            JButton button1 = new JButton();
            JButton button2 = new JButton();
            JButton button3 = new JButton();
            JButton button4 = new JButton();
            JButton button5 = new JButton();
            JButton button6 = new JButton();
            JButton button7 = new JButton();
            JButton button8 = new JButton();
            JButton button9 = new JButton();
            JButton button_resa = new JButton();
            JButton button_soluzione = new JButton();
            JButton casella14 =new JButton("0");
            JButton casella15 =new JButton("0");
            JButton casella17 =new JButton("0");
            JButton casella18 =new JButton("0");
            JButton casella22 =new JButton("0");
            JButton casella23 =new JButton("0");
            JButton casella24 =new JButton("0");
            JButton casella26 =new JButton("0");
            JButton casella27 =new JButton("0");
            JButton casella28 =new JButton("0");
            JButton casella29 =new JButton("0");
            JButton casella31 =new JButton("0");
            JButton casella35 =new JButton("0");
            JButton casella37 =new JButton("0");
            JButton casella38 =new JButton("0");
            JButton casella41 =new JButton("0");
            JButton casella42 =new JButton("0");
            JButton casella44 =new JButton("0");
            JButton casella45 =new JButton("0");
            JButton casella46 =new JButton("0");
            JButton casella47 =new JButton("0");
            JButton casella48 =new JButton("0");
            JButton casella51 =new JButton("0");
            JButton casella53 =new JButton("0");
            JButton casella54 =new JButton("0");
            JButton casella55 =new JButton("0");
            JButton casella56 =new JButton("0");
            JButton casella57 =new JButton("0");
            JButton casella59 =new JButton("0");
            JButton casella62 =new JButton("0");
            JButton casella63 =new JButton("0");
            JButton casella64 =new JButton("0");
            JButton casella66 =new JButton("0");
            JButton casella67 =new JButton("0");
            JButton casella71 =new JButton("0");
            JButton casella72 =new JButton("0");
            JButton casella73 =new JButton("0");
            JButton casella74 =new JButton("0");
            JButton casella75 =new JButton("0");
            JButton casella77 =new JButton("0");
            JButton casella78 =new JButton("0");
            JButton casella79 =new JButton("0");
            JButton casella81 =new JButton("0");
            JButton casella82 =new JButton("0");
            JButton casella84 =new JButton("0");
            JButton casella86 =new JButton("0");
            JButton casella87 =new JButton("0");
            JButton casella88 =new JButton("0");
            JButton casella89 =new JButton("0");
            JButton casella93 =new JButton("0");
            JButton casella96 =new JButton("0");
            JButton casella97 =new JButton("0");
            JButton casella98 =new JButton("0");
            JButton casella99 =new JButton("0");
            JButton casella11 =new JButton("6");
            JButton casella13 =new JButton("9");
            JButton casella16 =new JButton("4");
            JButton casella19 =new JButton("1");
            JButton casella21 =new JButton("8");
            JButton casella25 =new JButton("5");
            JButton casella32 =new JButton("3");
            JButton casella33 =new JButton("5");
            JButton casella34 =new JButton("1");
            JButton casella36 =new JButton("9");
            JButton casella39 =new JButton("8");
            JButton casella43 =new JButton("8");
            JButton casella49 =new JButton("4");
            JButton casella52 =new JButton("5");
            JButton casella58 =new JButton("3");
            JButton casella61 =new JButton("4");
            JButton casella65 =new JButton("7");
            JButton casella68 =new JButton("5");
            JButton casella69 =new JButton("2");
            JButton casella76 =new JButton("1");
            JButton casella83 =new JButton("1");
            JButton casella85 =new JButton("4");
            JButton casella91 =new JButton("7");
            JButton casella92 =new JButton("6");
            JButton casella94 =new JButton("9");
            JButton casella95 =new JButton("3");




    GridPanel(){

        casella11.setBounds(0,0,72,54);
        casella11.setFocusable(false);
        casella11.addActionListener(this);
        casella11.setBackground(new Color(227, 227, 250));
        casella11.setFont(new Font("MV Boli",Font.BOLD,20));
        casella11.setForeground(new Color(200,100, 0));
        casella12.setText("0");
        casella12.addActionListener(this);
        casella12.setBackground(new Color(227, 227, 250));
        casella12.setFont(new Font("MV Boli",Font.BOLD,20));
        casella12.setBounds(72,0,72,54);
        casella12.setFocusable(true);
        casella13.setBounds(144,0,72,54);
        casella13.setFocusable(false);
        casella13.setBackground(new Color(227, 227, 250));
        casella13.setFont(new Font("MV Boli",Font.BOLD,20));
        casella13.setForeground(new Color(200,100, 0));
        casella14.setBounds(221,0,72,54);
        casella14.addActionListener(this);
        casella14.setBackground(new Color(199, 206, 255));
        casella14.setFocusable(true);
        casella14.setFont(new Font("MV Boli",Font.BOLD,20));
        casella15.setBounds(293,0,72,54);
        casella15.setBackground(new Color(199, 206, 255));
        casella15.addActionListener(this);
        casella15.setFocusable(true);
        casella15.setFont(new Font("MV Boli",Font.BOLD,20));
        casella16.setBounds(365,0,72,54);
        casella16.setBackground(new Color(199, 206, 255));
        casella16.setFocusable(false);
        casella16.setFont(new Font("MV Boli",Font.BOLD,20));
        casella16.setForeground(new Color(200,100, 0));
        casella17.setBounds(442,0,72,54);
        casella17.addActionListener(this);
        casella17.setFocusable(true);
        casella17.setBackground(new Color(227, 227, 250));
        casella17.setFont(new Font("MV Boli",Font.BOLD,20));
        casella18.setBounds(514,0,72,54);
        casella18.addActionListener(this);
        casella18.setFocusable(true);
        casella18.setBackground(new Color(227, 227, 250));
        casella18.setFont(new Font("MV Boli",Font.BOLD,20));
        casella19.setBounds(586,0,72,54);
        casella19.setFocusable(false);
        casella19.setBackground(new Color(227, 227, 250));
        casella19.setFont(new Font("MV Boli",Font.BOLD,20));
        casella19.setForeground(new Color(200,100, 0));
        casella21.setBounds(0,54,72,54);
        casella21.setFocusable(false);
        casella21.setFont(new Font("MV Boli",Font.BOLD,20));
        casella21.setBackground(new Color(227, 227, 250));
        casella21.setForeground(new Color(200,100, 0));
        casella22.setBounds(72,54,72,54);
        casella22.addActionListener(this);
        casella22.setFocusable(true);
        casella22.setFont(new Font("MV Boli",Font.BOLD,20));
        casella22.setBackground(new Color(227, 227, 250));
        casella23.setBounds(144,54,72,54);
        casella23.setFocusable(true);
        casella23.addActionListener(this);
        casella23.setFont(new Font("MV Boli",Font.BOLD,20));
        casella23.setBackground(new Color(227, 227, 250));
        casella24.setBounds(221,54,72,54);
        casella24.setBackground(new Color(199, 206, 255));
        casella24.addActionListener(this);
        casella24.setFocusable(true);
        casella24.setFont(new Font("MV Boli",Font.BOLD,20));
        casella25.setBounds(293,54,72,54);
        casella25.setBackground(new Color(199, 206, 255));
        casella25.setFocusable(false);
        casella25.setFont(new Font("MV Boli",Font.BOLD,20));
        casella25.setForeground(new Color(200,100, 0));
        casella26.setBounds(365,54,72,54);
        casella26.setBackground(new Color(199, 206, 255));
        casella26.setFocusable(true);
        casella26.addActionListener(this);
        casella26.setFont(new Font("MV Boli",Font.BOLD,20));
        casella27.setBounds(442,54,72,54);
        casella27.setFocusable(true);
        casella27.addActionListener(this);
        casella27.setBackground(new Color(227, 227, 250));
        casella27.setFont(new Font("MV Boli",Font.BOLD,20));
        casella28.setBounds(514,54,72,54);
        casella28.setFocusable(true);
        casella28.addActionListener(this);
        casella28.setBackground(new Color(227, 227, 250));
        casella28.setFont(new Font("MV Boli",Font.BOLD,20));
        casella29.setBounds(586,54,72,54);
        casella29.setFocusable(true);
        casella29.addActionListener(this);
        casella29.setBackground(new Color(227, 227, 250));
        casella29.setFont(new Font("MV Boli",Font.BOLD,20));
        casella31.setBounds(0,108,72,54);
        casella31.setFocusable(true);
        casella31.addActionListener(this);
        casella31.setFont(new Font("MV Boli",Font.BOLD,20));
        casella31.setBackground(new Color(227, 227, 250));
        casella32.setBounds(72,108,72,54);
        casella32.setFocusable(false);
        casella32.setBackground(new Color(227, 227, 250));
        casella32.setFont(new Font("MV Boli",Font.BOLD,20));
        casella32.setForeground(new Color(200,100, 0));
        casella33.setBounds(144,108,72,54);
        casella33.setFocusable(false);
        casella33.setBackground(new Color(227, 227, 250));
        casella33.setFont(new Font("MV Boli",Font.BOLD,20));
        casella33.setForeground(new Color(200,100, 0));
        casella34.setBounds(221,108,72,54);
        casella34.setBackground(new Color(199, 206, 255));
        casella34.setFocusable(false);
        casella34.setFont(new Font("MV Boli",Font.BOLD,20));
        casella34.setForeground(new Color(200,100, 0));
        casella35.setBounds(293,108,72,54);
        casella35.setBackground(new Color(199, 206, 255));
        casella35.setFocusable(true);
        casella35.addActionListener(this);
        casella35.setFont(new Font("MV Boli",Font.BOLD,20));
        casella36.setBounds(365,108,72,54);
        casella36.setBackground(new Color(199, 206, 255));
        casella36.setFocusable(false);
        casella36.setFont(new Font("MV Boli",Font.BOLD,20));
        casella36.setForeground(new Color(200,100, 0));
        casella37.setBounds(442,108,72,54);
        casella37.setFocusable(true);
        casella37.addActionListener(this);
        casella37.setBackground(new Color(227, 227, 250));
        casella37.setFont(new Font("MV Boli",Font.BOLD,20));
        casella38.setBounds(514,108,72,54);
        casella38.setFocusable(true);
        casella38.addActionListener(this);
        casella38.setBackground(new Color(227, 227, 250));
        casella38.setFont(new Font("MV Boli",Font.BOLD,20));
        casella39.setBounds(586,108,72,54);
        casella39.setFocusable(false);
        casella39.setBackground(new Color(227, 227, 250));
        casella39.setFont(new Font("MV Boli",Font.BOLD,20));
        casella39.setForeground(new Color(200,100, 0));
        casella41.setBounds(0,167,72,54);
        casella41.setBackground(new Color(199, 206, 255));
        casella41.setFocusable(true);
        casella41.addActionListener(this);
        casella41.setFont(new Font("MV Boli",Font.BOLD,20));
        casella42.setBounds(72,167,72,54);
        casella42.setBackground(new Color(199, 206, 255));
        casella42.setFocusable(true);
        casella42.addActionListener(this);
        casella42.setFont(new Font("MV Boli",Font.BOLD,20));
        casella43.setBounds(144,167,72,54);
        casella43.setBackground(new Color(199, 206, 255));
        casella43.setFocusable(false);
        casella43.setFont(new Font("MV Boli",Font.BOLD,20));
        casella43.setForeground(new Color(200,100, 0));
        casella44.setBounds(221,167,72,54);
        casella44.setFocusable(true);
        casella44.addActionListener(this);
        casella44.setBackground(new Color(227, 227, 250));
        casella44.setFont(new Font("MV Boli",Font.BOLD,20));
        casella45.setBounds(293,167,72,54);
        casella45.setFocusable(true);
        casella45.addActionListener(this);
        casella45.setBackground(new Color(227, 227, 250));
        casella45.setFont(new Font("MV Boli",Font.BOLD,20));
        casella46.setBounds(365,167,72,54);
        casella46.setFocusable(true);
        casella46.addActionListener(this);
        casella46.setBackground(new Color(227, 227, 250));
        casella46.setFont(new Font("MV Boli",Font.BOLD,20));
        casella47.setBounds(442,167,72,54);
        casella47.setBackground(new Color(199, 206, 255));
        casella47.setFocusable(true);
        casella47.addActionListener(this);
        casella47.setFont(new Font("MV Boli",Font.BOLD,20));
        casella48.setBounds(514,167,72,54);
        casella48.setBackground(new Color(199, 206, 255));
        casella48.setFocusable(true);
        casella48.addActionListener(this);
        casella48.setFont(new Font("MV Boli",Font.BOLD,20));
        casella49.setBounds(586,167,72,54);
        casella49.setBackground(new Color(199, 206, 255));
        casella49.setFocusable(false);
        casella49.setFont(new Font("MV Boli",Font.BOLD,20));
        casella49.setForeground(new Color(200,100, 0));
        casella51.setBounds(0,221,72,54);
        casella51.setBackground(new Color(199, 206, 255));
        casella51.setFocusable(true);
        casella51.addActionListener(this);
        casella51.setFont(new Font("MV Boli",Font.BOLD,20));
        casella52.setBounds(72,221,72,54);
        casella52.setFocusable(false);
        casella52.setBackground(new Color(199, 206, 255));
        casella52.setFont(new Font("MV Boli",Font.BOLD,20));
        casella52.setForeground(new Color(200,100, 0));
        casella53.setBounds(144,221,72,54);
        casella53.setBackground(new Color(199, 206, 255));
        casella53.setFocusable(true);
        casella53.addActionListener(this);
        casella53.setFont(new Font("MV Boli",Font.BOLD,20));
        casella54.setBounds(221,221,72,54);
        casella54.setFocusable(true);
        casella54.addActionListener(this);
        casella54.setBackground(new Color(227, 227, 250));
        casella54.setFont(new Font("MV Boli",Font.BOLD,20));
        casella55.setBounds(293,221,72,54);
        casella55.setFocusable(true);
        casella55.addActionListener(this);
        casella55.setBackground(new Color(227, 227, 250));
        casella55.setFont(new Font("MV Boli",Font.BOLD,20));
        casella56.setBounds(365,221,72,54);
        casella56.setFocusable(true);
        casella56.addActionListener(this);
        casella56.setBackground(new Color(227, 227, 250));
        casella56.setFont(new Font("MV Boli",Font.BOLD,20));
        casella57.setBounds(442,221,72,54);
        casella57.setBackground(new Color(199, 206, 255));
        casella57.setFocusable(true);
        casella57.addActionListener(this);
        casella57.setFont(new Font("MV Boli",Font.BOLD,20));
        casella58.setBounds(514,221,72,54);
        casella58.setBackground(new Color(199, 206, 255));
        casella58.setFocusable(false);
        casella58.setFont(new Font("MV Boli",Font.BOLD,20));
        casella58.setForeground(new Color(200,100, 0));
        casella59.setBounds(586,221,72,54);
        casella59.setBackground(new Color(199, 206, 255));
        casella59.setFocusable(true);
        casella59.addActionListener(this);
        casella59.setFont(new Font("MV Boli",Font.BOLD,20));
        casella61.setBounds(0,275,72,54);
        casella61.setBackground(new Color(199, 206, 255));
        casella61.setFocusable(false);
        casella61.setFont(new Font("MV Boli",Font.BOLD,20));
        casella61.setForeground(new Color(200,100, 0));
        casella62.setBounds(72,275,72,54);
        casella62.setBackground(new Color(199, 206, 255));
        casella62.setFocusable(true);
        casella62.addActionListener(this);
        casella62.setFont(new Font("MV Boli",Font.BOLD,20));
        casella63.setBounds(144,275,72,54);
        casella63.setBackground(new Color(199, 206, 255));
        casella63.setFocusable(true);
        casella63.addActionListener(this);
        casella63.setFont(new Font("MV Boli",Font.BOLD,20));
        casella64.setBounds(221,275,72,54);
        casella64.setFocusable(true);
        casella64.addActionListener(this);
        casella64.setBackground(new Color(227, 227, 250));
        casella64.setFont(new Font("MV Boli",Font.BOLD,20));
        casella65.setBounds(293,275,72,54);
        casella65.setFocusable(false);
        casella65.setBackground(new Color(227, 227, 250));
        casella65.setFont(new Font("MV Boli",Font.BOLD,20));
        casella65.setForeground(new Color(200,100, 0));
        casella66.setBounds(365,275,72,54);
        casella66.addActionListener(this);
        casella66.setFocusable(true);
        casella66.setBackground(new Color(227, 227, 250));
        casella66.setFont(new Font("MV Boli",Font.BOLD,20));
        casella67.setBounds(442,275,72,54);
        casella67.setBackground(new Color(199, 206, 255));
        casella67.setFocusable(true);
        casella67.addActionListener(this);
        casella67.setFont(new Font("MV Boli",Font.BOLD,20));
        casella68.setBounds(514,275,72,54);
        casella68.setBackground(new Color(199, 206, 255));
        casella68.setFocusable(false);
        casella68.setFont(new Font("MV Boli",Font.BOLD,20));
        casella68.setForeground(new Color(200,100, 0));
        casella69.setBounds(586,275,72,54);
        casella69.setBackground(new Color(199, 206, 255));
        casella69.setFocusable(false);
        casella69.setFont(new Font("MV Boli",Font.BOLD,20));
        casella69.setForeground(new Color(200,100, 0));
        casella71.setBounds(0,334,72,54);
        casella71.setFocusable(true);
        casella71.addActionListener(this);
        casella71.setBackground(new Color(227, 227, 250));
        casella71.setFont(new Font("MV Boli",Font.BOLD,20));
        casella72.setBounds(72,334,72,54);
        casella72.addActionListener(this);
        casella72.setFocusable(true);
        casella72.setBackground(new Color(227, 227, 250));
        casella72.setFont(new Font("MV Boli",Font.BOLD,20));
        casella73.setBounds(144,334,72,54);
        casella73.setFocusable(true);
        casella73.addActionListener(this);
        casella73.setBackground(new Color(227, 227, 250));
        casella73.setFont(new Font("MV Boli",Font.BOLD,20));
        casella74.setBounds(221,334,72,54);
        casella74.setBackground(new Color(199, 206, 255));
        casella74.setFocusable(true);
        casella74.addActionListener(this);
        casella74.setFont(new Font("MV Boli",Font.BOLD,20));
        casella75.setBounds(293,334,72,54);
        casella75.setBackground(new Color(199, 206, 255));
        casella75.setFocusable(true);
        casella75.addActionListener(this);
        casella75.setFont(new Font("MV Boli",Font.BOLD,20));
        casella76.setBounds(365,334,72,54);
        casella76.setBackground(new Color(199, 206, 255));
        casella76.setFocusable(false);
        casella76.setFont(new Font("MV Boli",Font.BOLD,20));
        casella76.setForeground(new Color(200,100, 0));
        casella77.setBounds(442,334,72,54);
        casella77.setFocusable(true);
        casella77.addActionListener(this);
        casella77.setBackground(new Color(227, 227, 250));
        casella77.setFont(new Font("MV Boli",Font.BOLD,20));
        casella78.setBounds(514,334,72,54);
        casella78.setFocusable(true);
        casella78.addActionListener(this);
        casella78.setBackground(new Color(227, 227, 250));
        casella78.setFont(new Font("MV Boli",Font.BOLD,20));
        casella79.setBounds(586,334,72,54);
        casella79.setFocusable(true);
        casella79.addActionListener(this);
        casella79.setBackground(new Color(227, 227, 250));
        casella79.setFont(new Font("MV Boli",Font.BOLD,20));
        casella81.setBounds(0,388,72,54);
        casella81.setFocusable(true);
        casella81.addActionListener(this);
        casella81.setBackground(new Color(227, 227, 250));
        casella81.setFont(new Font("MV Boli",Font.BOLD,20));
        casella82.setBounds(72,388,72,54);
        casella82.setFocusable(true);
        casella82.addActionListener(this);
        casella82.setBackground(new Color(227, 227, 250));
        casella82.setFont(new Font("MV Boli",Font.BOLD,20));
        casella83.setBounds(144,388,72,54);
        casella83.setFocusable(false);
        casella83.setBackground(new Color(227, 227, 250));
        casella83.setFont(new Font("MV Boli",Font.BOLD,20));
        casella83.setForeground(new Color(200,100, 0));
        casella84.setBounds(221,388,72,54);
        casella84.setBackground(new Color(199, 206, 255));
        casella84.setFocusable(true);
        casella84.addActionListener(this);
        casella84.setFont(new Font("MV Boli",Font.BOLD,20));
        casella85.setBounds(293,388,72,54);
        casella85.setBackground(new Color(199, 206, 255));
        casella85.setFocusable(false);
        casella85.setFont(new Font("MV Boli",Font.BOLD,20));
        casella85.setForeground(new Color(200,100, 0));
        casella86.setBounds(365,388,72,54);
        casella86.setBackground(new Color(199, 206, 255));
        casella86.setFocusable(true);
        casella86.addActionListener(this);
        casella86.setFont(new Font("MV Boli",Font.BOLD,20));
        casella87.setBounds(442,388,72,54);
        casella87.setFocusable(true);
        casella87.addActionListener(this);
        casella87.setBackground(new Color(227, 227, 250));
        casella87.setFont(new Font("MV Boli",Font.BOLD,20));
        casella88.setBounds(514,388,72,54);
        casella88.setFocusable(true);
        casella88.addActionListener(this);
        casella88.setBackground(new Color(227, 227, 250));
        casella88.setFont(new Font("MV Boli",Font.BOLD,20));
        casella89.setBounds(586,388,72,54);
        casella89.setFocusable(true);
        casella89.addActionListener(this);
        casella89.setBackground(new Color(227, 227, 250));
        casella89.setFont(new Font("MV Boli",Font.BOLD,20));
        casella91.setBounds(0,442,72,54);
        casella91.setFocusable(false);
        casella91.setBackground(new Color(227, 227, 250));
        casella91.setFont(new Font("MV Boli",Font.BOLD,20));
        casella91.setForeground(new Color(200,100, 0));
        casella92.setBounds(72,442,72,54);
        casella92.setFocusable(false);
        casella92.setBackground(new Color(227, 227, 250));
        casella92.setFont(new Font("MV Boli",Font.BOLD,20));
        casella92.setForeground(new Color(200,100, 0));
        casella93.setBounds(144,442,72,54);
        casella93.setFocusable(true);
        casella93.addActionListener(this);
        casella93.setBackground(new Color(227, 227, 250));
        casella93.setFont(new Font("MV Boli",Font.BOLD,20));
        casella94.setBounds(221,442,72,54);
        casella94.setBackground(new Color(199, 206, 255));
        casella94.setFocusable(false);
        casella94.setFont(new Font("MV Boli",Font.BOLD,20));
        casella94.setForeground(new Color(200,100, 0));
        casella95.setBounds(293,442,72,54);
        casella95.setBackground(new Color(199, 206, 255));
        casella95.setFocusable(false);
        casella95.setFont(new Font("MV Boli",Font.BOLD,20));
        casella95.setForeground(new Color(200,100, 0));
        casella96.setBounds(365,442,72,54);
        casella96.setBackground(new Color(199, 206, 255));
        casella96.setFocusable(true);
        casella96.addActionListener(this);
        casella96.setFont(new Font("MV Boli",Font.BOLD,20));
        casella97.setBounds(442,442,72,54);
        casella97.setFocusable(true);
        casella97.addActionListener(this);
        casella97.setBackground(new Color(227, 227, 250));
        casella97.setFont(new Font("MV Boli",Font.BOLD,20));
        casella98.setBounds(514,442,72,54);
        casella98.setFocusable(true);
        casella98.addActionListener(this);
        casella98.setBackground(new Color(227, 227, 250));
        casella98.setFont(new Font("MV Boli",Font.BOLD,20));
        casella99.setBounds(586,442,72,54);
        casella99.setFocusable(true);
        casella99.addActionListener(this);
        casella99.setBackground(new Color(227, 227, 250));
        casella99.setFont(new Font("MV Boli",Font.BOLD,20));

        button1.setText("1");
        button1.addActionListener(this);
        button1.setBounds(712,70,52,25);
        button1.setLayout(null);
        button1.setFocusable(false);  //tolgo l'evidenza del testo del bottone
        button1.setFont(new Font("MV Boli",Font.BOLD,20));
        button1.setBackground(new Color(199, 206, 255));

        button2.setText("2");
        button2.addActionListener(this);
        button2.setBounds(790,70,52,25);
        button2.setLayout(null);
        button2.setFocusable(false);
        button2.setFont(new Font("MV Boli",Font.BOLD,20));
        button2.setBackground(new Color(199, 206, 255));


        button3.setText("3");
        button3.addActionListener(this);
        button3.setBounds(866,70,52,25);
        button3.setLayout(null);
        button3.setFocusable(false);
        button3.setFont(new Font("MV Boli",Font.BOLD,20));
        button3.setBackground(new Color(199, 206, 255));

        button4.setText("4");
        button4.addActionListener(this);
        button4.setBounds(712,109,52,25);
        button4.setLayout(null);
        button4.setFocusable(false);
        button4.setFont(new Font("MV Boli",Font.BOLD,20));
        button4.setBackground(new Color(199, 206, 255));

        button5.setText("5");
        button5.addActionListener(this);
        button5.setBounds(790,109,52,25);
        button5.setLayout(null);
        button5.setFocusable(false);
        button5.setFont(new Font("MV Boli",Font.BOLD,20));
        button5.setBackground(new Color(199, 206, 255));



        button6.setText("6");
        button6.addActionListener(this);
        button6.setBounds(866,109,52,25);
        button6.setLayout(null);
        button6.setFocusable(false);
        button6.setFont(new Font("MV Boli",Font.BOLD,20));
        button6.setBackground(new Color(199, 206, 255));

        button7.setText("7");
        button7.addActionListener(this);
        button7.setBounds(712,149,52,25);
        button7.setLayout(null);
        button7.setFocusable(false);
        button7.setFont(new Font("MV Boli",Font.BOLD,20));
        button7.setBackground(new Color(199, 206, 255));

        button8.setText("8");
        button8.addActionListener(this);
        button8.setBounds(790,149,52,25);
        button8.setLayout(null);
        button8.setFocusable(false);
        button8.setFont(new Font("MV Boli",Font.BOLD,20));
        button8.setBackground(new Color(199, 206, 255));

        button9.setText("9");
        button9.addActionListener(this);
        button9.setBounds(866,149,52,25);
        button9.setLayout(null);
        button9.setFocusable(false);
        button9.setFont(new Font("MV Boli",Font.BOLD,20));
        button9.setBackground(new Color(199, 206, 255));

        JLabel testo_soluzione1 = new JLabel();
        testo_soluzione1.setBounds(730,224,165,40);
        testo_soluzione1.setText("Quando hai finito");
        testo_soluzione1.setForeground(new Color(227, 227, 250));
        testo_soluzione1.setBackground(new Color(0x0B4776));
        testo_soluzione1.setFont(new Font("MV Boli",Font.PLAIN,20));

        JLabel testo_soluzione2 = new JLabel();
        testo_soluzione2.setBounds(742,245,155,40);
        testo_soluzione2.setText("clicca quì sotto");
        testo_soluzione2.setForeground(new Color(227, 227, 250));
        testo_soluzione2.setBackground(new Color(0x0B4776));
        testo_soluzione2.setFont(new Font("MV Boli",Font.PLAIN,20));

        button_soluzione.setText("SOLUZIONE");
        button_soluzione.addActionListener(this);
        button_soluzione.setBounds(755,286,120,30);
        button_soluzione.setLayout(null);
        button_soluzione.setFocusable(false);
        button_soluzione.setFont(new Font("MV Boli",Font.BOLD,14));
        button_soluzione.setBackground(new Color(199, 206, 255));

        JLabel testo_resa = new JLabel();
        testo_resa.setBounds(701,338,230,40);
        testo_resa.setText("Se ti arrendi clicca quì");
        testo_resa.setForeground(new Color(227, 227, 250));
        testo_resa.setBackground(new Color(0x0B4776));
        testo_resa.setFont(new Font("MV Boli",Font.PLAIN,20));


        button_resa.addActionListener(this);
        button_resa.setBackground(new Color(199, 206, 255));
        button_resa.setText("RESA");
        button_resa.setBounds(763,386,107,30);
        button_resa.setLayout(null);
        button_resa.setFocusable(false);
        button_resa.setFont(new Font("MV Boli",Font.BOLD,14));








        this.setBounds(30,120,930,498);
        this.setBackground(new Color(0xFF171666, true));
        this.setLayout(null);
        this.add(casella11);
        this.add(casella12);
        this.add(casella13);
        this.add(casella14);
        this.add(casella15);
        this.add(casella16);
        this.add(casella17);
        this.add(casella18);
        this.add(casella19);
        this.add(casella21);
        this.add(casella22);
        this.add(casella23);
        this.add(casella24);
        this.add(casella25);
        this.add(casella26);
        this.add(casella27);
        this.add(casella28);
        this.add(casella29);
        this.add(casella31);
        this.add(casella32);
        this.add(casella33);
        this.add(casella34);
        this.add(casella35);
        this.add(casella36);
        this.add(casella37);
        this.add(casella38);
        this.add(casella39);
        this.add(casella41);
        this.add(casella42);
        this.add(casella43);
        this.add(casella44);
        this.add(casella45);
        this.add(casella46);
        this.add(casella47);
        this.add(casella48);
        this.add(casella49);
        this.add(casella51);
        this.add(casella52);
        this.add(casella53);
        this.add(casella54);
        this.add(casella55);
        this.add(casella56);
        this.add(casella57);
        this.add(casella58);
        this.add(casella59);
        this.add(casella61);
        this.add(casella62);
        this.add(casella63);
        this.add(casella64);
        this.add(casella65);
        this.add(casella66);
        this.add(casella67);
        this.add(casella68);
        this.add(casella69);
        this.add(casella71);
        this.add(casella72);
        this.add(casella73);
        this.add(casella74);
        this.add(casella75);
        this.add(casella76);
        this.add(casella77);
        this.add(casella78);
        this.add(casella79);
        this.add(casella81);
        this.add(casella82);
        this.add(casella83);
        this.add(casella84);
        this.add(casella85);
        this.add(casella86);
        this.add(casella87);
        this.add(casella88);
        this.add(casella89);
        this.add(casella91);
        this.add(casella92);
        this.add(casella93);
        this.add(casella94);
        this.add(casella95);
        this.add(casella96);
        this.add(casella97);
        this.add(casella98);
        this.add(casella99);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);
        this.add(testo_soluzione1);
        this.add(testo_soluzione2);
        this.add(button_soluzione);
        this.add(testo_resa);
        this.add(button_resa);



    }
    public boolean giustoRiga1() {
        String[] riga = {
                casella11.getText(), casella12.getText(), casella13.getText(), casella14.getText(), casella15.getText(),
                casella16.getText(), casella17.getText(), casella18.getText(), casella19.getText()
        };
        return  !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) &&
                !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoRiga2() {
        String[] riga = {
                casella21.getText(), casella22.getText(), casella23.getText(), casella24.getText(), casella25.getText(),
                casella26.getText(), casella27.getText(), casella28.getText(), casella29.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1])
                && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoRiga3() {
        String[] riga = {
                casella31.getText(), casella32.getText(), casella33.getText(), casella34.getText(), casella35.getText(),
                casella36.getText(), casella37.getText(), casella38.getText(), casella39.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) &&
                !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoRiga4() {
        String[] riga = {
                casella41.getText(), casella42.getText(), casella43.getText(), casella44.getText(), casella45.getText(),
                casella46.getText(), casella47.getText(), casella48.getText(), casella49.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) &&
                !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoRiga5() {
        String[] riga = {
                casella51.getText(), casella52.getText(), casella53.getText(), casella54.getText(), casella55.getText(),
                casella56.getText(), casella57.getText(), casella58.getText(), casella59.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) &&
                !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoRiga6() {
        String[] riga = {
                casella61.getText(), casella62.getText(), casella63.getText(), casella64.getText(), casella65.getText(),
                casella66.getText(), casella67.getText(), casella68.getText(), casella69.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) &&
                !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoRiga7() {
        String[] riga = {
                casella71.getText(), casella72.getText(), casella73.getText(), casella74.getText(), casella75.getText(),
                casella76.getText(), casella77.getText(), casella78.getText(), casella79.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) &&
                !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoRiga8() {
        String[] riga = {
                casella81.getText(), casella82.getText(), casella83.getText(), casella84.getText(), casella85.getText(),
                casella86.getText(), casella87.getText(), casella88.getText(), casella89.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) &&
                !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoRiga9() {
        String[] riga = {
                casella91.getText(), casella92.getText(), casella93.getText(), casella94.getText(), casella95.getText(),
                casella96.getText(), casella97.getText(), casella98.getText(), casella99.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) &&
                !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }

    public boolean giustoCol1() {
        String[] riga = {
                casella11.getText(), casella21.getText(), casella31.getText(), casella41.getText(), casella51.getText(),
                casella61.getText(), casella71.getText(), casella81.getText(), casella91.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1])
                && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoCol2() {
        String[] riga = {
                casella12.getText(), casella22.getText(), casella32.getText(), casella42.getText(), casella52.getText(),
                casella62.getText(), casella72.getText(), casella82.getText(), casella92.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoCol3() {
        String[] riga = {
                casella13.getText(), casella23.getText(), casella33.getText(), casella43.getText(), casella53.getText(),
                casella63.getText(), casella73.getText(), casella83.getText(), casella93.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoCol4() {
        String[] riga = {
                casella14.getText(), casella24.getText(), casella34.getText(), casella44.getText(), casella54.getText(),
                casella64.getText(), casella74.getText(), casella84.getText(), casella94.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoCol5() {
        String[] riga = {
                casella15.getText(), casella25.getText(), casella35.getText(), casella45.getText(), casella55.getText(),
                casella65.getText(), casella75.getText(), casella85.getText(), casella95.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoCol6() {
        String[] riga = {
                casella13.getText(), casella23.getText(), casella33.getText(), casella43.getText(), casella53.getText(),
                casella63.getText(), casella73.getText(), casella83.getText(), casella93.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoCol7() {
        String[] riga = {
                casella17.getText(), casella27.getText(), casella37.getText(), casella47.getText(), casella57.getText(),
                casella67.getText(), casella77.getText(), casella87.getText(), casella97.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoCol8() {
        String[] riga = {
                casella18.getText(), casella28.getText(), casella38.getText(), casella48.getText(), casella58.getText(),
                casella68.getText(), casella78.getText(), casella88.getText(), casella98.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoCol9() {
        String[] riga = {
                casella19.getText(), casella29.getText(), casella39.getText(), casella49.getText(), casella59.getText(),
                casella69.getText(), casella79.getText(), casella89.getText(), casella99.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }

    public boolean giustoQuad1() {
        String[] riga = {
                casella11.getText(), casella12.getText(), casella13.getText(), casella21.getText(), casella22.getText(),
                casella23.getText(), casella31.getText(), casella32.getText(), casella33.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoQuad2() {
        String[] riga = {
                casella14.getText(), casella15.getText(), casella16.getText(), casella24.getText(), casella25.getText(),
                casella26.getText(), casella34.getText(), casella35.getText(), casella36.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoQuad3() {
        String[] riga = {
                casella17.getText(), casella18.getText(), casella19.getText(), casella27.getText(), casella28.getText(),
                casella29.getText(), casella37.getText(), casella38.getText(), casella39.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoQuad4() {
        String[] riga = {
                casella41.getText(), casella42.getText(), casella43.getText(), casella51.getText(), casella52.getText(),
                casella53.getText(), casella61.getText(), casella62.getText(), casella63.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoQuad5() {
        String[] riga = {
                casella44.getText(), casella45.getText(), casella46.getText(), casella54.getText(), casella55.getText(),
                casella56.getText(), casella64.getText(), casella65.getText(), casella66.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoQuad6() {
        String[] riga = {
                casella47.getText(), casella48.getText(), casella49.getText(), casella57.getText(), casella58.getText(),
                casella59.getText(), casella67.getText(), casella68.getText(), casella69.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoQuad7() {
        String[] riga = {
                casella71.getText(), casella72.getText(), casella73.getText(), casella81.getText(), casella82.getText(),
                casella83.getText(), casella91.getText(), casella92.getText(), casella93.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoQuad8() {
        String[] riga = {
                casella74.getText(), casella75.getText(), casella76.getText(), casella84.getText(), casella85.getText(),
                casella86.getText(), casella94.getText(), casella95.getText(), casella96.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }
    public boolean giustoQuad9() {
        String[] riga = {
                casella77.getText(), casella78.getText(), casella79.getText(), casella87.getText(), casella88.getText(),
                casella89.getText(), casella97.getText(), casella98.getText(), casella99.getText()
        };
        return !riga[0].equals("0") && !riga[1].equals("0") && !riga[2].equals("0") && !riga[3].equals("0") && !riga[4].equals("0") &&
                !riga[5].equals("0") && !riga[6].equals("0") && !riga[7].equals("0") && !riga[8].equals("0") && !riga[0].equals(riga[1]) && !riga[0].equals(riga[2]) && !riga[0].equals(riga[3]) && !riga[0].equals(riga[4]) &&
                !riga[0].equals(riga[5]) && !riga[0].equals(riga[6]) && !riga[0].equals(riga[7]) && !riga[0].equals(riga[8]) &&
                !riga[1].equals(riga[2]) && !riga[1].equals(riga[3]) && !riga[1].equals(riga[4]) && !riga[1].equals(riga[5]) &&
                !riga[1].equals(riga[6]) && !riga[1].equals(riga[7]) && !riga[1].equals(riga[8]) && !riga[2].equals(riga[3]) &&
                !riga[2].equals(riga[4]) && !riga[2].equals(riga[5]) && !riga[2].equals(riga[6]) && !riga[2].equals(riga[7]) &&
                !riga[2].equals(riga[8]) && !riga[3].equals(riga[4]) && !riga[3].equals(riga[5]) && !riga[3].equals(riga[6]) &&
                !riga[3].equals(riga[7]) && !riga[3].equals(riga[8]) && !riga[4].equals(riga[5]) && !riga[4].equals(riga[6]) &&
                !riga[4].equals(riga[7]) && !riga[4].equals(riga[8]) && !riga[5].equals(riga[6]) && !riga[5].equals(riga[7]) &&
                !riga[5].equals(riga[8]) && !riga[6].equals(riga[7]) && !riga[6].equals(riga[8]) && !riga[7].equals(riga[8]);
    }

    public boolean vaBene(){
        return giustoRiga1() && giustoRiga2() && giustoRiga3() && giustoRiga4() && giustoRiga5() && giustoRiga6() && giustoRiga7() &&
                giustoRiga8() && giustoRiga9() && giustoCol1() && giustoCol2() && giustoCol3() && giustoCol4() && giustoCol5() && giustoCol6() &&
                giustoCol7() && giustoCol8() && giustoCol9() && giustoQuad1() && giustoQuad2() && giustoQuad3() && giustoQuad4() && giustoQuad5() &&
                giustoQuad6() && giustoQuad7() && giustoQuad8() && giustoQuad9();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button_resa){
            JOptionPane.showMessageDialog(null,
                    "Peccato, ti sei arreso.","Resa",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (e.getSource()==casella12){
            valCasella=12;

        }
            if (e.getSource()==button1)
               if (valCasella == 12) {
                    casella12.setText("1");
               }
            if (e.getSource()==button2)
                if (valCasella == 12) {
                    casella12.setText("2");
                }
            if (e.getSource()==button3)
                if (valCasella == 12) {
                    casella12.setText("3");
                }
            if (e.getSource()==button4)
                if (valCasella == 12) {
                    casella12.setText("4");
                }
            if (e.getSource()==button5)
                if (valCasella == 12) {
                    casella12.setText("5");
                }
            if (e.getSource()==button6)
                if (valCasella == 12) {
                    casella12.setText("6");
                }
            if (e.getSource()==button7)
                if (valCasella == 12) {
                    casella12.setText("7");
                }
            if (e.getSource()==button8)
                if (valCasella == 12) {
                    casella12.setText("8");
                }
            if (e.getSource()==button9)
                if (valCasella == 12) {
                    casella12.setText("9");
                }

        if (e.getSource()==casella14){
            valCasella=14;

        }
        if (e.getSource()==button1)
            if (valCasella == 14) {
                casella14.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 14) {
                casella14.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 14) {
                casella14.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 14) {
                casella14.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 14) {
                casella14.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 14) {
                casella14.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 14) {
                casella14.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 14) {
                casella14.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 14) {
                casella14.setText("9");
            }

        if (e.getSource()==casella15){
            valCasella=15;

        }
        if (e.getSource()==button1)
            if (valCasella == 15) {
                casella15.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 15) {
                casella15.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 15) {
                casella15.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 15) {
                casella15.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 15) {
                casella15.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 15) {
                casella15.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 15) {
                casella15.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 15) {
                casella15.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 15) {
                casella15.setText("9");
            }

        if (e.getSource()==casella17){
            valCasella=17;
        }
        if (e.getSource()==button1)
            if (valCasella == 17) {
                casella17.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 17) {
                casella17.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 17) {
                casella17.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 17) {
                casella17.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 17) {
                casella17.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 17) {
                casella17.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 17) {
                casella17.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 17) {
                casella17.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 17) {
                casella17.setText("9");
            }

        if (e.getSource()==casella18){
            valCasella=18;
        }
        if (e.getSource()==button1)
            if (valCasella == 18) {
                casella18.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 18) {
                casella18.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 18) {
                casella18.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 18) {
                casella18.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 18) {
                casella18.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 18) {
                casella18.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 18) {
                casella18.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 18) {
                casella18.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 18) {
                casella18.setText("9");
            }

        if (e.getSource()==casella22){
            valCasella=22;
        }
        if (e.getSource()==button1)
            if (valCasella == 22) {
                casella22.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 22) {
                casella22.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 22) {
                casella22.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 22) {
                casella22.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 22) {
                casella22.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 22) {
                casella22.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 22) {
                casella22.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 22) {
                casella22.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 22) {
                casella22.setText("9");
            }

        if (e.getSource()==casella23){
            valCasella=23;
        }
        if (e.getSource()==button1)
            if (valCasella == 23) {
                casella23.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 23) {
                casella23.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 23) {
                casella23.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 23) {
                casella23.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 23) {
                casella23.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 23) {
                casella23.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 23) {
                casella23.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 23) {
                casella23.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 23) {
                casella23.setText("9");
            }

        if (e.getSource()==casella24){
            valCasella=24;
        }
        if (e.getSource()==button1)
            if (valCasella == 24) {
                casella24.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 24) {
                casella24.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 24) {
                casella24.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 24) {
                casella24.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 24) {
                casella24.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 24) {
                casella24.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 24) {
                casella24.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 24) {
                casella24.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 24) {
                casella24.setText("9");
            }

        if (e.getSource()==casella26){
            valCasella=26;
        }
        if (e.getSource()==button1)
            if (valCasella == 26) {
                casella26.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 26) {
                casella26.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 26) {
                casella26.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 26) {
                casella26.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 26) {
                casella26.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 26) {
                casella26.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 26) {
                casella26.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 26) {
                casella26.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 26) {
                casella26.setText("9");
            }

        if (e.getSource()==casella27){
            valCasella=27;
        }
        if (e.getSource()==button1)
            if (valCasella == 27) {
                casella27.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 27) {
                casella27.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 27) {
                casella27.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 27) {
                casella27.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 27) {
                casella27.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 27) {
                casella27.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 27) {
                casella27.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 27) {
                casella27.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 27) {
                casella27.setText("9");
            }

        if (e.getSource()==casella28){
            valCasella=28;
        }
        if (e.getSource()==button1)
            if (valCasella == 28) {
                casella28.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 28) {
                casella28.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 28) {
                casella28.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 28) {
                casella28.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 28) {
                casella28.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 28) {
                casella28.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 28) {
                casella28.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 28) {
                casella28.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 28) {
                casella28.setText("9");
            }

        if (e.getSource()==casella29){
            valCasella=29;
        }
        if (e.getSource()==button1)
            if (valCasella == 29) {
                casella29.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 29) {
                casella29.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 29) {
                casella29.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 29) {
                casella29.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 29) {
                casella29.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 29) {
                casella29.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 29) {
                casella29.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 29) {
                casella29.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 29) {
                casella29.setText("9");
            }

        if (e.getSource()==casella31){
            valCasella=31;
        }
        if (e.getSource()==button1)
            if (valCasella == 31) {
                casella31.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 31) {
                casella31.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 31) {
                casella31.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 31) {
                casella31.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 31) {
                casella31.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 31) {
                casella31.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 31) {
                casella31.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 31) {
                casella31.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 31) {
                casella31.setText("9");
            }

        if (e.getSource()==casella35){
            valCasella=35;
        }
        if (e.getSource()==button1)
            if (valCasella == 35) {
                casella35.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 35) {
                casella35.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 35) {
                casella35.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 35) {
                casella35.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 35) {
                casella35.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 35) {
                casella35.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 35) {
                casella35.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 35) {
                casella35.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 35) {
                casella35.setText("9");
            }

        if (e.getSource()==casella37){
            valCasella=37;
        }
        if (e.getSource()==button1)
            if (valCasella == 37) {
                casella37.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 37) {
                casella37.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 37) {
                casella37.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 37) {
                casella37.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 37) {
                casella37.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 37) {
                casella37.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 37) {
                casella37.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 37) {
                casella37.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 37) {
                casella37.setText("9");
            }

        if (e.getSource()==casella38){
            valCasella=38;
        }
        if (e.getSource()==button1)
            if (valCasella == 38) {
                casella38.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 38) {
                casella38.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 38) {
                casella38.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 38) {
                casella38.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 38) {
                casella38.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 38) {
                casella38.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 38) {
                casella38.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 38) {
                casella38.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 38) {
                casella38.setText("9");
            }

        if (e.getSource()==casella41){
            valCasella=41;
        }
        if (e.getSource()==button1)
            if (valCasella == 41) {
                casella41.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 41) {
                casella41.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 41) {
                casella41.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 41) {
                casella41.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 41) {
                casella41.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 41) {
                casella41.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 41) {
                casella41.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 41) {
                casella41.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 41) {
                casella41.setText("9");
            }

        if (e.getSource()==casella42){
            valCasella=42;
        }
        if (e.getSource()==button1)
            if (valCasella == 42) {
                casella42.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 42) {
                casella42.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 42) {
                casella42.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 42) {
                casella42.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 42) {
                casella42.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 42) {
                casella42.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 42) {
                casella42.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 42) {
                casella42.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 42) {
                casella42.setText("9");
            }

        if (e.getSource()==casella44){
            valCasella=44;
        }
        if (e.getSource()==button1)
            if (valCasella == 44) {
                casella44.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 44) {
                casella44.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 44) {
                casella44.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 44) {
                casella44.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 44) {
                casella44.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 44) {
                casella44.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 44) {
                casella44.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 44) {
                casella44.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 44) {
                casella44.setText("9");
            }

        if (e.getSource()==casella45){
            valCasella=45;
        }
        if (e.getSource()==button1)
            if (valCasella == 45) {
                casella45.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 45) {
                casella45.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 45) {
                casella45.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 45) {
                casella45.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 45) {
                casella45.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 45) {
                casella45.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 45) {
                casella45.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 45) {
                casella45.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 45) {
                casella45.setText("9");
            }

        if (e.getSource()==casella46){
            valCasella=46;
        }
        if (e.getSource()==button1)
            if (valCasella == 46) {
                casella46.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 46) {
                casella46.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 46) {
                casella46.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 46) {
                casella46.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 46) {
                casella46.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 46) {
                casella46.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 46) {
                casella46.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 46) {
                casella46.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 46) {
                casella46.setText("9");
            }

        if (e.getSource()==casella47){
            valCasella=47;
        }
        if (e.getSource()==button1)
            if (valCasella == 47) {
                casella47.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 47) {
                casella47.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 47) {
                casella47.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 47) {
                casella47.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 47) {
                casella47.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 47) {
                casella47.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 47) {
                casella47.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 47) {
                casella47.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 47) {
                casella47.setText("9");
            }

        if (e.getSource()==casella48){
            valCasella=48;
        }
        if (e.getSource()==button1)
            if (valCasella == 48) {
                casella48.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 48) {
                casella48.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 48) {
                casella48.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 48) {
                casella48.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 48) {
                casella48.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 48) {
                casella48.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 48) {
                casella48.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 48) {
                casella48.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 48) {
                casella48.setText("9");
            }

        if (e.getSource()==casella51){
            valCasella=51;
        }
        if (e.getSource()==button1)
            if (valCasella == 51) {
                casella51.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 51) {
                casella51.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 51) {
                casella51.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 51) {
                casella51.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 51) {
                casella51.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 51) {
                casella51.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 51) {
                casella51.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 51) {
                casella51.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 51) {
                casella51.setText("9");
            }

        if (e.getSource()==casella53){
            valCasella=53;
        }
        if (e.getSource()==button1)
            if (valCasella == 53) {
                casella53.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 53) {
                casella53.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 53) {
                casella53.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 53) {
                casella53.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 53) {
                casella53.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 53) {
                casella53.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 53) {
                casella53.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 53) {
                casella53.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 53) {
                casella53.setText("9");
            }

        if (e.getSource()==casella54){
            valCasella=54;
        }
        if (e.getSource()==button1)
            if (valCasella == 54) {
                casella54.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 54) {
                casella54.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 54) {
                casella54.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 54) {
                casella54.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 54) {
                casella54.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 54) {
                casella54.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 54) {
                casella54.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 54) {
                casella54.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 54) {
                casella54.setText("9");
            }

        if (e.getSource()==casella55){
            valCasella=55;
        }
        if (e.getSource()==button1)
            if (valCasella == 55) {
                casella55.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 55) {
                casella55.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 55) {
                casella55.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 55) {
                casella55.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 55) {
                casella55.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 55) {
                casella55.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 55) {
                casella55.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 55) {
                casella55.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 55) {
                casella55.setText("9");
            }

        if (e.getSource()==casella56){
            valCasella=56;
        }
        if (e.getSource()==button1)
            if (valCasella == 56) {
                casella56.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 56) {
                casella56.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 56) {
                casella56.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 56) {
                casella56.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 56) {
                casella56.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 56) {
                casella56.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 56) {
                casella56.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 56) {
                casella56.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 56) {
                casella56.setText("9");
            }

        if (e.getSource()==casella57){
            valCasella=57;
        }
        if (e.getSource()==button1)
            if (valCasella == 57) {
                casella57.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 57) {
                casella57.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 57) {
                casella57.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 57) {
                casella57.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 57) {
                casella57.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 57) {
                casella57.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 57) {
                casella57.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 57) {
                casella57.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 57) {
                casella57.setText("9");
            }

        if (e.getSource()==casella59){
            valCasella=59;
        }
        if (e.getSource()==button1)
            if (valCasella == 59) {
                casella59.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 59) {
                casella59.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 59) {
                casella59.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 59) {
                casella59.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 59) {
                casella59.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 59) {
                casella59.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 59) {
                casella59.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 59) {
                casella59.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 59) {
                casella59.setText("9");
            }

        if (e.getSource()==casella62){
            valCasella=62;
        }
        if (e.getSource()==button1)
            if (valCasella == 62) {
                casella62.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 62) {
                casella62.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 62) {
                casella62.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 62) {
                casella62.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 62) {
                casella62.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 62) {
                casella62.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 62) {
                casella62.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 62) {
                casella62.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 62) {
                casella62.setText("9");
            }

        if (e.getSource()==casella63){
            valCasella=63;
        }
        if (e.getSource()==button1)
            if (valCasella == 63) {
                casella63.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 63) {
                casella63.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 63) {
                casella63.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 63) {
                casella63.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 63) {
                casella63.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 63) {
                casella63.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 63) {
                casella63.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 63) {
                casella63.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 63) {
                casella63.setText("9");
            }

        if (e.getSource()==casella64){
            valCasella=64;
        }
        if (e.getSource()==button1)
            if (valCasella == 64) {
                casella64.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 64) {
                casella64.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 64) {
                casella64.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 64) {
                casella64.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 64) {
                casella64.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 64) {
                casella64.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 64) {
                casella64.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 64) {
                casella64.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 64) {
                casella64.setText("9");
            }

        if (e.getSource()==casella66){
            valCasella=66;
        }
        if (e.getSource()==button1)
            if (valCasella == 66) {
                casella66.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 66) {
                casella66.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 66) {
                casella66.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 66) {
                casella66.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 66) {
                casella66.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 66) {
                casella66.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 66) {
                casella66.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 66) {
                casella66.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 66) {
                casella66.setText("9");
            }

        if (e.getSource()==casella67){
            valCasella=67;
        }
        if (e.getSource()==button1)
            if (valCasella == 67) {
                casella67.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 67) {
                casella67.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 67) {
                casella67.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 67) {
                casella67.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 67) {
                casella67.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 67) {
                casella67.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 67) {
                casella67.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 67) {
                casella67.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 67) {
                casella67.setText("9");
            }

        if (e.getSource()==casella71){
            valCasella=71;
        }
        if (e.getSource()==button1)
            if (valCasella == 71) {
                casella71.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 71) {
                casella71.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 71) {
                casella71.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 71) {
                casella71.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 71) {
                casella71.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 71) {
                casella71.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 71) {
                casella71.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 71) {
                casella71.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 71) {
                casella71.setText("9");
            }

        if (e.getSource()==casella72){
            valCasella=72;
        }
        if (e.getSource()==button1)
            if (valCasella == 72) {
                casella72.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 72) {
                casella72.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 72) {
                casella72.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 72) {
                casella72.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 72) {
                casella72.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 72) {
                casella72.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 72) {
                casella72.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 72) {
                casella72.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 72) {
                casella72.setText("9");
            }

        if (e.getSource()==casella73){
            valCasella=73;
        }
        if (e.getSource()==button1)
            if (valCasella == 73) {
                casella73.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 73) {
                casella73.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 73) {
                casella73.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 73) {
                casella73.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 73) {
                casella73.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 73) {
                casella73.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 73) {
                casella73.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 73) {
                casella73.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 73) {
                casella73.setText("9");
            }

        if (e.getSource()==casella74){
            valCasella=74;
        }
        if (e.getSource()==button1)
            if (valCasella == 74) {
                casella74.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 74) {
                casella74.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 74) {
                casella74.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 74) {
                casella74.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 74) {
                casella74.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 74) {
                casella74.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 74) {
                casella74.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 74) {
                casella74.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 74) {
                casella74.setText("9");
            }

        if (e.getSource()==casella75){
            valCasella=75;
        }
        if (e.getSource()==button1)
            if (valCasella == 75) {
                casella75.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 75) {
                casella75.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 75) {
                casella75.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 75) {
                casella75.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 75) {
                casella75.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 75) {
                casella75.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 75) {
                casella75.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 75) {
                casella75.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 75) {
                casella75.setText("9");
            }

        if (e.getSource()==casella77){
            valCasella=77;
        }
        if (e.getSource()==button1)
            if (valCasella == 77) {
                casella77.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 77) {
                casella77.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 77) {
                casella77.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 77) {
                casella77.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 77) {
                casella77.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 77) {
                casella77.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 77) {
                casella77.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 77) {
                casella77.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 77) {
                casella77.setText("9");
            }

        if (e.getSource()==casella78){
            valCasella=78;
        }
        if (e.getSource()==button1)
            if (valCasella == 78) {
                casella78.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 78) {
                casella78.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 78) {
                casella78.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 78) {
                casella78.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 78) {
                casella78.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 78) {
                casella78.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 78) {
                casella78.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 78) {
                casella78.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 78) {
                casella78.setText("9");
            }

        if (e.getSource()==casella79){
            valCasella=79;
        }
        if (e.getSource()==button1)
            if (valCasella == 79) {
                casella79.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 79) {
                casella79.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 79) {
                casella79.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 79) {
                casella79.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 79) {
                casella79.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 79) {
                casella79.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 79) {
                casella79.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 79) {
                casella79.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 79) {
                casella79.setText("9");
            }

        if (e.getSource()==casella81){
            valCasella=81;
        }
        if (e.getSource()==button1)
            if (valCasella == 81) {
                casella81.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 81) {
                casella81.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 81) {
                casella81.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 81) {
                casella81.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 81) {
                casella81.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 81) {
                casella81.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 81) {
                casella81.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 81) {
                casella81.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 81) {
                casella81.setText("9");
            }

        if (e.getSource()==casella82){
            valCasella=82;
        }
        if (e.getSource()==button1)
            if (valCasella == 82) {
                casella82.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 82) {
                casella82.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 82) {
                casella82.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 82) {
                casella82.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 82) {
                casella82.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 82) {
                casella82.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 82) {
                casella82.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 82) {
                casella82.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 82) {
                casella82.setText("9");
            }

        if (e.getSource()==casella84){
            valCasella=84;
        }
        if (e.getSource()==button1)
            if (valCasella == 84) {
                casella84.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 84) {
                casella84.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 84) {
                casella84.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 84) {
                casella84.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 84) {
                casella84.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 84) {
                casella84.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 84) {
                casella84.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 84) {
                casella84.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 84) {
                casella84.setText("9");
            }

        if (e.getSource()==casella86){
            valCasella=86;
        }
        if (e.getSource()==button1)
            if (valCasella == 86) {
                casella86.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 86) {
                casella86.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 86) {
                casella86.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 86) {
                casella86.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 86) {
                casella86.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 86) {
                casella86.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 86) {
                casella86.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 86) {
                casella86.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 86) {
                casella86.setText("9");
            }

        if (e.getSource()==casella87){
            valCasella=87;
        }
        if (e.getSource()==button1)
            if (valCasella == 87) {
                casella87.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 87) {
                casella87.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 87) {
                casella87.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 87) {
                casella87.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 87) {
                casella87.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 87) {
                casella87.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 87) {
                casella87.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 87) {
                casella87.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 87) {
                casella87.setText("9");
            }

        if (e.getSource()==casella88){
            valCasella=88;
        }
        if (e.getSource()==button1)
            if (valCasella == 88) {
                casella88.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 88) {
                casella88.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 88) {
                casella88.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 88) {
                casella88.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 88) {
                casella88.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 88) {
                casella88.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 88) {
                casella88.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 88) {
                casella88.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 88) {
                casella88.setText("9");
            }

        if (e.getSource()==casella89){
            valCasella=89;
        }
        if (e.getSource()==button1)
            if (valCasella == 89) {
                casella89.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 89) {
                casella89.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 89) {
                casella89.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 89) {
                casella89.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 89) {
                casella89.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 89) {
                casella89.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 89) {
                casella89.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 89) {
                casella89.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 89) {
                casella89.setText("9");
            }

        if (e.getSource()==casella93){
            valCasella=93;
        }
        if (e.getSource()==button1)
            if (valCasella == 93) {
                casella93.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 93) {
                casella93.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 93) {
                casella93.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 93) {
                casella93.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 93) {
                casella93.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 93) {
                casella93.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 93) {
                casella93.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 93) {
                casella93.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 93) {
                casella93.setText("9");
            }

        if (e.getSource()==casella96){
            valCasella=96;
        }
        if (e.getSource()==button1)
            if (valCasella == 96) {
                casella96.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 96) {
                casella96.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 96) {
                casella96.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 96) {
                casella96.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 96) {
                casella96.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 96) {
                casella96.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 96) {
                casella96.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 96) {
                casella96.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 96) {
                casella96.setText("9");
            }

        if (e.getSource()==casella97){
            valCasella=97;
        }
        if (e.getSource()==button1)
            if (valCasella == 97) {
                casella97.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 97) {
                casella97.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 97) {
                casella97.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 97) {
                casella97.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 97) {
                casella97.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 97) {
                casella97.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 97) {
                casella97.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 97) {
                casella97.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 97) {
                casella97.setText("9");
            }

        if (e.getSource()==casella98){
            valCasella=98;
        }
        if (e.getSource()==button1)
            if (valCasella == 98) {
                casella98.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 98) {
                casella98.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 98) {
                casella98.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 98) {
                casella98.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 98) {
                casella98.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 98) {
                casella98.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 98) {
                casella98.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 98) {
                casella98.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 98) {
                casella98.setText("9");
            }

        if (e.getSource()==casella99){
            valCasella=99;
        }
        if (e.getSource()==button1)
            if (valCasella == 99) {
                casella99.setText("1");
            }
        if (e.getSource()==button2)
            if (valCasella == 99) {
                casella99.setText("2");
            }
        if (e.getSource()==button3)
            if (valCasella == 99) {
                casella99.setText("3");
            }
        if (e.getSource()==button4)
            if (valCasella == 99) {
                casella99.setText("4");
            }
        if (e.getSource()==button5)
            if (valCasella == 99) {
                casella99.setText("5");
            }
        if (e.getSource()==button6)
            if (valCasella == 99) {
                casella99.setText("6");
            }
        if (e.getSource()==button7)
            if (valCasella == 99) {
                casella99.setText("7");
            }
        if (e.getSource()==button8)
            if (valCasella == 99) {
                casella99.setText("8");
            }
        if (e.getSource()==button9)
            if (valCasella == 99) {
                casella99.setText("9");
            }


        if (e.getSource()==button_soluzione) {
            if (vaBene()) {
                ImageIcon image = new ImageIcon("Yes_Check_Circle.png");
                String[] Risposte_parole = {"Ok", "Esci"};

                int risposta = (JOptionPane.showOptionDialog(null,
                        "Complimenti, sei riuscito a risolvere il Sudoku!",
                        "Congratulazioni!",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        image,
                        Risposte_parole,
                        0));

                if (risposta == 1)
                    System.exit(0);
            } else {
                ImageIcon sbagliato = new ImageIcon("Sbagliato.png");
                String[] Risposte1 = {"Soluzione", "Riprova", "Esci"};

                int risposta1 = (JOptionPane.showOptionDialog(null,
                        "Peccato, il Sudoku non è stato risolto correttamente.",
                        "Peccato!",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        sbagliato,
                        Risposte1,
                        0));

                if (risposta1 == 0) {
                    casella12.setText("7");
                    casella14.setText("3");
                    casella15.setText("8");
                    casella17.setText("5");
                    casella18.setText("2");
                    casella22.setText("1");
                    casella23.setText("4");
                    casella24.setText("2");
                    casella26.setText("7");
                    casella27.setText("3");
                    casella28.setText("6");
                    casella29.setText("9");
                    casella31.setText("2");
                    casella35.setText("6");
                    casella37.setText("7");
                    casella38.setText("4");
                    casella41.setText("3");
                    casella42.setText("2");
                    casella44.setText("6");
                    casella45.setText("1");
                    casella46.setText("5");
                    casella47.setText("9");
                    casella48.setText("7");
                    casella51.setText("1");
                    casella53.setText("7");
                    casella54.setText("4");
                    casella55.setText("9");
                    casella56.setText("2");
                    casella57.setText("8");
                    casella59.setText("6");
                    casella62.setText("9");
                    casella63.setText("6");
                    casella64.setText("8");
                    casella66.setText("3");
                    casella67.setText("1");
                    casella71.setText("9");
                    casella72.setText("4");
                    casella73.setText("3");
                    casella74.setText("5");
                    casella75.setText("2");
                    casella77.setText("6");
                    casella78.setText("8");
                    casella79.setText("7");
                    casella81.setText("5");
                    casella82.setText("8");
                    casella84.setText("7");
                    casella86.setText("6");
                    casella87.setText("2");
                    casella88.setText("9");
                    casella89.setText("3");
                    casella93.setText("2");
                    casella96.setText("8");
                    casella97.setText("4");
                    casella98.setText("1");
                    casella99.setText("5");

                }

                if (risposta1 == 2) {
                    System.exit(0);
                }

            }
        }


    }
}

