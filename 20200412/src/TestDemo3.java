/**
 * @program:TestDemo3
 * @description
 *方法递归
 * @auther:
 * @creat:
 **/
public class TestDemo3 {

    //求斐波那契数列的第n项。(迭代实现)
    public static int fabonaci2(int n){
        int f1 = 1;
        int f2 = 1;
        //注意：如果n是1或者0的时候----->f3=1
        int f3 = 1;
        for(int i = 3;i <= n;i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        System.out.println(fabonaci2(10));
    }

    //递归求斐波那契数列的第 N 项
    public static int fabonaci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fabonaci(n-1) + fabonaci(n-2);
    }
    public static void main5(String[] args) {
        System.out.println(fabonaci(4));
    }

    //输入一个非负整数，返回组成它的数字之和.
    // 例如，输入 1729, 则应该返回1+7+2+9，它的和是19
    public static int func2(int n){
        if(n <= 9){
            return n;
        }
        return n%10 + func2(n/10);
    }
    public static void main4(String[] args) {
        System.out.println(func2(1729));
    }

    //递归求 1 + 2 + 3 + ... + 10
    public static int sum(int n){
       if(n == 1){
           return 1;
       }
       return n + sum(n-1);
    }
    public static void main3(String[] args) {
        System.out.println(sum(10));
    }

    //按顺序打印一个数字的每一位
    public static void func1(int n){
        if(n > 9){
            func1(n/10);
        }
        System.out.println(n%10);
    }
    public static void main2(String[] args) {
        func1(1234);
    }


    //求n！
    public static int fac(int n){
        if(n == 1){
            return 1;
        }
        return n * fac(n-1);
    }
    public static void main1(String[] args) {
        System.out.println(fac(5));
    }
}
