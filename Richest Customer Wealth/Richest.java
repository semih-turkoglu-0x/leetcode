class Richest {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int[] wealthes = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                wealthes[i] += accounts[i][j];
            }
        }
        int max = 0;
        for (int i = 0; i < wealthes.length; i++) {
            if(wealthes[i] >= max) {
                max = wealthes[i];
            }
        }

        return max;
    }
}
