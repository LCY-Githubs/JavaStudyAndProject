package proxy.dynamicProxy;

public class Swift implements Star {

    private String name;

    public Swift(String name) {
        this.name = name;
    }

    @Override
    public String sing() {
        System.out.println(name + "明星会唱歌");
        return "唱得好";
    }

    @Override
    public void dance(String code) {
        System.out.println(code + "会跳舞");
    }
}
