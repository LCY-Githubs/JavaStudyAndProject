package Group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    //存储顶点的集合
    List<String> vertexList;
    //存储图的领接矩阵
    int[][] edges;
    //标识边的条数
    int numEdges;
    //表示是否被遍历过
    boolean[] marked;
    public Graph(int n){
        //初始化存储顶点的集合，初始化矩阵
        vertexList = new ArrayList<>();
        edges = new int[n][n];
        marked = new boolean[n];
    }

    //找当前节点的领结节点对应的下标w
    public int adj(int v){
        for (int i = 0; i < vertexList.size(); i++) {
            if (edges[v][i]!=0){
                return i;
            }
        }
        //没找到
        return -1;
    }
    //返回给定下标的顶点值
    public String getVertex(int index){
        return vertexList.get(index);
    }

    //返回顶点的个数
    public int numVertex(){
        return vertexList.size();
    }
    //显示图对应的矩阵
    public void show(){
        for (int[] edge : edges) {
            System.out.println(Arrays.toString(edge));
        }
    }
    //返回v1和v2的全职
    public int weight(int v1,int v2){
        return edges[v1][v2];
    }
    //插入节点
    public  void insertVertex(String vertex){
        vertexList.add(vertex);
    }

    //添加边
    public void insertEdge(int v1 ,int v2 ,int w){
        edges[v1][v2] = w;
        edges[v2][v1] = w;
        numEdges++;
    }

    //dfs
    public void dfs(int v){
        System.out.print(getVertex(v)+"=>");
        marked[v] = true;
        for (int i = adj(v); i < vertexList.size(); i++) {
            if (edges[v][i]!=0&&!marked[i]){
                dfs(i);
            }
        }
    }

    //遍历所有的节点
    public void dfs(){
        marked = new boolean[vertexList.size()];
        for (int i = 0; i < vertexList.size(); i++) {
            if (!marked[i]){
                dfs(i);
            }
        }
    }

    //广度优先搜索
    public void bfs(int i){
        //创建一个链表进行存储
        LinkedList<Integer> list = new LinkedList<>();
        marked[i] = true;

        list.addLast(i);
        while (!list.isEmpty()){
            Integer v = list.removeFirst();
            System.out.print(getVertex(v)+"=>");
            for (int w = adj(v); w < vertexList.size(); w++) {
                if (edges[v][w]!=0&&!marked[w]){
                    marked[w] = true;
                    list.addLast(w);
                }
            }
        }
    }

    public void bfs(){
        marked = new boolean[vertexList.size()];
        for (int i = 0; i < vertexList.size(); i++) {
            if (!marked[i]){
                bfs(i);
            }
        }
    }










    public void myBfs(){
        marked = new boolean[vertexList.size()];
        for (int i = 0; i < vertexList.size(); i++) {
            if (!marked[i]){
                myBfs(i);
            }
        }
    }
    public void myBfs(int v){
        marked[v] = true;
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(v);
        while (!list.isEmpty()){

            //遍历所有的子节点
            Integer first = list.removeFirst();
            System.out.print(first+"-");
            System.out.print(getVertex(first)+"=>");
            for (int w = adj(first); w < vertexList.size(); w++) {
                if (edges[first][w]!=0&&!marked[w]){//相通且没被访问过{}
                    list.addLast(w);
                    //标记为已访问
                    marked[w] = true;
                }
            }
        }
    }

    //myDFS
    public void myDfs(){
        marked = new boolean[vertexList.size()];
        for (int i = 0; i < vertexList.size(); i++) {
            if (!marked[i]){
                myDfs(i);
            }
        }
    }
    public void myDfs(int i){
        marked[i] = true;
        System.out.print(getVertex(i)+"=>");
        for (int j = adj(i); j < vertexList.size(); j++) {
            if (edges[i][j]!=0&&!marked[j]){
                myDfs(j);
            }
        }
    }






}
