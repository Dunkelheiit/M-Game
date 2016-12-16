/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author nils.bloemeke
 */
public abstract class Field {
    
    protected int loc;
    protected String name;
    protected Player owner;

    public Field(int loc, String name) {
        this.loc = loc;
        this.name = name;
        this.owner = new Bank();
    }    

    public int getLoc() {
        return loc;
    }

    public String getName() {
        return name;
    }
    
    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
    
    public abstract void landedOn();
}
