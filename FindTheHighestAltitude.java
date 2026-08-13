import java.util.Scanner;

public class FindTheHighestAltitude {

    public static class Solution {
        public int largestAltitude(int[] gain) {
            int currentAltitude = 0;
            int maxAltitude = 0; // Starts at 0 altitude

            for (int g : gain) {
                currentAltitude += g;
                maxAltitude = Math.max(maxAltitude, currentAltitude);
            }

            return maxAltitude;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of altitude gains (n): ");
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int n = scanner.nextInt();

        int[] gain = new int[n];
        System.out.print("Enter " + n + " space-separated integers for gain: ");
        for (int i = 0; i < n; i++) {
            gain[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int highestAltitude = solution.largestAltitude(gain);

        // Output results
        System.out.println("\nHighest Altitude = " + highestAltitude);

        scanner.close();
    }
}