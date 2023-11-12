package cpen221.mp2.boggle;

import cpen221.mp2.graph.ALGraph;
import cpen221.mp2.graph.Edge;
import cpen221.mp2.graph.Vertex;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;

public class BogglePlayer {

    String[] dictionary;
    Vertex[][] vertices = new Vertex[4][4];
    ALGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
    // Some empty methods provided to ensure that the
    // build succeeds. You should implement these methods
    // and the others that are required.

    public BogglePlayer(String[] dictionary) {
        this.dictionary = dictionary;
    }

    public Set<String> getAllValidWords(BoggleBoard board) {

        int id = 1;
        for (int i = 0; i < board.rows(); i++) {
            for (int j = 0; j < board.cols(); j++) {
                Vertex v = new Vertex(id++, board.getLetter(i, j) + "");
                vertices[i][j] = v;

                g.addVertex(v);
            }
        }
        addEdges();
        Set<String> allPaths = getAllPaths();
        System.out.println(allPaths);
        return allPaths;
    }

    private Set<String> getAllPaths() {
        Set<String> set = new HashSet<>();
        for (Vertex v : g.allVertices()) {
            for (Vertex v1 : g.allVertices()) {
                List<List<Vertex>> allPaths = g.getAllPaths(v, v1);
                for (List<Vertex> allPath : allPaths) {
                    String path = "";
                    for (Vertex vertex : allPath) {
                        path += vertex.name();
                    }
                    for (String s : dictionary) {
                        if(s.equals(path)){
                            set.add(path);
                        }
                    }

                }
            }
        }
        return set;
    }


    private void addEdges() {
        for (int i = 0; i < vertices.length; i++) {
            for (int j=0;j<vertices[i].length;j++) {
                Vertex v = vertices[i][j];
                if (v.id() == 1) {
                    g.addEdge(new Edge<>(vertices[3][3], v));
                    g.addEdge(new Edge<>(vertices[3][0], v));
                    g.addEdge(new Edge<>(vertices[3][1], v));
                    g.addEdge(new Edge<>(vertices[0][3], v));
                    g.addEdge(new Edge<>(vertices[0][1], v));
                    g.addEdge(new Edge<>(vertices[1][3], v));
                    g.addEdge(new Edge<>(vertices[1][0], v));
                    g.addEdge(new Edge<>(vertices[1][1], v));
                } else if (v.id() == 2 || v.id() == 3) {
                    g.addEdge(new Edge<>(vertices[3][j-1], v));
                    g.addEdge(new Edge<>(vertices[3][j], v));
                    g.addEdge(new Edge<>(vertices[3][j+1], v));
                    g.addEdge(new Edge<>(vertices[0][j-1], v));
                    g.addEdge(new Edge<>(vertices[0][j+1], v));
                    g.addEdge(new Edge<>(vertices[1][j-1], v));
                    g.addEdge(new Edge<>(vertices[1][j], v));
                    g.addEdge(new Edge<>(vertices[1][j+1], v));
                }else if (v.id() == 4) {
                    g.addEdge(new Edge<>(vertices[3][j-1], v));
                    g.addEdge(new Edge<>(vertices[3][j], v));
                    g.addEdge(new Edge<>(vertices[3][0], v));
                    g.addEdge(new Edge<>(vertices[0][j-1], v));
                    g.addEdge(new Edge<>(vertices[0][0], v));
                    g.addEdge(new Edge<>(vertices[1][j-1], v));
                    g.addEdge(new Edge<>(vertices[1][j], v));
                    g.addEdge(new Edge<>(vertices[1][0], v));
                }else if (v.id() == 5||v.id()==9) {
                    g.addEdge(new Edge<>(vertices[i-1][3], v));
                    g.addEdge(new Edge<>(vertices[i-1][j], v));
                    g.addEdge(new Edge<>(vertices[i-1][j+1], v));
                    g.addEdge(new Edge<>(vertices[i][3], v));
                    g.addEdge(new Edge<>(vertices[i][j+1], v));
                    g.addEdge(new Edge<>(vertices[i+1][3], v));
                    g.addEdge(new Edge<>(vertices[i+1][j], v));
                    g.addEdge(new Edge<>(vertices[i+1][j+1], v));
                }else if (v.id() == 8||v.id()==12) {
                    g.addEdge(new Edge<>(vertices[i-1][j-1], v));
                    g.addEdge(new Edge<>(vertices[i-1][j], v));
                    g.addEdge(new Edge<>(vertices[i-1][0], v));
                    g.addEdge(new Edge<>(vertices[i][j-1], v));
                    g.addEdge(new Edge<>(vertices[i][0], v));
                    g.addEdge(new Edge<>(vertices[i+1][j-1], v));
                    g.addEdge(new Edge<>(vertices[i+1][j], v));
                    g.addEdge(new Edge<>(vertices[i+1][0], v));
                }else if (v.id() == 13) {
                    g.addEdge(new Edge<>(vertices[i-1][3], v));
                    g.addEdge(new Edge<>(vertices[i-1][j], v));
                    g.addEdge(new Edge<>(vertices[i-1][j+1], v));
                    g.addEdge(new Edge<>(vertices[i][3], v));
                    g.addEdge(new Edge<>(vertices[i][j+1], v));
                    g.addEdge(new Edge<>(vertices[0][3], v));
                    g.addEdge(new Edge<>(vertices[0][j], v));
                    g.addEdge(new Edge<>(vertices[0][j+1], v));
                }else if (v.id() == 14||v.id()==15) {
                    g.addEdge(new Edge<>(vertices[i-1][j-1], v));
                    g.addEdge(new Edge<>(vertices[i-1][j], v));
                    g.addEdge(new Edge<>(vertices[i-1][j+1], v));
                    g.addEdge(new Edge<>(vertices[i][j-1], v));
                    g.addEdge(new Edge<>(vertices[i][j+1], v));
                    g.addEdge(new Edge<>(vertices[0][j-1], v));
                    g.addEdge(new Edge<>(vertices[0][j], v));
                    g.addEdge(new Edge<>(vertices[0][j+1], v));
                }else if (v.id() == 16) {
                    g.addEdge(new Edge<>(vertices[i-1][j-1], v));
                    g.addEdge(new Edge<>(vertices[i-1][j], v));
                    g.addEdge(new Edge<>(vertices[i-1][0], v));
                    g.addEdge(new Edge<>(vertices[i][j-1], v));
                    g.addEdge(new Edge<>(vertices[i][0], v));
                    g.addEdge(new Edge<>(vertices[0][j-1], v));
                    g.addEdge(new Edge<>(vertices[0][j], v));
                    g.addEdge(new Edge<>(vertices[0][0], v));
                }else{
                    g.addEdge(new Edge<>(vertices[i-1][j-1], v));
                    g.addEdge(new Edge<>(vertices[i-1][j], v));
                    g.addEdge(new Edge<>(vertices[i-1][j+1], v));
                    g.addEdge(new Edge<>(vertices[i][j-1], v));
                    g.addEdge(new Edge<>(vertices[i][j+1], v));
                    g.addEdge(new Edge<>(vertices[i+1][j-1], v));
                    g.addEdge(new Edge<>(vertices[i+1][j], v));
                    g.addEdge(new Edge<>(vertices[i+1][j+1], v));
                }

            }
        }

    }

    public int getMaximumScore(BoggleBoard board) {

        return 1;
    }

}

