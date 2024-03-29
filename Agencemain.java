/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package l.tpgl4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class Agencemain {
    static ArrayList<String>vd = new ArrayList<String>();
   static ArrayList<String>vl = new ArrayList<String>();
     static  ArrayList<Voyage>vyg = new ArrayList<Voyage>();
     static ArrayList<Client>cl= new ArrayList<Client>();
     static ArrayList<Agence>gerant= new ArrayList<Agence>();
     static Voyage vg ;  
     
     
    public static void main(String[] args) throws ParseException {
        
         System.out.println("\n\n\n-------------------WELCOME TO THE AGENCE------------------------");
         System.out.println("\n please add a agence manger to start ");
         System.out.println("\n \t\t THE INSCRAPTION :");
         System.out.println("\n your first name : ");
              System.out.print("===>");
             Scanner input = new Scanner(System.in);
              String name = input.nextLine();
              
              System.out.println("\n your last name : ");
              System.out.print("===>");
              input = new Scanner(System.in);
              String prenom = input.nextLine();
               
               System.out.println("\n your age : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              int age = input.nextInt();
               
               System.out.println("\n your gender : ");
               System.out.print("\n 1-femme \n 2-homme");
               System.out.print("===>");
                String gender="";
              input = new Scanner(System.in);
              int g = input.nextInt();
              if(g==1){
                gender ="femme";  
              }else{
                  if(g==2){
                   gender ="homme";   
                  }
              }
               
               System.out.println("\n your mail : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              String mail = input.nextLine();
               
               System.out.println("\n your adress : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              String adress = input.nextLine();
               
               System.out.println("\n your phone number : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              int tele= input.nextInt();
              
         
             System.out.println("\n Password : ");
               System.out.print("===>");
              input = new Scanner(System.in);
             String password = input.nextLine();
             
        
        Agence ag = new Agence(name,prenom,mail,adress,gender,age,tele,password);
        gerant.add(ag);
        
        
        System.out.println("done inscruption .");
        
        System.out.println("...............................................................................................................................................................................................................................");
        
        System.out.println("___________________Log In ____________________________________");
        System.out.println("\nYour Name : ===> ");
         input = new Scanner(System.in);
        String nom = input.nextLine();
        System.out.println("\nPassword : ===> ");
        input = new Scanner(System.in);
        password = input.nextLine();
        int ver =0;
        int I =0;
        for( int i=0 ;i<gerant.size();i++){
            if(gerant.get(i).getnom().equalsIgnoreCase(nom)){
                if(gerant.get(i).getpass().equalsIgnoreCase(password)){
                    ver =1;
                    I=i;
                    break;
                    
                }else{
                    ver =2;
                }
            }else{
                ver =0;
            }
            
        }
        
          if (ver==1){
            
            int chose =0;  
              
            while(chose!=8){
                
                
                
                
              
            
            System.out.println("\n\n\n....................................................................................................");
             System.out.println("\n  ________________________Menue ______________     :"
                + "\n 1-your information"
                + "\n 2-edit your ingormation"
                + "\n 3-edit password "
                + "\n 4-add Voyage"
                + "\n 5-add client"
                + "\n 6-list of voyage"
                + "\n 7-list of client"
                + "\n 9-change etat voyage"
                + "\n 10-rechrche client"
                + "\n 10-rechrche voyage"
                + "\n 8-log out "
                );
             
            
            input = new Scanner(System.in);
            chose = input.nextInt();
            
            switch(chose){
                case 1:{
                    ag.afficherinfo();
                    System.out.println("..................................................................................\n\n\n");
                    
                    break;
                }
                case 2:{
                    
                    break;
                }
                case 3:{
                      System.out.println("\n your new password : ");
                        System.out.print("===>");
                        input = new Scanner(System.in);
                        password = input.nextLine();
                    ag.setpasw(password);
                    System.out.println("\n Done_________");
                    
                    break;
                }
                case 4:{
                    
                   Voyage v=ag.ajoutervoy();
                   vd.add(v.getvilled());
                   vl.add(v.getvillea());
                  
                   vyg.add(v);
                   System.out.println("\n\n Voyage ADD ________");
                    break;
                    
                }
                
                case 5:{
                    System.out.println("\n \n_________ADD NEW CLIENT__________");
                    System.out.println("\n first name : ");
              System.out.print("===>");
              input = new Scanner(System.in);
               name = input.nextLine();
              
              System.out.println("\n last name : ");
              System.out.print("===>");
              input = new Scanner(System.in);
               prenom = input.nextLine();
               
               System.out.println("\n age : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              age = input.nextInt();
               
               System.out.println("\n gender : ");
               System.out.print("\n 1-femme \n 2-homme");
               System.out.print("===>");
                 gender="";
              input = new Scanner(System.in);
               g = input.nextInt();
              if(g==1){
                gender ="femme";  
              }else{
                  if(g==2){
                   gender ="homme";   
                  }
              }
               
               System.out.println("\n mail : ");
               System.out.print("===>");
              input = new Scanner(System.in);
               mail = input.nextLine();
              
               System.out.println("\n city : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              String city = input.nextLine();
               
               System.out.println("\n adress : ");
               System.out.print("===>");
              input = new Scanner(System.in);
               adress = input.nextLine();
               
               System.out.println("\n phone number : ");
               System.out.print("===>");
              input = new Scanner(System.in);
               tele= input.nextInt();
              
              System.out.println("\n password : ");
               System.out.print("===>");
              input = new Scanner(System.in);
               password = input.nextLine();
              ag.addclient(nom, prenom, mail, nom, gender, city, age, tele, mail);
             // Client client = new Client(name,prenom,mail,adress,gender,city,age,tele,password);
            //  cl.add(c);
                  break;  
                }
                case 6:{
                    
                    System.out.println("LIST OF : "
                            + "\n 1-ALL VOYAGE "
                            + "\n 2-OPEN VOYAGE "
                            + "\n 3-CLOSE VOYAGE");
                    input = new Scanner(System.in);
                    int ch = input.nextInt();
                    
                    switch(ch){
                        case 1:{
                            
                    System.out.println("....................................................................");
                    System.out.println("\n \t\t_______________LIST OF VOYAGE_______________");
                    for(int i =0;i<vyg.size();i++){
                        System.out.println("\n\n");
                        ag.affichvyg(vyg.get(i));
                        vyg.get(i).affichvyg();
                    }
                    System.out.println("\n\n");
                    
                    
                        }
                         case 2:{
                             
                             System.out.println("....................................................................");
                    System.out.println("\n \t\t_______________LIST OF OPEN VOYAGE_______________");
                    for(int i =0;i<vyg.size();i++){
                        if(vyg.get(i).getetat()==true){
                            System.out.println("\n\n");
                            ag.affichvyg(vyg.get(i));
                        }
                        
                    }
                    System.out.println("\n\n");
                            
                        }
                          case 3:{
                              
                              System.out.println("....................................................................");
                    System.out.println("\n \t\t_______________LIST OF FALSE VOYAGE_______________");
                    for(int i =0;i<vyg.size();i++){
                        if(vyg.get(i).getetat()==false){
                            System.out.println("\n\n");
                            ag.affichvyg(vyg.get(i));
                        }
                        
                    }
                    System.out.println("\n\n");
                              
                            
                        }
                    }
                    
                    
                  break;  
                }
                case 7 :{
                    System.out.println("............................................................................................................................");
                   System.out.println("\n \t\t___________LIST OF CLIENT_________");
                   ag.affichclient();
                   System.out.println("...................................................");
                   System.out.println("\n\n");
                  break; 
                   
                }
               
                
                
                
                
                
                
                
            }
            
            
          }
            
          }
        
        
       /* 
        
       int j =1;
       while(j!=0){
           
       
        System.out.println("-------------------WELCOME TO OUR AGENCE------------------------");
        System.out.println("Are u :"
                + "\n 1-client"
                + " \t  2-agence manger");
        System.out.println("===>");
        Scanner input = new Scanner(System.in);
        int choix = input.nextInt();
        
        if (choix ==1){
          ///client ....................................................................  
           System.out.println("\n are you new client : 1yes /2no ");
           System.out.print("===>");
           input = new Scanner(System.in);
           int old = input.nextInt();
           if (old ==1){
               //new cient .............................................................
              System.out.println("\n your first name : ");
              System.out.print("===>");
              input = new Scanner(System.in);
              String name = input.nextLine();
              
              System.out.println("\n your last name : ");
              System.out.print("===>");
              input = new Scanner(System.in);
              String prenom = input.nextLine();
               
               System.out.println("\n your age : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              int age = input.nextInt();
               
               System.out.println("\n your gender : ");
               System.out.print("\n 1-femme \n 2-homme");
               System.out.print("===>");
                String gender="";
              input = new Scanner(System.in);
              int g = input.nextInt();
              if(g==1){
                gender ="femme";  
              }else{
                  if(g==2){
                   gender ="homme";   
                  }
              }
               
               System.out.println("\n your mail : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              String mail = input.nextLine();
              
               System.out.println("\n your city : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              String city = input.nextLine();
               
               System.out.println("\n your adress : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              String adress = input.nextLine();
               
               System.out.println("\n your phone number : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              int tele= input.nextInt();
              
              Client client = new Client(name,prenom,mail,adress,gender,city,age,tele);
              System.out.println("u want to take reservration for : 1you / 2another");
              System.out.print("===>");
              input = new Scanner(System.in);
              int a= input.nextInt();
              ////////////////////////////////////////////////////////
              if(a==1){
                  //passager.................................................
              System.out.println("\n your first name : ");
              System.out.print("===>");
              input = new Scanner(System.in);
              name = input.nextLine();
              
              System.out.println("\n your last name : ");
              System.out.print("===>");
              input = new Scanner(System.in);
               prenom = input.nextLine();
               
               System.out.println("\n your age : ");
               System.out.print("===>");
              input = new Scanner(System.in);
               age = input.nextInt();
               
               System.out.println("\n your gender : ");
               System.out.print("\n 1-femme \n 2-homme");
               System.out.print("===>");
                
              input = new Scanner(System.in);
              g = input.nextInt();
              if(g==1){
                gender ="femme";  
              }else{
                  if(g==2){
                   gender ="homme";   
                  }
              }
              
              System.out.println("\n your city : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              city= input.nextLine();
              
               
               System.out.println("\n your phone number : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              tele= input.nextInt();
              
              Passager passager = new Passager(name,prenom,gender,city,age,tele);
              
              }else{
                  //client.............................................................
                  if(a==2){
                   System.out.println("_______ADD VOYAGE : ..................");
        System.out.println("DEPARTURE CITY :");
        System.out.print("===>");
         input = new Scanner(System.in);
        String ville = input.nextLine();
        Ville villed = new Ville(ville);
        
        System.out.println("Arrival CITY :");
         System.out.print("===>");
         input = new Scanner(System.in);
         ville = input.nextLine();  
         Ville villea = new Ville(ville); 
         
     int i = client.recharch(villed, villea, vyg,vd,vl);
           if(i==0){
               
           }else{
               
             client.res( vyg.get(i));
               
               
           }          
                      
                      
                      
                      
                      
                  }
              }
              
           }else{
            if(old==2){
               //old client.................................................... 
                
            }
           }
            
            
        }else{
        //agence..................................................................................
        if(choix==2){
             System.out.println("\n your first name : ");
              System.out.print("===>");
              input = new Scanner(System.in);
              String name = input.nextLine();
              
              System.out.println("\n your last name : ");
              System.out.print("===>");
              input = new Scanner(System.in);
              String prenom = input.nextLine();
              
               
               System.out.println("\n your mail : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              String mail = input.nextLine();
              
              System.out.println("\n your phone number : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              int tele= input.nextInt();
              
              System.out.println("\n your adress : ");
               System.out.print("===>");
              input = new Scanner(System.in);
              String adress = input.nextLine();
              
              Agence agence = new Agence(name,prenom,mail,adress,tele);
              
        vg  =  agence.ajoutervoy();
        
              
        }    
            
            
            
        }
        System.out.println("you want another fonction :1yes/2no");
        input =new Scanner(System.in);
        j = input.nextInt();
        
    }

*/}

}
