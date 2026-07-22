class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int n = grid.length;

        int a = 0;
        int b = 0;

        int actualSum = 0;
        int expSum = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                actualSum += grid[i][j];

                //check duplicate
                if (set.contains(grid[i][j])){
                    a = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
            //expected sum
            expSum = (n * n * (n*n + 1)) / 2;
            //missing number
            b = expSum + a - actualSum;

            return new int[]{a,b};
        }
    }


