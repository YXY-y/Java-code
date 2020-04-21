import java.util.Arrays;
/**
 * @program:TeatDemo2
 * @description
 * 数组:存放相同数据类型的集合。内容是连续的
 * new:实例化一个对象    内存在堆上
 * 栈上的地址 可以打印，但是不真实的。
 * @auther:
 * @creat:
 **/
public class TestDemo2 {

    //数组中所有元素的平均值(注意方法的返回值类型)
    public static double avg(int [] array){
       double a = 0;
       a = (double)sum(array)/(double)array.length;
       return a;
    }
    public static void main12(String[] args) {
        int [] array = {1,3,5,7,10,34};
        System.out.println(avg(array));
    }

    //数组所有元素之和
    public static int sum(int [] array){
        int sum = 0;
        for(int i = 0;i < array.length;i++){
            sum += array[i];
        }
        return sum;
    }
    public static void main11(String[] args) {
        int [] array = {1,3,4,6,5};
        System.out.println(sum(array));
    }

    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static void main10(String[] args) {
       int [] array = new int [100] ;
       for(int i = 0;i < array.length;i++){
           array [i] = i+1;
       }
        System.out.println(Arrays.toString(array));
    }

    //数组转字符串
    public static String myString(int [] array){
        String ret = "[";//真正拼接用StringBuilder
        for(int i = 0;i < array.length;i++){
            ret += array[i];
            if(i != array.length -1){
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main(String[] args) {
        int [] array = {1,2,3};
        System.out.println(myString(array));
    }

    public static void main8(String[] args) {
        int [] array = {12,34,1,6,2,9,21};
        Arrays.sort(array);//排序
        System.out.println(Arrays.toString((array)));
    }

    // 数组中的每个元素都 * 2
    public static int [] transform(int [] array){
        int [] tmp = new int [array.length];
        for(int i = 0;i < array.length;i++){
            tmp [i] = array [i]*2;
        }
        return tmp;
    }
    public static void main7(String[] args) {
        int [] array = {1,2,3};
        int [] ret = transform(array);
        System.out.println(Arrays.toString(ret));
    }

    //null  空对象
    //C语言中的Null代表0地址处
    public static void main6(String[] args) {
        int a = 0;
        System.out.println(a);
        int [] array = null;
        System.out.println(array);
    }

    public static void main5(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(array));//将数组以字符串形式输出
    }

    public static void swap(int [] array){
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
    public static void main4(String[] args) {
        int [] array = {10,20};
        System.out.println(array[0]+" "+array[1]);
        swap(array);
        System.out.println(array[0]+" "+array[1]);
    }

    public static void printArray(int [] arr){
        for (int x:arr) {
            System.out.println(x+" ");
        }
    }
    /**
     * 数组进行参数传递
     * @param args
     */
    public static void main3(String[] args) {
        int [] array = {1,2,3,4,};
        printArray(array);
    }

    public static void main2(String[] args) {
        int [] array = {1,2,3,4};
        int len = array.length;
        System.out.println(len);
        System.out.println("====================");
        for (int i = 0;i <array.length;i++){
            System.out.println(array[i]+" ");
        }
        System.out.println("====================");
        for (int val:array) {
            System.out.println(val+" ");
        }
    }

    public static void main1(String[] args) {
        int [] array = {1,2,3,4};
        int [] array2 = new int [] {11,22,33,44};
        int [] array3 = new int [4];//0 0 0 0
        System.out.println(array);
    }

}
