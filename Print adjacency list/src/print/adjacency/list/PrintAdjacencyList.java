/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print.adjacency.list;
import java.util.Scanner;
/**
 *
 * @author vidyakamal
 */
public class PrintAdjacencyList {

    public static class Graph{
        int noVertex;
        int noEdge;
        int adjMatrix[][];
        public Graph(int vertex, int edge){
            
            noVertex = vertex;
            noEdge = edge;
            adjMatrix = new int[vertex][vertex];
            
        }
        
        void addEdge(int source, int dest){
            
            adjMatrix[source][dest]= 1;
            adjMatrix[dest][source]= 1;
            
        }
        
        void printMatrix(){
            
            for(int i=0; i<noVertex; i++){
                
                System.out.print(i);
                for(int j=i+1; j<noVertex; j++){
                    if(adjMatrix[i][j]==1){
                        System.out.print("-> "+j);
                    }
                }
                for(int j=0; j<=i; j++){
                    if(adjMatrix[i][j]==1){
                        System.out.print("-> "+j);
                    }
                }
                
                System.out.println();
            }
            
        }
    }
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            
            int v = sc.nextInt();
            int e = sc.nextInt();
            Graph gf = new Graph(v,e);
            
            while(e-->0){
                gf.addEdge(sc.nextInt(), sc.nextInt());
            }
            
            gf.printMatrix();
        }
    }
    
}
