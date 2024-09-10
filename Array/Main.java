
package javaapplication14;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

               Scanner sc=new Scanner(System.in);    //for input something

               Scoreboard b=new Scoreboard();       //create scoreboard class object
            
             
               while(true)
                      {
                          String name;   //Player name

                          String disqualifierName;   //name of disqualifier player
                        
                          int score;    //score of each player
                          
                          System.out.println("Enter the name of the player:\n");
                         
                          name=sc.next();    
                       
                       
                         if(name.equals("over"))   //check if user input name is "over"
                             {
                                break;   
                             }
                         
                         else if(name.equals("disqualify"))     //check if user input name disqualify
                             {
                                System.out.println("Enter the Name you want to disqualified:");
                                disqualifierName= sc.next();
                                b.remove(disqualifierName);
                             }
                         
                         else{
                                System.out.println("Enter the Score of that player:");
                                score=sc.nextInt();
                                GameEntry g=new GameEntry(name,score);
                                b.add(g);
                                b.show(g);
                              }
                      
                       }
               
    }
    
}
