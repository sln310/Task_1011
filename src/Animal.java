public class Animal {
    
    double height;
    double weight;
    String animalType;
    char bloodlType;

    public Animal(double height, double weight, String animalType, char bloodlType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodlType = bloodlType;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public char getBloodlType() {
        return bloodlType;
    }
    
    }

