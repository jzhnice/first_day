/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-03 11:12
 */


/**
 * 计算机中不同进制的使用说明
 *
 * 对于整数
 * ①二进制：有0和１两个基本数，运算规则：逢二进一。
 * ②十进制：有0 1 2 3 4 5 6 7 8 9十个基本数，运算规则：逢十进一。
 * ③八进制： 有0 1 2 3 4 5 6 7八个基本数，运算规则：逢八进一。
 * ④十六进制：有0－9、A-F共16个基本数，运算规则：逢16进一。
 * */


public class jinzhi {
    public static void main(String[] args) {
        int num1 = 0b110;
        int num2 = 110;
        int num3 = 0127;
        int num4 = 0x110A;
        System.out.println("num1 = " +num1);
        System.out.println("num2 = " +num2);
        System.out.println("num3 = " +num3);
        System.out.println("num4 = " +num4);
    }
}
