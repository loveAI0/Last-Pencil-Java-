import java.util.Random;
public class Bot {
    public static int botGamePlay(int pencilNumber){
        Random removed = new Random();
        int rem = pencilNumber % 4 ;
        switch (rem) {
            case 0:
                rem = 3;
                break;
            case 1:
                rem = removed.nextInt(3) + 1;
                break;
        
            case 2:
                rem = 1;
                break;
            case 3: 
                rem = 2;
                break;
        }
        return rem;
    }
}
