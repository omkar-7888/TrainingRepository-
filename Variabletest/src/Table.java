
public class Table {

	public static void main(String[] args) {
		Table t1 = new Table();
		t1.table(5);
		System.out.println("Table Generated:");
		
		}
	public void table(int num) {
	 
		for (int i = 1;i<=10;i++) {
			int t = num *i;
			System.out.println(num+"*"+i+"="+t);
		}
	}

	}


