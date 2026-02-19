package main.java.com.dataStructs.Trees;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Traversal {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{

        static int index = -1;

        // Building tree preorder ->root ->left ->right
        public Node BuildTree(Integer[] nodes) {
                index++;
                if(index >= nodes.length || nodes[index] == null){
                    return null;
                }
                Node newNode = new Node(nodes[index]);
                newNode.left = BuildTree(nodes);
                newNode.right = BuildTree(nodes);
                return newNode;
        }

        // DFS
        //Preorder Traversal ->root ->left ->right
        public void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // DFS
        //Preorder Traversal ->left ->right ->root
        public void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // DFS
        //Preorder Traversal ->left ->right ->root
        public void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // BFS
        // Level Order Traversal -> from top (root) to bottom
        public void levelorder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<Node>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node curr = q.remove();
                if(curr == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    } else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curr.data + " ");
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] nodes = { 1, 2, 4, null, null, 5, null, null, 3, null, 6, null, null};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        System.out.println("Root Node-> " + root.data);
        System.out.println("Preorder");
        tree.preorder(root);
        System.out.println("\nInorder");
        tree.inorder(root);
        System.out.println("\nPostorder");
        tree.postorder(root);
        System.out.println("\nLevel order");
        tree.levelorder(root);
    }
}
