/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

public class Calculator {
    JFrame jframe;
    JPanel jp = new JPanel();
    JPanel jp2 = new JPanel();
    JTabbedPane tabbedPane = new JTabbedPane();
 
    public Calculator(){     
      init();
    }
    
    public void init(){
        jframe = new JFrame("Calculator");
        jframe.setSize(300, 550);
        jframe.setLocation(100, 100);
        jframe.setLayout(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        draw();

        tabbedPane.setBounds(5, 170, 273, 260);
        tabbedPane.add("Normal", jp);
        tabbedPane.add("Scientist", jp2);
        jframe.add(tabbedPane);
        jframe.setVisible(true);     
    }
    
    public void drawKeyBoard(){
        
        jp2.setLocation(20, 200);
        jp2.setSize(250,200);   
        jp2.setLayout(new GridLayout(4,3)); 
        
        for (int i = 1; i < 10; i++) {
            JButton btn = new JButton("" + i);
            jp2.add(btn);
        }
        
        JButton b10 = new JButton("0");
        jp2.add(b10);
        
        JButton b11 = new JButton("+");
        jp2.add(b11);
        
        JButton b12 = new JButton("-");
        jp2.add(b12);
        
        JButton b13 = new JButton("/");
        jp2.add(b13);
        
        JButton b14 = new JButton("="); 
        jp2.add(b14);
        
        JButton b16 = new JButton("shift"); 
        jp2.add(b16);
        
        JButton b17 = new JButton("sin"); 
        jp2.add(b17);
        
        JButton b18 = new JButton("cos"); 
        jp2.add(b18);
        
        JButton b19 = new JButton("tan"); 
        jp2.add(b19);
        
        JButton b20 = new JButton("cot"); 
        jp2.add(b20);
        
       ////////////////////////////////
        jp.setLocation(20, 200);
        jp.setSize(250,200);   
        jp.setLayout(new GridLayout(4,3)); 
        
        for (int i = 1; i < 10; i++) {
            JButton btn = new JButton("" + i);
            jp.add(btn);
        }
        
        JButton b5 = new JButton("0");
        jp.add(b5);
        
        JButton b1 = new JButton("+");
        jp.add(b1);
        
        JButton b2 = new JButton("-");
        jp.add(b2);
        
        JButton b3 = new JButton("/");
        jp.add(b3);
        
        JButton b4 = new JButton("="); 
        jp.add(b4);
        
        JButton b6 = new JButton("shift"); 
        jp.add(b6);
        
        jframe.add(jp2);
        jframe.add(jp);
    }
 
    public void drawScreen(){
        JTextArea display = new JTextArea(); 
        display.setEditable(false);
        display.setFont(new Font("Arial", 14,14));
        
        JScrollPane jsp = new JScrollPane(display);
        jsp.setSize(280, 140);
        jsp.setLocation(3, 20);

        jframe.add(jsp);
       
    }
    
     public void draw(){
        drawKeyBoard();
        drawScreen();
    }
}
