package day_code.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo02 {
    /*
* 框架：半成品软件。可以在框架的基础上进行软件开发，简化编码
	* 反射：将类的各个组成部分封装为其他对象，这就是反射机制
		* 好处：
			1. 可以在程序运行过程中，操作这些对象。
			2. 可以解耦，提高程序的可扩展性。


	* 获取Class对象的方式：
		1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
			* 多用于配置文件，将类名定义在配置文件中。读取文件，加载类
		2. 类名.class：通过类名的属性class获取
			* 多用于参数的传递
		3. 对象.getClass()：getClass()方法在Object类中定义着。
			* 多用于对象的获取字节码的方式

		* 结论：
			同一个字节码文件(*.class)在一次程序运行过程中，只会被加载一次，不论通过哪一种方式获取的Class对象都是同一个。


	* Class对象功能：
		* 获取功能：
			1. 获取成员变量们
				* Field[] getFields() ：获取所有public修饰的成员变量
				* Field getField(String name)   获取指定名称的 public修饰的成员变量

				* Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
				* Field getDeclaredField(String name)
			2. 获取构造方法们
				* Constructor<?>[] getConstructors()
				* Constructor<T> getConstructor(类<?>... parameterTypes)

				* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
				* Constructor<?>[] getDeclaredConstructors()
			3. 获取成员方法们：
				* Method[] getMethods()
				* Method getMethod(String name, 类<?>... parameterTypes)

				* Method[] getDeclaredMethods()
				* Method getDeclaredMethod(String name, 类<?>... parameterTypes)

			4. 获取全类名
				* String getName()


	* Field：成员变量
		* 操作：
			1. 设置值
				* void set(Object obj, Object value)
			2. 获取值
				* get(Object obj)

			3. 忽略访问权限修饰符的安全检查
				* setAccessible(true):暴力反射


	* Constructor:构造方法
		* 创建对象：
			* T newInstance(Object... initargs)

			* 如果使用空参数构造方法创建对象，操作可以简化：Class对象的newInstance方法


	* Method：方法对象
		* 执行方法：
			* Object invoke(Object obj, Object... args)

		* 获取方法名称：
			* String getName:获取方法名
     */
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
     /*
     获取构造方法们
				* Constructor<?>[] getConstructors()
				* Constructor<T> getConstructor(类<?>... parameterTypes)

				* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
				* Constructor<?>[] getDeclaredConstructors()
      */
        Constructor<Person> constructor = personClass.getConstructor(String.class,int.class);
        System.out.println(constructor);
        Person person = constructor.newInstance("张三", 28);
        System.out.println(person);
        System.out.println("===============");
        Constructor<Person> constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        Person person1 = constructor1.newInstance();
        person1.setName("我的");
        System.out.println(person1);
        Person person2 = personClass.newInstance();
        System.out.println(person2);

    }
}

