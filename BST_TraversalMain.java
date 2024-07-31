public class BST_TraversalMain
{
    public static void main(String[] args)
    {
        //construct a BST
        BST_Traversal tree = new BST_Traversal();

        tree.root = new Node(45);
        tree.root.left = new Node(10);
        tree.root.right = new Node(90);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(12);

        //PreOrder Traversal
        System.out.println("BST => PreOrder Traversal:");
        tree.preOrder_traversal();
        System.out.println();

        //InOrder Traversal
        System.out.println("BST => InOrder Traversal:");
        tree.inOrder_traversal();
        System.out.println();

        //PostOrder Traversal
        System.out.println("BST => PostOrder Traversal:");
        tree.postOrder_traversal();
        System.out.println();
    }
}
