/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-03 10:20
 */


/**
 * String类型变量的的使用
 * 1.String属于引用类型 ，翻译为字符串
 * 2.声明String类型变量时，使用一对”“
 * 3.String可以和八种基本数据类型变量做运算，且运算只能是连接运算
 * 4.运算的结果仍然是String
 */
public class zifuchuan {
    public static void main(String[] args) {
        String s1 = "hello";

        String s2 = "a";
        String s3 = "";

        System.out.println("hello \tworld");

        String numberStr = "学号";
        int number = 1001;
        String info = number + numberStr;
        boolean b1 = true;
        String info1 = info + b1;
        System.out.println(info1);

        /***********************************************/

// 练习1
        char c = 'a'; // a=97 A = 65
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str);  // 107hello  假发运算
        System.out.println(c + str + num); // ahello10
        System.out.println(c + (num + str));//    a10hello
        System.out.println((c + num) + str);//       107hello
        System.out.println(str + c + num);//    helloa10

       // 练习2
       // * *
        System.out.println("* *"); //true
        System.out.println('*' + '\t' +'*');   // false
        System.out.println('*' + "\t" +'*');//true
        System.out.println('*' + '\t' +"*");//false
        System.out.println('*' + ('\t' +"*")); //true


    }
}
