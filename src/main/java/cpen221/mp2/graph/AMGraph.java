package cpen221.mp2.graph;
import java.util.*;

public class AMGraph<V extends Vertex, E extends Edge<V>>
        implements IGraph<V, E> {

    /**
     * Create an empty graph with an upper-bound on the number of vertices
     *
     * @param maxVertices is greater than 1
     */
    private Map<V, Integer> vertices;
    private E[][] adjacencymatrix;
    private int maxVertices;

    public AMGraph(int maxVertices) {
        this.vertices = new HashMap<>();
        this.maxVertices = maxVertices;
        this.adjacencymatrix = (E[][]) new Edge[maxVertices][maxVertices];

    }

    @Override
    public boolean addVertex(V v) {
        boolean vertexaddition = false;
        if (hasVertex(v) || vertices.size() == maxVertices) {
            return false;
        } else {
            int newIndex = vertices.size();
            vertices.put(v, newIndex);
            return true;
        }
    }

    @Override
    public boolean addEdge(E e) {
        boolean EdgeADD;
        if (!hasEdge(e) || !hasVertex(e.v1()) || !hasVertex(e.v2())) {
            return false;
        } else {
            V v1 = e.v1();
            V v2 = e.v2();
            adjacencymatrix[vertices.get(v1)][vertices.get(v2)] = e;
            adjacencymatrix[vertices.get(v2)][vertices.get(v1)] = e;
            EdgeADD = true;

        }
        return EdgeADD;
    }


    @Override
    public boolean hasVertex(V v) {
        return vertices.containsKey(v);
    }

    @Override
    public boolean hasEdge(E e) {
        return hasEdge(e.v1(), e.v2());
    }

    @Override
    public boolean hasEdge(V v1, V v2) {
        if (vertices.containsKey(v1) && vertices.containsKey(v2)) {
            return adjacencymatrix[vertices.get(v1)][vertices.get(v2)] != null || adjacencymatrix[vertices.get(v2)][vertices.get(v1)] != null;
        }
        return false;
    }

    @Override
    public int edgeLength(V v1, V v2) {
        if (vertices.containsKey(v1) && vertices.containsKey(v2)) {
            int index1 = vertices.get(v1);
            int index2 = vertices.get(v2);

            Edge<V> edge = adjacencymatrix[index1][index2];
            if (edge != null) {
                return edge.length();
            }
            return -1;
        }
        return -1;
    }

    @Override
    public int edgeLengthSum()
    {
        int sum = 0;
        for (E[] row : adjacencymatrix) {
            for (E edge : row) {
                if (edge != null) {
                    sum += edge.length();
                }
            }
        }
        return sum;
    }


    @Override
    public boolean removeEdge(E e) {
        if (hasEdge(e))
        {
            V v1 = e.v1();
            V v2 = e.v2();
            adjacencymatrix[vertices.get(v1)][vertices.get(v2)] = null;
            adjacencymatrix[vertices.get(v2)][vertices.get(v1)] = null;
            return true;
        }return false;
    }
    @Override
    public boolean removeEdge(V v1, V v2) {
        boolean result = false ;
        if(hasEdge(v1,v2))
        {
            adjacencymatrix[vertices.get(v1)][vertices.get(v2)] = null;
            adjacencymatrix[vertices.get(v2)][vertices.get(v1)] = null;
            result = true;
        }
        return result;
    }

    @Override
    public boolean removeVertex(V v)
    {
        if(hasVertex(v))
        {
            vertices.remove(v);
            return true;
        }
        return false;
    }



    @Override
    public E getEdge(V v1, V v2)
    {
        if(hasEdge(v1,v2))
        {
            return adjacencymatrix[vertices.get(v1)][vertices.get(v2)];
        }
        return null;
    }
    @Override
    public Set<V> allVertices()
    {
        return vertices.keySet();
    }

    @Override
    public Set<E> allEdges() {
        Set<E> edges = new HashSet<>();
        for (E[] row : adjacencymatrix) {
            for (E edge : row) {
                if (edge != null) {
                    edges.add(edge);
                }
            }
        }
        return edges;
    }


    @Override
    public Set<E> allEdges(V v)
    {
        Set<E> edges = new HashSet<>();
        if (vertices.containsKey(v)) {
            int index = vertices.get(v);
            for (int i = 0; i < adjacencymatrix.length; i++) {
                if (adjacencymatrix[index][i] != null) {
                    edges.add(adjacencymatrix[index][i]);
                }
            }


            for (int i = 0; i < adjacencymatrix.length; i++) {
                if (adjacencymatrix[i][index] != null) {
                    edges.add(adjacencymatrix[i][index]);
                }
            }
        }
        return edges;
    }


    @Override
    public Map<V, E> getNeighbourhood(V v) {
        Map<V, E> neighbourhood = new HashMap<>();

        if (vertices.containsKey(v)) {
            int index = vertices.get(v);
            for (int i = 0; i < adjacencymatrix.length; i++) {
                E edge = adjacencymatrix[index][i];
                if (edge != null) {
                    neighbourhood.put(edge.v2(), edge);
                }
            }
            for (int i = 0; i < adjacencymatrix.length; i++) {
                E edge = adjacencymatrix[i][index];
                if (edge != null) {
                    neighbourhood.put(edge.v2(), edge);
                }
            }
        }

        return neighbourhood;
    }

    @Override
    public int pathCost(List<V> path, PathCostType costType) {
        int sum = 0;
        switch (costType) {
            case MAX_EDGE:

                break;
            case MIN_EDGE:

                break;
            case SUM_EDGES:
                for (int i = 1; i < path.size(); i++) {
                    sum += edgeLength(path.get(i),path.get(i-1));
                }
                break;
        }
        return sum;
    }

    private void minCostPath() {
    }


    private void maxCostPath() {
    }

    private List<V> sumCostPath(V source, V destination) {
        // Initialize distance and previous vertex
        Map<V, Integer> distance = new HashMap<>();
        Map<V, V> previous = new HashMap<>();
        for (V vertex : vertices.keySet()) {
            distance.put(vertex, Integer.MAX_VALUE);
            previous.put(vertex, null);
        }
        distance.put(source, 0);

        // Use a priority queue to sort vertices based on distance
        PriorityQueue<V> queue = new PriorityQueue<>(Comparator.comparingInt(distance::get));
        queue.add(source);

        while (!queue.isEmpty()) {
            V current = queue.poll();

            // If the current vertex has already calculated the shortest path, skip it
            if (current.equals(destination)) {
                break;
            }

            int currentIndex = vertices.get(current);

            // Iterate through neighbors in the matrix
            for (int i = 0; i < adjacencymatrix.length; i++) {
                E edge = adjacencymatrix[currentIndex][i];

                if (edge != null) {
                    V neighbor = (currentIndex == i) ? edge.v2() : edge.v1();
                    int newDistance = distance.get(current) + edge.length();

                    // If a shorter path is found, update the distance and previous vertex
                    if (newDistance < distance.get(neighbor)) {
                        distance.put(neighbor, newDistance);
                        previous.put(neighbor, current);
                        queue.add(neighbor);
                    }
                }
            }
        }

        // Build the shortest path
        List<V> shortestPath = new ArrayList<>();
        V current = destination;
        while (previous.get(current) != null) {
            shortestPath.add(current);
            current = previous.get(current);
        }
        shortestPath.add(source);
        Collections.reverse(shortestPath);

        return shortestPath;
    }






    @Override
    public List<V> minimumCostPath(V source, V sink, PathCostType costType) {
        List<V> list = null;
        switch (costType) {
            case MAX_EDGE:
                maxCostPath();
                break;
            case MIN_EDGE:
                minCostPath();
                break;
            case SUM_EDGES:
                list = sumCostPath(source, sink);
                break;
        }
        return list;
    }

    @Override
    public Map<V, E> getNeighbourhood(V v, int range)
    {
        Map<V, E> neighbourhood = new HashMap<>();
        for (V vertex : vertices.keySet())
        {
            List<V> mincostpath = minimumCostPath(v, vertex, PathCostType.SUM_EDGES);
            int size = mincostpath.size();
            if (pathCost(mincostpath, PathCostType.SUM_EDGES) <= range)
            {
                E edge = (E) new Edge<>(mincostpath.get(size - 1), mincostpath.get(size - 2));
                neighbourhood.put(vertex, edge);
            }
        }
        return neighbourhood;
    }

    @Override
    public int getDiameter(PathCostType costType) {
        TreeSet<Integer> ts = new TreeSet<>();

        for (V v : vertices.keySet()) {
            int max = 0;

            for (V v1 : vertices.keySet()) {
                if (!v.equals(v1)) {
                    List<V> path = minimumCostPath(v, v1, PathCostType.SUM_EDGES);
                    int pathCost = pathCost(path, PathCostType.SUM_EDGES);

                    if (pathCost > max) {
                        max = pathCost;
                    }
                }
            }
            ts.add(max);
        }

        return ts.last();
    }


    @Override

    public V getCenter(PathCostType costType) {
        TreeMap<Integer,V> ts = new TreeMap<>();
        for (V v : vertices.keySet()) {
            int min = 0;
            for (V v1 : vertices.keySet()) {
                if(!v.equals(v1)&&pathCost(minimumCostPath(v,v1,PathCostType.SUM_EDGES),PathCostType.SUM_EDGES)<min){
                    min = pathCost(minimumCostPath(v,v1,PathCostType.SUM_EDGES),PathCostType.SUM_EDGES);
                }
            }
            ts.put(min,v);
        }
        return ts.firstEntry().getValue();
    }
    public List<List<V>> getAllPaths(V source, V destination)
    {
        List<List<V>> result = new ArrayList<>();
        Set<V> visited = new HashSet<>();
        List<V> path = new ArrayList<>();

        dfs(source, destination, visited, path, result);

        return result;
    }

    private void dfs(V currentVertex, V destination, Set<V> visited, List<V> path, List<List<V>> result) {
        visited.add(currentVertex);
        path.add(currentVertex);

        if (currentVertex.equals(destination)) {
            result.add(new ArrayList<>(path));
        } else {
            int currentIndex = vertices.get(currentVertex);
            for (int i = 0; i < adjacencymatrix.length; i++) {
                E edge = adjacencymatrix[currentIndex][i];

                if (edge != null) {
                    V neighborVertex = (currentIndex == i) ? edge.v2() : edge.v1();
                    if (!visited.contains(neighborVertex)) {
                        dfs(neighborVertex, destination, visited, path, result);
                    }
                }
            }
        }

        visited.remove(currentVertex);
        path.remove(path.size() - 1);
    }

}

