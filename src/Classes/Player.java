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
    private ArrayList<Field> ownedFields;
    private int loc;

    public Player(String name) {
        this.name = name;
        this.money = 1500;
        this.ownedFields = new ArrayList<>();
        this.loc = 0;
    }
    
    protected Player() {
        this.name = "Bank";
        this.money = Integer.MAX_VALUE;
        this.ownedFields = new ArrayList<>();
        this.loc = -1;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Field> getOwnedFields() {
        return ownedFields;
    }

    public int getLoc() {
        return loc;
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
                this.loc += amount;
                break;
            case DIR_BACKWARD:
                this.loc -= amount;
        }
    }
    
    public void addField(Field f) {
        this.ownedFields.add(f);
    }
    
    public void removeField(Field f) {
        this.ownedFields.remove(f);
    }
    
    public final int DIR_FORWARD = 1;
    public final int DIR_BACKWARD = 2;
}
