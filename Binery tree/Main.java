class node {
    int key;
    node left, right;

    public node(int item)
    {
        key = item;
        left = right = null;
    }
}

class binerytree {

    node root;
    binerytree() { root = null; }

    void printPostorder(node node)
    {
        if (node == null)
        return;

        printPostorder(node.left);
        printPostorder(node.right);

        System.out.println(node.key + " ");
    }

    void printInorder(node node)
    {
        if (node == null)
        return;

        printInorder(node.left);
        System.out.println(node.key + " ");

        printInorder(node.right);
    }
    
    void printPreorder(node node)
    {
        if ( node == null )
        return;

        System.out.println(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printPostorder() { printPostorder(root); }
    void printInorder() {printInorder(root); }
    void printPreorder() { printPreorder(root); }
}

    public class Main {
        public static void main(String[] args) 
        {
            binerytree tree = new binerytree();
            tree.root = new node(20);
            tree.root.left = new node(15);
            tree.root.right = new node(18);
            tree.root.left.left = new node(12);
            tree.root.left.right = new node(13);
            tree.root.right.left = new node(14);
            tree.root.right.right = new node(19);
    
            System.out.println("\t\t\t\t================");
            System.out.println("\t\t\t\t TRAVERSAL  ");
            System.out.println("\t\t\t\t================");
            System.out.println("\nPre-order : ");
            tree.printPreorder();
            System.out.println("\nIn-order : ");
            tree.printInorder();
            System.out.println("\nPost-order : ");
            tree.printPostorder();
        }    
        
    }
