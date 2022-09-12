package responseChain;

public class Manager extends AbstractHandler{

    public Manager(int maxAmount, String name) {
        super(maxAmount, name);
    }

    @Override
    void agree(int amount) {
        System.out.println(name + ":这批贷款由<经理>审批通过，贷款金额为：" + amount);
    }
}
