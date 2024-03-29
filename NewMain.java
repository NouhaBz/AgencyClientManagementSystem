/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l.tpgl4;

import java.util.Scanner;


/**
 *
 * @author welcome
 */
public class NewMain extends Agencemain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("\n\n\n.....................Welcom to our Agence ...................");
         System.out.print(Agencemain.cl.size());
        System.out.println("\nYour Name : ===> ");
        Scanner input = new Scanner(System.in);
        String nom = input.nextLine();
         System.out.print(Agencemain.cl.size());
        System.out.println("\nPassword : ===> ");
        input = new Scanner(System.in);
        String password = input.nextLine();
        int ver =0;
        int I =0;
       
        for( int i=0 ;i<=Agencemain.cl.size();i++){
            if(Agencemain.cl.get(i).getnom().equalsIgnoreCase(nom)){
                if(Agencemain.cl.get(i).getpasw().equalsIgnoreCase(password)){
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
        System.out.println("\n hey");
        if (ver==1){
            
             System.out.println("  Menue      :"
                + "\n 1-your information"
                + "\n 2-edit your ingormation"
                + "\n 3-edit password "
                + "\n 4-reservration"
                + "\n 5-list of reservation");
        int chose ;
         input = new Scanner(System.in);
          chose = input.nextInt();
          
          
          switch(chose){
              case 1:{
                 System.out.println("Your Information :");
            Agence.cl.get(I).afficherinfo(); 
                  break;
              }
              case 2:{
                  
                   System.out.println("What do you want to edit :");
                 Agencemain.cl.get(I).afficherinfo();
                 input = new Scanner(System.in);
                 int edt = input.nextInt();
                switch(edt){
                    case 1:{
                        System.out.println("\n your first name : ");
                        System.out.print("===>");
                        input = new Scanner(System.in);
                        String name = input.nextLine();
                      Agencemain.cl.get(I).setnom(nom);
                      break;
                    }
                    case 2:{
                          System.out.println("\n your last name : ");
                           System.out.print("===>");
                            input = new Scanner(System.in);
                            String prenom = input.nextLine();
                     Agencemain.cl.get(I).setprenom(prenom);
                      break;
                    }
                    case 3:{
                         System.out.println("\n your mail : ");
                         System.out.print("===>");
                          input = new Scanner(System.in);
                          String mail = input.nextLine();
                        Agencemain.cl.get(I).setmail(mail);
                         break;
                    }
                    case 4:{
                         System.out.println("\n your adress : ");
                         System.out.print("===>");
                         input = new Scanner(System.in);
                         String adress = input.nextLine();
               
                        Agencemain.cl.get(I).setadress(adress);
                         break;
                    }
                    case 5:{
                        System.out.println("gender cant be modified");
                    }
                    case 6:{
                        System.out.println("\n your city : ");
                        System.out.print("===>");
                        input = new Scanner(System.in);
                        String city = input.nextLine();
                        Agencemain.cl.get(I).setcity(city);
                         break;
                    }
                    case 7:{
                        System.out.println("\n your age : ");
                         System.out.print("===>");
                          input = new Scanner(System.in);
                         int age = input.nextInt();
                        Agence.cl.get(I).setage(age);
                         break;
                    }
                    case 8:{
                        System.out.println("\n your phone number : ");
                        System.out.print("===>");
                        input = new Scanner(System.in);
                       int tele= input.nextInt();
                        Agencemain.cl.get(I).settele(tele);
                         break;
                       
                    }
                    
                } 
                 break; 
                  
              }
              case 3:{
                  System.out.println("\n your new password : ");
                        System.out.print("===>");
                        input = new Scanner(System.in);
                        password = input.nextLine();
                        Agencemain.cl.get(I).setpasw(password);
                        break;
              }
              case 4:{
                  
                  System.out.println("DEPARTURE CITY :");
        System.out.print("===>");
        input = new Scanner(System.in);
        String ville = input.nextLine();
        Ville rvilled = new Ville(ville);
        
        
         System.out.println("Arrival CITY :");
         System.out.print("===>");
         input = new Scanner(System.in);
         ville = input.nextLine();  
         Ville rvillea = new Ville(ville); 
         
                  Agencemain.cl.get(0).recharch(rvilled, rvillea);
                  
                  System.out.print("===>");
         input = new Scanner(System.in);
        int k = input.nextInt();
        
            Client.vygre.get((k-1)).affichvyg();
        
        
                  
              }
              
          }
          
      
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
        // TODO code application logic here
    }
    
}
