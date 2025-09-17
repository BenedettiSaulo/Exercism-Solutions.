public class Twofer {
    public String twofer(String name) {
        StringBuilder sb = new StringBuilder();
		sb.append("One for ");
		sb.append(name == null || name.isEmpty() ? "you" : name);
		sb.append(", one for me.");
		return sb.toString();
    }
}
