/* **
    User: Seokjung Kim.
    Date: 2019.10.16.
    Time: 3:52 AM
    ProgrammersPractice/Q2
    이분탐색 > 입국심사
    https://programmers.co.kr/learn/courses/30/lessons/43238
** */
package binarysearch;

import java.util.Arrays;

public class Q2_yet {
    /*  틀림..    정확성 5/9     */
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long answer = n * times[times.length - 1];
        long right = answer;
        long left = 0;
        long mid;
        long people;

        while (left <= right) {
            people = 0;
            mid = (left + right) / 2;
            for (int time : times) {
                people += mid / time;
                if(mid < time) {
                    break;
                }
            }
//            System.out.println("left:"+left+" / mid:"+mid+" / right:"+right+" / people:"+people);
            if(people >= n) {
                right = mid - 1;
                if (answer > mid) {
                    answer = mid;
                }
            }
            else {
                left = mid + 1;
            }
        }

        return answer;
    }
}
