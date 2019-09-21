import java.util.Scanner;
class StringNum_1152 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    //String[] split = str.trim().split(" ");
    //int num = split.length;
    int num = 0;
    if(str.charAt(0) == ' ') num--;
    if(str.charAt(str.length()-1) == ' ') num--;
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == ' ') num++;
    }
    System.out.println(num+1);
  }
}
