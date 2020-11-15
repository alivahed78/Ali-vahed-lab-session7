/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.UIManager;

/**
 *
 * @author Ali
 */
public class Main {

    public static void main(String[] args) {
        
        try{
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch (Exception e) {
            System.err.println(e);
        }
        
       Calculator calc = new Calculator();
       
    }
    
}
