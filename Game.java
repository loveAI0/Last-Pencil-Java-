import java.util.InputMismatchException;
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
              flagInitial = false;
              if (pencilNumber == 0) {
                  System.out.println("The number of pencils should be positive");
                  flagInitial = true;
              } else if(pencilNumber < 0) {
                  System.out.println("The number of pencils should be numeric");
                  flagInitial = true;
              }else {
                flagInitial = false;
              }
          } catch (InputMismatchException e) {
              System.out.println("The number of pencils should be numeric");
               input.next();
              flagInitial = true;
              
          }
          
        }
        input.nextLine();
        String player1 = input.nextLine();
            
        String player2 = input.nextLine();
        String playerToPlay = "";
        flagInitial = true;
        System.out.println(String.format("Who will be the first (%s, %s):", player1, player2));
        while(flagInitial){ 
            
            playerToPlay = input.nextLine();
            if(playerToPlay.equals(player1) || playerToPlay.equals(player2)){
                flagInitial = false;
            }else{
                System.out.println(String.format("Choose between %s and %s", player1, player2));
                
                flagInitial = true;
            }
        }
        

        // available pencil
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
            int pencilRemoved = 0;
            flagInitial = true;
            while(flagInitial){
                try{ 
                    pencilRemoved = input.nextInt();
                    int rem =  pencilRemoved;
                    
                    if(rem == 1 || rem == 2 || rem == 3 ){
                        pencilNumber -= pencilRemoved;
                        flagInitial = false;
                    } 
                    else if(pencilNumber < pencilRemoved) {
                        System.out.println("Too many pencils were taken");
                        System.out.println("Possible values: '1', '2' or '3'");
                        flagInitial = true;
                    }
                    else{
                        
                        System.out.println("Possible values: '1', '2' or '3'");
                        flagInitial = true;
                    }
                }
                catch (InputMismatchException e) {
                System.out.println("Possible values: '1', '2' or '3'");
                input.next();
                flagInitial = true;
                }
            }
         

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
    

