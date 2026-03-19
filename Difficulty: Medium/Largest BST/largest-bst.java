class Solution {

    static int largestBst(Node root) {
        return helper(root).count;
    }
    
    public static BSTPair helper(Node root) {
        if (root == null) { // null subtree is a valid BST
            BSTPair pair = new BSTPair();
            pair.min = Integer.MAX_VALUE;
            pair.max = Integer.MIN_VALUE;
            pair.count = 0;
            pair.isBST = true;
            return pair;
        }

        BSTPair left = helper(root.left);
        BSTPair right = helper(root.right);

        BSTPair curr = new BSTPair();

        // Check if current subtree is BST
        if (left.isBST && right.isBST && root.data > left.max && root.data < right.min) {
            curr.isBST = true;
            curr.count = left.count + right.count + 1;
            curr.min = Math.min(root.data, left.min);  // update min
            curr.max = Math.max(root.data, right.max); // update max
        } else {
            curr.isBST = false;
            curr.count = Math.max(left.count, right.count); // pick max of left/right
        }

        return curr;
    }
    
    static class BSTPair {
        int max;
        int min;
        int count;
        boolean isBST;
    }
}