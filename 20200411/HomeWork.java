//import java.util.Scanner;
//import java.util.Random;
import java.util.*;

public class HomeWork{

	public static void main(String[] args){
		//输出一个整数的每一位
		/*int num =123;
		 for(int i = 0;i < 3;i++){
            int n = num % 10;
            num = num / 10;
            System.out.println(n);
        }*/
        int num = 123;
        while(n != 0){
        	int tmp = n%10;
        	System.out.println(tmp+" ");
        	num = num/10;
        }
	}

	public static void main11(String[] args){
		//密码
		Scanner scan = new Scanner(System.in);
		int count = 3;
		while(count != 0){
			System.out.println("请输入密码：");
			String password = scan.nextLine();
			if(password.equals("123456")){
				System.out.println("密码正确，登陆成功");
				break;
			}else{
				count--;
				System.out.println("你还有"+count+"次机会");
			}
		}
	}

	public static void main10(String[] args){
		//求出0～999之间的所有“水仙花数”并输出
		for(int n = 1;n <= 99999;n++){
			int count = 0;
			int tmp = n;
			while(tmp != 0){
				count ++;
				tmp = tmp/10;
			}
			tmp = n;
			int sum = 0;
			while(tmp != 0){
				sum +=Math.pow(tmp%10,count);
				tmp = tmp/10;
			}
			if(sum == n){
				System.out.println(sum+" is my result");
			}
		}
	}

	public static void main9(String[] args){
		// 1-100中出现数字9的个数
		int count = 0; 
		for(int i = 1;i <= 100;i++){
			if(i%10 == 9){
				count++;
			}
			if(i/10 == 9){
				count++;
			}
		}
		System.out.println(count);//20

		//1-100中包含9的数的个数
		/*int count = 0; 
		for(int i = 1;i <= 100;i++){
			if(i%10 == 9){
				count++;
			}else if(i/10 == 9){
				count++;
			}
		}
		System.out.println(count);//19*/
	}

	public static void main8(String[] args){
		//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double sum = 0;
		int flg = 1;
		for(int i = 1;i <= n;i++){
			sum = sum + 1.0/i *flg;
			flg = -flg;
		}
		System.out.println(sum);
	}

	public static void main7(String[] args){
		//求两个正整数的最大公约数
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = b;
		while(a%b != 0){
			c = a%b;
			a = b;
			b = c;
		}
		System.out.println(c);
	}

	public static void main6(String[] args){
		//乘法表
		for(int i = 1;i <=9;i++){
			for(int j = 1;j <= i;j++){
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
	}

	public static void main5(String[] args){
		//输出 1000 - 2000 之间所有的闰年
		for(int year = 1000;year <= 2000;year++){
			if((year%4==0 && year%100 != 0)||(year%400 == 0)){
				System.out.println(year+"是闰年");
			}
		}
	}

	public static void main4(String[] args){
		//打印1-100之间的素数
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int j = 2;
		for(int i = 1;i <= n;i++){
			for(j = 2;j <= (int)Math.sqrt(i);j++){
				if(i % j == 0){
					break;
				}
			}
			if(j>(int)Math.sqrt(i)){
				System.out.println(i+"是素数");
			}
		}
	}

	public static void main3(String[] args){
		//判断素数
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 2;i <= (int)Math.sqrt(n);i++){
			if(n % i == 0){
				System.out.println(n+"不是素数");
				break;
			}
		}	
		/*for(int i = 1;i <= n;i++){
			if(n % i == 0){
				System.out.println(n+"不是素数");
				break;
			}else{
				System.out.println(n+"是素数");
				break;
			}
		}*/

		/*for(int i = 1;i <= n/2;i++){
			if(n % i == 0){
				System.out.println(n+"不是素数");
				break;
			}
		}*/
	}

	public static void main2(String[] args){
		//年龄
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n <= 18){
			System.out.println("少年");
		}else if(n >= 19 && n <= 28){
			System.out.println("青年");
		}else if(n >= 29 && n <= 55){
			System.out.println("中年");
		}else{
			System.out.println("老年");
		}
	}

	public static void main1(String[] args){
		//猜数字
		Scanner scan = new Scanner(System.in);
		Random rang = new Random();//如果给定一个时间戳，随机数一定
		int randNum = rang.nextInt(100);//[0,100)
		//int randNum = rang.nextInt(100)+100;//[100,200)
		System.out.println(randNum);
		while(true){
			System.out.println("请输入你要猜的数字：");
			int num = scan.nextInt();
			if(num <randNum ){
				System.out.println("你猜的数字猜小了！");
			}else if(num == randNum){
				System.out.println("你猜的数字猜对了！");
				break;
			}else{
				System.out.println("你猜的数字猜大了！");
			}
		}
	}
}