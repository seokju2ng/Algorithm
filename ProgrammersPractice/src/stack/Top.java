package stack;

public class Top {
    public static void main(String[] args) {
        SolutionTop s = new SolutionTop();
        print(s.solution(new int[] {6,9,5,7,4}));
        print(s.solution(new int[] {3,9,9,3,5,7,2}));
        print(s.solution(new int[] {1,5,3,6,7,6,5}));
    }
    private static void print(int[] arr) {
        System.out.print("[");
        for(int a : arr) {
            System.out.print(a+",");
        }
        System.out.println("]");
    }
}

class SolutionTop {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        for(int i = heights.length - 1; i > 0; i--) {
            for(int j = i - 1; j >= 0; j--) {
                if(heights[j] > heights[i]) {
                    answer[i] = j+1;
                    break;
                }
            }
        }
        return answer;
    }
}