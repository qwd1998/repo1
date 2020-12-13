package day04_code.demo01File;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.io.File;

/*java.io.File
文件和目录路径名的抽象表示形式。
java把电脑的文件和文件夹（目录）封装为了一个file类
我们使用file类，可以
创建一个文件/文件夹
删除一个文件/文件夹
获取一个文件/文件夹
判断一个文件/文件夹是否存在
获取文件的大小
File类是一个与系统无关的类，

重点：
file  文件
directory   文件夹/目录
path  路径


static String pathSeparator
          与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
static char pathSeparatorChar
          与系统有关的路径分隔符。
static String separator
          与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
static char separatorChar
          与系统有关的默认名称分隔符。

 */
public class Demo01File {
    public static void main(String[] args) {
        String path = File.pathSeparator;
        System.out.println(path);
        //window 分号  linux：冒号
        String path1 =File.separator;
        System.out.println(path1);
        //window 反斜杠\   linux：正斜杠/
    }

}
