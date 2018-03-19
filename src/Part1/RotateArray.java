package Part1;

/**
 * Created by 周杰伦 on 2018/2/25.
 */
public class RotateArray {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];
        int min = array[0];
        for(int i = 1;i<array.length;i++){
            if(array[i] <= array[i+1]) {
                continue;
            }
            else return array[i+1];
        }
        return array[array.length - 1];
    }
}
