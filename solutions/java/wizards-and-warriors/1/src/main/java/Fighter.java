class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {
    
    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        }

        return 6;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter {
    private boolean prepared = false;
    
    public void prepareSpell() {
        this.prepared = !prepared;
    }
    
    @Override
    public boolean isVulnerable() {
        return !this.prepared;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if (this.prepared) {
            return 12;
        }

        return 3;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}