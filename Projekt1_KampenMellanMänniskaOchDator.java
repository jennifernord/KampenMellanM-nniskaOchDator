package projekt1_kampenmellanmänniskaochdator;
import java.util.Scanner;
public class Projekt1_KampenMellanMänniskaOchDator {
    static double score1=0;
    static double score2=0;
     static void GameRound(double DinHP, double DatornsHP){
        while(DinHP>=0 && DatornsHP>=0){
            Scanner scan = new Scanner(System.in);
            System.out.print("Välj mellan attack 1, 2 eller 3: ");
            double slag1=Math.random()*10;
            int slag11=(int)slag1; //Konvertera double till int för att slagen ska vara heltal istället för 
            
            int ENTER=scan.nextInt();
            if(ENTER==1){
                slag11++;
            }
            if(ENTER==2){
                slag11=slag11*2;
            }
            if(ENTER==3){
                slag11=slag11/2;
            }
            DatornsHP=DatornsHP-slag11;
            System.out.println("Du gör en attack mot datorn. Datorn förlorar " +slag11 +"HP");
            if(slag11==0){
                    System.out.println("Du missade ditt slag.");
                }
            if(slag11>12){
                System.out.println("Du fick in en jättebra träff! Men bli inte för kaxig...");
            }
            System.out.println("Din HP:" +DinHP +" Datorns HP" +DatornsHP);
            if(DatornsHP<=0){
                System.out.println("Datorn krachar totalt, trots det är den för stolt för att erkänna sig besegrad.\nDu har vunnit, för den här gången...");
                break; 
            }
            
            double slag2=Math.random()*10;
            int slag22=(int)slag2;
            DinHP=DinHP-slag22;
            System.out.println("Datorn gör en attack mot dig. Du förlorar " +slag22 +"HP");
            if(slag22==0){
                System.out.println("Datorn missade sitt slag.");
            }
            if(slag22>12){
                System.out.println("Aj, det gjorde ont. Datorn fick in en alldeles för bra träff...");
            }
            System.out.println("Din HP:" +DinHP +" Datorns HP" +DatornsHP);
            if(DinHP<=0){
                System.out.println("Du har ingen energi kvar,\ndatorn framför dig provocerar dig något enormt,\nmen det finns inget du kan göra.\nDu erkänner dig besegrad... Iallafall den här gången.");
                break; 
            }
    }
        if(DatornsHP<=0){
            score1++;
    }
        if(DinHP<=0){
            score2++;
    }  
    System.out.println("Du har " +score1 +" poäng och Datorn har " +score2 +" poäng."); 
    }
    
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Både du och datorn har lika mycket HP,\ndu börjar med att ge ett slag,\ndärefter är det datorns tur.\nSlagets kraft är slumpmässigt,\nden som får 0 eller lägre HP förlorar,\nvilket gör att den andra parten vinner omgången.\nFörsten till 5 vunna omgånger är segraren över kampen mellan människa och Dator.\nLycka till.");
    
    double DinHP=30;
    double DatornsHP=50;
    String yn="y";

    do{
    GameRound(DinHP, DatornsHP);
   
    System.out.println("Nästa omgång? (y/n)");
    yn=scan.nextLine();
    }while(yn.equalsIgnoreCase("y"));
    
    if(score1>score2){
        System.out.println("Du har vunnit Kampen mellan människa och dator, ge dig själv en klapp på axeln.");
    }
    if(score2>score1){
        System.out.println("Du har förlorat Kampen mellan människa och dator, du borde skämmas.");
    }
    }
    
    }
 