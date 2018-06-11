import java.util.ArrayList;
import java.lang.reflect.Array;
import java.awt.Point;

//Author: Lily Li
//Date created: 6/10/18

public class Node { 
	Point point;
	ArrayList<Node> children;
	Node parent;
	
	//constructor
	public Node(Point x) {
		this.point = x;
		children = new ArrayList<Node>();
	}
	
	public Node(Point x, ArrayList<Node> children) {
		this.point = x;
		this.children = children;
	}
	   
	public Node(Point x, ArrayList<Node> children, Node parent) {
		this.point = x;
		this.children = children;
		this.parent = parent;
	}
		
	//return a list of all connected nodes
	public ArrayList<Node> getChildren(){
		return this.children;
	}
	
	//used to set the children of a node
	public void setChildren (ArrayList<Node> children) {
		this.children = children;
	}
	
	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public boolean equals(Object x) {
		Node check = (Node) x;
		return(check.point.equals(this.point));
	}
}
