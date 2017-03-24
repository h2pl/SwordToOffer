package Part3;

import ADT.TreeNode;
import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/23.
 */
public class isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot)
    {
        TreeNode temp=pRoot;
        Mirror(pRoot);
        return isSameTree(temp,pRoot);
    }
    void Mirror(TreeNode root) {
        if(root == null)return;
        if(root.left!=null || root.right!=null)
        {
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
        }
        Mirror(root.left);
        Mirror(root.right);


    }
    boolean isSameTree(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null)return true;
        else if(t1!=null && t2!=null && t1.val==t2.val) {
            boolean left = isSameTree(t1.left, t2.left);
            boolean right = isSameTree(t1.right, t2.right);
            return left && right;
        }
        else return false;
    }

    @Test
    public void test(){
        TreeNode roota1=new TreeNode(8);
        TreeNode roota2=new TreeNode(8);
        TreeNode roota3=new TreeNode(7);
        TreeNode roota4=new TreeNode(9);
        TreeNode roota5=new TreeNode(2);
        TreeNode roota6=new TreeNode(4);

        TreeNode rootb1=new TreeNode(8);
        TreeNode rootb2=new TreeNode(8);
        TreeNode rootb3=new TreeNode(7);
        TreeNode rootb4=new TreeNode(9);
        TreeNode rootb5=new TreeNode(2);
        TreeNode rootb6=new TreeNode(4);


        roota1.left=roota2;
        roota3.left=roota4;
        roota5.left=roota6;
        roota3.right=roota5;
        roota1.right=roota3;

        rootb1.left=rootb2;
        rootb3.left=rootb4;
        rootb5.left=rootb6;
        rootb3.right=rootb5;
        rootb1.right=rootb3;


        System.out.println(isSymmetrical(roota1));
    }
}
