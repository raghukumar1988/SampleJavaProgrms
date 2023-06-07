package java8features.optional2.nullcheckExample.olderWay;

public class MobileTesterWithoutOptional {

    public static void main(String[] args) {
		MobileService mService = new MobileService();

        ScreenResolution resolution = new ScreenResolution(750, 1334); // width 750
        DisplayFeatures displayFeatures = new DisplayFeatures("4.7", resolution);
        Mobile mobile = new Mobile(2015001, "Apple", "iPhone 6s", displayFeatures);
        int mobileWidth = mService.getMobileScreenWidth(mobile);
        System.out.println("Apple iPhone 6s Screen Width = " + mobileWidth);

        ScreenResolution resolution2 = new ScreenResolution(250, 0);// width 250
        DisplayFeatures displayFeatures2 = new DisplayFeatures("0", resolution2);
        Mobile mobile2 = new Mobile(2015001, "Apple", "iPhone 6s", displayFeatures2);
        int mobileWidth2 = mService.getMobileScreenWidth(mobile2);
        System.out.println("Apple iPhone 16s Screen Width = " + mobileWidth2);

    }

}