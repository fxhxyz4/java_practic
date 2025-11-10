public class Unit {
    private String name;
    private String type;     // infantry, artillery, recon, etc.
    private int range;
    private int ammo;
    private double accuracy;
    private double morale;

    public Unit() {}

    public Unit(String name, String type, int range, int ammo, double accuracy, double morale) {
        this.name = name;
        this.type = type;
        this.range = range;
        this.ammo = ammo;
        this.accuracy = accuracy;
        this.morale = morale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public double getMorale() {
        return morale;
    }

    public void setMorale(double morale) {
        this.morale = morale;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", range=" + range +
                ", ammo=" + ammo +
                ", accuracy=" + accuracy +
                ", morale=" + morale +
                '}';
    }

}