package edu.xcdq;

/**
 * 标识符的使用
 * 1：标识符 凡是自己可以其名字的地方都叫做标识符
 * 比如：类名、变量名、方法名、接口名、包名
 * <p>
 * 2：标识符的命名规则  --> 如果不遵守如下的规则，编译不通过
 * >由26个英文字母大小写。0-9._或 $ 组成
 * >数字不可以开头
 * >不可以使用关键字和保留字，但能包含关键字和保留字
 * >Java中严格区分大小写。长度无限制
 * >标识符不能包含空格
 * <p>
 * 3: java中的名称命名规范 -->如果不遵守以下的规范，编译可以通过。建议大家遵守
 * >包名：多单词组成时所有字母都小写：xxxyyyzzz
 * >类名、接口名：多单词组成时、所有单词的首字母大写：XxxYxxZzz
 * >变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写xxxYyyZzz
 * >常量名：所有字母都大写。多单词每个单词用下划线连接：XXX_YYY_ZZZ
 * 4：注意
 * 注意1：在起名字的时候，为了提高阅读性，要尽量有意义，“见名如意”
 * 注意2：Java采用Unicode字符集，因此标识符也可以使用汉字声明，但是不建议用
 */
class IdentiferTeset {

    public static void main(String[] args) {

    }

}

class hello_$ {

}

class static1 {

}