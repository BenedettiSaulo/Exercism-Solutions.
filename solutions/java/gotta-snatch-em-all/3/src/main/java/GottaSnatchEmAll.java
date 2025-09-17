import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty()) {
            return false;
        }
        
        return myCollection.size() < theirCollection.size()
            ? myCollection.stream().anyMatch(card -> !theirCollection.contains(card))
            : theirCollection.stream().anyMatch(card -> !myCollection.contains(card));
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        return collections.stream()
            .skip(1)
            .reduce(new HashSet<>(collections.get(0)), (common, set) -> {
                common.retainAll(set);
                return common;
            });
    }

    static Set<String> allCards(List<Set<String>> collections) {
        return collections.stream().flatMap(Set::stream).collect(Collectors.toSet());
    }
}
