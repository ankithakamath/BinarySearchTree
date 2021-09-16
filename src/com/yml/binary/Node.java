package com.yml.binary;


	public class Node<K extends Comparable<K>> {
		K key;
		Node<K> left;
		Node<K> right;
		public Node(K key)
		{
			this.key=key;
			this.left=this.right=null;
		}
	}


