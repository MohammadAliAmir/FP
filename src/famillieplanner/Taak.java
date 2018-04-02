/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package famillieplanner;
import java.util.ArrayList;

/**
 *
 * @author Yasin
 */
public class Taak {
    private String persoon;
    private String beschrijving;
    private String deadline;
    private boolean volbracht;
    private ArrayList<User2> users;
    
    public Taak(ArrayList<User2> users)
    {
        this.users = users;
    }
    
    public void maakTaak(String p, String b, String d)
    {
        persoon=p;
        deadline=d;
        beschrijving=b;
    }
    
    public void beeindigTaak()
    {
        volbracht=true;
    }
}
