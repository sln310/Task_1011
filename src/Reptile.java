public class Reptile extends Animal {
    
    private String skinType;
    private String bone  ;
    private String eggType ;

    
    public Reptile(double height, double weight, String animalType, char bloodlType) {
        super(height, weight, animalType, bloodlType);
        skinType = "Dry Skin";
        bone = "Backbone";
        eggType = "Soft-shelled eggs";
    }

    


    public Reptile(double height, double weight, String animalType, char bloodlType, String eggType) {
        super(height, weight, animalType, bloodlType);
        this.eggType = eggType;
    }




    public Reptile(double height, double weight, String animalType, char bloodlType, String skinType, String bone,
            String eggType) {
        super(height, weight, animalType, bloodlType);
        this.skinType = skinType;
        this.bone = bone;
        this.eggType = eggType;
    }


    public String getSkinType() {
        return skinType;
    }


    public String getBone() {
        return bone;
    }


    public String getEggType() {
        return eggType;
    }



}

