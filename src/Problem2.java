public class Problem2 {
    //has sub tree
    public static void main(String args[]) {
        BinaryTreeNode root1 = new BinaryTreeNode(1);
        BinaryTreeNode a = new BinaryTreeNode(2);
        BinaryTreeNode b = new BinaryTreeNode(3);
        BinaryTreeNode c = new BinaryTreeNode(4);
        BinaryTreeNode d = new BinaryTreeNode(5);
        root1.left = a;
        root1.right = b;
        a.left = c;
        a.right = d;

        BinaryTreeNode root2 = new BinaryTreeNode(2);
        BinaryTreeNode node1 = new BinaryTreeNode(6);
        BinaryTreeNode node2 = new BinaryTreeNode(5);
        root2.left = node1;
        root2.right = node2;

        System.out.println(isTrue(root1, root2));
    }

    private static boolean isTrue(BinaryTreeNode root1, BinaryTreeNode root2) {
        boolean result = false;
        if (root1.value == root2.value) {
            result = isHasSubTree(root1, root2);
        } if (!result) {
            result = isHasSubTree(root1.left, root2);
        } if (!result) {
            result = isHasSubTree(root1.right, root2);
        }
        return result;
    }

    private static boolean isHasSubTree(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1 == null) {
            return true;
        }
        if (root2 != null) {
            if (root2.value == root1.value) {
                return isHasSubTree(root1.left, root2.left) && isHasSubTree(root1.right, root2.right);
            }
        }
        return false;
    }


}

class BinaryTreeNode {
    BinaryTreeNode(int value) {
        this.value = value;
    }

    int value;
    BinaryTreeNode left = null;
    BinaryTreeNode right = null;
}