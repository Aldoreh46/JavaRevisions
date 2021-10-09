package JavaRevisions;

public class SliceProblem {
    public int solution(int[] A) {
        int t = 0;
    int r = 0;
    int n = A.length;
    for (int i = 1; i < n; i++) {
      t = Math.max(0, t + A[i] - A[i - 1]);
      r = Math.max(r, t);
    }
    return r > 0 ? r : 0;
    }
}
