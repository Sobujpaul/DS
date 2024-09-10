
package javaapplication14;

public class Scoreboard {
            private int NumEntries=0;
        
            private GameEntry [] game=new GameEntry[50];
       
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
                       System.out.println("Sample Output:");
            
                       for(int i=0;i<NumEntries;i++)
                           {
                              System.out.println(game[i]);   
                           }
                  }

   
            public void remove( String s)
                  {
                      String temp=s;
                
                      for(int j=0;j<NumEntries;j++)
                          {
                    
                             if(temp.equals(game[j].getName()))
                                   {
                                      for(int i=j;i<NumEntries;i++)
                                         {
                                            game[j]=game[j+1];
                                            NumEntries--;                             
                                         }
                                      game[NumEntries]=null;
                                      j=0; 
                                   }  
                          }
                      System.out.println("Sample Output:");
             
                      for(int i=0;i<NumEntries;i++)
                         {
                            System.out.println(game[i]);   
                         }
              
                
               }
    
}
