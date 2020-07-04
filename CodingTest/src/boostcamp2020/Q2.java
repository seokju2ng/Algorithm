package boostcamp2020;

import java.util.ArrayList;

public class Q2 {
    public int[] solution(int[] arrayA, int[] arrayB) {
        int[] ret = new int[5];

        ArrayList<Integer> setA = createSet(arrayA);
        ArrayList<Integer> setB = createSet(arrayB);

        ret[0] = setA.size();
        ret[1] = setB.size();
        ret[2] = sum(setA, setB).size();
        ret[3] = complement(setA, setB).size();
        ret[4] = intersect(setA, setB).size();
        return ret;
    }

    private ArrayList<Integer> sum(ArrayList<Integer> setA, ArrayList<Integer> setB) {
        ArrayList<Integer> ret = new ArrayList<>();
        ret.addAll(setA);
        for (int elem : setB) {
            if (!ret.contains(elem))
                ret.add(elem);
        }
        return ret;
    }

    private ArrayList<Integer> complement(ArrayList<Integer> setA, ArrayList<Integer> setB) {
        ArrayList<Integer> ret = new ArrayList<>();
        int i = 0;
        ret.addAll(setA);
        while (ret.size() > i) {
            int size = ret.size();
            for (int elemB : setB) {
                if (ret.get(i) == (elemB)) {
                    ret.remove(i);
                    break;
                }
            }
            if (size == ret.size()) ++i;
        }
        return ret;
    }

    private ArrayList<Integer> intersect(ArrayList<Integer> setA, ArrayList<Integer> setB) {
        ArrayList<Integer> ret = new ArrayList<>();
        for (int elemA : setA) {
            for (int elemB : setB) {
                if (elemA == elemB) {
                    ret.add(elemA);
                }
            }
        }
        return ret;
    }

    private ArrayList<Integer> createSet(int[] array) {
        ArrayList<Integer> set = new ArrayList<>();
        for (int elem : array) {
            if (!set.contains(elem))
                set.add(elem);
        }
        return set;
    }
}
