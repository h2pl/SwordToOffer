package Part2;

import ADT.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 树的层次遍历
 * Created by 周杰伦 on 2017/3/22.
 */
public class 树的层次遍历 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        if(root==null)return arrayList;

        Queue<TreeNode> queue=new LinkedList<>();

        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode p=queue.poll();
            arrayList.add(p.val);
            if(p.left!=null)
                queue.offer(p.left);
            if(p.right!=null)
                queue.offer(p.right);
        }
        return arrayList;

    }
}
