public class Main {
    public static void main(String[] args) {
        HolyBasil holyBasil1 = new HolyBasilBuilder("Pork")
                .fishSauce("Soy Sauce")
                .garlic("Lots of Garlic")
                .chili("Spicy")
                .build();

        System.out.println(holyBasil1);
        System.out.println("Meat: " + holyBasil1.getMeat());
        System.out.println("Fish Sauce: " + holyBasil1.getFishSauce());
        System.out.println("Garlic: " + holyBasil1.getGarlic());
        System.out.println("Chili: " + holyBasil1.getChili());
    }
}
