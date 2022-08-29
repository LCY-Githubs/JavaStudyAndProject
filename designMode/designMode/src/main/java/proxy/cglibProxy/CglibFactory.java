package proxy.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 新建工厂类，即ProxyFactory，该工厂就是用来获取代理对象的，所以我们应该在该工厂类中定义一个获取代理对象的方法，此时，使用CGLIB进行代理的话，获得的代理类就是目标对象所属类的子类。
 *
 * 使用CGLIB来进行代理：
 *
 * 1.创建Enhancer类对象，该类类似于JDK动态代理中的Proxy类。它就是用来获取代理对象的。注意该类是属于CGLIB里面的，所以我们要导入相对应的包。
 * 2.设置父类的字节码对象。使用CGLIB生成的代理类是属于目标类的子类的，也就是说代理类是要继承自目标类的。
 * 3.设置回调函数。
 */
public class CglibFactory<T> implements MethodInterceptor {

    private T o;

    public CglibFactory(T o) {
        this.o = o;
    }

    //获取代理对象的方法
    public T  getProxy(){
        //1.创建Enhancer 类对象
        Enhancer enhancer = new Enhancer();
        //2.设置父类的字节码对象
        enhancer.setSuperclass(o.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建代理对象
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if ("makeCloth".equals(method.getName())){
            System.out.println("制作服装前的准备");
        }
        //调用业务代码
        Object in = methodProxy.invokeSuper(o, objects);
        //后置处理器
        if ("makeCloth".equals(method.getName())){
            System.out.println("对制造好的衣服进行打包处理");
        }

        return in;
    }
}
