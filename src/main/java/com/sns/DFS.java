package com.sns;

import java.util.List;
import java.util.Stack;

/**
 * Depth First Search
 *
 * This will search as far as possible on a single branch and then moves to other branches
 * In order to implement this algorithm we uses Slack which is first come last go
 * Stack has pop method which is going to get the last object and removes it
 */

public class DFS {
    private Stack<Vertex> stack;

    public DFS(){
        this.stack = new Stack<>();
    }
    public void dfs(List<Vertex> vertexList){
        for(Vertex v:vertexList){
            if(!v.isVisited()){
                v.setVisited(true);

            }
        }
    }

    private void dfsHelper(Vertex vertex){
        stack.add(vertex);
        vertex.setVisited(true);
        while(!stack.isEmpty()){
            Vertex actualVertex = stack.pop();
            System.out.println(actualVertex.getName());
            for(Vertex adjacent:actualVertex.getAdjacencyList()){
                if(!adjacent.isVisited()){
                    adjacent.setVisited(true);
                    stack.add(adjacent);
                }
            }
        }
    }

}
