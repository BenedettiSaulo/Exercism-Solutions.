import java.util.LinkedHashMap;
import java.util.Map;

class ResistorColor {
    private final Map<String, Integer> colorCodeMap;

    ResistorColor() {
        this.colorCodeMap = new LinkedHashMap<>();
        this.colorCodeMap.put("black", 0);
        this.colorCodeMap.put("brown", 1);
        this.colorCodeMap.put("red", 2);
        this.colorCodeMap.put("orange", 3);
        this.colorCodeMap.put("yellow", 4);
        this.colorCodeMap.put("green", 5);
        this.colorCodeMap.put("blue", 6);
        this.colorCodeMap.put("violet", 7);
        this.colorCodeMap.put("grey", 8);
        this.colorCodeMap.put("white", 9);
    }

    int colorCode(String color) {
        return this.colorCodeMap.get(color);
    }

    String[] colors() {
        return this.colorCodeMap.keySet().toArray(String[]::new);
    }
}
