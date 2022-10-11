public class Crocodile extends Reptile {

    public Crocodile(double height, double weight, String animalType, char bloodlType) {
        super(height, weight, animalType, bloodlType, "Hard-shelled eggs");//Reptile()
        // eggType = "Hard-shelled eggs";
    }

    public Crocodile(double height, double weight, String animalType, char bloodlType, String skinType, String bone,
            String eggType) {
        super(height, weight, animalType, bloodlType, skinType, bone, eggType);
    }
    
    public String Showinfo() {
        return "Crocodile [height = " + getHeight() + 
            ", weight = " + getWeight() + 
            ", animalType = " + getAnimalType() + 
            ", bloodType = "+ getBloodlType() + 
            
            ", skinType = " + getSkinType() + 
            ", bone = " + getBone() + 
            ", eggType = " + getEggType() + 
            "]";
    }


}
