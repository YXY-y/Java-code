

/**
 * 文档注释
 * 描述：
 * 如果一个类是public的 那么这个类名 一定和文件名相同  
 * 并且一个java文件当中只能有一个公有的类
 */


/*块注释

 class A{

}
*/
public class HelloWorld{
	
	public static void main(String[] args){

		/*
			1、整型int   4字节  和操作系统没有直接关系
			2、如果一个局部变量没有初始化，那么久不能使用它，会报错   C中是一个随机值
			3、变量/标识符 ：数字 字母 下划线 $    
			    数字不能开头，不建议用$开头，不建议用_开头
 		*/
 	
 		int a=0;

 		System.out.println(a);
 		// int max=Integer.MAX_VALUE+1;//-2147483648
 		// System.out.println(max);
 		// int min=Integer.MIN_VALUE-1;//2147483647
 		// System.out.println(min);

 		// System.out.println(Integer.MAX_VALUE);
 		// System.out.println(Integer.MIN_VALUE);

		// int a=10;
		// System.out.println(a);//打印切换行
		// System.out.print(a);//打印但是不换行
		// System.out.printf("%d\n",a);//以格式化的形式输出内容
	}
}



