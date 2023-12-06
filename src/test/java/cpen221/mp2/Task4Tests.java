package cpen221.mp2;

import cpen221.mp2.graph.*;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@Timeout(15)
class Task4Tests {
    private static List<String> alphabet = List.of(
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    );

    /* Graph 0 */
    private static List<Vertex> lv0 = List.of(
            new Vertex(1, "A"),
            new Vertex(2, "B"),
            new Vertex(3, "C"),
            new Vertex(4, "D")
    );
    private static List<Edge<Vertex>> le0 = List.of(
            new Edge<>(lv0.get(0), lv0.get(1), 5),
            new Edge<>(lv0.get(1), lv0.get(2), 7),
            new Edge<>(lv0.get(0), lv0.get(3), 9)
    );

    /* Graph 1 (No connection) */
    private static List<Edge<Vertex>> le1 = List.of(
            new Edge<>(lv0.get(0), lv0.get(1), 5),
            new Edge<>(lv0.get(2), lv0.get(3), 7)
    );

    /* Full Alphabet vertices */
    private static Map<String, Vertex> lv1 = IntStream.range(0, 26)
            .mapToObj(a -> new AbstractMap.SimpleEntry<>(
                    alphabet.get(a), new Vertex(a, alphabet.get(a))
            ))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    /*                 Graph 2
     *
     *                    D
     *  +V----------------+--+
     *  |                 |  E
     *  |                 |
     * U+-----+S         B+-----+
     *  |     |    Q      |     C        +G
     *  +T   R+----+      |              |
     *        |    |      |              |
     *        |    +------+---------+F   |
     *    Y   |    P      A         |    |
     *    +---+X-------------------W+----+H
     *    |   |                     |    |
     *    +   +-------+N----K+------+J   |
     *    Z   O       |      |           |
     *                |      |           +I
     *                |      |
     *                +------+L
     *                M
     */
    private static List<Edge<Vertex>> le2 = List.of(
            new Edge<>(lv1.get("A"), lv1.get("P"), 6),
            new Edge<>(lv1.get("A"), lv1.get("B"), 3),
            new Edge<>(lv1.get("A"), lv1.get("F"), 9),
            new Edge<>(lv1.get("B"), lv1.get("D"), 4),
            new Edge<>(lv1.get("B"), lv1.get("C"), 5),
            new Edge<>(lv1.get("D"), lv1.get("E"), 7),
            new Edge<>(lv1.get("D"), lv1.get("V"), 15),
            new Edge<>(lv1.get("F"), lv1.get("W"), 2),
            new Edge<>(lv1.get("G"), lv1.get("H"), 43),
            new Edge<>(lv1.get("H"), lv1.get("I"), 8),
            new Edge<>(lv1.get("J"), lv1.get("W"), 1),
            new Edge<>(lv1.get("J"), lv1.get("K"), 10),
            new Edge<>(lv1.get("K"), lv1.get("L"), 11),
            new Edge<>(lv1.get("L"), lv1.get("M"), 13),
            new Edge<>(lv1.get("M"), lv1.get("N"), 14),
            new Edge<>(lv1.get("N"), lv1.get("O"), 16),
            new Edge<>(lv1.get("N"), lv1.get("K"), 19),
            new Edge<>(lv1.get("O"), lv1.get("X"), 18),
            new Edge<>(lv1.get("P"), lv1.get("Q"), 22),
            new Edge<>(lv1.get("Q"), lv1.get("R"), 23),
            new Edge<>(lv1.get("R"), lv1.get("S"), 24),
            new Edge<>(lv1.get("R"), lv1.get("X"), 25),
            new Edge<>(lv1.get("S"), lv1.get("U"), 26),
            new Edge<>(lv1.get("T"), lv1.get("U"), 27),
            new Edge<>(lv1.get("U"), lv1.get("V"), 28),
            new Edge<>(lv1.get("W"), lv1.get("H"), 29),
            new Edge<>(lv1.get("X"), lv1.get("Y"), 30),
            new Edge<>(lv1.get("X"), lv1.get("W"), 42),
            new Edge<>(lv1.get("Y"), lv1.get("Z"), 40)
    );

    private static IGraph<Vertex, Edge<Vertex>> g0 = formGraph(lv0, le0);
    private static IGraph<Vertex, Edge<Vertex>> g1 = formGraph(lv0, le1);
    private static IGraph<Vertex, Edge<Vertex>> g2 = new ALGraph<>();
    private static IGraph<Vertex, Edge<Vertex>> g3 = formGraph(new ArrayList<>(lv1.values()), le2);
    private static IGraph<Vertex, Edge<Vertex>> g4 = formGraph(new ArrayList<>(lv1.values()), le2);
    private static IGraph<Vertex, Edge<Vertex>> g5 = formGraph(new ArrayList<>(lv1.values()), le2);

    static {
        g4.removeEdge(new Edge<Vertex>(lv1.get("W"), lv1.get("H")));
        g5.removeEdge(new Edge<Vertex>(lv1.get("W"), lv1.get("H")));
        g5.removeEdge(new Edge<Vertex>(lv1.get("O"), lv1.get("X")));
        g5.removeEdge(new Edge<Vertex>(lv1.get("W"), lv1.get("J")));
    }

    private static IGraph<Vertex, Edge<Vertex>> formGraph(List<Vertex> lv, List<Edge<Vertex>> le) {
        IGraph<Vertex, Edge<Vertex>> g = new ALGraph<>();
        lv.forEach(g::addVertex);
        le.forEach(g::addEdge);
        return g;
    }

    @ParameterizedTest
    @MethodSource("diameterProvider")
    void diameter(IGraph<Vertex, Edge<Vertex>> g, double expected) {
        try {
            double answer = g.getDiameter(PathCostType.SUM_EDGES);
            if (answer < 0 || answer == Integer.MAX_VALUE) {
                if (g.allEdges().size() == 0) {
                    expected = answer;
                }
            }
            assertEquals(expected, answer);
        }
        catch (Exception ex) {
            if (g.allEdges().size() != 0) {
                fail();
            }
        }
    }

    @ParameterizedTest
    @MethodSource("centerProvider")
    void center(IGraph<Vertex, Edge<Vertex>> g, Vertex expected) {
        try {
            Vertex answer = g.getCenter(PathCostType.SUM_EDGES);
            assertEquals(expected, answer);
        }
        catch (Exception ex) {
            fail();
        }
    }

    /**
     * Argument provider
     *
     * @return Graph to test, expected diameter
     */
    private static Stream<Arguments> diameterProvider() {
        return Stream.of(
                Arguments.of(g0, 21),
                Arguments.of(g1, 7),
                Arguments.of(g2, 0),
                Arguments.of(g3, 184)
        );
    }

    /**
     * Argument provider for testing getCenter
     * @return graph to test, expected center
     */
    private static Stream<Arguments> centerProvider() {
        return Stream.of(
                Arguments.of(g0, lv0.get(0)),
                Arguments.of(g3, lv1.get("W")),
                Arguments.of(g4, lv1.get("R")),
                Arguments.of(g5, lv1.get("R"))
        );
    }
}
