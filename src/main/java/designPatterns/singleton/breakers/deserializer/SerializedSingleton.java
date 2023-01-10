package designPatterns.singleton.breakers.deserializer;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = -3567602570639362667L;

	//private static final SerializedSingleton instance = new SerializedSingleton();
	private static volatile SerializedSingleton instance = new SerializedSingleton();

	private  SerializedSingleton() {
	}

	public static SerializedSingleton getInstance() {
		return instance;
	}

	/*readResolve wont create new Instance it return existing Instance.
	 * if you are not implement readResolve then deserialize create new Instance*/

	/*protected Object readResolve() {
		System.out.println("read reslove called");
		return getInstance();
	}*/
}
