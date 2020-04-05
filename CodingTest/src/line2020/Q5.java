package line2020;

import java.util.ArrayList;
import java.util.Collections;

public class Q5 {
    private ArrayList<Document> result;
    public String[] solution(String[][] dataSource, String[] tags) {
        result = new ArrayList<>();
        for (int i = 0; i < dataSource.length; i++) {
            int tagsIncluded = 0;
            for (int j = 1; j < dataSource[i].length; j++) {
                for (int k = 0; k < tags.length; k++) {
                    if (dataSource[i][j].equals(tags[k])) {
                        tagsIncluded++;
                    }
                }
            }
            if (tagsIncluded != 0) {
                result.add(new Document(dataSource[i][0], tagsIncluded));
            }
        }


        Collections.sort(result);
        int size = result.size() > 10 ? 10 : result.size();
        String[] answer = new String[size];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i).docname;
        }

        return answer;
    }
}

class Document implements Comparable {
    String docname;
    int tagsIncluded;

    public Document(String docname, int tagsIncluded) {
        this.docname = docname;
        this.tagsIncluded = tagsIncluded;
    }

    @Override
    public int compareTo(Object o) {
        Document other = (Document)o;
        if (this.tagsIncluded > other.tagsIncluded) {
            return -1;
        } else if (this.tagsIncluded < other.tagsIncluded) {
            return 1;
        } else {
            return this.docname.compareTo(other.docname);
        }
    }
}