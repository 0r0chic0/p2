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

            if (edge.equals(new Edge<>(v1, v2))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int edgeLength(V v1, V v2) {
        for (E e : allEdges(v1)) {
            if(e.v1().equals(v1)&&e.v2().equals(v2)){
                return e.length();
            }else if(e.v1().equals(v2)&&e.v2().equals(v1)){
                return e.length();
            }
        }
//        for (E edge : adjacencyList.get(v1)) {
//            if (edge.v2().equals(v2)) {
//                return edge.length();
//            }
//        }
        return 0;
    }

    @Override
    public int edgeLengthSum() {
        int lengthSum = 0;
        for (V v : adjacencyList.keySet()) {
            List<E> es = adjacencyList.get(v);
            for (Edge edge : es) {
                lengthSum += edge.length();
            }
        }
        return lengthSum;
    }


    @Override
    public boolean removeEdge(E e) {
        boolean flag = false;
        for (V v : adjacencyList.keySet()) {
            List<E> es = adjacencyList.get(v);
            for (Edge edge : es) {
                if (edge.equals(e)) {
                    es.remove(edge);
                    flag = true;
                }
            }
        }
        if (flag) {

            if (adjacencyList.get(e.v1()).size() == 0 && adjacencyList.keySet().size() > 1) {
                removeVertex(e.v1());
            }
            if (adjacencyList.get(e.v2()).size() == 0 && adjacencyList.keySet().size() > 1) {
                removeVertex(e.v2());
            }
        }
        return flag;
    }

    @Override
    public boolean removeEdge(V v1, V v2) {
        E e = (E) new Edge<>(v1, v2);
        return removeEdge(e);
    }

    @Override
    public boolean removeVertex(V v) {
        for (V v1 : adjacencyList.keySet()) {
            if (v.equals(v1)) {
                adjacencyList.remove(v1);
                return true;
            }
        }
        return false;
    }

    @Override
    public E getEdge(V v1, V v2) {
        if (hasEdge(v1, v2)) {
//            List<E> es = adjacencyList.get(v1);
//            es.retainAll(adjacencyList.get(v2));
            List<E> es1 = adjacencyList.get(v1);
            List<E> es2 = adjacencyList.get(v2);
            for(E e : es1){
                if(es2.contains(e)){
                    return e;
                }
            }

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
        for (E e : es) {
            if (e.v1().equals(v) || e.v2().equals(v)) {
                set.add(e);
            }
        }
        return set;
    }


    @Override
    public Map<V, E> getNeighbourhood(V v) {
        Map<V, E> map = new HashMap<>();
        List<E> es = adjacencyList.get(v);
        for (E e : es) {
            if (!e.v1().equals(v)) {
                map.put(e.v1(), e);
            } else {
                map.put(e.v2(), e);
            }
        }
        return map;
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
                System.out.println(path);
                for (int i = 1; i < path.size(); i++) {
                    sum += edgeLength(path.get(i),path.get(i-1));
                }
                break;
        }
        return sum;
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


    private List<V> sumCostPath(V source, V destination) {
        // Initialize distance and previous vertex
        Map<V, Integer> distance = new HashMap<>();
        Map<V, V> previous = new HashMap<>();
        for (V vertex : adjacencyList.keySet()) {
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

            for (Edge edge : adjacencyList.get(current)) {
                V neighbor = null;
                if(edge.v1().equals(current)){
                    neighbor = (V) edge.v2();
                }else{
                    neighbor = (V) edge.v1();
                }
                int newDistance = distance.get(current) + edge.length();

                // If a shorter path is found, update the distance and previous vertex
                if (newDistance < distance.get(neighbor)) {
                    distance.put(neighbor, newDistance);
                    previous.put(neighbor, current);
                    queue.add(neighbor);
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


    private void minCostPath() {
    }


    private void maxCostPath() {
    }

    @Override
    public Map<V, E> getNeighbourhood(V v, int range) {
        Map<V,E> map = new HashMap<>();
        for (V v1 : adjacencyList.keySet()) {
            if(!v.equals(v1)){
                List<V> vs = minimumCostPath(v, v1, PathCostType.SUM_EDGES);
                if(pathCost(vs,PathCostType.SUM_EDGES)<range){
                    E edge = getEdge(vs.get(vs.size() - 2), vs.get(vs.size() - 1));
                    map.put(v1,edge);
                }
            }
        }
        return map;
    }


    @Override
    public int getDiameter(PathCostType costType) {
        TreeSet<Integer> ts = new TreeSet<>();
        for (V v : adjacencyList.keySet()) {
            int max = 0;
            for (V v1 : adjacencyList.keySet()) {
                if(!v.equals(v1)&&pathCost(minimumCostPath(v,v1,PathCostType.SUM_EDGES),PathCostType.SUM_EDGES)>max){
                    max = pathCost(minimumCostPath(v,v1,PathCostType.SUM_EDGES),PathCostType.SUM_EDGES);
                }
            }
            ts.add(max);
        }
        return ts.last();
    }


    @Override
    public V getCenter(PathCostType costType) {
        TreeMap<Integer,V> ts = new TreeMap<>();
        for (V v : adjacencyList.keySet()) {
            int min = 0;
            for (V v1 : adjacencyList.keySet()) {
                if(!v.equals(v1)&&pathCost(minimumCostPath(v,v1,PathCostType.SUM_EDGES),PathCostType.SUM_EDGES)<min){
                    min = pathCost(minimumCostPath(v,v1,PathCostType.SUM_EDGES),PathCostType.SUM_EDGES);
                }
            }
            ts.put(min,v);
        }
        return ts.firstEntry().getValue();
    }
    public List<List<Vertex>> getAllPaths(Vertex source, Vertex destination) {
        List<List<Vertex>> result = new ArrayList<>();
        Set<Vertex> visited = new HashSet<>();
        List<Vertex> path = new ArrayList<>();

        dfs(source, destination, visited, path, result);

        return result;
    }

    private void dfs(Vertex currentVertex, Vertex destination, Set<Vertex> visited, List<Vertex> path, List<List<Vertex>> result) {
        visited.add(currentVertex);
        path.add(currentVertex);

        if (currentVertex.equals(destination)) {
            result.add(new ArrayList<>(path));
        } else {
            List<E> neighbors = adjacencyList.get(currentVertex);
            for (Edge neighbor : neighbors) {
                Vertex neighborVertex = neighbor.v1();
                if (!visited.contains(neighborVertex)) {
                    dfs(neighborVertex, destination, visited, path, result);
                }
            }
        }

        visited.remove(currentVertex);
        path.remove(path.size() - 1);
    }


}