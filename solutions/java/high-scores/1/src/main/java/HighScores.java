import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {
    private final List<Integer> scores;

    public HighScores(List<Integer> highScores) {
        this.scores = new ArrayList<>(highScores);
    }

    List<Integer> scores() {
        return this.scores;
    }

    Integer latest() {
        return this.scores.get(this.scores.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(scores);
    }

    List<Integer> personalTopThree() {
        List<Integer> ordenedScores = new ArrayList<>(scores());
        Collections.sort(ordenedScores, Collections.reverseOrder());
        return ordenedScores.subList(0, Math.min(3, ordenedScores.size()));
    }
}
