import java.util.Scanner;
/**
 * @program:TestDemo2
 * @
 * 实参和形参的关系
 * 重载
 * @auther:
 * @creat:
 **/
public class TestDemo2 {

    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
    public static int max(int a,int b) {
        return a>b?a:b;
    }
    public static double max(double d1,double d2) {
        return d1>d2 ? d1:d2;
    }
    public static double max (double x,double y,int k) {
        return max(max(x,y),k);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("两个整数中最大的是："+max(a,b));
        double d1 = 12.3;
        double d2 = 27.3;
        System.out.println("两个小数中最大的是："+max(d1,d2));
        double x = 33.6;
        double y = 25.6;
        int k = 30;
        System.out.println("两个小数和一个整数中最大的是："+max(x,y,k));
    }
    /**
     * 方法的重载(Overload)：
     * 1.方法名相同
     * 2.参数列表不同（参数的个数 或者 参数的类型 不同）
     * 3.返回值不做要求
     * 4.同一个类中
     * 重载和重写的区别？
     *
     * @param args
     */
    //求和--->重载
    public static void main2(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
        double d1 = 19.9;
        double d2 = 18.8;
        double d3 = 17.7;
        System.out.println(sum(d1,d2));
        System.out.println(sum(d1,d2,d3));
    }
    public static int sum(int a,int b){
        return a + b;
    }
    public static int sum(int a,int b,int c){
        return a + b + c;
    }
    public static double sum(double a,double b){
        return a + b;
    }
    public static double sum(double a,double b,double c){
        return a + b + c;
    }

    public static void swap(int x ,int y){
        int tmp = x;
        x = y;
        y = tmp;
    }
    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a +" "+ b);//没有完成数据的交换
        //解决办法: 传引用类型参数------数组
    }
}
