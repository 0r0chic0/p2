package cpen221.mp2.graph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class AMGraph<V extends Vertex, E extends Edge<V>>
        implements IGraph<V, E> {

    /**
     * Create an empty graph with an upper-bound on the number of vertices
     *
     * @param maxVertices is greater than 1
     */
    private Map<V, List<E>> adjacencyList;
    private int maxVert;

    public AMGraph(int maxVertices) {
        this.maxVert = maxVertices;
        this.adjacencyList = new HashMap<>(maxVert);
    }

    @Override
    public boolean addVertex(V v) {
        boolean vertexaddition = false;
        if (adjacencyList.size() == maxVert) {
            return false;
        } else if (hasVertex(v)) {
            vertexaddition = false;
        } else {
            adjacencyList.put(v, new ArrayList<>());
            vertexaddition = true;
        }
        return vertexaddition;
    }


    @Override
    public boolean hasVertex(V v) {
        return adjacencyList.containsKey(v);
    }

    @Override
    public boolean addEdge(E e) {
        boolean EdgeADD = false;
        if (!hasEdge(e) || !hasVertex(e.v1()) || !hasVertex(e.v2())) {
            return false;
        } else {
            adjacencyList.get(e.v1()).add(e);
            EdgeADD = true;

        }
        return EdgeADD;
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
        int edgelength = 0 ;
        for (E edge : adjacencyList.get(v1)) {
            if (edge.v2().equals(v2)) {
                edgelength = edge.length();
                return edgelength;
            }
            return 0;
        } return edgelength;
    }
}


