package responseChain;

public class Main {

    public static void main(String[] args) {
        ConcreteHandler handler = new ConcreteHandler(100, "职员");
        Leader leader = new Leader(1000, "组长");
        Manager manager= new Manager(10000, "经理");
        handler.setNextHandler(leader);
        leader.setNextHandler(manager);
        handler.handleLoan(5000);
    }
}
