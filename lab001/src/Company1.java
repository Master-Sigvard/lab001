public class Company1 extends ACompany {

    @Override
    public IPerepustka createPerepustka() {
        return new Perepustka1();
    }

    @Override
    public IOrder createOrder() {
        return new Order1();
    }
}
