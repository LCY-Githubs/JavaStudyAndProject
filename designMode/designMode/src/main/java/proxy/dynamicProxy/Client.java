package proxy.dynamicProxy;

public class Client {
    public static void main(String[] args) {
        Swift swift = new Swift("swift");
        StarProxy invoke = new StarProxy(swift);
        Star proxy = (Star)invoke.createProxy();
        proxy.dance("sdasd");
        proxy.sing();
    }
}
