package day03_code.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) /*throws ParseException  第一种方法*/ {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = null;
        try {
            parse = sdf.parse("1999-01-25");//可能产生异常的代码
        } catch (ParseException e) {
            e.printStackTrace();
        }//try{}catch{}  第二种方法
        System.out.println(parse);//产生异常对象对象之后，怎么处理对象，一般在工作中，把异常的信息记录在日志中
    }
}
