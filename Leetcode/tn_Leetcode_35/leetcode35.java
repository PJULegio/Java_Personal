public class leetcode35 {
    public static void main(String [] args){

        int[] tab = {1,3,5,6};
        System.out.println(searchInsert(tab , 2));

    }



    static int searchInsert(int[] nums, int target) {
        int low = 0, mid = 0, guess;
        int high = nums.length - 1;

        while (low <= high){
            mid = (low + high) / 2;
            guess = nums[mid];
            
            if(guess == target)
                return mid;

            if(guess > target)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return (nums[mid] > target) ? mid : mid + 1;

    }
}