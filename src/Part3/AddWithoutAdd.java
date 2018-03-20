package Part3;

import java.util.ArrayList;

/**
 * Created by 周杰伦 on 2018/3/20.
 */
public class AddWithoutAdd {
    public static int Add(int num1,int num2) {
        if( num2 == 0 )return num1;
        if( num1 == 0 )return num2;

        int temp = num2;
        while(num2!=0) {
            temp = num1 ^num2;
            num2 = (num1 & num2)<<1;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(Add(1,2));
    }
}
