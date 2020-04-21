/**
 * @program:TestDemo
 * @description
 *
 * @auther:
 * @creat:
 **/
public class TestDemo {

    //青蛙跳台阶
    public static int jumpFloor(int target){
        if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }else{
            return jumpFloor(target-1) + jumpFloor(target-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(jumpFloor(5));
    }

    public static void move(char post1,char post2){
        System.out.print(post1+">"+post2+" ");
    }
    /**
     *
     * @param n  盘子个数
     * @param post1  起始位置
     * @param post2  中途位置
     * @param post3  目的地位置
     */
    public static void hanoi(int n,char post1,char post2,char post3){
        if(n == 1){
            move(post1,post3);
        }else{
            hanoi(n-1,post1,post3,post2);
            move(post1,post3);
            hanoi(n-1,post2,post1,post3);
        }
    }
    public static void main1(String[] args) {
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
    }
}
