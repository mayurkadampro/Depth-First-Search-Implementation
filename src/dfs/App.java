
package dfs;


public class App {
    
    
    
    public static void main(String[] args) {
        
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");
        Vertex vertexF = new Vertex("F");
        Vertex vertexG = new Vertex("G");
        Vertex vertexH = new Vertex("H");
        Vertex vertexI = new Vertex("I");
        Vertex vertexJ = new Vertex("J");
        Vertex vertexK = new Vertex("K");
        Vertex vertexL = new Vertex("L");
        Vertex vertexM = new Vertex("M");
        Vertex vertexN = new Vertex("N");
        Vertex vertexO = new Vertex("O");
        Vertex vertexP = new Vertex("P");
        Vertex vertexQ = new Vertex("Q");
        Vertex vertexR = new Vertex("R");
        Vertex vertexS = new Vertex("S");
        
        
        
        
        
        
        vertexA.addnebh(vertexB);
        vertexA.addnebh(vertexC);
        vertexA.addnebh(vertexD);
        
        vertexB.addnebh(vertexG);
        vertexB.addnebh(vertexE);
        vertexB.addnebh(vertexF);
        
        vertexC.addnebh(vertexH);
        vertexC.addnebh(vertexI);
        vertexC.addnebh(vertexJ);
        
        vertexD.addnebh(vertexL);
        vertexD.addnebh(vertexM);
        
        vertexE.addnebh(vertexN);
        vertexE.addnebh(vertexO);
        
        vertexF.addnebh(vertexP);
        vertexF.addnebh(vertexQ);
        vertexF.addnebh(vertexR);
        vertexF.addnebh(vertexS);
        

        
        DFS dfs = new DFS();
        dfs.dfs(vertexA,vertexQ);


        

        
        
    } 

}
