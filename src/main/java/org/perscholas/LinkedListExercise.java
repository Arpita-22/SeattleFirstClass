package org.perscholas;

import java.util.function.Function;

public class LinkedListExercise<E> {
	
	private class Node{
		
		//default access so the outer class can use them
		E value;
		Node next;
		Node prev;
		
		Node(Node prev, E value){
			this.prev = prev;
			this.value = value;
		}
		
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public int size() {
		return size;
	}
	
	public void addNode(E value){
		Node newNode = new Node(tail,value);
		if(head == null) {
			head = tail = newNode;	
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
			
	}
	
	public boolean removeNode(E value) {
		Node currentNode = head;
		
		while(currentNode != null) {
			if(value == null? currentNode.value == null: value.equals(currentNode.value)) {
				if(currentNode == head) {
					head = head.next;
				}else {
					currentNode.prev.next = currentNode.next;
				}
				
				if(currentNode.next != null) {
					currentNode.next.prev = currentNode.prev;
				}
				size --;
				return true;			
				
			}
			currentNode = currentNode.next;
			
		}
		return false;
	}
	
	
	public boolean contains(E value) {
		Node currentNode = head;
		
		while(currentNode != null) {
			if(value == null ? currentNode.value == null: value.equals(currentNode.value)) {
				return true;
			}
			currentNode = currentNode.next;
		}
		return false;
	}
	
	public static void main(String [] args) {
		LinkedListExercise<Integer> list = new LinkedListExercise<>();
		
		list.addNode(8);
	}
	
	public void traverse(Function<E, Boolean> method){
		Node currentNode = head;
		
		while(currentNode != null) {
		if(!method.apply(currentNode.value)) {
			return;
		}
		currentNode = currentNode.next;
		}		
	}
	
	public void reverseTraverse(Function<E, Boolean> method) {
		Node  currentNode = tail;
		
		while(currentNode != null) {
			if(!method.apply(currentNode.value)) {
				return;
			}
			currentNode = currentNode.prev;
		}
		
	}
	
	
}
