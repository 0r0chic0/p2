package cpen221.mp2;

import cpen221.mp2.graph.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskThreeTestsAL {
    @Test
    public void testPathCost() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();

        Vertex v1 = new Vertex(1,"A");
        Vertex v2 = new Vertex(2, "B");
        Vertex v3 = new Vertex(3, "C");

        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);

        Edge<Vertex> e1 = new Edge<>(v1, v2, 5);
        Edge<Vertex> e2 = new Edge<>(v2, v3, 8);
        Edge<Vertex> e3 = new Edge<>(v1, v3, 3);

        g.addEdge(e1);
        g.addEdge(e2);
        g.addEdge(e3);

        List<Vertex> path1 = Arrays.asList(v1, v2, v3);
        List<Vertex> path2 = Arrays.asList(v1, v3);
        List<Vertex> path3 = Arrays.asList(v2, v3);

        int sumEdges1 = g.pathCost(path1, PathCostType.SUM_EDGES);
        assertEquals(5 + 8, sumEdges1);

        int sumEdges2 = g.pathCost(path2, PathCostType.SUM_EDGES);
        assertEquals(3, sumEdges2);

        int sumEdges3 = g.pathCost(path3, PathCostType.SUM_EDGES);
        assertEquals(8, sumEdges3);
    }

    @Test
    public void testMinimumCostPath() {

        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();

        Vertex v1 = new Vertex(1,"A");
        Vertex v2 = new Vertex(2, "B");
        Vertex v3 = new Vertex(3, "C");
        Vertex v4 = new Vertex(4, "D");

        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);

        Edge<Vertex> e1 = new Edge<>(v1, v2, 5);
        Edge<Vertex> e2 = new Edge<>(v2, v3, 3);
        Edge<Vertex> e3 = new Edge<>(v3, v4, 2);
        Edge<Vertex> e4 = new Edge<>(v1, v3, 8);

        g.addEdge(e1);
        g.addEdge(e2);
        g.addEdge(e3);
        g.addEdge(e4);

        List<Vertex> path = g.minimumCostPath(v1, v4, PathCostType.MAX_EDGE);
        assertEquals(Arrays.asList(v1, v2, v3, v4), path);


    }
}
