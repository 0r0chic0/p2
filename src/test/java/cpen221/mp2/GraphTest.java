package cpen221.mp2;

import cpen221.mp2.graph.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {

    @Test
    public void testCreateGraph() {
        Vertex v1 = new Vertex(1, "A");
        Vertex v2 = new Vertex(2, "B");
        Vertex v3 = new Vertex(3, "C");
        Vertex v4 = new Vertex(4, "D");

        Edge<Vertex> e1 = new Edge<>(v1, v2, 5);
        Edge<Vertex> e2 = new Edge<>(v2, v3, 7);
        Edge<Vertex> e3 = new Edge<>(v1, v4, 9);

        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);
        g.addEdge(e1);
        g.addEdge(e2);
        g.addEdge(e2);
        g.addEdge(e3);

        assertEquals(e2, g.getEdge(v2, v3));
        assertEquals(21,
                g.pathCost(
                        g.minimumCostPath(v3, v4, PathCostType.SUM_EDGES),
                        PathCostType.SUM_EDGES
                )
        );
    }

    @Test
    public void testCreateGraphAM() {

        AMGraph<Vertex, Edge<Vertex>> g = new AMGraph<>(10);

        Vertex v1 = new Vertex(1, "A");
        Vertex v2 = new Vertex(2, "B");
        Vertex v3 = new Vertex(3, "C");

        Edge<Vertex> e1 = new Edge<>(v1, v2, 5);
        Edge<Vertex> e2 = new Edge<>(v2, v3, 7);

        assertTrue(g.addVertex(v1));
        assertTrue(g.addVertex(v2));
        assertTrue(g.addVertex(v3));
        assertFalse(g.addVertex(v1));
        assertTrue(g.addVertex(new Vertex(4,"D")));

    }

    @Test
    public void testCreateGraphAL2() {
        Vertex v1 = new Vertex(1, "A");
        Vertex v2 = new Vertex(2, "B");
        Vertex v3 = new Vertex(3, "C");
        Vertex v4 = new Vertex(4, "D");
        Vertex v5 = new Vertex(1, "E");
        Vertex v6 = new Vertex(2, "F");
        Vertex v7 = new Vertex(3, "G");
        Vertex v8 = new Vertex(4, "H");

        Edge<Vertex> e1 = new Edge<>(v1, v2, 5);
        Edge<Vertex> e2 = new Edge<>(v2, v3, 7);
        Edge<Vertex> e3 = new Edge<>(v3, v4, 9);
        Edge<Vertex> e4 = new Edge<>(v4, v5, 21);
        Edge<Vertex> e5 = new Edge<>(v5, v6, 29);
        Edge<Vertex> e6 = new Edge<>(v6, v7, 8);
        Edge<Vertex> e7 = new Edge<>(v7, v8, 21);
        Edge<Vertex> e8 = new Edge<>(v8, v1, 21);

        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);
        g.addVertex(v5);
        g.addVertex(v6);
        g.addVertex(v7);
        g.addVertex(v8);
        g.addEdge(e1);
        g.addEdge(e2);
        g.addEdge(e2);
        g.addEdge(e3);
        g.addEdge(e4);
        g.addEdge(e5);
        g.addEdge(e6);
        g.addEdge(e7);

        assertEquals(e2, g.getEdge(v2, v3));
        assertEquals(9,
                g.pathCost(
                        g.minimumCostPath(v3, v4, PathCostType.SUM_EDGES),
                        PathCostType.SUM_EDGES
                )
        );
    }

}
