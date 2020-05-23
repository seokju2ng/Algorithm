package summercoding;


public class Q2 {
    /*
    * 테스트가 끝나고 규칙을 찾아서 해결한 방법                //  example)
    * n을 n보다 작거나 같은 2의 가장 큰 거듭제곱(*)으로 빼가면   //   n = 11 => 8(2^3) + 2(2^1) + 1(2^0)
    * 해당 순열의 n번째 값은 2의 거듭제곱을 => 3의 거듭제곱으로   //   result = 27(3^3) + 3(3^1) + 1(3^0) ==> 31
    * 바꿔주면 일치하더라 라는 것이었다.
    */
    public long solution(long n) {
        long result = 0;
        StringBuilder sb = new StringBuilder(Long.toBinaryString(n));
        sb.reverse();
        String binary = sb.toString();
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                result += Math.pow(3, i);
            }
        }
        return result;
    }


    /*
     * 처음 생각한 건 DFS.
     * 잘 동작하지만, 느리고 long형 파라미터를 간과하고 짜버렸다.
    private int[] perm = null;
    private int[] mul3Array = null;
    private boolean[] check = null;
    private int idx = 0;

    public long solution(long n) {
        int pow = 1;
        int totlength = 0;

        for (int i = 1; ; i++) {
            totlength += pow;
            if (n <= totlength) {
                mul3Array = new int[i];
                check = new boolean[i];
                break;
            }
            pow *= 2;
        }
        perm = new int[totlength];
        mul3Array[0] = 1;

        for (int i = 1; i < mul3Array.length; i++) {
            mul3Array[i] = mul3Array[i-1] * 3;
        }

        dfs(0);

        Arrays.sort(perm);

        System.out.print("perm: ");
        for (int i = 0; i < perm.length; i++) {
            System.out.print(perm[i]+", ");
        }
        System.out.println();

        int index = (int)(n - 1);
        return perm[index];
    }

    private void dfs(int n) {
        System.out.println("dfs()");
        for (int i = n; i < mul3Array.length; i++) {
            if (!check[i]) {
                check[i] = true;
                int sum = 0;
                for (int j = 0; j < check.length; j++) {
                    if (check[j]) {
                        sum += mul3Array[j];
                    }
                }
                perm[idx++] = sum;
                dfs(i+1);
                check[i] = false;
            }
        }
    }
    */
}
