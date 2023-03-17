package AbstractAndInterfaces.interfaces;
class Device implements IDevice {
	public void doIt() {  //commenting this method  will throw error in Phone 3
		System.out.println("Inside doIt method of device..");
	}

	public static void main(String[] args) {
		IDevice device = new Device();
		device.doIt();
	}
}

//no unimplemented error because extended class(Device) has already implemented it
class Phone3 extends Device implements IDevice {
	public void doStuff() {
		System.out.println("Inside doStuff method of Phone3..");
	}

	public static void main(String[] args) {
		Phone3 phone3= new Phone3();
		phone3.doStuff();
		phone3.doIt();;

		Device device= new Phone3();
		device.doIt();

		IDevice device1= new Phone3();
		device1.doIt();
	}
}

interface IDevice {
	void doIt();
}