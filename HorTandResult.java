import java.util.Random;
import java.util.Scanner;

public class HorTandResult{
    public static void main(String[] args) {
        String name ;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int head =0;
        int tail = 0;
        int coun = 0;
        System.out.println("Who are you?");
        System.out.print("> ");
        name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Tossing a coin...");
        while(head<2 && tail<2){
            coun++;
            System.out.print("Round " + coun+ " ");
          int coin = rnd.nextInt(2);
          if(coin == 1){
            head++;
          System.out.println("Heads");
          }
          else{
            tail++;
            System.out.println("Tails");
          }
        }

        System.err.println("Heads: " + head + "Tails: " + tail);
        if(head ==2){
            System.out.println("You won");
        }
        else{System.out.println("You lost");}
    }
}