import java.util.Scanner;
class IntNum_2577 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] res = new int[10];
    int input = 1;
    for(int i = 0; i < 3; i++){
      input *= in.nextInt();
    }
    String str = String.valueOf(input);
    for(int i = 0; i < str.length(); i++){
      res[str.charAt(i)-48]++;
    }
    for(int i : res){
      System.out.println(i);
    }
  }
}
