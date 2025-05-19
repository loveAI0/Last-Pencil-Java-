import java.util.Scanner;


public class Game {
    static void playGame(){
        Scanner input = new Scanner(System.in);

        System.out.println("How many pencils would you like to use:");
        int pencilNumber = 0;
        //check pencil
        boolean flagInitial = true;
        while(flagInitial){ 
          try {
              pencilNumber = input.nextInt();
              if (pencilNumber == 0) {
                  System.out.println("The number of pencils should be positive");
              } else if(pencilNumber < 0) {
                  System.out.println("The number of pencils should be numeric");
              }

          } catch (NumberFormatException e) {
              System.out.println("The number of pencils should be numeric");
              
          }
          
        }
        input.nextLine();
        String player1 = input.nextLine();
            
        String player2 = input.nextLine();

        
        System.out.println(String.format("Who will be the first (%s, %s):", player1, player2));
        String playerToPlay = input.nextLine();

        for(int i = 0 ; i < pencilNumber; i++){
                System.out.print("|" + " ");
        }
        
        
        System.out.println();
        /* 
        System.out.println(String.format("%s is going first!", playerToPlay));
        */
       
        boolean flag = true;
        boolean toogleFlag = true;

        while(flag){ 
         

         System.out.println(String.format("%s's turn:", playerToPlay));
         
         System.out.println("pencil removed");
         int pencilRemoved = input.nextInt();
         input.nextLine(); 

         pencilNumber -= pencilRemoved;
         if(pencilNumber == 0){
            flag = false;
         }
          
          for(int i = 0 ; i < pencilNumber ; i++){ 
                System.out.print("|" + " ");
          }
          System.out.println();
          playerToPlay = toogleFlag ? player2 : player1;
          toogleFlag = !toogleFlag;
          
          
        }   
    }
}
    

