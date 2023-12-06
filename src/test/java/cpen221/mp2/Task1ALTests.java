package cpen221.mp2;

import cpen221.mp2.graph.ALGraph;
import cpen221.mp2.graph.Edge;
import cpen221.mp2.graph.IGraph;
import cpen221.mp2.graph.Vertex;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task1ALTests {
    @Test
    public void testAddVertex() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        Vertex v = new Vertex(1, "Neo");
        assertTrue(g.addVertex(v));
    }

    @Test
    public void testAddMultipleVertices() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        var vertices = new Vertex[] {
                new Vertex(1, "Neo"),
                new Vertex(2, "Morpheus"),
                new Vertex(3, "Trinity"),
                new Vertex(4, "Neo")
        };
        for (var v: vertices) {
            assertTrue(g.addVertex(v));
        }
    }

    @Test
    public void testAddDuplicateVertices1() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        var v1 = new Vertex(1, "Neo");
        var v2 = new Vertex(1, "Neo");
        g.addVertex(v1);
        assertFalse(g.addVertex(v2));
    }

    @Test
    public void testContainsVertex() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        var vertices = new Vertex[] {
                new Vertex(1, "Neo"),
                new Vertex(2,  "Morpheus"),
                new Vertex(3, "Trinity"),
                new Vertex(4, "Neo")
        };
        for (var v: vertices) {
            g.addVertex(v);
        }
        for (var v: vertices) {
            assertTrue(g.hasVertex(v));
        }
    }

    @Test
    public void testDoesNotContainsVertex() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        var vertices = new Vertex[] {
                new Vertex(1, "Neo"),
                new Vertex(2,  "Morpheus"),
                new Vertex(3, "Trinity"),
                new Vertex(4, "Neo")
        };
        var v5 = new Vertex(5, "Niobe");
        for (var v: vertices) {
            g.addVertex(v);
        }
        assertFalse(g.hasVertex(v5));
    }

    @Test
    public void testAddEdge() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        var v1 = new Vertex(1, "Neo");
        var v2 = new Vertex(2, "Morpheus");
        g.addVertex(v1);
        g.addVertex(v2);
        var e = new Edge<>(v1, v2);
        assertTrue(g.addEdge(e));
    }

    @Test
    public void testAddBadEdge() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        var v1 = new Vertex(1, "Neo");
        var v2 = new Vertex(2, "Morpheus");
        var v3 = new Vertex(3, "Trinity");
        g.addVertex(v1);
        g.addVertex(v2);
        var e = new Edge<>(v1, v3);
        assertFalse(g.addEdge(e));
    }

    @Test
    public void testContainsEdge() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        var v1 = new Vertex(1, "Neo");
        var v2 = new Vertex(2, "Morpheus");
        var v3 = new Vertex(3, "Trinity");
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        var e = new Edge<>(v1, v2);
        g.addEdge(e);
        assertTrue(g.hasEdge(new Edge(v1, v2)));
    }

    @Test
    public void testDoesNotContainsEdge() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        var v1 = new Vertex(1, "Neo");
        var v2 = new Vertex(2, "Morpheus");
        var v3 = new Vertex(3, "Trinity");
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        var e = new Edge<>(v1, v2);
        g.addEdge(e);
        assertFalse(g.hasEdge(new Edge(v1, v3)));
    }

    @Test
    public void testEdgeLength() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        var v1 = new Vertex(1, "Neo");
        var v2 = new Vertex(2, "Morpheus");
        var v3 = new Vertex(3, "Trinity");
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        var e1 = new Edge<>(v1, v2, 3);
        var e2 = new Edge<>(v1, v3);
        g.addEdge(e1);
        g.addEdge(e2);
        assertEquals(3, g.edgeLength(v1, v2));
        assertEquals(1, g.edgeLength(v1, v3));
    }
}
