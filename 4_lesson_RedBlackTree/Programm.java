public class Programm {
    public static void main(String[] args) {
        RedBlackTree RBTree = new RedBlackTree();
        
        RBTree.insert(8);
        RBTree.insert(18);
        RBTree.insert(5);
        RBTree.insert(15);
        RBTree.insert(17);
        RBTree.insert(25);
        RBTree.insert(40);
        RBTree.insert(80);
        RBTree.deleteNode(25);
        RBTree.prettyPrint();
    }
}