package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    public Object createProxy(ClassLoader loader,
                              Class<?>[] interfaces,
                              InvocationHandler h){
        return Proxy.newProxyInstance(loader,interfaces,h);
    }
}
