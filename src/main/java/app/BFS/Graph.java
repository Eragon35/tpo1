package app.BFS;

import java.util.LinkedList;


public class Graph {
    private final int size;
    private final LinkedList<Integer>[] adj;

    // constructor
    public Graph(int size)
    {
        if (size <= 0) throw new IllegalArgumentException("Граф не может состоять меньше чем из 1 вершины");
        this.size = size;
        adj = new LinkedList[size];
        for (int i = 0; i < size; ++i) adj[i] = new LinkedList<>();
    }

    public void addEdge(int v, int w) {
        if (v < 0) throw new IllegalArgumentException("Вершина не может быть отрицательным элементов");
        if (w < 0) throw new IllegalArgumentException("Вершина не может быть отрицательным элементов");
        if (v >= adj.length) throw new IllegalArgumentException("Нельзя добавлять вершины вне графа");
        if (w >= adj.length) throw new IllegalArgumentException("Нельзя добавлять вершины вне графа");

        adj[v].add(w);
        adj[w].add(v);
    }

    private void DFSUtil(int v, boolean[] visited, LinkedList<Integer> result)
    {

        // mark the current node as visited and print it -> adding to result list
        visited[v] = true;
        result.add(v);
//        System.out.print(v + " ");

        // recursive for all the vertices neighbor to this vertex that not visited
        for (int n : adj[v]) if (!visited[n]) DFSUtil(n, visited, result);
    }

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

    public static void main(String[] args)
    {
        Graph g = new Graph(8);

//        g.addEdge(0, 1);
//        g.addEdge(0, 2);
//        g.addEdge(0, 4);
//        g.addEdge(1, 3);
//        g.addEdge(1, 5);
//        g.addEdge(3, 5);
//        g.addEdge(3, 7);
//        g.addEdge(7, 4);
//        g.addEdge(5, 6);


        LinkedList<Integer> answer = g.DFS(6);
        answer.forEach(System.out::print);
    }
}