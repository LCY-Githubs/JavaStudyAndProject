package proxy.cglibProxy;

public class Client {

    public static void main(String[] args) {
        NaikeCloth cloth = new NaikeCloth();
        CglibFactory<NaikeCloth> factory = new CglibFactory<>(cloth);
        NaikeCloth proxy = factory.getProxy();
        proxy.makeCloth("liuchengyi");
        String brand = proxy.brand();
        System.out.println(brand);
    }
}
