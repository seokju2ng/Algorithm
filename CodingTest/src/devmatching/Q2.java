package devmatching;

public class Q2 {
    private int[][] office;
    private int n;
    public int solution(int[][] office, int r, int c, String[] move) {
        int amount = 0;
        int direction = 0;
        this.office = office;
        n = office.length;
        Direction go = new Direction();

        amount = office[r][c];
        office[r][c] = 0;

        for (int i = 0; i < move.length; i++) {
            switch (move[i]) {
                case "go" :
                    if (isRange(r + go.r[direction], c + go.c[direction])) {
                        r += go.r[direction];
                        c += go.c[direction];
                        amount += office[r][c];
                        office[r][c] = 0;
                    }
                    break;
                case "right" :
                    direction = (direction == 3 ? 0 : direction + 1);
                    break;
                case "left" :
                    direction = (direction == 0 ? 3 : direction - 1);
                    break;
                default: break;
            }
        }

        return amount;
    }

    private boolean isRange(int r, int c){
        return (r >= 0 && r < n && c >= 0 && c < n && office[r][c] != -1);
    }
}

class Direction {
    int[] r = {-1, 0, 1, 0};
    int[] c = {0, 1, 0, -1};
}
