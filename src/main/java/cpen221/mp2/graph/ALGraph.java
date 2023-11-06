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

            if (edge.equals(new Edge<>(v1,v2))) {
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

    @Override
    public int edgeLengthSum() {
        int lengthSum = 0;
        for(V v: adjacencyList.keySet()){
            List<E> es = adjacencyList.get(v);
            for(Edge edge : es){
                lengthSum += edge.length();
            }
        }
        return lengthSum;
    }


    @Override
    public boolean removeEdge(E e) {
        boolean flag = false;
        for(V v: adjacencyList.keySet()){
            List<E> es = adjacencyList.get(v);
            for(Edge edge : es){
                if(edge.equals(e)){
                    es.remove(edge);
                    flag = true;
                }
            }
        }
        if(flag){

            if(adjacencyList.get(e.v1()).size()==0&&adjacencyList.keySet().size()>1){
                removeVertex(e.v1());
            }
            if(adjacencyList.get(e.v2()).size()==0&&adjacencyList.keySet().size()>1){
                removeVertex(e.v2());
            }
        }
        return flag;
    }

    @Override
    public boolean removeEdge(V v1, V v2) {
        E e = (E) new Edge<>(v1,v2);
        return removeEdge(e);
    }

    @Override
    public boolean removeVertex(V v) {
        for (V v1 : adjacencyList.keySet()) {
            if(v.equals(v1)){
                adjacencyList.remove(v1);
                return true;
            }
        }
        return false;
    }

    @Override
    public E getEdge(V v1, V v2) {
        if(hasEdge(v1,v2)){
            List<E> es = adjacencyList.get(v1);
            es.retainAll(adjacencyList.get(v2));
            return es.get(0);
        }
        return null;
    }

    @Override
    public Set<V> allVertices() {
        return adjacencyList.keySet();
    }

    @Override
    public Set<E> allEdges() {
        Set<E> edges = new HashSet<>();
        for (List<E> es : adjacencyList.values()) {
            for (E e : es) {
                edges.add(e);
            }
        }
        return edges;
    }

    @Override
    public Set<E> allEdges(V v) {
        Set<E> set = new HashSet<>();
        Set<E> es = allEdges();
        for(E e :es){
            if(e.v1().equals(v)||e.v2().equals(v)){
                set.add(e);
            }
        }
        return set;
    }


    @Override
    public Map<V, E> getNeighbourhood(V v) {
        Map<V,E> map = new HashMap<>();
        List<E> es = adjacencyList.get(v);
        for (E e : es) {
            if(!e.v1().equals(v)){
                map.put(e.v1(),e) ;
            }else{
                map.put(e.v2(),e);
            }
        }
        return map;
    }

    @Override
    public int pathCost(List<V> path, PathCostType costType) {
        return 0;
    }

    @Override
    public List<V> minimumCostPath(V source, V sink, PathCostType costType) {
        return null;
    }

    @Override
    public Map<V, E> getNeighbourhood(V v, int range) {
        return null;
    }

    @Override
    public int getDiameter(PathCostType costType) {
        return 0;
    }

    @Override
    public V getCenter(PathCostType costType) {
        return null;
    }
}