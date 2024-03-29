/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l.tpgl4;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author welcome
 */
public class ResarvastionBus extends Resarvation {
    private int numBus;

    public ResarvastionBus(Voyage v) {
        super(v);
        Random rand = new Random();
        int int_random = rand.nextInt(15);
        this.numBus=int_random;
    }
    
    
    
}
