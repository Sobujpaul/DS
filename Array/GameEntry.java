package javaapplication14;
public class GameEntry {
         private String name;

         private int score;
        
         public GameEntry(String n,int s)       //constructor
          {
             this.name=n;
             this.score=s;
          }
         
          public String getName()             //getter for get name
          {
             return name;   
          }
         
        public int getScore()               //getter for get score
          {
              return score;
          }
       
        public String toString(){         //tostring method
            return name+","+score;  
          }
}
