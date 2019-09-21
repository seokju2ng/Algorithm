import java.util.Scanner;
class BeeHouse_2292 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt()//, i = 1;
    int cnt = 0, six = 0;
  //while(n-1>3*i*(i-1)) i++;
    while(n > 1){
      six +=  6;
      n -= six;
      cnt++;
    } cnt++;
    System.out.println(cnt);
  }
}
