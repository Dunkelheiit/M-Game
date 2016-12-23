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
public abstract class OwnableField extends Field{
    
    protected Player owner;
    private boolean mortgaged;

    public OwnableField(int location, String name, Player owner, boolean mortgaged) {
        super(location, name);
        this.owner = owner;
        this.mortgaged = mortgaged;
    }
    
    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public boolean isMortgaged() {
        return mortgaged;
    }

    public void setMortgaged(boolean mortgaged) {
        this.mortgaged = mortgaged;
    }
    
    
}
