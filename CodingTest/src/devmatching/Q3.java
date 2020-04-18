package devmatching;

import java.util.ArrayList;

public class Q3 {
    private int[] origNumbers;
    private int K;
    private Queue queue = new Queue();

    public int solution(int[] numbers, int K) {
        this.origNumbers = numbers;
        this.K = K;
        int maxswap = (numbers.length + 1) / 2;

        queue.enqueue(new Node(numbers, 0));

        while(!queue.isEmpty()) {
            Node node = queue.dequeue();

            if (isRight(node.numbers)) {
                return node.swap;
            }
            if (node.swap > maxswap) {
                return -1;
            }
            // 아니었던 배열을 등록해놓고
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i+1; j < numbers.length; j++) {
                    int[] nbs = node.getNumbers();
                    int temp = nbs[i];
                    nbs[i] = nbs[j];
                    nbs[j] = temp;
                    if (isOrig(nbs)) {
                        continue;
                    }
                    // nbs가 아니었던 배열이면 continue 시키면 효율 올라갈듯
                    // 하지만 시간이 좀 부족하다
                    queue.enqueue(new Node(nbs, node.swap+1));
                }
            }
        }

        return 0;
    }

    private boolean isOrig(int[] numbers){
        for (int i = 0; i < origNumbers.length; i++) {
            if (origNumbers[i] != numbers[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isRight(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (Math.abs(numbers[i] - numbers[i+1]) > K) {
                return false;
            }
        }
        return true;
    }
}

class Node {
    int[] numbers;
    int swap;

    public Node(int[] numbers, int swap) {
        this.numbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            this.numbers[i] = numbers[i];
        }
        this.swap = swap;
    }
    public int[] getNumbers() {
        int[] returnValue = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            returnValue[i] = numbers[i];
        }
        return returnValue;
    }
}

class Queue {
    private ArrayList<Node> queue;
    public Queue(){
        queue = new ArrayList<>();
    }
    public void enqueue(Node node) {
        queue.add(node);
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public Node dequeue(){
        return queue.remove(0);
    }
}