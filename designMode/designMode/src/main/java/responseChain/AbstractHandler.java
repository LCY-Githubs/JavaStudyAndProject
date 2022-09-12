package responseChain;

public abstract class AbstractHandler {

    public int maxAmount;

    public String name;

    public AbstractHandler(int maxAmount, String name) {
        this.maxAmount = maxAmount;
        this.name = name;
    }

    private AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final void handleLoan(int amount) {
        if (this.maxAmount > amount) {
            this.agree(amount);
        }else {
            if (nextHandler!=null){
                System.out.println(this.name+":贷款已超过我的审批权限，已提交由我的上级审批");
                nextHandler.handleLoan(amount);
            }else {
                System.out.println("贷款额度过大，审核不通过");
            }
        }
    }

    //  审批动作：子类来实现
    abstract void agree(int amount);
}
