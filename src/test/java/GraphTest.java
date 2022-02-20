import app.BFS.Graph;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {

    @BeforeAll
    public void init(){
        Graph g = new Graph(10);
    }

    @Test
    public void epmtyGraphTest(){
        Graph g = new Graph(0);
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> g.BFS(0));
        assertEquals("0", exception.getMessage());
    }

    @Test
    public void graphWithoutPurposeTest(){
        Graph g = new Graph(0);
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> g.BFS(0));
        assertEquals("0", exception.getMessage());
    }


}
