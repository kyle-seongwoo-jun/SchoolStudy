
public class ConversionTest { 
	public static void main(String[] args) {
		byte b;
		int i = 300;
		long j = 9876543210l;
		b = (byte)i;
		i = (int)j;
		System.out.println("b�� �� : "+b);
		System.out.println("i�� �� : "+i);
		System.out.println("j�� �� : "+j);
	}
}