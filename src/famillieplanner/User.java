/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package famillieplanner;

/**
 *
 * @author cedricplouvier
 */
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class User extends Famillieplanner {
    String naam;
    String paswoord;
    String groep;
    
    public User (){
    }
    
    public void meldAan () {
        Scanner input = new Scanner(System.in); 
        System.out.println("geef accountnaam");
        naam = input.next();
        System.out.println("geef paswoord");
        paswoord = input.next();
    }
    
    public void registreer() {
        
        Scanner input = new Scanner(System.in); 
        System.out.println("geef accountnaam");
        naam = input.next();
        System.out.println("geef paswoord");
        paswoord = input.next();
    }
    
    public void maakGroepAan(){
        Scanner input = new Scanner (System.in);
        System.out.println("geef de groepnaam");
        groep = input.nextLine(); 
    }
    
    public String getNaam(){
        return naam;
    }
    
}
