package cse360assign2;

public class Calculator1 {
	private int total;
	StringBuffer history;
	public Calculator1() {
		total = 0;
		history = new StringBuffer("0");
	}
	public int getTotal() {
		return total;
	}
	public void add(int value) {
		total = total + value;
		history.append(" + " + value);
	}
	public void subtract(int value) {
		total = total - value;
		history.append(" - " + value);
	}
	public void multiply(int value) {
		total = total * value;
		history.append(" * " + value);
	}
	public void divide(int value) {
		if (value == 0)
			total = 0;
		else
			total = total/value;
		history.append(" / " + value);
	}
	public String getHistory() {
		return history.toString();
	}
}