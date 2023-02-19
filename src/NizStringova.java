import java.util.Random;

public class NizStringova {

    public static void main(String[] args) {

        //Ne umem da izvučem random listu, samo random element.

        String[] names = {"Heart", "Cherry", "Coin", "Melon", "Jocker"};

        Random random = new Random();

        int rand_names = random.nextInt(names.length);

        System.out.println("Kombinacija je:");

        System.out.println(names[rand_names]);





    }
}
