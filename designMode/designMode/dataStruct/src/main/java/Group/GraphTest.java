package Group;

import org.junit.Test;

public class GraphTest {


    @Test
    public void Test(){
        String[] vertexes = {"a","B","C","D","E","F","G","H","I"};
        Graph graph = new Graph(vertexes.length);
        //添加顶点
        for (String vertex : vertexes) {
            graph.insertVertex(vertex);
        }
        //添加边
        graph.insertEdge(0,1,1);
        graph.insertEdge(0,5,1);
        graph.insertEdge(1,2,1);
        graph.insertEdge(1,6,1);
        graph.insertEdge(1,8,1);
        graph.insertEdge(2,3,1);
        graph.insertEdge(2,8,1);
        graph.insertEdge(3,8,1);
        graph.insertEdge(3,4,1);
        graph.insertEdge(3,6,1);
        graph.insertEdge(3,7,1);
        graph.insertEdge(4,5,1);
        graph.insertEdge(4,7,1);
        graph.insertEdge(5,6,1);
        graph.insertEdge(6,7,1);
        graph.show();
        System.out.println("DFS-----");
        graph.dfs();
        System.out.println();
        System.out.println("BFS--------");
        graph.bfs();
        System.out.println();
        System.out.println("MyBFS=========");
        graph.myBfs();
        System.out.println();
        System.out.println("MyDFS=========");
        graph.myDfs();



//        graph.insertVertex();
    }
}
