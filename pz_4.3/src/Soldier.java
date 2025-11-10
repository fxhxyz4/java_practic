public class Soldier {
    private String name;
    private String role;     // sniper, medic, engineer
    private int stamina;
    private int ammo;

    public Soldier() {
    }

    public Soldier(String name, String role, int stamina, int ammo) {
        this.name = name;
        this.role = role;

        this.stamina = stamina;
        this.ammo = ammo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public void attack() { System.out.println(name + " attacks!"); }
    public void reload() { System.out.println(name + " reloads!"); }
    public void rest()   { System.out.println(name + " rests"); }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", stamina=" + stamina +
                ", ammo=" + ammo +
                '}';
    }
}