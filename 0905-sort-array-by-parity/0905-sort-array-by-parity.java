class Solution 
{
    public static int[] sortArrayByParity(int[] nums)
    {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int temp;
        while(left < right)
        {
            if(nums[left] % 2 == 0)
            {
            left++;
            }
            else if(nums[right] % 2 == 1)
            {
                right--;
            }
            else
            {
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            
        }
        return nums;
    }
    }
