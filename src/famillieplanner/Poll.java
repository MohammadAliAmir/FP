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
import java.util.ArrayList;

public class Poll {
    
    private String vraag;
    private int antwoord1;
    private int antwoord2;
    
    public Poll (){
    }
    
    public String getVraag(){
        return vraag;
    }
    
    public void setVraag(String v){
        vraag=v;
    }
    
}
