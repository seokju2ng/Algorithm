package summercoding;

public class Q3 {
    public int[] solution(int total_sp, int[][] skills) {
        int[] parent = new int[skills.length+1];
        boolean[] child = new boolean[skills.length+1];
        int[] point = new int[skills.length+1];
        int skillPoint = 0;

        for (int[] skill : skills) {
            int p = skill[0];
            int c = skill[1] - 1;
            child[p - 1] = true;
            parent[c] = p;
        }

        for (int i = 0; i < point.length; i++) {
            if (!child[i]) {
                point[i] = 1;
                int pn = i;
                skillPoint += 1;
                while (parent[pn] != 0) {
                    pn = parent[pn] - 1;
                    point[pn] += 1;
                    skillPoint += 1;
                }
            }
        }

        skillPoint = total_sp / skillPoint;

        for (int i = 0; i < point.length; i++) {
            point[i] *= skillPoint;
        }

        return point;
    }
}
