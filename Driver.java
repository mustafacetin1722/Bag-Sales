public class Driver {
    public static void main(String[] args) {

        PaperBag paperBag=new PaperBag();
        paperBag.setLenght(10.0);
        paperBag.setWidht(20.0);
        System.out.println(paperBag.getPrice());


        PlasticBag plasticBag=new PlasticBag();
        plasticBag.setWidht(15.4);
        plasticBag.setLenght(25.5);
        plasticBag.setTax(0.2);
        System.out.println(plasticBag.getPrice());
    }
}