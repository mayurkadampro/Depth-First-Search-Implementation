package dfs;

import java.util.Stack;

public class DFS {

    private final Stack<Vertex> stack;

    public DFS() {
        this.stack = new Stack();
    }

//    public void goal(Vertex goal) {
//        stack.add(goal);
//        goal.setVisited(true);
//        if (goal.isVisited()) {
//            System.out.println("Found : " + goal + " Is Final Goal");
//            System.out.println("Successfull");
//            System.exit(0);
//        }
//
//    }

    public void dfs(Vertex root,Vertex goal) {
        stack.add(root);
        root.setVisited(true);

        while (!stack.isEmpty()) {
            Vertex acVertex = stack.pop();
            System.out.println("Actual Vertex : " + acVertex);

            for (Vertex v : acVertex.getAdjacenciesList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    v.setPredecessor(acVertex);
                    stack.push(v);
                }if(goal.isVisited())
                {
                    stack.add(goal);
                    goal.setVisited(true);
                    System.out.println("Found : " + goal + " Is Final Goal");
                    System.out.println("Successfull");
                    System.exit(0);
                }

            }
        }
    }
}
