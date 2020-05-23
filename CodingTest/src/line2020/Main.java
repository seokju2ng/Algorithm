/*
 * 2020 SW개발 신입 LINER 공개채용 코딩테스트
 *
 * */
package line2020;

public class Main {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        String[] inputStrings = {"Hello, world",
                                "line [plus]",
                                "if (Count of eggs is 4.) {Buy milk.}",
                                ">_<",
                                "{ ( }"};
        System.out.println("Q1 > ");
        for (int i = 0; i < inputStrings.length; i++)
            System.out.println(q1.solution(inputStrings[i]));
        System.out.println();
//
//        Q2 q2 = new Q2();
//        String[] answer_sheet = {"4132315142", "53241", "24551"};
//        String[][] sheets = {{"3241523133","4121314445","3243523133","4433325251","2412313253"},
//        {"53241", "42133", "53241", "14354"},
//        {"24553", "24553", "24553", "24553"}};
//        System.out.println("Q2 >");
//        for (int i = 0; i < 3; i++) {
//            System.out.println(q2.solution(answer_sheet[i], sheets[i]));
//        }
//        System.out.println();
//
        System.out.println("Q3 >");
        System.out.println(new Q3().solution("11011110011111011111100011111", 3));
        System.out.println(new Q3().solution("001100", 5));




//        String[][] snapshots = {
//                {"ACCOUNT1", "100"},
//                {"ACCOUNT2", "150"},
//                {"ACCOUNT10", "150"}
//        };
//        String[][] transactions = {
//              {"1", "SAVE", "ACCOUNT2", "100"},
//              {"2", "WITHDRAW", "ACCOUNT1", "50"},
//              {"1", "SAVE", "ACCOUNT2", "100"},
//              {"4", "SAVE", "ACCOUNT3", "500"},
//              {"3", "WITHDRAW", "ACCOUNT2", "30"}
//        };
//        String[][] q4answer = new Q4().solution(snapshots, transactions);
//        System.out.println();
//        for (int i = 0; i < q4answer.length; i++) {
//            System.out.println("[\""+q4answer[i][0]+"\", \""+q4answer[i][1]+"\"]");
//        }
//
//
////
//
//        Q5 q5 = new Q5();
//        String[][] datasource = {
//    {"doc1", "t1", "t2", "t3"},
//    {"doc2", "t0", "t2", "t3"},
//    {"doc3", "t1", "t6", "t7"},
//    {"doc4", "t1", "t2", "t4"},
//    {"doc5", "t6", "t100", "t8"}
//};
//        String[] tags = {"t1", "t2", "t3"};
//        String[] q5answer = q5.solution(datasource, tags);
//        for (int i = 0; i < q5answer.length; i++) {
//            System.out.print(q5answer[i]+", ");
//        }


//        Q6 q6 = new Q6();
//        String[] directory = {
//        "/",
//                "/hello",
//                "/hello/tmp",
//                "/root",
//                "/root/abcd",
//                "/root/abcd/etc",
//                "/root/abcd/hello"
//    };
//        String[] command = {
//        "mkdir /root/tmp",
//                "cp /hello /root/tmp",
//                "rm /hello"
//    };
//        String[] result = q6.solution(directory, command);
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }

    }
}
