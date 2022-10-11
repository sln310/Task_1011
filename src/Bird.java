public class Bird extends Animal {

    private String appearance;
    private String characteristic;

    public Bird(double height, double weight, String animalType, char bloodlType, String appearance,
            String characteristic) {
        super(height, weight, animalType, bloodlType);
        this.appearance = appearance;
        this.characteristic = characteristic;
    }

    public Bird(double height, double weight, String animalType, char bloodlType) {
        super(height, weight, animalType, bloodlType);
        appearance = "Animals with feathers";
        characteristic = "Can fly";
    
    }

    public String getAppearance() {
        return appearance;
    }

    public String getCharacteristic() {
        return characteristic;
    }
    
    
    
    
}
