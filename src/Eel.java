public class Eel extends Fish {

    public Eel(double height, double weight, String animalType, char bloodlType, String where, String feature) {
        super(height, weight, animalType, bloodlType, where, feature);
    }

    
    public Eel(double height, double weight, String animalType, char bloodlType) {
        super(height, weight, animalType, bloodlType, "Release electric charge");
    }

    public String Showinfo() {
        return "Eel [height = " + getHeight() + 
            ", weight = " + getWeight() + 
            ", animalType = " + getAnimalType() + 
            ", bloodType = "+ getBloodlType() + 
            
            ", where = " + getWhere() + 
            ", feature = " + getFeature() + 
            "]";
    }
    
}
