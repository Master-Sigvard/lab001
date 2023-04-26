public abstract class ACompany {
    public abstract IPerepustka createPerepustka();

    public abstract IOrder createOrder();

    public String doSomeStuff() {

        IOrder ord1 = createOrder();
        IPerepustka prp1 = createPerepustka();

        return ord1.getOrderInfo() + " " + prp1.getPerepustkaInfo();
    }
}
