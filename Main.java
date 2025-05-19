import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        System.out.println("|||||||");
        System.out.println("Your turn!");


        Scanner input = new Scanner(System.in);

        System.out.println("How many pencils would you like to use:");
        int pencilNumber = input.nextInt();
        input.nextLine();
        String player1 = input.nextLine();
        
        String player2 = input.nextLine();
        System.out.println(String.format("Who will be the first (%s, %s):", player1, player2));
        
        String playerToPlay = input.nextLine();

        for(int i = 0 ; i < pencilNumber; i++){
            System.out.print("|" + " ");
        }
        System.out.println();
        System.out.println(String.format("%s is going first!", playerToPlay));

    }
}