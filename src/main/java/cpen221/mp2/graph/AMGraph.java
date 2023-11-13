package cpen221.mp2.graph;
import java.util.*;

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
        int edgelength = 0;
        for (E edge : adjacencyList.get(v1)) {
            if (edge.v2().equals(v2)) {
                edgelength = edge.length();
                return edgelength;
            }
            return 0;
        }
        return edgelength;
    }

    @Override
    public int edgeLengthSum() {
        int sum = 0 ;
        Set<E> alledges = allEdges();
        List<E> converted = new ArrayList<>(alledges);
        for(E edge : converted)
        {
            int length = edge.length();
            sum = sum + length;
        }
        return sum;


    }

    @Override
    public boolean removeEdge(E e) {
        Set<V> allvertices = allVertices();
        boolean removed = false;
        for(V v : allvertices)
        {
            if(hasEdge(e.v1(),e.v2()))
            {
                adjacencyList.get(v).remove(e);
                removed = true;
            }
        }

        return removed;
    }

    @Override
    public boolean removeEdge(V v1, V v2) {
        boolean result = false;
        if(hasEdge(v1,v2))
        {
            adjacencyList.get(v1).remove(v1);
        }
        return false;
    }

    @Override
    public boolean removeVertex(V v) {
        boolean removal = false;
        if (adjacencyList.isEmpty()) {
            return false;
        } else if (adjacencyList.containsKey(v))
        {
            adjacencyList.remove(v);
            removal = true;
        }
        else {
            removal = false;
        }
        return removal;
    }



    @Override
    public E getEdge(V v1, V v2) {
        List<E> list = new ArrayList<>();
        int i = 0;
        if (hasEdge(v1, v2)) {
            list = adjacencyList.get(v1);
            {
                for ( i = 0; i < list.size(); i++) {
                    if (list.get(i).v2().equals(v2)) {
                        return  list.get(i);
                    }
                }
            }
        }
        return list.get(i);
    }
    @Override
    public Set<V> allVertices()
    {
        Set<V> listofvertices = adjacencyList.keySet();
        return listofvertices;
    }

    @Override
    public Set<E> allEdges() {
        List<E> alledge1 = new ArrayList<>();
        Set<V> allvertices =  allVertices();
        for(V v : allvertices)
        {
           List<E> edgelist = adjacencyList.get(v);
           for(E edge : edgelist)
           {
               alledge1.add(edge);
           }
        }
        for(int i = 0; i < alledge1.size() - 1 ; i++)
        {
            for(int j = i+1 ; j < alledge1.size(); j++ )
            {
                if(alledge1.get(i).equals(alledge1.get(j)))
                {
                    alledge1.remove(alledge1.get(j));
                }
            }
        }
        Set<E> listofalledges = new HashSet<>(alledge1);

        return listofalledges;
    }

    @Override
    public Set<E> allEdges(V v) {
        List<E> list = new ArrayList<>();
        Set<E> alledges = new HashSet<>();
        if (hasVertex(v))
        {
            list = adjacencyList.get(v);
            for (int i = 0; i < list.size(); i++) {
                alledges.add(list.get(i));
            }
        }
        return alledges;
    }

    @Override
    public Map<V, E> getNeighbourhood(V v) {
        Map<V,E> neighbourood = new HashMap<>();
        for(E edge : adjacencyList.get(v))
        {
            neighbourood.put(edge.v2(),edge);
        }
        return neighbourood;
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


