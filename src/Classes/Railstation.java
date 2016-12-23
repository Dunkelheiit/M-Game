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
public class Railstation extends Utility{

    public Railstation(int loc, String name, Player owner) {
        super(loc, name, owner, 200, false);
    }

    public Railstation(int loc, String name, Player owner, int cost, boolean mortgaged) {
        super(loc, name, owner, cost, mortgaged);
    }

    @Override
    public void landedOn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
