/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Nils Bloemeke, Erik
 */
public class Utility extends OwnableField{

    private int cost, level;
    
    public Utility(int loc, String name, Player owner, int cost, boolean mortgaged) {
        super(loc, name, owner, mortgaged);
        this.cost =  cost;
        //this.level = checkOther();
    }

    public Utility(int location, String name, Player owner) {
        super(location, name, owner, false);
        this.cost = 75;
    }
    
    @Override
    public void landedOn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
