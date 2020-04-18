import java.util.Scanner;

public class TestDemo{

	public static void main(String[] args){
		//使用 Scanner 循环读取 N 个数字
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()){
			int num = scan.nextInt();
			System.out.println(num);
		}
	}

	public static void main3(String[] args){
		/*int num = 0;
		do{
			System.out.println("hhh!");//num要被打印一次
		}while(num != 0);*/

		//打印 1 - 10
		int num = 1;
		do{
			System.out.println(num);
			num++;
		}while(num <= 10);
	}

	public static void main2(String[] args){
		//打印 1 - 10 的数字
		/*for(int i = 1;i <= 10;i++){
			System.out.println(i);
		}*/

		//for死循环
		/*for(  ; ; ){
			System.out.println("yyy");
		}*/
		//while死循环
		/*while(true){
			System.out.println("yyy");
		}*/

		/*for(byte i = 1;i <= 130;i++){
			System.out.println(i);//死循环
		}*/


		//计算 1 - 100 的和
		/*int sum = 0;
		for(int i = 1;i <= 100;i++){
			sum +=i;
		}
		System.out.println(sum);*/

		//计算5！
		/*int ret = 1;
		for(int i = 1;i <=5;i++){
			ret *=i;
		}
		System.out.println(ret);*/

		//计算 1! + 2! + 3! + 4! + 5!
		/*int sum = 0;
		int ret = 1;
		for(int i = 1;i <= 5;i++){
			ret *=i;
			sum +=ret;
		}
		System.out.println(sum);*/

		Scanner scan=new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		for(int j = 1;j <= num;j++){
			int ret = 1;
			for(int i = 1;i <= j;i++){
				ret *=i;
			}
			sum +=ret;
		}
		System.out.println(sum);
	}

	public static void main1(String[] args){
		//找到 100 - 200 中第一个 3 的倍数
		/*int num = 100;
		while (num <= 200) {
 			if (num % 3 == 0) {
 			System.out.println("找到了 3 的倍数, 为:" + num);
 			break;
			}
 			num++;
		} */

		//找到第一个既能被 3 整除的数字又能被 5 整除的数字
		
		//break和continue必须用再循环中，break还可以用在switch
		//break----跳出循环，循环结束
		//continue----结束本趟循环，立刻进入下次循环
		int num = 1;
		while(num <= 100){
			if(num % 15 == 0){
				System.out.println(num);
				//break;//
				continue;
			}
			System.out.println("hhh");
			num++;
		}
	}
}