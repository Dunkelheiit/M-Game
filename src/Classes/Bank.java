/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author Nils Bloemeke, Erik
 */
public class Bank extends Player{

    private int houses, hotels;
    
    public Bank(ArrayList<OwnableField> ownedFields) {
        super("Bank", 1, ownedFields, -1);
    }
    
    @Override
    public void addMoney(int amount) {
        
    }
    
    @Override
    public void removeMoney(int amount) {
        
    }
    
    @Override
    public void move(int dir, int amount) {
        
    }
    
    @Override
    public int getLocation() {
        return -1;
    }
    
}
