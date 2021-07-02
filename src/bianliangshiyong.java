/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-02 16:36
 */



/**
 * 基本数据之间的运算规则

 * 前提：这里讨论的只是7种基本数据类型变量间的运算。不包含Boolean类型
 * <p>
 * 1.自动类型提升
 * 当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型
 * byte 、char、short -> int  -> long ->  float ->double
 * 特别的：当byte、char、short三种类型的变量做运算时，结果为int型
 * <p>
 * 2.强制类型转换
 * 自动类型提升运算的逆运算
 * 需要使用强转符 （）：
 * 注意点：强制类型转换 可能导致精度损失
 * <p>
 * 说明：此时的容量大小指的是，表示数的范围大大和小。比如float容量要大于long的容量
 */
public class bianliangshiyong {
    public static void main(java.lang.String[] args) {
//        *****************************************
        /**              自动类型提升              */
        System.out.println("hello world");
        byte b1 = 2;
        int i1 = 12;
        int b2 = b1 + i1;
        // 编译不通过
        // byte b2 = b1+i1;
        long l1 = b1 + i1;

        float f = b1 + i1;
        System.out.println(b2);

        short s1 = 123;
        double d1 = s1;
        System.out.println(d1);
        //********************8
        char c1 = 'a';
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

        short s2 = 10;
        //short s3 = c1+s2; 编译不通过
        //char c2 = c1+s2;编译不通过

        byte b3 = 10;
        //char c3= c1+b3;编译不通过
        // short s3 =  b3+s2;编译不通过
//        **********************************
        /**            强制类型转换                                   */
        double d2 = 12.9;
        // 精度损失举例1
        int i2 = (int) d2; // 截断操作
        System.out.println(i2);
        // 没有精度损失
        long l2 = 123;
        short s3 = (short) l2;

        // 精度损失举例2
        int i5 = 128;
        byte b = (byte) i5;
        System.out.println(b); // -128

//        变量运算规则的两个特殊情况
//    编码情况1
        long l = 123213;
        System.out.println(l);
        // 编译失败：过大的整数 不超过的时候用的是int
        //long l5 = 2313241421441421414;
        long l4 = 2313241421441421414L;

//        编码情况2
//                整形常量：默认类型为int型
//                浮点型常量，默认为double 型
        byte ba = 12;
//        byte b5 = b +1;
//float f4 = b+12.3;



    }

}
