import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q3_4 {
    Node root;
    static Scanner sc = new Scanner(System.in);

    q3_4(Node root) {
        this.root = root;
    }

    public static void main(String[] args) {
        q3_4 obj = new q3_4(null);
        System.out.println("Enter the number of countries");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            obj.root = obj.insert(obj.root, new Country(sc.next(), sc.nextInt()));
        }
        System.out.println("Level Order Traversal");
        obj.levelOrder(obj.root);
        System.out.println("Inorder Traversal");
        System.out.println("Country with maximum population: " + obj.max(obj.root));
        System.out.println("Country with minimum population: " + obj.min(obj.root));
    }

    public Node insert(Node root, Country val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.info.compareTo(val) > 0) {
            root.left = insert(root.left, val);
        }
        if (root.info.compareTo(val) < 0) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.println(temp.info);
            if (temp.left != null) {
                q.offer(temp.left);
            }
            if (temp.right != null) {
                q.offer(temp.right);
            }
        }
    }

    public String max(Node root) {
        if (root.right == null) {
            return root.info.name;
        }
        return max(root.right);
    }

    public String min(Node root) {
        if (root.left == null) {
            return root.info.name;
        }
        return min(root.left);
    }
}

class Country implements Comparable<Country> {
    String name;
    int population;

    Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public int compareTo(Country obj) {
        return this.population - obj.population;
    }

    public String toString() {
        return name + " " + population;
    }
}

class Node {
    Country info;
    Node left;
    Node right;

    Node(Country info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }

}
