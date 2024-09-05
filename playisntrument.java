public class playisntrument {
    public static void main(String[] args) {
        instrument a = new instrument("Guitar", 101.5);
        instrument b = new instrument("Piano", 200.0);
        instrument c = new instrument("Violin", 150.9);


        a.setType("guitar");
        a.setPrice(101.5);
        a.print();
        b.print();
        c.print();

        if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("Harga guitar paling murah");
        }else if (b.getPrice() < c.getPrice() && b.getPrice() > a.getPrice()) {
            System.out.println("Harga piano paling murah");
        }else {
            System.out.println("Harga violin paling murah");
        }

        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("Harga guitar paling mahal");
        }else if(b.getPrice() < c.getPrice() && b.getPrice() < a.getPrice()){
            System.out.println("harga violin paling mahal");
        }else {
            System.out.println("harga piano paling mahal");
        }
    }
}
