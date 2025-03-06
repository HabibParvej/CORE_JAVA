import java.util.Random;

class random {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("5 Random Numbers: ");
        
        for (int i = 0; i < 5; i++) {
            System.out.print((rand.nextInt(100) + 1) + " ");
        }
    }
}
