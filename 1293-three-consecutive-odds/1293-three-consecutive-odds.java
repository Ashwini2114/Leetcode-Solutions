class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int counter = 0;
        for(int num : arr)
        {
            if(num%2 != 0 || num == 1)
            {
                counter+=1;
                if(counter>=3)
                {
                    return true;
                }
            }
            else
            {
                counter = 0;
            }
        }
        return false;
    }
}