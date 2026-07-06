class Solution {
    public void sortColors(int[] nums) {

    int i =0;
    int j = 0;
    int k = 0;
    int x = 0;
    while(i < nums.length)
    {
        if(nums[i] == 0)
        {
            x++;
        }
        if(nums[i] == 1)
        {
            j++;
        }
        if(nums[i] == 2)
        {
            k++;
        }
        i++;
    }
    i =0;
    while(x > 0)
    {
        nums[i] = 0;
        i++;
        x--;
    }
     while(j > 0)
    {
        nums[i] = 1;
        i++;
        j--;
    }
     while(k > 0)
    {
        nums[i] = 2;
        i++;
        k--;
    }

        
    }
}