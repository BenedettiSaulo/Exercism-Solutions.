import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DialingCodes {

    private Map<Integer, String> dialingCodesMap = new HashMap<>();
    
    public Map<Integer, String> getCodes() {
        return dialingCodesMap;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodesMap.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodesMap.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!dialingCodesMap.containsKey(code) && !dialingCodesMap.containsValue(country)) {
            this.setDialingCode(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        return dialingCodesMap.entrySet().stream().filter(e -> e.getValue().equals(country)).map(Map.Entry::getKey).findFirst().orElse(null);
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = findDialingCode(country);

        if (oldCode != null) {
            dialingCodesMap.remove(oldCode);
            setDialingCode(code, country);
        }
    }
}
