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
public class Utility extends Field{

    private int cost, level;
    private boolean mortgaged;
    
    public Utility(int loc, String name) {
        super(loc, name);
        this.mortgaged = false;
        this.cost =  75;
        //this.level = checkOther();
    }

    @Override
    public void landedOn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
