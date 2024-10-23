public class ConcreteElementA implements Element {
    public void operationA() {
        System.out.println("ConcreteElementA operation");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
