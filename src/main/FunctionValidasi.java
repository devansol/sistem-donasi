/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Daus
 */
public class FunctionValidasi {
    public void filterhuruf(KeyEvent a, String pesan){
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null,pesan);
        }
    }
    
    public void filterangka(KeyEvent a, String pesan){
        if(Character.isDigit(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null,pesan);
        }
    }
}
