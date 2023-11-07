class Main {
  public static void main(String[] args) {
    HolyBasil dish1 = new HolyBasil.HolyBasilBuilder("Pork")
    .fishSauce("นิดเดียว")
    .garlic("เยอะๆ")
    .chili("ไม่พริก")
    .build();
 
    System.out.println(dish1);
 
    HolyBasil dish2 = new HolyBasil.HolyBasilBuilder("Chicken")
    .chili("ขอเผ็ดๆ")
    .build();
 
    System.out.println(dish2);
 
    HolyBasil dish3 = new HolyBasil.HolyBasilBuilder("Shimp")
    .build();
 
    System.out.println(dish3);
}
}