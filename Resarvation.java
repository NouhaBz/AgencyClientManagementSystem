/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l.tpgl4;

import java.util.Date;

/**
 *
 * @author welcome
 */
public class Resarvation {
     private Voyage resvoyage;
     public  Resarvation(Voyage v) {
         this.resvoyage=v; 
     }
    public void aff(){
        System.out.println("the voyage :"
                + "\n DEPARTURE city :"+this.resvoyage.getvilled()
                + "\n Arrival city :"+this.resvoyage.getvillea()
                + "\n DEPARTURE date :"+this.resvoyage.getdated()
                + "\n Arrival date :"+this.resvoyage.getdatea()
        );
    }
}
