import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Graph {
    List<Node> nodes;
    List<Edge> edges;
    Map<String, String> attributes;


    public Graph() {
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        attributes = Map.of();
    }

    public Graph(Map<String, String> attributes) {
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        this.attributes = attributes;
    }

    public Collection<Node> getNodes() {
        return this.nodes;
    }

    public Collection<Edge> getEdges() {
        return this.edges;
    }

    public Graph node(String name) {
        getNodes().add(new Node(name));

        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        getNodes().add(new Node(name, attributes));

        return this;
    }

    public Graph edge(String start, String end) {
        getEdges().add(new Edge(start, end));

        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        getEdges().add(new Edge(start, end, attributes));

        return this;
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }
}
