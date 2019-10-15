package binarysearch;

public class Main {
    public static void main(String[] args) {
        // Q1
        int[][] budgets = {{120, 110, 140, 150}, {2, 3, 4, 5, 8, 3}, {11, 15, 23, 4, 35}, {1, 1, 4, 1, 5, 8, 1},
                {99999, 98075, 54648, 40653, 98456, 75644, 65135, 65408, 97564, 98751}};
        int[] M = {485, 12, 100, 12, 665443};
        for (int i = 0; i < M.length; i++) {
            System.out.println(new Q1().solution(budgets[i], M[i]));
        }   // return 127, 2, 35, 2
    }
}
