package app.BFS;

import java.util.LinkedList;


public class Graph {
    private final int size;
    private final LinkedList<Integer>[] adj;


    // DFS
    public LinkedList<Integer> DFS(int start)
    {
        if (start < 0) throw new IllegalArgumentException("Нельзя начать поиск с отрицательной вершины");
        if (start >= adj.length) throw new IllegalArgumentException("Нельзя начать поиск с вершины вне графа");

        boolean[] visited = new boolean[size];
        LinkedList<Integer> result = new LinkedList<>();

        DFSUtil(start, visited, result);
        return result;
    }
}