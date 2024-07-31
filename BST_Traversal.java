//define node of the BST
    class Node
    {
        int key;
        Node left, right;

        public Node(int data)
        {
            key = data;
            left = right = null;
        }
    }

    //Binary Search Tree Traversal class
     class BST_Traversal
    {
        // BST root node
        Node root;

        BST_Traversal()
        {
            root = null;
        }

        //PostOrder Traversal   Left:Right:rootNode (LRn)
        void postOrder(Node node)
        {
            if (node == null)
                return;

            // first traverse left subtree recursively
            postOrder(node.left);

            // then traverse right subtree recursively
            postOrder(node.right);

            // now process root node
            System.out.print(node.key + " ");
        }
        // InOrder Traversal  Left:rootNode:Right (LnR)
        void inOrder(Node node)
        {
            if (node == null)
                return;

            //first traverse left subtree recursively
            inOrder(node.left);

            //then go for root node
            System.out.print(node.key + " ");

            //next traverse right subtree recursively
            inOrder(node.right);
        }

        //PreOrder Traversal - rootNode:Left:Right (nLR)
        void preOrder(Node node)
        {
            if (node == null)
                return;

            //first print root node first
            System.out.print(node.key + " ");

            // then traverse left subtree recursively
            preOrder(node.left);

            // next traverse right subtree recursively
            preOrder(node.right);
        }
        // Wrappers for recursive functions
        void postOrder_traversal()
        {
            postOrder(root);
        }
        void inOrder_traversal()
        {
            inOrder(root);
        }
        void preOrder_traversal()
        {
            preOrder(root);
        }
    }



