package p2;

public class additional {
	 	String a;
		int b;
		double c, d;
		
		public additional(String a, int b, double c, double d) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			
		}
		public additional (String a) {
			this.a = a;
		}
		
		public void printAll() {
		System.out.print(this.a + "/" + this.b + "/" + this.c + "/"+ this.d +"\n");
		}

		
}
			