package day_code.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/*
* 案例：
		* 需求：写一个"框架"，不能改变该类的任何代码的前提下，可以帮我们创建任意类的对象，并且执行其中任意方法
			* 实现：
				1. 配置文件
				2. 反射
			* 步骤：
				1. 将需要创建的对象的全类名和需要执行的方法定义在配置文件中
				2. 在程序中加载读取配置文件
				3. 使用反射技术来加载类文件进内存
				4. 创建对象
				5. 执行方法
 */
@Pro(className = "day_code.reflect.Demo01",methodName = "show")
public class ReflectTest02 {
    public static void main(String[] args) throws Exception{
        //获取该类的字节码文件
        Class<ReflectTest02> cls = ReflectTest02.class;
        //获取上边的注解对象
        Pro annotation = cls.getAnnotation(Pro.class);
        //调用注解对象中定义的抽象方法
        String className = annotation.className();
        String methodName = annotation.methodName();

        //3.加载该类进内存，
        Class aClass = Class.forName(className);
        //4.创建对象
        Object o = aClass.newInstance();
        //5.获取方法对象
        Method method = aClass.getMethod(methodName);
        //6.执行方法
        method.invoke(o);

    }
}
