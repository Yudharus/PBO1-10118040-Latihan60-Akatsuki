/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118040.latihan60.akatsuki;

/**
 *
 * @author asus
 */
public class Akatsuki {
    protected String clothes;
    protected String goals;

    public Akatsuki(String clothes, String goals) {
        this.clothes = clothes;
        this.goals = goals;
        
        clothes = "Black Red Cloud";
        goals = "Gathering all Jinchuriki";
        
    }

    public String getClothes() {
        return clothes;
    }

    public String getGoals() {
        return goals;
    }
}
