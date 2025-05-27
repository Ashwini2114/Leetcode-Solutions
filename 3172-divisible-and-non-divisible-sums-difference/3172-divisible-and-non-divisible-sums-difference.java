class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1 = 0;
        for(int i = 1; i <= n; i++)
        {
            sum1 += (i % m != 0) ? i : -i;
        }
        return sum1;
    }
}
// public class Solution {
//     public int differenceOfSums(int n, int m) {
//         //Calculate total sum from 1 to n 
//         int totalSum = n * (n + 1) / 2;
//         //calculate the count of divisible numbers
//         int divisibleCount = n / m;
//         //calculate the sum of divisible numbers
//         int divisibleSum = m * divisibleCount * (divisibleCount + 1) / 2;
//         //Subtract sum of integers divisible from total
//         return totalSum - 2 * divisibleSum;
//     }
// }