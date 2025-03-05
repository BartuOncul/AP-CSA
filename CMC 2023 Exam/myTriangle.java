import java.util.Scanner;

public class Trianglane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] tiles = new int[2][n];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                tiles[i][j] = scanner.nextInt();
            }
        }
        
        int tapeLength = 0;
        int[] dx = {0, 0, -1, 1, -1, 1};
        int[] dy = {-1, 1, 0, 0, 1, -1};
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                if (tiles[i][j] == 1) {
                    int sides = 3;
                    for (int k = 0; k < 6; k++) {
                        int ni = i + dx[k];
                        int nj = j + dy[k];
                        if (ni >= 0 && ni < 2 && nj >= 0 && nj < n && tiles[ni][nj] == 1) {
                            sides--;
                        }
                    }
                    tapeLength += sides;
                }
            }
        }
        
        System.out.println(tapeLength);
        scanner.close();
    }
}
