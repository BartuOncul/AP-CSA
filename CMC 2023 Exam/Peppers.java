import java.util.*;

public class Peppers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pepperNames = {"Poblano", "Mirasol", "Serrano", "Cayenne", "Thai", "Habanero"};
        int[] pepperSHU = {1500, 6000, 15500, 40000, 75000, 125000};

        int n = scanner.nextInt();
        scanner.nextLine();

        int totalSpiciness = 0;

        for (int i = 0; i < n; i++) {
            String pepper = scanner.nextLine();
            for (int j = 0; j < pepperNames.length; j++) {
                if (pepperNames[j].equals(pepper)) {
                    totalSpiciness += pepperSHU[j];
                    break;
                }
            }
        }

        System.out.println(totalSpiciness);
    }
}
