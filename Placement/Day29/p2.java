package Placement.Day29;

public class p2 {  // find duplicate number
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Finding the intersection point in the cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Finding the entrance to the cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    public static void main(String[] args) {
        p2 solution = new p2();
        int[] nums = {1, 3, 4, 2, 2}; // Example array
        int duplicate = solution.findDuplicate(nums);
        System.out.println("The duplicate number is: " + duplicate);
    }
    
}
