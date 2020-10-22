package AbstractAndInterfaces;

interface A {
	void a();
	void b();
	void c();
	void d();
}

abstract class B implements A {
	
	@Override
	public void c() {
		System.out.println("I am c");
	}
}

class M extends B {

	@Override
	public void a() {
		System.out.println("I am a");

	}

	@Override
	public void b() {
		System.out.println("I am b");

	}

	@Override
	public void d() {
		System.out.println("I am d");

	}
}

class BasicInterface {
	public static void main(String args[]) {
		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}
