package org.oom.binarycomposite;

public interface Tree {
	public void add(Tree node);
	public void remove(Tree node);
	public Tree getChild(int i);
	public double getInfo();
	public void print();
}
