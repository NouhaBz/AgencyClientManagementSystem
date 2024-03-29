/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l.tpgl4;


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author welcome
 */
public class Voyage {
    private Date datedepart,datearrive;
    private Ville villed, villea;
    private ArrayList<InfoArret> infoarret ;
    private int prix ;
    private boolean etat ;
    public Voyage (Date dated , Date datea, Ville villed , Ville villea , boolean e,ArrayList<InfoArret>infarret,int prix){
        this.datedepart=dated;
        this.datearrive=datea;
        this.villed =villed;
        this.villea =villea;
        this.etat=e;
        this.infoarret=infarret;
        this.prix=prix;
    }
    
    public Date getdated(){
        return this.datedepart;
    }
    
    public Date getdatea(){
        return this.datearrive;
    }
    
    public String getvilled(){
        return this.villed.getvill();
    }
    
    public String getvillea(){
       
        return this.villea.getvill();
    }
    
    public boolean getetat(){
        return this.etat;
    }
   public ArrayList<InfoArret> getinfoarrt(){
       return this.infoarret;
   }
   public boolean setetat(boolean e){
       return this.etat= e;
   }
    
    
    public void affichvyg(){
        
        System.out.print("\nDEPARTURE CITY :"+this.villed
                         + "\nArrival CITY :"+this.villea
                          +"\nDEPATURE TIME :"+this.datedepart
                         +"\nARRAVIL TIME  :"+this.datearrive 
                          +"\nPRIX OF VOYAGE  :"+this.prix
                           );
        
    }
    
}
