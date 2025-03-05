import java.util.*;

public class BronzeCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            scores.add(scanner.nextInt());
        }
        Set<Integer> distinctScores = new TreeSet<>(Collections.reverseOrder());
        distinctScores.addAll(scores);
        List<Integer> sortedScores = new ArrayList<>(distinctScores);
        int bronzeScore = sortedScores.get(2);
        int bronzeCount = Collections.frequency(scores, bronzeScore);
        System.out.println(bronzeScore + " " + bronzeCount);
        scanner.close();
    }
}
