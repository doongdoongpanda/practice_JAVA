package d10_main;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = { 5, 10, 12};
		
		try {
			System.out.println(numbers[3]);
		}catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("NullPointer Exception");
		}catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println(numbers[2]);//ȸ�翡�� ��Ȯ�� �����ľ� ���� 
			//e.printStackTrace();
			System.out.println("ArrayIndexOutOfBounds Exception");
		}catch (Exception e) {//���� ū����
			System.out.println("general exception");
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}

	}
}

