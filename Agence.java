/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l.tpgl4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author welcome
 */
public class Agence {
    ArrayList<Ville>vd = new ArrayList<Ville>();
    ArrayList<Ville>vl = new ArrayList<Ville>();
    ArrayList<InfoArret>infarrt = new ArrayList<InfoArret>();
      static ArrayList<Client>cl= new ArrayList<Client>();
    
    private String nom , prenom ,mail ,adr,gender ,passw;
    private int tele,age ;
    
    public Agence(String nom, String prenom,String mail ,String adr,String gender ,int age ,int tele,String passw){
        this.nom =nom;
        this.prenom =prenom;
        this.mail =mail ;
        this.adr =adr ;
        this.gender=gender;
        this.age=age;
        this.tele =tele;
        this.passw=passw;
    }
    public Agence(){
       
    }
    
    public Client getclient(String nom , String password ){
         int ver =0;
        int I =0;
        for( int i=0 ;i<=cl.size();i++){
            if(cl.get(i).getnom().equalsIgnoreCase(nom)){
                if(cl.get(i).getpasw().equalsIgnoreCase(password)){
                    ver =1;
                    I=i;
                   System.out.println("welcom....");
                    
                }else{
                    ver =2;
                    System.out.println("wring password...");
                }
            }else{
                ver =0;
                System.out.println("wrong name...");
            }
            
        }
        return cl.get(I);
    }
    
    public String getnom(){
        return this.nom;
    }
    public String getpass(){
        return this.passw;
    }
    public String setpasw(String newpasw){
        return this.passw=newpasw;
    }
    
    public Voyage ajoutervoy() throws ParseException{
        
        System.out.println("_______ADD VOYAGE : ..................");
        System.out.println("DEPARTURE CITY :");
        System.out.print("===>");
        Scanner input = new Scanner(System.in);
        String ville = input.nextLine();
        Ville villed = new Ville(ville);
        vd.add(villed);
        
         System.out.println("Arrival CITY :");
         System.out.print("===>");
         input = new Scanner(System.in);
         ville = input.nextLine();  
         Ville villea = new Ville(ville); 
         vl.add(villea);
         
         System.out.print("DEPARTURE date (eg:2001-01-01 11:00): \n");
           SimpleDateFormat dateInput = new SimpleDateFormat("yyyy-MM-dd hh:mm");
           input = new Scanner(System.in);
           String strdate = input.nextLine();
           Date dated = dateInput.parse(strdate);
               
           System.out.print("Arrival date (eg:2001-01-01 11:00): \n");
           input = new Scanner(System.in);
           strdate = input.nextLine();
           Date datea = dateInput.parse(strdate);
           
           
           
           System.out.println("etat of voyage :(true/false)");
         System.out.print("===>");
         input = new Scanner(System.in);
        boolean etat = input.nextBoolean();
        
        System.out.println("prix of voyage :(true/false)");
         System.out.print("===>");
         input = new Scanner(System.in);
       int prix= input.nextInt();
        
         System.out.println("how many arret do you want to add :");
         System.out.print("===>");
         input = new Scanner(System.in);
         int arrt = input.nextInt();
         
         
         for(int i =1;i<=arrt;i++){
             System.out.println("DEPARTURE CITY :");
        System.out.print("===>");
         input = new Scanner(System.in);
          ville = input.nextLine();
         villea = new Ville(ville);
        
        
        
         
         
         System.out.print("DEPARTURE HEAUR (eg: 11:00): \n");
           input = new Scanner(System.in);
           String  tmd = input.nextLine();
         LocalTime hd = LocalTime.parse(tmd);
           
           
           
            System.out.print("Arrival HEAUR (eg: 11:00): \n");
           input = new Scanner(System.in);
           String tma = input.nextLine();
          LocalTime ha = LocalTime.parse(tma);
        
          InfoArret ina = new InfoArret(hd,ha,villea);
          infarrt.add(ina);
        
         }
        
           Voyage voyage = new Voyage(dated,datea,villed,villea,etat,infarrt,prix);
           
           System.out.println("\n\n_______VOYAGE IS CREATED .....THANK YOU");
           return voyage ;
        
        
    }
    
    
    public void affichvyg(Voyage v){
        
        System.out.print("\nDEPARTURE CITY :"+v.getvilled()
                         + "\nArrival CITY :"+v.getvillea()
                          +"\nDEPATURE TIME :"+v.getdated()
                         +"\nARRAVIL TIME  :"+v.getdatea()
                                         
        );
        System.out.println("THE STOPS : ");
        for(int i =0;i<v.getinfoarrt().size();i++){
            System.out.print(v.getinfoarrt().get(i).getvill()+"\t\t");
        }
        
    }
    
    
    public void afficherinfo(){
      
      System.out.print("\nFirst Name :"+this.nom
                      +"\nLast Name :"+this.prenom
                      +"\nMail     :"+this.mail
                      +"\n Gender   :"+this.gender
                      +"\nAge       "+this.age
                      +"\nphone number :"+this.tele);
  }
    
    public void addclient(String nom ,String prenom, String mail ,String adr, String gender,String city, int age , int tele,String pasw){
        
        
        Client c =new Client( nom , prenom, mail , adr,  gender, city,  age , tele, pasw);
        cl.add(c);
    
        Clientmain.lc.add(c);
    }
    
    public void changetatstat(Voyage v){
       System.out.println("Do you want :"
               + "\n 1-open this voyage "
               + "\n 2-close this.voyage");
       Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        switch(c){
            case 1:v.setetat(true);
            case 2:v.setetat(false);
            default :System.out.println("please u have to chose 1 or 2");
        }
       
       
    }
    public void affichclient(){
        
             for(int i=0;i<cl.size();i++){
                        System.out.println("\n"+(i+1)+"-"+cl.get(i).getnom());
                   }
        
    }
    
    
    
}
