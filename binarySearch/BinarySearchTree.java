package binarySearch;

import javax.management.RuntimeErrorException;

public class BinarySearchTree {

	Node root;
	 void insert(int data) {
		 Node n=new Node(data);
		 
		 Node r = null;
		 if(root==null) {
			 root=n;
		 }
		 Node temp=root;
		while(temp!=null) {
			r=temp;
			if(temp.data>data) {
				temp=temp.left;
			}else if(temp.data<data) {
				temp=temp.right;
			}else {
				return;
			}
		}
		if(r.data>data) {
			r.left=n;
		}else {
			r.right=n;
		}
		 
	 }

	/*
	 * void insert(int data) { Node newNode=new Node(data); Node temp=root; Node r =
	 * null; if(root==null) { root=newNode; return; } while(temp!=null) { r=temp;
	 * 
	 * if(temp.data>data) { temp=temp.left; }else if(temp.data<data) {
	 * temp=temp.right; }else { return; } } if(r.data>data) { r.left=newNode; }else
	 * { r.right=newNode; } }
	 */
 
 boolean search(Node r,int data) {
	 Node temp=r;
	 
	 while(temp!=null) {
		 if(temp.data==data) {
			 return true;
		 }
		 if(temp.data>data) {
			 temp=temp.left;
		 }else {
			 temp=temp.right;
		 }
	 }
	 return false;
 }
 
 
 void delete(int data) {// we need to take inorder producer(left child and then bottom right child
	 // in order sucesser(right child and bottom most left child will take its place
	 Node temp=root;
	 Node r;
	 Node l1;
	 Node r2;
	 
	 if(root==null) {
		 throw new RuntimeException("No records");
	 }
	 while(temp!=null) {
		 r=temp;
		 if(temp.data==data) {
			 break;
		 }
		 if(temp.data>data) {
			 temp=temp.left;
		 }else  if(temp.data<data) {
			 temp=temp.right;
		 }else {
			 throw new RuntimeException("No Deleted Record");
		 }
	 }
	 
 }
 
 
 public void inOrder(Node r) {
	 if(r!=null) {
		 inOrder(r.left);
		 System.out.print(r.data+" ");
		 inOrder(r.right);
	 }
 }
 public void inOrderIterator(Node r) {
	 Node temp=r;
	 while(temp!=null) {
		 
	 }
	 if(r!=null) {
		 inOrder(r.left);
		 System.out.print(r.data);
		 inOrder(r.right);
	 }
 }
}
