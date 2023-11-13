package cpen221.mp2;

import cpen221.mp2.graph.*;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskTwoTestsAL {

    @Test
    public void testEdgeLengthSumAM(){
        /*

        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        Vertex v1 = new Vertex(1,"A");
        Vertex v2 = new Vertex(2, "B");
        Vertex v3 = new Vertex(3, "C");

        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);

        Edge<Vertex> e1 = new Edge<>(v1, v2, 5);
        Edge<Vertex> e2 = new Edge<>(v2, v3, 7);
        Edge<Vertex> e3 = new Edge<>(v1, v3, 9);
        System.out.println(e1.length());
        System.out.println(e2.length());
        System.out.println(e3.length());

        g.addEdge(e1);
        g.addEdge(e2);
        g.addEdge(e3);

        int expectedSum = e1.length() + e2.length() + e3.length();

        assertEquals(expectedSum, g.edgeLengthSum());

         */
    }

    @Test
    public void testRemoveEdgeAM(){

        /*

        AMGraph<Vertex, Edge<Vertex>> graph = new AMGraph<>(10);

        Vertex v1 = new Vertex(1,"A");
        Vertex v2 = new Vertex(2, "B");
        Vertex v3 = new Vertex(3, "C");

        Edge<Vertex> e1 = new Edge<>(v1, v2, 5);
        Edge<Vertex> e2 = new Edge<>(v2, v3, 8);

        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);

        graph.addEdge(e1);
        graph.addEdge(e2);


        assertTrue(graph.removeEdge(e1));
        assertFalse(graph.hasEdge(e1));
        assertFalse(graph.removeEdge(e1));

        assertTrue(graph.removeEdge(v2, v3));
        assertFalse(graph.hasEdge(v2, v3));

         */

    }

    @Test
    public void testRemoveVertex() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        Vertex v1 = new Vertex(1,"A");
        Vertex v2 = new Vertex(2, "B");

        Edge<Vertex> e1 = new Edge<>(v1, v2, 5);

        g.addVertex(v1);
        g.addVertex(v2);
        g.addEdge(e1);

        assertTrue(g.hasVertex(v1));
        assertTrue(g.hasVertex(v2));
        assertTrue(g.hasEdge(e1));
        assertTrue(g.removeVertex(v1));
        assertFalse(g.hasVertex(v1));

        assertTrue(g.removeVertex(v2));
        assertFalse(g.hasVertex(v2));

    }

    @Test
    public void testGetEdgeAM() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        Vertex v1 = new Vertex(1,"A");
        Vertex v2 = new Vertex(2, "B");

        Edge<Vertex> e1 = new Edge<>(v1, v2, 17);

        g.addVertex(v1);
        g.addVertex(v2);
        g.addEdge(e1);

        Edge retrievedEdge = g.getEdge(v1, v2);
        assertNotNull(retrievedEdge);
        assertEquals(e1, retrievedEdge);

    }

    @Test
    public void testAllVerticesAM() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        Vertex v1 = new Vertex(1,"A");
        Vertex v2 = new Vertex(2, "B");
        Vertex v3 = new Vertex(3,"C");
        Vertex v4 = new Vertex(4, "D");
        Vertex v5 = new Vertex(5,"E");
        Vertex v6 = new Vertex(6, "F");


        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);
        g.addVertex(v5);
        g.addVertex(v6);

        Set<Vertex> allVertices = g.allVertices();
        assertEquals(6, allVertices.size());

        assertTrue(allVertices.contains(v1));
        assertTrue(allVertices.contains(v2));
        assertTrue(allVertices.contains(v3));
        assertTrue(allVertices.contains(v4));
        assertTrue(allVertices.contains(v5));
        assertTrue(allVertices.contains(v6));

    }

    @Test
    public void testAllEdgesAM() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        Vertex v1 = new Vertex(1,"A");
        Vertex v2 = new Vertex(2, "B");
        Vertex v3 = new Vertex(3,"C");

        Edge<Vertex> e1 = new Edge<>(v1, v2, 17);

        g.addVertex(v1);
        g.addVertex(v2);
        g.addEdge(e1);

        assertEquals(1, g.allEdges().size());
    }

    @Test
    public void testAllEdgesAgainAM() {
        /*
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        Vertex v1 = new Vertex(1,"A");
        Vertex v2 = new Vertex(2, "B");
        Vertex v3 = new Vertex(3,"C");

        Edge<Vertex> e1 = new Edge<>(v1, v2, 17);
        Edge<Vertex> e2 = new Edge<>(v1, v2, 2);

        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addEdge(e1);
        g.addEdge(e2);

        Set<Edge<Vertex>> edgesOfV1 = g.allEdges(v1);
        assertEquals(1, edgesOfV1.size());

        assertTrue(edgesOfV1.contains(e1));

        IGraph<Vertex, Edge<Vertex>> emptyGraph = new AMGraph<>(10);
        Set<Edge<Vertex>> emptyEdges = emptyGraph.allEdges(v1);
        assertTrue(emptyEdges.isEmpty());

        g.removeEdge(e1);
        Set<Edge<Vertex>> remainingEdgesOfV1 = g.allEdges(v1);
        assertTrue(remainingEdgesOfV1.isEmpty());

         */
    }

    @Test
    public void testGetNeighbours() {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        Vertex v1 = new Vertex(1,"A");
        Vertex v2 = new Vertex(2, "B");
        Vertex v3 = new Vertex(3,"C");

        Edge<Vertex> e1 = new Edge<>(v1, v2, 1);
        Edge<Vertex> e2 = new Edge<>(v1, v3, 2);

        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addEdge(e1);
        g.addEdge(e2);

        Map<Vertex, Edge<Vertex>> neighboursOfV1 = g.getNeighbourhood(v1);

        assertEquals(2, neighboursOfV1.size());

        assertTrue(neighboursOfV1.containsKey(v2));
        assertTrue(neighboursOfV1.containsKey(v3));

        Edge<Vertex> edgeToV2 = neighboursOfV1.get(v2);
        assertNotNull(edgeToV2);
        assertTrue(edgeToV2.equals(e1));

        Edge<Vertex> edgeToV3 = neighboursOfV1.get(v3);
        assertNotNull(edgeToV3);
        assertTrue(edgeToV3.equals(e2));


    }


}
