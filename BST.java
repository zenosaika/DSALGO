public class BST {
    BinaryNode head;

    public static class BinaryNode {
        int val;
        BinaryNode left = null;
        BinaryNode right = null;

        public BinaryNode(int val) {
            this.val = val;
        }
    }

    public BST() {
        head = new BinaryNode(9);
    }

    public void insert(int val) {
        BinaryNode curr = this.head;
        
        while (curr != null) {
            if (val > curr.val) {
                if (curr.right != null) curr = curr.right;
                else curr.right = new BinaryNode(val);
            } else if (val < curr.val) {
                if (curr.left != null) curr = curr.left;
                else curr.left = new BinaryNode(val);
            } else {
                System.out.println("[INSERT]: Found the same value in the BST, CANCEL OPERATION!");
            }
        }
    }
}
