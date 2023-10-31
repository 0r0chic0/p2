package cpen221.mp2.graph;
import java.util.*;
public class ALGraph<V extends Vertex, E extends Edge<V>>
        implements IGraph<V, E> {
    // TODO: Implement this type using an adjacency list representation
    private Map<V, List<E>> adjacencyList;
    public ALGraph() {
        this.adjacencyList = new HashMap<>();
    }

    @Override
    public boolean addVertex(V v) {
        if (adjacencyList.containsKey(v)) {
            return false;
        }
        adjacencyList.put(v, new ArrayList<>());
        return true;
    }

    @Override
    public boolean hasVertex(V v) {
        return adjacencyList.containsKey(v);
    }

    @Override
    public boolean addEdge(E e) {
        if (!hasVertex(e.v1()) || !hasVertex(e.v2())) {
            return false;
        }
        if (hasEdge(e)) {
            return false;
        }
        adjacencyList.get(e.v1()).add(e);
        adjacencyList.get(e.v2()).add(e);
        return true;
    }

    @Override
    public boolean hasEdge(E e) {
        return hasEdge(e.v1(), e.v2());
    }

    @Override
    public boolean hasEdge(V v1, V v2) {
        for (E edge : adjacencyList.get(v1)) {
            if (edge.v2().equals(v2)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int edgeLength(V v1, V v2) {
        for (E edge : adjacencyList.get(v1)) {
            if (edge.v2().equals(v2)) {
                return edge.length();
            }
        }
        return 0;
    }
}