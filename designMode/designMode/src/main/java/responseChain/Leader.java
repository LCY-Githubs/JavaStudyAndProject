package responseChain;

public class Leader extends AbstractHandler {

    public Leader(int maxAmount, String name) {
        super(maxAmount, name);
    }

    @Override
    void agree(int amount) {
        System.out.println(name + ":这批贷款由<组长>审批通过，贷款金额为：" + amount);
    }
}
