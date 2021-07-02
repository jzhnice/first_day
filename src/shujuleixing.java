/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-02 11:27
 */


/**
 *
 * java定义的数据类型
 * 一、变量按照数据类型来分
 *      基本数据类型：
 *          整形：byte\ short\ int\long
 *          浮点型 float\double
 *          字符型:char
 *          布尔型：boolean
 *      引用数据类型
 *      类（class）
 *      接口(interface)
 *      数组(array)
 *
 * 二、变量在类中声明的位置
 * 成员变量 vs 局部变量
 *
 * */
public class shujuleixing {
    public static void main(java.lang.String[] args) {
        //1:整形： byte(1字节=8bit ) short(2字节) \ int（4字节） \ long（8字节）
        //1:byte  范围: -128~127
        byte b1 = 12;
        byte b2 = -128;
        // b2 = 128;  编译不通过
        System.out.println(b1);
        System.out.println(b2);
        //2: 声明long型变量，必须以“l”或“L”结尾
        //3:通常定义整形变量时，使用int性
        short s1 = 128;
        int i1 = 1234;
        long l1 = 3414234324L;
        System.out.println(l1);

        // 2:浮点型：float(四个字节) \double(八个字节)
        //浮点型：表示带小数点的数值
        //float表示数值的范围比long还大
        double d1 = 123.3;
        System.out.println(d1+1);

        // 定义float类型变量时，变量要以“f” 或“F” 结尾
        float f1 = 12.3F;
        System.out.println(f1);
        // 通常定义浮点型变量时，使用double型


        // 3:字符型 ： char(1字符=2字节)
        // 定义char型变量，通常使用一对‘’ 内部只能写一个字符
        char c1 = 'a';
        c1 = 'A';
        //编译不通过
        //c1 = 'AB';
        System.out.println(c1);

        char c2 = '1';
        char c3 = '中';
        char c4 = '是';
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        // 表示方式：1声明一个字符 2.转义字符
        char c5 = '\n'; //换行符
        c5 = '\t'; // 制表符
        System.out.println("hello" +c5 );
        System.out.println("world");

        char c6 = '\u0043';
        System.out.println(c6);

        //4:布尔型 boolean
        // 1:只能取两个值之一： True false
        //2:常常在条件判断、循环结构中使用
        boolean bb1 = true;
        System.out.println(bb1);


        boolean isMarried = true;
        if(isMarried){
            System.out.println("很遗憾，\"你\"不能参加//n ");
        }else{
            System.out.println("你可以");
        }




    }
}
