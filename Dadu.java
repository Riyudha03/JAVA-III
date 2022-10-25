/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak301;

public class Dadu {
    private int value;

    public void acakNilai(){
        this.value=(int)(1+Math.random()*(6));
    }
    
    public int getValue(){
        return this.value;
    }
}
