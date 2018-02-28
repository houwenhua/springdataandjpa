package top.hwh228.utils;

import java.util.Scanner;
import org.junit.Test;
/**
 * Created with IDEA
 * author:houwenhua
 * Date:2018/2/28 0028
 * Time:下午 4:04
 */
public class TestHello {

    /**
     * int time=1;
     float contribution,totall=0.0;
     while(1)
     {
     printf("请输入第%d次的捐款:\n",time);
     scanf("%d",&contribution);
     totall=contribution+totall;
     time++;
     if(totall>=SUM)	break;
     }
     printf("捐款结束\n");
     return 0;
     * */

    public static void main(String[] args){
        int time=1;
        float contribution=0;
        float totall=0;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("请输入第"+time+"次的捐款:");
            contribution = Float.parseFloat(sc.next());
            totall=contribution+totall;
            time++;
            if(totall>=100000)	break;
        }
        System.out.println("捐款结束\n");
    }
    @Test
    public void test() {
        int time=1;
        float contribution=0;
        float totall=0;
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        System.out.println("输入的数据为：" + str1);
        while(true)
        {
            System.out.println("请输入第"+time+"次的捐款:");
            contribution = Float.parseFloat(sc.next());
            totall=contribution+totall;
            time++;
            if(totall>=100000)	break;
        }
        System.out.println("捐款结束\n");
    }
}
