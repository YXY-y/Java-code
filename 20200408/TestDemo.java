
public class TestDemo{

	/**
	 * 类型转换
	 * 1、隐式类型转换：把一个小类型  给  大类型
	 * 2、显式类型转换：把一个大类型  强制转换  为小类型
	 * int  和 boolean 不能互相转换
	 * int 转换 byte ，要在byte的取值范围内
	 *
	 * int和String互转
	 * @param args [description]
	 */
	public static void main(String[] args) {
		//隐式
		int a = 10;
		long b =a;
		System.out.println(b);

		//显式
		long c = 10L;
		int d = (int)c;
		System.out.println(d);

		//int e = 10;
		//boolean f = e;//错误: 不兼容的类型: int无法转换为boolean
		
		//int 转换为 String
		int num1 = 10;
		//方法一
		String str1 = num1 + "";
		System.out.println(str1);
		//方法二
		String str2 = String.valueOf(num1);
		System.out.println(str2);

		//String 转换为 int
		String str = "100";
		int num = Integer.parseInt(str);
		System.out.println(num);
	}

	/**
	 * 常量只能被初始化一次且使用时一定要初始化
	 * 常量：
	 * 1、字面常量
	 * 2、final修饰的常量
	 * @param args [description]
	 */
	public static void main11(String[] args) {
		final int MAXNUM = 10;//常量名的字母全用大写
		//MAXNUM = 999;//错误: 无法为最终变量MAXNUM分配值
		//常量只能被初始化一次
		System.out.println(MAXNUM);
	}

	/**
	 * 小于4字节的数据类型 运算的时候会发生 类型的提升
	 * @param args [description]
	 */
	public static void main10(String[] args) {
		byte b =10;
		byte c =20;
		//byte d =b + c;
		byte d =(byte)(b + c);
		System.out.println(d);
		//报错：不兼容的类型 从int转换到byte可能会有损失
		//4字节以下类型运算时先转换为int类型
		//计算机的CPU按4字节读取数据，诸如byte、short类型会先提升为整型再参与计算
		//b+c强制转换为byte类型  或者  b c d 改为int类型 
	}

//java中的数据类型：
//1、基本类型
//2、引用类型:类 String 数组 抽象类 接口 枚举

	/**
	 * 字符串类型 String
	 * 引用类型
	 * @param args [description]
	 */
	public static void main9(String[] args) {
		String str1 = "hello";
		System.out.println(str1);
		String str2 = "\\hello\\";//转义字符
		System.out.println(str2);

		//字符串的拼接
		String a = "hello";
		String b = "world";
		String c = a + b;
		System.out.println(c);

		int d = 10;
		int e = 20;
		System.out.println("d = " + d + ",e = " + e) ;
	}

//java中的8种基本类型：
//数据类型  byte   char    short   int   long float double boolean
//包装类    Byte Character Short Integer Long Float Double Boolean
//字节数      1      2       2     4       8    4     8      没有

	/**
	 * 布尔类型 boolean
	 * 1、在Java当中，布尔类型没有明确的大小
	 * 2、在Java当中，布尔类型只有两个取值 true 和 false
	 * 3、在Java当中，没有所谓的0是假，1是真。真只有true，假只有false
	 * @param args [description]
	 */
	public static void main8(String[] args) {
		boolean flg = true;
		System.out.println(flg);
	}

	/**
	 * 短整型  short  2字节
	 * 取值范围: -32768~32767
	 * @param args [description]
	 */
	public static void main7(String[] args) {
		short sh = 12;
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
	}

	/**
	 * 字节类型 byte  1字节  
	 * 数值类型  取值范围:-128~127
	 * 每一种数据类型给它赋值时不能超过它的取值范围
	 * @param args [description]
	 */
	public static void main6(String[] args) {
		byte b = 12;
		byte c = 21;
		System.out.println(b+" "+c);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		//byte d = Byte.MAX_VALUE+1;
		//System.out.println(d);
		//报错：不兼容的类型 从byte转换到int可能会有损失
		
		System.out.println(Byte.MAX_VALUE+1);
		//打印结果：128
		//原因：println默认是以整型打印的，所以不是-128
		
		byte d = 127;//最大值127
	}

	/**
	 * 字符类型 char 2字节   
	 * 取值范围：0-65535
	 * java中的Unicode字符集--->比c语言中的ASCII码包含更多
	 * @param args [description]
	 */
	public static void main5(String[] args) {
		char ch1 = 'a';
		System.out.println(ch1);

		char ch2 = '杨';//汉字  2字节
		System.out.println(ch2);

		char ch3 = 97;//Unicode字符集
		System.out.println(ch3);
	}

	/**
	 * 单精度浮点型 float 4字节
	 * 1、double   8字节
	 * 2、float    4字节
	 * @param args [description]
	 */
	public static void main4(String[] args){
		//float f = 12.5;//b12.5默认是double
		//System.out.println(f);//报错：不兼容 double到float可能会用损失
		float f = 12.3f;
		System.out.println(f);
		//体现了java安全  
		//java是一个强类型语言  c语言是一个弱类型语言
	}

	/**
	 * 双精度浮点型 double 8字节
	 * @param args [description]
	 */
	public static void main3(String[] args){
		double d = 12.5;//12.5默认是双精度类型
		System.out.println(d);
		System.out.println("最大值：" + Double.MAX_VALUE);
		System.out.println("最小值：" + Double.MIN_VALUE);
		int a = 1;
		int b = 2;
		System.out.println(a / b);//执行结果： 0  原因：a和b都是整型
		//double a = 1;
		//double b = 2;
		//System.out.println(a / b);
		//执行结果： 0.5
		
		double num = 1.1;
		System.out.println(num*num);
		//执行结果：1.2100000000000002
		//原因:精度的原因       浮点数在内容中的存储
		//一般情况 如果遇到小数 建议使用double
		//小数没有精确值
	}

	/**
	 * String[] args作用是什么？ 运行时命令行参数
	 * @param args [description]
	 */
	public static void main2(String[] args){

		for(int i = 0;i < args.length; i++){
			System.out.println(args[i]);
		}
		System.out.println("kaixin");
	}
	//运行时java TestDemo
	//kaixin

	//运行时java TestDemo wo he
	//wo
	//hen
	//kaixin

	/**
	 * 长整型
	 * @param args [description]
	 */
	public static void main1(String[] args){

		long a=10L;//长整型 8字节

		System.out.println(a);
		System.out.println("最大值：" + Long.MAX_VALUE);//+表示拼接
		System.out.println("最小值：" + Long.MIN_VALUE);

		int b=10;
		int c=20;
		System.out.println(b+c);//30
		System.out.println("hahaha" + b + c);//hahaha1020
		//注意：任何类型的数据   和  字符串拼接  结果就是字符串
		System.out.println("hahaha" +(b + c));//hahaha30
	}
}