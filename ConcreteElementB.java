public class ConcreteElementB implements Element {
    public void operationB() {
        System.out.println("ConcreteElementB operation");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
