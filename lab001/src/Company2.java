public class Company2 extends ACompany {

    @Override
    public IPerepustka createPerepustka() {
        return new Perepustka2();
    }

    @Override
    public IOrder createOrder() {
        return new Order2();
    }
}