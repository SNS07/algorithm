package com.sns;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Breadth First Search Algorithm
 * It will traverse through all the nodes and edges
 * Uses a Queue to implement BSF Queue has first come first go
 */
public class BSF {
    class Vertex {
        private String name;
        private boolean isVisited;
        private List<Vertex> adjacencyList;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isVisited() {
            return isVisited;
        }

        public void setVisited(boolean visited) {
            isVisited = visited;
        }

        public List<Vertex> getAdjacencyList() {
            return adjacencyList;
        }

        public void setAdjacencyList(List<Vertex> adjacencyList) {
            this.adjacencyList = adjacencyList;
        }
    }

    public void traverse(Vertex vertex){
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(vertex);
        vertex.setVisited(true);
        while(!queue.isEmpty()){
            Vertex actualVertex = queue.remove();
            System.out.println(actualVertex.getName());
            for(Vertex ver:actualVertex.getAdjacencyList()){
                if(!ver.isVisited){
                    ver.setVisited(true);
                    queue.add(ver);
                }
            }
        }


    }

}
