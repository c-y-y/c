import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        System.out.println("请输入红包金额");
        Scanner inmoney=new Scanner(System.in);
        double money=inmoney.nextDouble();
        System.out.println("请输入红包个数");
        Scanner innum=new Scanner(System.in);
        int num=innum.nextInt();
        double randomnum;
        DecimalFormat s=new DecimalFormat("00.00");
        for (int i=1;i<=num;i++) {
            if (i<num) {
                do{
                    randomnum = Math.random() * money + 0.01;
                }while(randomnum>=money);
                money-=randomnum;
                String a=s.format(randomnum);
            System.out.println("第" + i + "抢到" + a);
            }
            else{
                String b=s.format(money);
               System.out.println("第"+num+"抢到"+b);
            }
        }
    }
}
