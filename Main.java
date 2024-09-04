
package javaapplication14;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
             int length;
             Scanner sc=new Scanner(System.in);
 
             System.out.println("PLEASE ENTER THE Capacity OF SCOREBOAD :");
            
             length=sc.nextInt();
       
             Scoreboard b=new Scoreboard(length); 
       
             int player;
       
             System.out.println("Enter The size of Total Player :");
       
             player=sc.nextInt();
             int i;
     
             for(i = 0; i < length; i++)
                {
                       String name;
                      
                       int n;
                       
                       System.out.println("Enter the Name Of Player :");
                       
                       name=sc.nextLine();
                       
                       name=sc.nextLine();
                       
                       System.out.println("Enter the Score of that player:");
                       
                       n=sc.nextInt();
                       
                       GameEntry g=new GameEntry(name,n);
                      
                       b.add(g);
                       
                       b.show(g);
                      
                }
            
    }
    
}
