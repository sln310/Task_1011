public class Fish extends Animal {

    private String where;
    private String feature ;
    
    public Fish(double height, double weight, String animalType, char bloodlType, String where, String feature) {
        super(height, weight, animalType, bloodlType);
        this.where = where;
        this.feature = feature;
    }

    public Fish(double height, double weight, String animalType, char bloodlType) {
        super(height, weight, animalType, bloodlType);
        where = "Live in water";
        feature = "Has gills";
    
    }

    

    public Fish(double height, double weight, String animalType, char bloodlType, String feature) {
        super(height, weight, animalType, bloodlType);
        this.feature = feature;
    }

    public String getWhere() {
        return where;
    }

    public String getFeature() {
        return feature;
    }
    
    
}
