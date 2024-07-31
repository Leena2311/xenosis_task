public class BinarySearchTreeMain
{

        public static void main(String[] args)
        {
            //create a BST object
            BinarySearchTree bst = new BinarySearchTree();

            //insert data into BST
            bst.insert(45);
            bst.insert(10);
            bst.insert(7);
            bst.insert(12);
            bst.insert(90);
            bst.insert(50);

            //print the BST
            System.out.println("The BST Created with input data(Left-root-right):");
            bst.inorder();
            System.out.println();

            //delete leaf node
            System.out.println("The BST after Delete 12(leaf node):");
            bst.deleteKey(12);
            bst.inorder();
            System.out.println();

            //delete the node with one child
            System.out.println("The BST after Delete 90 (node with 1 children)");
            bst.deleteKey(90);
            bst.inorder();
            System.out.println();

            //delete node with two children
            System.out.println("The BST after Delete 45 (Node with 2 children)");
            bst.deleteKey(45);
            bst.inorder();
            System.out.println();

            //search a key in the BST
            boolean ret_val = bst.search (50);
            System.out.println("Key 50 found in BST:" + ret_val );
            System.out.println();
            ret_val = bst.search (12);
            System.out.println("Key 12 found in BST:" + ret_val );

        }
}

