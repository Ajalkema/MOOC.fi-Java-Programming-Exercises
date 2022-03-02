public class Bird {
    private String name;
    private String latinName;
    private int birdCount = 0;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public void birdCountPlus() {
        this.birdCount++;
    }

    public boolean isEqual(Bird bird) {
        if (!(this.name.equals(bird.getName()))) return false;
        if (!(this.latinName.equals(bird.getLatinName()))) return false;
        return true;
    }

    public String toString() {
        return name + " (" + latinName + "): " + birdCount + " observations";
    }
}
