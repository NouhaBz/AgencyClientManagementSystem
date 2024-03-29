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
public class Client{
    static ArrayList<Client> lc =new ArrayList<Client>(); 
    ArrayList<ResarvastionBus> lr = new ArrayList<ResarvastionBus>();
   static ArrayList<Voyage> vygre = new ArrayList<Voyage>();
    private String nom, prenom,mail,adress,gender,city,pasw;
    private int age , tele;
    private Passager passager ;
    public Client(String nom ,String prenom, String mail ,String adr, String gender,String city, int age , int tele,String pasw){
        this.nom =nom ;
        this.prenom =prenom;
        this.mail =mail ;
        this.adress =adr ;
        this.city=city;
        this.gender =gender;
        this.age =age ;
        this.tele  =tele;
        this.pasw =pasw;
        
    }
   
    public String getnom(){
        return this.nom;
    }
    public String setpasw(String newpasw){
        return this.pasw=newpasw;
    }
    public String getpasw(){
        return this.pasw;
    }
    
     public String setnom(String nom){
        return this.nom=nom;
    }
      public String setprenom(String prenom){
        return this.prenom=prenom;
    }
       public String setmail(String mail){
        return this.mail=mail;
    }
        public String setadress(String adress){
        return this.adress=adress;
    }
         public String setcity(String city){
        return this.city=city;
    }
          public int setage(int age){
        return this.age=age;
    }
           public int settele(int tele){
        return this.tele=tele;
    }
   
    
    
  public ResarvastionBus res (Voyage v){
      ResarvastionBus re =new ResarvastionBus(v);
      lr.add(re);
      return re;
  } 
  
    
  public int recharch(Ville rvilled,Ville rvillea  ){
       int i=0;
       
        for( i=0;i<Agencemain.vd.size();i++){
         
            if(Agencemain.vd.get(i).equals(rvilled)){
               if(Agencemain.vl.get(i).equals(rvillea)){
                   System.out.println("\n "+(i+1)+"-"+rvilled +" ==> "+rvillea +" : "+Agencemain.vyg.get(i).getdated()+"==>"+Agencemain.vyg.get(i).getdatea());
                  i=i;
                  vygre.add(Agencemain.vyg.get(i));
                          break;
               } 
                
            }else{
                
                i=0;
            }
           
            
        }
        
        
       return i ; 
    }
    
  public void afficheres(){
      for(int i =0;i<lr.size();i++){
          lr.get(i).aff();
      }
      
  }
  
  
  public void afficherinfo(){
      
      System.out.print("\nFirst Name :"+this.nom
                      +"\nLast Name :"+this.prenom
                      +"\nMail     :"+this.mail
                      +"\n Adress   :"+this.adress
                      +"\n Gender   :"+this.gender
                      +"\nCity      :"+this.city
                      +"\nAge       "+this.age
                      +"\nphone number :"+this.tele);
  }
  
 
  
}
