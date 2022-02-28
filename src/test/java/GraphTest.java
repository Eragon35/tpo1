import app.BFS.Graph;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {

    static Graph g;
    @BeforeAll
    static void init(){
        g = new Graph(8);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 4);
        g.addEdge(1, 3);
        g.addEdge(1, 5);
        g.addEdge(3, 5);
        g.addEdge(3, 7);
        g.addEdge(5, 6);
        g.addEdge(7, 4);
    }

    @Test
    public void illegalConstructorExceptionTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Graph(0));
        assertEquals("Граф не может состоять меньше чем из 1 вершины", exception.getMessage());
    }

    @Test
    public void negativeVertexExceptionFirstParamTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> g.addEdge(-1, 2));
        assertEquals("Вершина не может быть отрицательным элементов", exception.getMessage());
    }

    @Test
    public void negativeVertexExceptionSecondParamTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> g.addEdge(1, -2));
        assertEquals("Вершина не может быть отрицательным элементов", exception.getMessage());
    }

    @Test
    public void vertexOutOfGraphExceptionFirstParamTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> g.addEdge(9, 1));
        assertEquals("Нельзя добавлять вершины вне графа", exception.getMessage());
    }

    @Test
    public void vertexOutOfGraphExceptionSecondParamTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> g.addEdge(0, 10));
        assertEquals("Нельзя добавлять вершины вне графа", exception.getMessage());
    }

    @Test
    public void startSearchOutsideGraphExceptionTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> g.DFS( 35));
        assertEquals("Нельзя начать поиск с вершины вне графа", exception.getMessage());
    }

    @Test
    public void startSearchFromNegativeVertexExceptionTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> g.DFS( -2));
        assertEquals("Нельзя начать поиск с отрицательной вершины", exception.getMessage());
    }

    @Test
    public void vertexWithoutConnectionTest(){
        Graph g = new Graph(5);
        LinkedList<Integer> list = new LinkedList<>(Collections.singletonList(2));
        assertEquals(list, g.DFS(2));
    }

    @Test
    public void positiveTest1() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(0, 1, 3, 5, 6, 7, 4, 2));
        assertEquals(list, g.DFS(0));
    }

    @Test
    public void positiveTest2(){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(6, 5, 1, 0, 2, 4, 7, 3));
        assertEquals(list, g.DFS(6));
    }



}
