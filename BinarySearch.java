public class BinarySearch {
    public static int binarySearch(int[] nums, int flag) {
        int highNum = nums.length - 1;
        int lowNum = 0;
        while (highNum >= lowNum) {
            int guess = (lowNum + highNum) >>> 1;
            if (nums[guess] > flag) {
                highNum = guess - 1;
            } else if (nums[guess] < flag) {
                lowNum = guess + 1;
            } else {
                return guess;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,6,7,8,11};
        int searchNum = 7;
        int index = binarySearch(nums, searchNum);
        if(index == -1) {
            System.out.println(searchNum + " is not in the array");
        } else {
            System.out.println(searchNum + " is at index " + index);
        }
    }
}
