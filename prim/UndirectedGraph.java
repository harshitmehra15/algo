package prim;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Iterator;
public class UndirectedGraph {
	HashMap<Vertex,LinkedList<Vertex>> adjList;
	HashMap<Vertex,LinkedList<Edge>> adjListEdges;
	LinkedList<Vertex> vertices;
	public UndirectedGraph() {
		this.adjList = new HashMap<Vertex,LinkedList<Vertex>>();
		this.adjListEdges = new HashMap<Vertex,LinkedList<Edge>>();
		this.vertices=new LinkedList<Vertex>();
	}
	
	public void addEdge(Vertex source, Vertex destination, int weight) {
		if(!this.adjList.containsKey(source)) {
			this.adjList.put(source, new LinkedList<Vertex>());
			this.vertices.add(source);
		}
		this.adjList.get(source).add(destination);
		
		if(!this.adjList.containsKey(destination)) {
			this.adjList.put(destination, new LinkedList<Vertex>());
			this.vertices.add(destination);
		}
		this.adjList.get(destination).add(source);
		
		Edge edge = new Edge(source,destination,weight);
		if(!this.adjListEdges.containsKey(source)) {
			this.adjListEdges.put(source, new LinkedList<Edge>());
		}
		this.adjListEdges.get(source).add(edge);
	}
	public void primMST(Vertex root) {
		this.initializeVertices();
		if(!this.adjList.containsKey(root)) {
			System.out.println("vertex not present");
			return;
		}
		root.dist=0;
		MinHeap<Vertex> minQueue = new MinHeap<Vertex>((Vertex[]) this.vertices.toArray());
		while(!minQueue.isEmpty()) {
			
		}
	}

	private void initializeVertices() {
		// TODO Auto-generated method stub
		Iterator<Vertex> it = this.vertices.iterator();
		while(it.hasNext()) {
			Vertex v = it.next();
			v.dist=999999999;
			v.parent=null;
		}
	}
}
