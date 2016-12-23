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
public class Player {
    
    private String name;
    private int money;
    private ArrayList<OwnableField> ownedFields;
    private int location;

    public Player(String name, int money, ArrayList<OwnableField> ownedFields, int location) {
        this.name = name;
        this.money = money;
        this.ownedFields = ownedFields;
        this.location = location;
    }
    
    protected Player(String name) {
        this.name = name;
        this.money = 1500;
        this.ownedFields = new ArrayList<>();
        this.location = 0;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<OwnableField> getOwnedFields() {
        return ownedFields;
    }

    public int getLocation() {
        return location;
    }
    
    public void addMoney(int amount) {
        this.money += amount;
    }
    
    public void removeMoney(int amount) {
        this.money -= amount;
    }
    
    public void move(int dir, int amount) {
        switch(dir) {
            case DIR_FORWARD:
                this.location += amount;
                break;
            case DIR_BACKWARD:
                this.location -= amount;
        }
    }
    
    public void addField(OwnableField f) {
        this.ownedFields.add(f);
    }
    
    public void removeField(OwnableField f) {
        this.ownedFields.remove(f);
    }
    
    public final int DIR_FORWARD = 1;
    public final int DIR_BACKWARD = 2;
}
