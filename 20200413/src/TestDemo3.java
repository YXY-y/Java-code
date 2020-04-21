import java.util.Arrays;

/**
 * @program:TestDemo3
 * @description
 * @auther:
 * @creat:
 **/
public class TestDemo3 {

    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。

    public static void func2(int [] array) {
        int count = 0;
        for(int i =0;i < array.length;i++){
            int tmp = array[i];
            if(array[i]%2 != 0){
                for(int j = i;j > count;j--){
                    array[j] = array[j-1];
                }
                array[count] = tmp;
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        func2(array);
        System.out.println(Arrays.toString(array));
    }
    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
    public static int func(int[] array){
        int n = 0;
        for(int i = 0;i < array.length;i++){
           n ^=array[i];
        }
        return n;
    }
    public static void main1(String[] args) {
        int[] array = new int[]{1,1,2,3,3,4,4};
        System.out.println(func(array));
    }
}
