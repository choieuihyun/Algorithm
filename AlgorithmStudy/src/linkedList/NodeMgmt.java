package linkedList;

public class NodeMgmt {
	
	private Node head;
	
	public NodeMgmt(int data) {
		this.head = new Node(data);
	}
	
	public void add(int data) { // ������ ��
		if(this.head == null) {
			// ���� ����Ʈ�� ����� ���� ��� ��� ��
			this.head = new Node(data);
		} else {
			
			// ���� ������ ��� �ڿ� ������ �߰�
			Node node = this.head;
			
			while(node.getNext() != null) {
				node = node.getNext();
			}
			
			node.setNext(new Node(data));
		}
	}
	
	public void desc() {
		Node node = this.head;
		while(node != null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
	}
	
	public void delete(int data) {
		
		boolean search = false;
		
		if(this.head == null) {
			System.out.println("���� ����Ʈ�� �������� ���� �����Դϴ�.");
			System.out.println("���� ����Ʈ�� ���� ������ �ֽʽÿ�");
			System.out.println();
		} else if(this.head.getData() == data) {
			// ����� �����ϴ� ���
			Node temp = this.head;
			this.head = this.head.getNext(); // ��� ���� ���� ��� ���� ������ �������ְ�,
			// ���� ��� ���� ������ null�� ��.
			temp = null;
			
			// �ƹ��͵� �������� �ʴ� ��ü�� GC�� ����� �Ǿ� �޸𸮿��� �ڵ����� �����ȴ�.
			System.out.println("�����Ͱ� ���������� �����Ǿ����ϴ�.");
			System.out.println();
		} else {
			// �߰� ���, �Ǵ� ������ ��带 ������ ���
			Node node = this.head;
			
			while(node.getNext() != null) {
				if(node.getNext().getData() == data) {
					Node temp = node.getNext();
					node.setNext(node.getNext().getNext());
					
					temp = null;
					search = true;
					break;
				} else
					node = node.getNext();
			}
			
			if(search) {
				System.out.println("�����Ͱ� ���������� �����Ǿ����ϴ�.");
				System.out.println();
			}else {
				System.out.println("�Է��Ͻ� �����Ͱ� �������� �ʽ��ϴ�.");
				System.out.println();
			}
		}
		
	}

}
