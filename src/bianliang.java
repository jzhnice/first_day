/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-02 11:09
 */



/**
 * 变量的使用
 * 1.Java定义变量的格式：数据类型 变量名 = 变量值
 * 2：说明：
 * 变量必须先声明，后使用
 * 变量都定义在其作用域内。在作用域内，他是有效的。换句话说，出了作用域 就失效了
 * 同一个作用域内，不可以声明两个同名的变量
 * */
public class bianliang {
    public static void main(java.lang.String[] args) {
        // 变量的定义
        int myAge = 12;
        // 变量的使用
        System.out.println(myAge);
        //编译错误，使用变量前并未定义过变量
        //System.out.println(myNumber);
        //变量的声明
        int myNumber;
        //编译错误，使用变量前并未赋值过变量
        //System.out.println(myNumber);
        //变量的赋值
        myNumber = 1001;

       // System.out.println(myClass);
    }
    public void method(){
        int myClass = 1;

    }
  //  class bianliang {}  //逆转思维，反证法
}
