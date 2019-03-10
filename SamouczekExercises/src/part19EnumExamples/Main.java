package part19EnumExamples;

public class Main {
    

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(TshirtSize.L, "Polex");
        System.out.println("chest width - " + tshirt.size.getChestWidth() + ", shitrt length - " + tshirt.size.getShirtLength() + ", sleeve length - " + tshirt.size.getSleeveLength() + " " + tshirt.manufacturer);
    }
}
