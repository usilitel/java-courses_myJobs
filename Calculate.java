public class Calculate{
	public static void main(String[] arg){
		long n1 = Long.valueOf(arg[0]);
		long n2 = Long.valueOf(arg[1]);
		long r1 = n1 + n2;
		long r2 = n1 - n2;
		long r3 = n1 * n2;
		//float r4 = Float.valueOf(n1) / n2;
		float r4 = (float)n1 / n2;
		double r5 = Math.pow(n1, n2);
		
		System.out.println(n1 + " + " + n2 + " = " + r1);
		System.out.println(n1 + " - " + n2 + " = " + r2);
		System.out.println(n1 + " * " + n2 + " = " + r3);
		System.out.println(n1 + " / " + n2 + " = " + r4);
		System.out.println(n1 + " ^ " + n2 + " = " + r5);		
	}
}