public class Eagle extends Bird {

    public Eagle(double height, double weight, String animalType, char bloodlType, String appearance,
            String characteristic) {
        super(height, weight, animalType, bloodlType, appearance, characteristic);
    }

    public Eagle(double height, double weight, String animalType, char bloodlType) {
        super(height, weight, animalType, bloodlType);
    }

    public String Showinfo() {
        return "Eagle [height = " + getHeight() + 
            ", weight = " + getWeight() + 
            ", animalType = " + getAnimalType() + 
            ", bloodType = "+ getBloodlType() + 
            
            ", appearance = " + getAppearance() + 
            ", characteristic= " + getCharacteristic() + 
            "]";
    }
    
}
