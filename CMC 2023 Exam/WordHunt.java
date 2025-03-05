
import java.util.*;

public class CCCWordHunt {
    static int rows, cols;
    static char[][] grid;
    static String word;
    static int wordLength;
    static int[][] directions = {
        {0, 1}, {1, 0}, {1, 1}, {-1, 1},
        {0, -1}, {-1, 0}, {-1, -1}, {1, -1}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        word = sc.next();
        wordLength = word.length();
        rows = sc.nextInt();
        cols = sc.nextInt();
        grid = new char[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == word.charAt(0)) {
                    count += findWord(i, j);
                }
            }
        }
        
        System.out.println(count);
    }

    static int findWord(int x, int y) {
        int found = 0;
        for (int[] dir : directions) {
            int newX = x, newY = y, index = 0;
            while (index < wordLength && isValid(newX, newY) && grid[newX][newY] == word.charAt(index)) {
                newX += dir[0];
                newY += dir[1];
                index++;
            }
            if (index == wordLength) found++;
            
            for (int[] dir2 : directions) {
                if (dir2 == dir) continue;
                newX = x + dir[0] * (index - 1);
                newY = y + dir[1] * (index - 1);
                int newIndex = index;
                while (newIndex < wordLength && isValid(newX, newY) && grid[newX][newY] == word.charAt(newIndex)) {
                    newX += dir2[0];
                    newY += dir2[1];
                    newIndex++;
                }
                if (newIndex == wordLength) found++;
            }
        }
        return found;
    }

    static boolean isValid(int x, int y) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }
}
