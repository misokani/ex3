import java.util.Random;

class HeadorTail{
    public static void main(String[] args) {
        Random rnd = new Random();
        int head =0;
        int tail = 0;
        int coun = 0;
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
    }
}