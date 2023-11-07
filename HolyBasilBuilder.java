public class HolyBasilBuilder {
   private String meat;
   private String fishSauce;
   private String garlic;
   private String chili;

   public HolyBasilBuilder(String meat) {
       this.meat = meat;
   }

   public HolyBasilBuilder fishSauce(String fishSauce) {
       this.fishSauce = fishSauce;
       return this;
   }

   public HolyBasilBuilder garlic(String garlic) {
       this.garlic = garlic;
       return this;
   }

   public HolyBasilBuilder chili(String chili) {
       this.chili = chili;
       return this;
   }

   public HolyBasil build() {
       return new HolyBasil(meat, fishSauce, garlic, chili);
   }
}
