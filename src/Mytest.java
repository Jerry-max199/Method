import com.zzjm.SayHello;
import com.zzjm.impl.SayHelloImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Mytest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //SayHello sayHello=new SayHelloImpl();
        //sayHello.say("张安");
        //利用method反射机制获取对象并赋值,核心method(类中的方法)
        SayHello sayHello=new SayHelloImpl();
        //获取say方法，对于method方法。
        Method method=SayHello.class.getMethod("say", String.class);
        //现在我们可以通过method方法来调用say方法
        /*
        invok是method方法下的一个类
        参数
        object：表示对象的，要执行对象的方法
        Object... args：表示方法执行是的参数
        返回值
        object：方法执行后的返回值
         */
        method.invoke(sayHello,"张三");
    }
}
