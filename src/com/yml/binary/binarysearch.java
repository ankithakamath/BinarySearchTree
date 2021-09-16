package com.yml.binary;


	public class binarysearch<K extends Comparable<K>> {
		private Node<K> root;

		public void add(K key) {
			this.root = this.addRecursively(root, key);
		}

		//to add a new node
		public Node<K> addRecursively(Node<K> current, K key) {
			if (current == null)
				return new Node<>(key);
			int compareResult = key.compareTo(current.key);
			if (compareResult == 0)
				return current;
			if (compareResult < 0) {
				current.left = addRecursively(current.left, key);
			} else {
				current.right = addRecursively(current.right, key);
			}

			return current;
		}
		public int getSize() {
			return this.getSizeRecursive(root);
		}
		public void printNodes() {
			printNodes(root);
		}
		private int getSizeRecursive(Node<K> current) {
			return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
		}

//printing nodes
		public void printNodes(Node<K> root) {
			if (root == null)
				return;
			printNodes(root.left);
			System.out.print(root.key + " ");
			printNodes(root.right);

		}

	}

