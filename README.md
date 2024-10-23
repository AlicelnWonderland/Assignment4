# Assignment4


### Explanation:
- **Visitor** interacts with different elements (`ConcreteElementA` and `ConcreteElementB`).
- For each element, **Visitor** calls a `visit()` method.
- Inside each element’s `visit()` method, the corresponding operation is executed.

## Visitor Pattern

<pre>
Visitor
   |
   |----> visit(ConcreteElementA)
   |                 |
   |                 ----> operationA() [ConcreteElementA]
   |
   |----> visit(ConcreteElementB)
                     |
                     ----> operationB() [ConcreteElementB]
</pre>
