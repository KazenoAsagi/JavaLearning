package com.dlq.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author KznAsg
 * @version 2022/10/25  上午 9:49
 * @description 广度优先搜索
 * @page
 * @link https://cp-algorithms.com/graph/breadth-first-search.html#implementation
 */

public class BreadthFirstSearch {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    LinkedList<Integer> queue = new LinkedList<>();
    boolean[] isUsed;
    int[] d_pathLengths;
    int[] parents;
    private int numOfNodes;
    private int srcVertex;
    
    public BreadthFirstSearch(int numOfNodes, int srcVertex) {
        this.numOfNodes = numOfNodes;
        this.srcVertex = srcVertex;
    }
    
    public void initialization() {
        isUsed = new boolean[numOfNodes];
        d_pathLengths = new int[numOfNodes];
        parents = new int[numOfNodes];
        
        queue.push(srcVertex);
        isUsed[srcVertex] = true; // while others are all false
        parents[srcVertex] = -1;
    }
    
    public void doBreadthFirstSearch() {
        while (queue.isEmpty()) {
            int pop = queue.pop();
            for (Integer get : adjList.get(pop)) {
                if (!isUsed[get]) {
                    isUsed[get] = true;
                    queue.push(get);
                    d_pathLengths[get] = d_pathLengths[pop] + 1;
                    parents[get] = pop;
                }
            }
        }
    }
    
}
