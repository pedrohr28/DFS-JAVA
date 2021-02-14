
import java.util.ArrayList;


public class AlgoritmosEmGrafos extends Grafo
{
    private final int[] distanciaProfundidade;
    private final int[] verticePredecessor;
    
    public AlgoritmosEmGrafos(int vertices){
        super(vertices);
        this.distanciaProfundidade=new int[vertices];
        this.verticePredecessor=new int[vertices];
    }
    public void iniciaBuscaEmProfundidade(int vertice)       
    {
        for(int i = 0; i < this.numeroVertices; i++){
            this.distanciaProfundidade[i] = this.numeroVertices + 1;
            this.verticePredecessor[i] = -1;
        }
        
        distanciaProfundidade[vertice] = 0; //o vertice inicial sempre tem distancia 0
        
        this.buscaProfundidade(vertice);
    }
    
    private void buscaProfundidade(int vertice)
    {      
       ArrayList<Integer> vizinhos = this.listaDeAdjacencia(vertice);
       
       for(Integer vizinho: vizinhos)
       {
 
           // numero de vertice + 1 = infinito
           //se a distancia eh infinita, o vertice nao foi visitado
           if(this.distanciaProfundidade[vizinho] == this.numeroVertices +1)
           {
                this.distanciaProfundidade[vizinho] = this.distanciaProfundidade[vertice] +1; //atualiza a distancia
                this.verticePredecessor[vizinho] = vertice; //atualiza o pai
                buscaProfundidade(vizinho); //chama de novo
           }
            
       }   
    }
    public int[] getDistanciaProfundidade()
    {
        return this.distanciaProfundidade;
    }
    public int[] getVerticePai()
    {
        return this.verticePredecessor;
    }
}
