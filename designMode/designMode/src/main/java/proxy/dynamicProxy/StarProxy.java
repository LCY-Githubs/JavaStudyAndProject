package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarProxy implements InvocationHandler {

    //设置代理对象
    Star target;

    public StarProxy(Star target) {
        this.target = target;
    }

    //代理类前后处理方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("让明星唱歌要收钱");
        Object invoke = method.invoke(target, args);
        System.out.println("唱完歌要收拾");
        return invoke;
    }

    public Object createProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }



}
