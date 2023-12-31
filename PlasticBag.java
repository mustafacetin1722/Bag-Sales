public class PlasticBag extends Bag{
    private double tax;

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public double getPrice() {
        double area=getLenght()*getWidht();
        if (area>250){
            price=0.3;
        }
        else {
            price=0.2;
        }
        return price+tax;

    }
}
