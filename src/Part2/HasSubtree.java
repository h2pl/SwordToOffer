package Part2;

import ADT.TreeNode;
import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/21.
 * 题目描述
 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean hasleft=true;
        boolean hasright=true;

        if(root2==null &&root1!=null)return true;
        if(root2!=null &&root1==null)return false;

        if(root1.val==root2.val){
            if(root2.left!=null)
            hasleft=HasSubtree(root1.left,root2.left);
            if(root2.right!=null)
            hasright=HasSubtree(root1.right,root2.right);

            if(hasleft && hasright)return true;

        }

            boolean left = HasSubtree(root1.left, root2);
            boolean right = HasSubtree(root1.right, root2);

            return left || right;


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
        TreeNode rootb2=new TreeNode(9);
        TreeNode rootb3=new TreeNode(2);


        roota1.left=roota2;
        roota3.left=roota4;

        roota5.left=roota6;

        roota3.right=roota5;
        roota1.right=roota3;

        rootb1.left=rootb2;
        rootb1.right=rootb3;

        System.out.println(HasSubtree(roota1,rootb1));
    }
}
