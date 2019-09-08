/**
 * Created by Johan Engström 2019-09-08
 * <p>
 * Assignment 5.1:
 * 12
 * /    \
 * 8       22
 * /  \        \
 * 5   10        37
 * /
 * 2
 * prefix:12,8,5,2,10,22,37
 * infix:2,5,8,10,12,22,37
 * postfix:2,5,10,8,22,37,12
 */
public class BinaryTree {
    Node root;

    public class Node<Item> {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    public void insert(Node root, int key) {
        Node newNode = new Node(key);

        if (root == null) {
            this.root = newNode;
        } else {
            if (newNode.key < root.key) {
                if (root.left == null)
                    root.left = newNode;
                else
                    insert(root.left, key);
            } else {
                if (root.right == null)
                    root.right = newNode;
                else
                    insert(root.right, key);
            }
        }
    }

    public void traversePrefix(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            traversePrefix(root.left);
            traversePrefix(root.right);
        }
    }

    public void traverseInfix(Node root) {
        if (root != null) {
            traversePrefix(root.left);
            System.out.print(root.key + " ");
            traversePrefix(root.right);
        }
    }

    public void traversePostfix(Node root) {
        if (root != null) {
            traversePrefix(root.left);
            traversePrefix(root.right);
            System.out.print(root.key + " ");
        }
    }

    public boolean search(Node root, int searchKey) {
        if (searchKey == root.key)
            return true;
        if (searchKey < root.key){
            if (root.left == null)
                return false;
            else
                return search(root.left, searchKey);
        } else {
            if (root.right == null)
                return false;
            else
                return search(root.right, searchKey);
        }
    }
}
