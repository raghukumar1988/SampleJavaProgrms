package java8features.optional22.nullcheckExample.java8Way;


import java.util.Optional;

public class MobileService {
	
	public int getMobileScreenWidth(Optional<Mobile> mobile){
		return mobile.flatMap(Mobile::getDisplayFeatures)
				.flatMap(DisplayFeatures::getResolution)
				.map(ScreenResolution::getWidth)
				//.or(()->Optional.of(7)).get();
				//.orElse(0); // Option 1

				/*.orElseGet(()-> { // Option 2
					System.out.println("Unable to find Width, Returning default");
					return 1;
				});*/

				//.orElseThrow(); // Option 3 - default exception

				.orElseThrow(IllegalArgumentException::new);  // Option 4


	}

	/*  Refer - https://mkyong.com/java8/java-8-optional-in-depth/
	Very Good -https://stackabuse.com/guide-to-optional-in-java-8/   */

}