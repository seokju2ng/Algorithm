package kakao;
/* 16:35 ~  */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Q4 {
    public long[] solution(long k, long[] room_number) {
        int customerSize = room_number.length;
        int m = customerSize * 3;
        long[] answer = new long[customerSize];
        long[] chkAry = new long[m];

        for (int i = 0; i < customerSize; i++) {
            long roomNum = room_number[i];
            int mod = (int)(roomNum % m);
            while(true) {
                if (chkAry[mod] == 0) {
                    chkAry[mod] = roomNum;
                    answer[i] = roomNum;
                    break;
                }
                else if (chkAry[mod] == roomNum) {
                    roomNum++;
                }
                mod++;
            }
        }

        return answer;
    }
}

//public class Q4 {
////    private static final int MOD = 31;
//    public long[] solution(long k, long[] room_number) {
//        int customerSize = room_number.length;
//        int m = calcModNum(customerSize);
//        System.out.println(m);
//        long[] answer = new long[customerSize];
//        ArrayList<Long>[] chkAry = new ArrayList[m];
//        boolean chk = false;
//
//        for (int i = 0; i < m; i++) {
//            chkAry[i] = new ArrayList<>();
//        }
//        for (int i = 0; i < customerSize; i++) {
//            long roomNum = room_number[i];
//
//            while(true) {
//                int mod = (int)(roomNum % m);
//                chk = false;
//                System.out.println("mod = "+mod+", chkAry[mod].size() = "+chkAry[mod].size());
//                for (int j = 0; j < chkAry[mod].size(); j++) {
//                    if(chkAry[mod].get(j).equals(roomNum)) {
//                        chk = true;
//                        break;
//                    }
//                }
//                if (chk) {
//                    roomNum++;
//                } else {
//                    answer[i] = roomNum;
//                    chkAry[mod].add(roomNum);
//                    break;
//                }
//            }
//        }
//
//        return answer;
//    }
//
//    private int calcModNum(int customerSize) {
//        int mod = customerSize * 3;
//        return mod;
//    }
//}
