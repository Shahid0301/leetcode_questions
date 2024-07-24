class Solution {
    public int missingNumber(int[] a) {
        int xor1 = 0, xor2 = 0;
        int N = a.length; // Length of the array

        // Calculate xor2 as the XOR of all array elements
        // Calculate xor1 as the XOR of numbers from 0 to N
        for (int i = 0; i < N; i++) {
            xor2 = xor2 ^ a[i];
            xor1 = xor1 ^ i;
        }

        // Include the last number N in xor1
        xor1 = xor1 ^ N;

        // The missing number will be the XOR of xor1 and xor2
        return (xor1 ^ xor2);
    }
}
