// import java.math.BigInteger;
// class Solution {
//     public int[] plusOne(int[] digits) {
//         StringBuilder strbuilder = new StringBuilder();
//         for (int digit : digits) {
//             strbuilder.append(digit);
//         }
//         String str = strbuilder.toString();
//         BigInteger number = new BigInteger(str);
//         BigInteger n = number.add(BigInteger.ONE);
//         String numPlusOne = n.toString();
//         int[] answer = new int[numPlusOne.length()];

//         for(int i = 0; i < numPlusOne.length(); i++)
//         {
//             answer[i] = Character.getNumericValue(numPlusOne.charAt(i));
//         }
//         return answer;
//     }
// }

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // If all digits were 9, we need an extra digit at the beginning
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
