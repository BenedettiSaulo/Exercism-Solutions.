public class GameMaster {

    public String describe(Character character) {
        return String.format("You're a level %d %s with %d hit points.", character.getLevel(), character.getCharacterClass(), character.getHitPoints());
    }

    public String describe(Destination destination) {
        return String.format("You've arrived at %s, which has %d inhabitants.", destination.getName(), destination.getInhabitants());
    }

    public String describe(TravelMethod travelMethod) {
        return "You're traveling to your destination " + (travelMethod == TravelMethod.HORSEBACK ? "on horseback." : "by walking.");
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character).concat(" ").concat(describe(travelMethod)).concat(" ").concat(describe(destination));
    }

    public String describe(Character character, Destination destination) {
        return describe(character).concat(" ").concat(describe(TravelMethod.WALKING)).concat(" ").concat(describe(destination));
    }
}
