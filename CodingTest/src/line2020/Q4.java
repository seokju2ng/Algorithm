package line2020;

import java.util.ArrayList;
import java.util.Comparator;

public class Q4 {
    private ArrayList<String[]> snapshots;
    public String[][] solution(String[][] snapshots, String[][] transactions) {
        boolean[] isCheckedId = new boolean[100000];
        this.snapshots = new ArrayList<>();
        for (int i = 0; i < snapshots.length; i++) {
            this.snapshots.add(new String[]{snapshots[i][0], snapshots[i][1]});
        }

        for (int i = 0; i < transactions.length; i++) {
            int id = Integer.parseInt(transactions[i][0]);
            if (isCheckedId[id]) {
                continue;
            }
            isCheckedId[id] = true;

            int account = -1;
            for (int j = 0; j < this.snapshots.size(); j++) {
//                System.out.println(transactions[i][2]+" == "+this.snapshots.get(j)[0] + " ?? ");
                if (transactions[i][2].equals(this.snapshots.get(j)[0])) {
//                    System.out.println("j = "+j);
                    account = j;
                }
            }
            if (account == -1) {
//                System.out.println("add : "+transactions[i][2]);
                this.snapshots.add(new String[]{transactions[i][2], transactions[i][3]});
                continue;
            }

            switch (transactions[i][1]) {
                case "SAVE" : save(account, transactions[i][3]); break;
                case "WITHDRAW" : withdraw(account, transactions[i][3]); break;
            }
        }

        this.snapshots.sort((o1, o2) -> o1[0].compareTo(o2[0]));

        String[][] answer = new String[this.snapshots.size()][2];
        for (int i = 0; i < this.snapshots.size(); i++) {
            answer[i][0] = this.snapshots.get(i)[0];
            answer[i][1] = this.snapshots.get(i)[1];
        }


        return answer;
    }

    private void save(int account, String amount) {
        this.snapshots.get(account)[1] = (Integer.parseInt(this.snapshots.get(account)[1]) + Integer.parseInt(amount)) + "";
    }

    private void withdraw(int account, String amount) {
        this.snapshots.get(account)[1] = (Integer.parseInt(this.snapshots.get(account)[1]) - Integer.parseInt(amount)) + "";
    }
}
