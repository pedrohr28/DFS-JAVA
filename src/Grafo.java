
import java.util.ArrayList;


public class Grafo
{
    protected int numeroVertices;
    protected int[][] matrizAdjacencia;
    
    public Grafo(int vertices)
    {
        this.matrizAdjacencia=new int[vertices][vertices];
        this.numeroVertices=vertices;
        
        for(int i=0;i<vertices;i++)
        {
            for(int j=0;j<vertices;j++)
            {
                this.matrizAdjacencia[i][j]=0;
            }
        }
    }
    public void insereAresta(int vertice1, int vertice2, int peso)
    {
        this.matrizAdjacencia[vertice1][vertice2]=peso;
    }
    public boolean existeAresta(int vertice1, int vertice2)
    {
        return (this.matrizAdjacencia[vertice1][vertice2]>0);
    }
    ArrayList<Integer> listaDeAdjacencia(int vertice1)
    {
        ArrayList aux = new ArrayList();
        for(int i=0; i<this.numeroVertices;i++){
            if(this.matrizAdjacencia[vertice1][i]!=0){
                aux.add(i);
            }
        }
        return aux;
    }
    
    public int getPeso(int vertice1, int vertice2)
    {
        return this.matrizAdjacencia[vertice1][vertice2];
    }
}
