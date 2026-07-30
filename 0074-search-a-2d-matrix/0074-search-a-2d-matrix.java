class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m - 1;
        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;
            if (target < matrix[mid][0]) {
                bottom = mid - 1;
            } else if (target > matrix[mid][n - 1]) {
                top = mid + 1;
            } else {
                int left = 0;
                int right = n - 1;
                while (left <= right) {
                    int midCol = left + (right - left) / 2;

                    if (matrix[mid][midCol] == target)
                        return true;
                    else if (matrix[mid][midCol] < target)
                        left = midCol + 1;
                    else
                        right = midCol - 1;
                }

                return false;
            }
        }

        return false;
    }
}