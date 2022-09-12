package responseChain;

public class ConcreteHandler extends AbstractHandler {

    public ConcreteHandler(int maxAmount, String name) {
        super(maxAmount, name);
    }

    @Override
    void agree(int amount) {
        System.out.println(name + ":这批贷款由<普通职员>审批通过，贷款金额为：" + amount);
    }
}
