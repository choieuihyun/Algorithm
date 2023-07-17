package linkedList;

public class Node {
	
	private int data; // 노드에 데이터로 저장될 정수형 필드 data
	private Node next; // 다음 노드에 대한 참조 정보를 저장할필드 next
	
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
