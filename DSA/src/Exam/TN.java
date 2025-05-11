package Exam;

public class TN {
	
	private int data;
	private TN left,right;
	
	
	public TN ()
	{
		data = 0;
		left = right = null;
	}
	
	public TN (int d)
	{
		data = d;
		left = right = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TN getLeft() {
		return left;
	}

	public void setLeft(TN left) {
		this.left = left;
	}

	public TN getRight() {
		return right;
	}

	public void setRight(TN right) {
		this.right = right;
	}
	
	
	

}
