package org.oom.binarycomposite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Node implements Tree{

	
	private double info;
	
	public Node(double info){
		this.info = info;
	}
	
	List<Tree> trees = new ArrayList<Tree>();
	public void add(Tree tree){
		trees.add(tree);
	}
	
		

	public Tree getChild(int i) {

		return trees.get(i);
	}

	public double getInfo() {

		return info;
	}


	public void print() {
		System.out.println("\n " + getInfo());
		
		
		Iterator<Tree> treeIterator = trees.iterator();
			while(treeIterator.hasNext()){
				Tree tree = treeIterator.next();
				tree.print();
			}
		
	}


	public void remove(Tree tree) {
		trees.remove(tree);
		
	}

}
