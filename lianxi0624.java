/*题目描述
已知某公司总人数为W，平均年龄为Y岁(每年3月末计算，同时每年3月初入职新人)，假设每年离职率为x，
x>0&&x<1,每年保持所有员工总数不变进行招聘，新员工平均年龄21岁。
从今年3月末开始，请实现一个算法，可以计算出第N年后公司员工的平均年龄。(最后结果向上取整)。
输入描述:
输入W Y x N
输出描述:
输出第N年后的平均年龄

示例1
输入

5 5 0.2 3

输出
15
*/
package lianxi0624;

import java.util.Scanner;

public class lianxi0624 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int w = sc.nextInt();
            int y = sc.nextInt();
            double x = sc.nextDouble();
            int n = sc.nextInt();
            double avgAge = y;
            for(int i=0;i<n;i++){
                avgAge = (1.0-x)*(avgAge+1.0)+x*21.0;
            }
            System.out.println((int)Math.ceil(avgAge));
        }
    }
}
