
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Lista6 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        AlgoritmosEmGrafos grafo = null;
        int arestas=0, vertices=0;
        int vertice1,vertice2;
        int primeira_linha=0;
        BufferedReader ler = new BufferedReader(new FileReader("/home/aluno/Downloads/grafo1.txt")); 
        while(ler.ready())
        { 
            String linha= ler.readLine();
            String []textosplit= linha.split(" ");
            if(primeira_linha==0)
            {
                vertices=Integer.valueOf(textosplit[0]);
                arestas=Integer.valueOf(textosplit[1]);
                grafo=new AlgoritmosEmGrafos(vertices);
                primeira_linha++;
                System.out.println(vertices+" "+arestas);
            }
            else
            {
                vertice1=Integer.valueOf(textosplit[0]);
                vertice2=Integer.valueOf(textosplit[1]);
                grafo.insereAresta(vertice1,vertice2 ,1);
                System.out.println(vertice1+" "+vertice2);
            }
            
	} 
        
	ler.close(); 
        grafo.iniciaBuscaEmProfundidade(0);
        int precedentes[];
        int distancia[];
        precedentes=grafo.getVerticePai();
        distancia=grafo.getDistanciaProfundidade();
        for(int i=0;i<grafo.numeroVertices;i++)
        {
            System.out.println("Vertice "+i+" Precedentes = "+precedentes[i]+" , Distancia = "+distancia[i]);
            
        }
        /*
        Grafo grafo2=null;
        BufferedReader ler2 = new BufferedReader(new FileReader("/home/aluno/Downloads/grafo2.txt")); 
        while(ler2.ready())
        { 
            String linha= ler.readLine();
            String []textosplit= linha.split(" ");
            if(primeira_linha==0)
            {
                vertices=Integer.valueOf(textosplit[0]);
                arestas=Integer.valueOf(textosplit[1]);
                grafo2=new Grafo(vertices);
                primeira_linha++;
            }
            else
            {
                vertice1=Integer.valueOf(textosplit[0]);
                vertice2=Integer.valueOf(textosplit[1]);
                grafo2.insereAresta(vertice1,vertice2 ,1);
            }
    
	} 
        ler2.close(); */ 
    }
}
