class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;

        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            reverse(nums, 0);
        } else {
            for(int i = nums.length-1; i >= 0; i--){
                if(nums[i] > nums[index]) {
                    swap(nums,index, i);
                    break;
                }
            }
            reverse(nums, index+1);
        }

    }

    private void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    private void reverse(int[] nums,int start){
        int i=start;
        int j= nums.length - 1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}