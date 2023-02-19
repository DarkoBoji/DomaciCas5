import java.util.Arrays;

public class Main {

    // Izvuci minimalnu i maksimalnu vrednost iz niza

    public static void main(String[] args) {

        int [] mojNiz = {38, 54, 56, 48, 15, 5, 79,98};

        int max = Arrays.stream(mojNiz).max().getAsInt();
        int min = Arrays.stream(mojNiz).min().getAsInt();
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}