
package javaapplication14;

public class Scoreboard {
        private int NumEntries=0;
        
        private GameEntry [] game;
       
        public Scoreboard(int capacity)
          {
           game=new GameEntry[capacity];   
          }
  
        public void add(GameEntry e)
          {
             int newScore=e.getScore();
            
             if(NumEntries<game.length || newScore>game[NumEntries-1].getScore())
                 {
                    if(NumEntries<game.length)
                       {
                         NumEntries++;   
                       }
                 }
             int j=NumEntries-1;
             
             while(j>0 && newScore>game[j-1].getScore())
                 {
                    game[j]=game[j-1];   
                    j--;
                 }
             game[j]=e;
          }
  
        public void show(GameEntry e)
          {
            System.out.println("/t/t/t ScoreBoad/n");
            
              System.out.println("Totall Number of Entry :"+NumEntries );
            for(int i=0;i<NumEntries;i++)
               {
                  System.out.println((i+1)+"Th"+":"+game[i]);   
               }
          }

   
        public GameEntry remove(int i)
           {
              if( i<0 || i>=NumEntries) 
                 System.out.println("INVALID INDEX"+i);
              
              GameEntry temp=game[i];
              
              for(int j=i;j<NumEntries-1;j++)
                 {
                   game[j]=game[j+1];  
                 }
    
              game[NumEntries-1]=null;
              NumEntries--;
              return temp;
           }
    
}
