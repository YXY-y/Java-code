import java.util.Scanner;
public class TestDemo{

	public static void main(String[] args){
		//打印1-10的数字
		/*int num = 1;//初始条件
		while(num <= 10){
			System.out.println(num+" ");
			num++;//步进
		}*/

		/*//计算1-100的和
		int i = 1;
		int sum = 0;
		while(i <= 100){
			sum+=i;
			i++;
		}
		System.out.println(sum);*/

		//计算5！
		/*int i = 1;
		int ret = 1;
		while(i <= 5){
			ret*=i;
			i++;
		}
		System.out.println(ret);*/

		//计算  5！+4！+3！+2！+1！
		/*int sum = 0;
		int i = 1;
		int ret = 1;
		while(i <= 5){
			ret*=i;
			sum+=ret;
			i++;
		}
		System.out.println(sum);*/
		//循环的嵌套
		int num = 1;
		int sum = 0;
		while(num <= 5){
			int i = 1;
			int ret = 1;
			while(i<=num){
				ret *= i;
				i++;
			}
			sum += ret;
			num++;
		}
		System.out.println(sum);
	}


	/**
	 * 1.不能做switch类型的参数有哪些？
	 * long float double boolean
	 * 2.枚举也可以作为switch的参数
	 * 3.break不能省
	 * 4.switch 不能表达复杂的条件
	 * 5.不建议嵌套---丑
	 * @param args [description]
	 */
	public static void main12(String[] args){
		//switch
		int a = 10;
		switch(a){
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			default:
				System.out.println("请输入正确的数字！");
				break;
		}
	}

	public static void main11(String[] args){
		//悬垂else---不建议这样写
		int x = 10;
		int y = 10;
		if (x == 10)
 		if (y == 10)
 		System.out.println("aaa");
		else
 		System.out.println("bbb");
	}
	
	public static void main10(String[] args){
		//判定一个数字是奇数还是偶数
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num%2==0){
			System.out.println(num +"是偶数");
		}else{
			System.out.println(num +"是奇数");
		}*/

		//判定一个数是正数还是负数
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num > 0){
			System.out.println(num+"是正数");
		}else if(num < 0){
			System.out.println(num+"是负数");
		}else{
			System.out.println("num是0");
		}*/

		//判断某一年是否是闰年
		/*Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if(((year%4 == 0)&&(year%100 != 0))||(year%400 == 0)){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}*/

		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int year = scan.nextInt();
			if(((year%4 == 0)&&(year%100 != 0))||(year%400 == 0)){
				System.out.println(year+"是闰年");
			}else{
				System.out.println(year+"不是闰年");
			}
		}
		//退出循环
		//1.Ctrl+C(直接中断程序)
		//2.Ctrl+D 正常退出

	}

	public static void main9(String[] args){
		int a = 10;
		//if（布尔表达式）
		if(a == 10){
			System.out.println("hello");
		}
	}

	public static void main8(String[] args){
		//next和nextLine的区别
		//next遇到空格会结束掉
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		//String str = scan.nextLine();
		System.out.println(str);
	}

	public static void main7(String[] args){
		Scanner scan = new Scanner(System.in);
		/*int a = scan.nextInt();
		System.out.println(a);*/

		/*String str = scan.nextLine();
		System.out.println(str);*/
		//注意：nextInt和nextLine不一起使用
		//一起使用：使用next
		int a = scan.nextInt();
		System.out.println(a);
		String str = scan.next();//
		System.out.println(str);
	}

	public static void main6(String[] args){
		/*int a = 10;
		int b = 20;
		System.out.println(a & b);//0 */

		/*int a = 10;
		int b = 20;
		System.out.println(a | b); //30*/

		/*int a = 0x1;
		int b = 0x2;
		System.out.printf("%x\n", a ^ b); //3*/
		
		int a = 0xf;
		System.out.printf("%x\n", ~a);//fffffff0
	}

	public static void main5(String[] args){
		/*int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a < b && b < c);//ture*/

		/*int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a < b || b < c); //ture*/

		/*int a = 10;
		int b = 20;
		//System.out.println(!a < b); //错误：一元运算符 '!' 的操作数类型int错误
		boolean flag = true;
		System.out.println(!flag);//false
		//非!只能作用于boolean类型*/
		
		//短路求值
		System.out.println(10 > 20 && 10 / 0 == 0); // false
		System.out.println(10 < 20 || 10 / 0 == 0); // true
		//10/0没有被执行
	}

	public static void main4(String[] args){
		int a = 10;
		int b = 20;
		System.out.println(a == b);//false
		System.out.println(a != b);//true
		System.out.println(a > b);//false
		System.out.println(a <= b);//ture
		System.out.println(a >= b); //false
	}

	public static void main3(String[] args){
		int i = 10;
		i = i++;
		System.out.println(i);//10
	}

	public static void main2(String[] args){

		/*System.out.println(10%3);//1
		System.out.println(-10%3);//-1
		System.out.println(10%-3);//1
		System.out.println(-10%-3);//-1*/

		//System.out.println(5/0);//异常，除数不能为0
		
		System.out.println(11.5%2.0);//1.5

		int a = 10;
		int b = a++;
		System.out.println(b);//10
		int c = ++a;
		System.out.println(c);//12

	}

	public static void main1(String[] args){

		System.out.println(5/2);//2
		System.out.println(5.0/2);//2.5
		System.out.println((float)5/2);//2.5
		System.out.println((float)(5/2));//2.0
	}
}
