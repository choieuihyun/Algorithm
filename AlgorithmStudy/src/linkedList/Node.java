package linkedList;

public class Node {
	
	private int data; // ��忡 �����ͷ� ����� ������ �ʵ� data
	private Node next; // ���� ��忡 ���� ���� ������ �������ʵ� next
	
	public Node(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	

}
