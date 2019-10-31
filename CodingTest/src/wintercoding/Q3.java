package wintercoding;

public class Q3 {
    private int[][] checked;
    private int[][] land;
    private int height;
    private int n;
    private int[] dx = {1, -1, 0, 0};
    private int[] dy = {0, 0, 1, -1};

    public int solution(int[][] land, int height) {
        this.land = land;
        this.height = height;
        n = land.length;
        checked = new int[n][n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (checked[i][j] == 0) {
                    dfs(i, j, ++cnt);
                }
            }
        }

        int answer = 0;
        return answer;
    }


    private void dfs(int x, int y, int cnt) {
        checked[x][y] = cnt;

        for (int i = 0; i < 4; i++) {
            int dx = x + this.dx[i];
            int dy = y + this.dy[i];
            if (isRange(dx, dy) && checked[dx][dy] == 0 && isCanGo(x, y, dx, dy)) {
                dfs(dx, dy, cnt);
            }
        }
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", land[i][j]);
            }
            System.out.print("   ");
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", checked[i][j]);
            }
            System.out.println();
        }
    }

    private boolean isRange(int x, int y) {
        return (x >= 0 && y >= 0 && x < n && y < n);
    }

    private boolean isCanGo(int x, int y, int cx, int cy) {
        return (land[x][y] > land[cx][cy] ?
                land[x][y] - land[cx][cy] :
                land[cx][cy] - land[x][y]) <= height;
    }
}
