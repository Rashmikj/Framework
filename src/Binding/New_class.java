package Binding;

public class New_class {

	public static class baseclass {
		static void print()
		{
		System.out.println("print in super class.");
		}
		}
		public static class derivedclass extends baseclass {
		static void print()
		{
		System.out.println("print in child class.");
		}
		static void print1() {
			System.out.println("different method");
		}
		}

		public static void main(String[] args)
		{
			System.out.println("=====================upcasting===========================");
		baseclass A = new baseclass();
		baseclass B = new derivedclass();
		A.print();
		B.print();
		
		
		
		System.out.println("=========================downcasting=======================");
		derivedclass c=(derivedclass)B;
		c.print();
		c.print1();
		derivedclass d=new derivedclass();
		d.print();
		
		}
}
