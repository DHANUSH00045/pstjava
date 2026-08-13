import java.util.Scanner;

public class RemoveElement {

    public static class Solution {
        public int removeElement(int[] nums, int val) {
            int k = 0; // Pointer to track position for non-val elements
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter " + n + " space-separated integers: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to remove: ");
        int val = scanner.nextInt();

        Solution solution = new Solution();
        int k = solution.removeElement(nums, val);

        // Output results
        System.out.println("\nOutput k = " + k);
        System.out.print("Modified array (first " + k + " elements): [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
        System.out.println("]");

        scanner.close();
    }
}