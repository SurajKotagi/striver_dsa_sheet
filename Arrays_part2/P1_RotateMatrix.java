class Solution {
    public void rotate(int[][] arr) {
        // diagonal alter
        for (int i = 0, g = arr[0].length - 1; i < arr.length - 1; i++, g--) {
            for (int j = 0; j < g; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[arr.length - j - 1][arr.length - i - 1];
                arr[arr.length - j - 1][arr.length - i - 1] = temp;
            }
        }

        // middle flip
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[arr.length - i - 1][j];
                arr[arr.length - i - 1][j] = temp;
            }
        }
    }
}