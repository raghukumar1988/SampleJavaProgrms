package AbstractAndInterfaces;
class SCJP_Computer implements Device {
	public void doIt() {  //commenting this method  will throw error in Phone 3
	}
}

abstract class Phone1 extends SCJP_Computer {
}

abstract class Phone2 extends SCJP_Computer {
	public void doIt(int x) {
	}
}

//no unimplemented error because extended class(SCJP_Computer) has already implemented it
class Phone3 extends SCJP_Computer implements Device { 
	public void doStuff() {
	}
}

interface Device {
	public void doIt();
}