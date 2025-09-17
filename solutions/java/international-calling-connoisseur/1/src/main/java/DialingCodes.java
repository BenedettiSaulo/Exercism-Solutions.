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
        if (dialingCodesMap.containsValue(country)) {
            for(Entry<Integer, String> entry : dialingCodesMap.entrySet()) {
                if (entry.getValue().equals(country)) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (getCountry(code) != null) {
            return;
        }

        Integer oldCode = findDialingCode(country);

        if (oldCode != null) {
            dialingCodesMap.remove(oldCode);
            setDialingCode(code, country);
        }
    }
}
