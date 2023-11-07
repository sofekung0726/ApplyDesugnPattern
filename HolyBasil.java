public class HolyBasil {
   private final String meat;
   private final String fishSauce;
   private final String garlic;
   private final String chili;

   public HolyBasil(String meat, String fishSauce, String garlic, String chili) {
       this.meat = meat;
       this.fishSauce = fishSauce;
       this.garlic = garlic;
       this.chili = chili;
   }

   public String getMeat() {
       return meat;
   }

   public String getFishSauce() {
       return fishSauce;
   }

   public String getGarlic() {
       return garlic;
   }

   public String getChili() {
       return chili;
   }

   @Override
   public String toString() {
       String order = "HolyBasil "+this.meat + ", fishSauce:"+this.fishSauce+", garlic:"+this.garlic+", chili:"+this.chili;
       return order;
   }
}
