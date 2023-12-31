public class PaperBag extends Bag{
    public double getPrice(){
        double area=getLenght()*getWidht();
        if (area>300.0){
            price=0.2;
        }
        else {
            price=0.12;
        }
        return price;
    }
}
