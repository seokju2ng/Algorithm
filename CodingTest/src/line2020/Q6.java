package line2020;

import java.util.ArrayList;
import java.util.TreeMap;

public class Q6 {
    private ArrayList<String> result;
    private TreeMap<String, ArrayList<String>> tree;

    public String[] solution(String[] directory, String[] command) {
        tree = new TreeMap<>();
        result = new ArrayList<>();
        tree.put("/", new ArrayList<>());
        for (int i = 1; i < directory.length; i++) {
            String[] split = directory[i].split("/");
            if (split.length == 2) {
                tree.get("/").add(split[1]);
            } else {
                String dir = directory[i].substring(0, directory[i].length() - split[split.length-1].length());
                if (tree.get(dir) == null) {
                    tree.put(dir, new ArrayList<>());
                }
                tree.get(dir).add(split[split.length-1]);
            }
        }

        for (String key : tree.keySet()) {
            System.out.println(key + ", " + tree.get(key));
        }

        for (int i = 0; i < command.length; i++) {
            String[] split = command[i].split(" ");
            switch (split[0]) {
                case "mkdir" :
                case "cp" :
                case "rm" :
            }
        }

        return null;
    }
}

//public class Q6 {
//    private ArrayList<String> result;
//    private TreeNode root;
//    public String[] solution(String[] directory, String[] command) {
//        result = new ArrayList<>();
//        root = new TreeNode("/");
//
//        for (int i = 0; i < directory.length; i++) {
//            result.add(directory[i]);
//            System.out.println(result.get(i));
//            String[] split = directory[i].split("/");
//            TreeNode temp = new TreeNode(split[split.length-1]);
//            for (int j = 1; j < split.length - 1; j++) {
//                if(root.child.size() == 0) {
//                    root.child.add(temp);
//                    break;
//                }
//                for (int k = 0; k < root.child.size(); k++) {
//
//                }
//            }
//        }
//
//
//
//
//        for (int i = 0; i < command.length; i++) {
//            String[] split = command[i].split(" ");
//            switch (split[0]) {
//                case "mkdir" :
//                case "cp" :
//                case "rm" :
//            }
//        }
//
//
//
//
//
//
//
//
//        String[] answer = {};
//
//
//        return answer;
//    }
//}
//
//class TreeNode {
//    String folderName;
//    ArrayList<TreeNode> child;
//
//    public TreeNode(String folderName) {
//        this.folderName = folderName;
//        child = new ArrayList<>();
//    }
//
//    public TreeNode(String folderName, ArrayList<TreeNode> child) {
//        this.folderName = folderName;
//        this.child = child;
//    }
//}