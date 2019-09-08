import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            binaryTree.insert(binaryTree.root, scanner.nextInt());
        }
/*
        binaryTree.insert(binaryTree.root, 12);
        binaryTree.insert(binaryTree.root, 8);
        binaryTree.insert(binaryTree.root, 5);
        binaryTree.insert(binaryTree.root, 10);
        binaryTree.insert(binaryTree.root, 2);
        binaryTree.insert(binaryTree.root, 22);
        binaryTree.insert(binaryTree.root, 37);

        */
/*
        binaryTree.traversePrefix(binaryTree.root);
        System.out.println();
        binaryTree.traverseInfix(binaryTree.root);
        System.out.println();
        binaryTree.traversePostfix(binaryTree.root);
        System.out.println();

        System.out.println(binaryTree.root.key+ //12
                "\n"+binaryTree.root.left.key+" "+binaryTree.root.right.key+//8 22
                "\n"+binaryTree.root.left.left.key+" "+binaryTree.root.left.right.key+" "+binaryTree.root.right.right.key+//5 10 37
                "\n"+binaryTree.root.left.left.left.key);
*/
        System.out.println(binaryTree.search(binaryTree.root, 499));
    }
}
