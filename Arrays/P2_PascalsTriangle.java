class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ArrL = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> aL = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    aL.add(1);
                } else {
                    // using genral formula
                    // int next_val = ArrL.get(i-1).get(j-1) + ArrL.get(i-1).get(j);

                    // using math formual of combinations
                    int next_val = aL.get(aL.size() - 1) * (i - (j - 1)) / j;
                    aL.add(next_val);
                }
            }
            ArrL.add(aL);
        }
        return ArrL;
    }
}