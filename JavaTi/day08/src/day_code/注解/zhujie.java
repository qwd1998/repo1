package day_code.注解;

import java.lang.annotation.*;

@Target(value = {ElementType.TYPE}) //描述注解能够作用的位置
@Retention(RetentionPolicy.RUNTIME) //描述注解被保留的阶段
@Documented //描述注解是否被抽取到API文档

@Inherited  //描述注解是否被子类继承
public @interface zhujie {
}
