/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Color;

/**
 *
 * @author Nils Bloemeke, Erik
 */
public class Property extends OwnableField{

    private Color color;
    private int cost, rent, level;

    public Property(int loc, String name, Color color, int cost, int rent, Player owner, int level, boolean mortgaged) {
        super(loc, name, owner, mortgaged);
        this.color = color;
        this.cost = cost;
        this.rent = rent;
        this.level = level;
    }
    
    @Override
    public void landedOn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
