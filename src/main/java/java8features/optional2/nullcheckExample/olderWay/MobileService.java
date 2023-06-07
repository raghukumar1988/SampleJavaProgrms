package java8features.optional2.nullcheckExample.olderWay;

public class MobileService {
	
	public int getMobileScreenWidth(Mobile mobile){

		if(mobile != null){
			DisplayFeatures displayFeatures = mobile.getDisplayFeatures();
			if(displayFeatures != null){
				ScreenResolution resolution = displayFeatures.getResolution();
				if(resolution != null){
					return resolution.getWidth();
				}
			}
		}
		return 0;

	}

}