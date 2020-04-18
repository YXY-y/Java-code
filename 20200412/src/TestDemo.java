import java.util.Scanner;

/**
 * 调试：
 * 1.打断点：让代码走到这一步停下来
 * 2.开始调试：点击甲壳虫
 */

/**
 * 方法：功能
 * public static   返回值     方法名（形式参数列表）{
 *     方法体
 * }
 * 方法名：小驼峰形式
 * public static：因为当前的所以方法写完之后会在main方法中调用
 * main方法是public static的
 * 返回值：可有可无  具体看需求。如果有，那么返回值的类型和方法的返回值类型匹配
 * 形参列表：实参的一份拷贝
 * 方法体：就是具体方法的实现
 * return代表函数结束，不会执行return后的语句
 * java中只有值传递
 */
public class TestDemo {

    //计算1！+2！+3！+4！+5！
    public static int factor(int n){
        int sum = 0;
        for(int i = 1;i <= n;i++){
           /* int ret = 1;
            for(int j = 1;j <= i;j++){
                ret *= j;
            }*/
            sum += fac(i);
        }
        return sum;
    }
    //求某个数的阶乘
    public static int fac(int num){
        int ret = 1;
        for(int i = 1;i <= num;i++){
            ret *= i;
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factor(n));
    }

    //计算两个整数相加
    public static int sum(int a,int b){
        return a + b;
    }
    public static void main6(String[] args) {
        int a = 10;
        int b = 20;
        int ret = sum(a,b);
        System.out.println(ret);
    }

    //求三个数的最大值
    public static int max3(int num1,int num2,int num3){
        return max2(max2(num1,num2),num3);
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        //int ret1 = max2(n1,n2);
        int ret2 = max3(n1,n2,n3);
        //System.out.println(ret1);
        System.out.println(ret2);
        //System.out.println(max3(n1, n2, n3));
    }

    //求两个数的最大值
    public static int max2(int num1,int num2){
        return num1 > num2 ? num1 : num2;
    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int ret = max2(n1,n2);
        System.out.println(ret);
    }

    public static void main3(String[] args) {
        //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 31;i >= 1;i -= 2){
            System.out.print(((n >> i) & 1)+" ");//偶
        }
        System.out.println();
        for(int i = 30;i >= 1;i -= 2){
            System.out.print(((n >> i) & 1)+" ");//奇
        }
    }

    public static void main2(String[] args) {
        //求一个整数，在内存当中存储时，二进制1的个数
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }

    public static void main1(String[] args) {
        //求一个整数，在内存当中存储时，二进制1的个数
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i = 0;i < 32;i++){
            if(((n>>i)&1) ==1){
                count ++;
            }
        }
        System.out.println("count:"+count);
    }
}
