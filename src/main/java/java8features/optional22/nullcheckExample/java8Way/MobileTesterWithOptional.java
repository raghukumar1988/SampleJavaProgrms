package java8features.optional22.nullcheckExample.java8Way;

import java.util.Optional;

public class MobileTesterWithOptional {

    public static void main(String[] args) {
        MobileService mService = new MobileService();

        ScreenResolution resolution = new ScreenResolution(750, 1334);
        DisplayFeatures displayFeatures = new DisplayFeatures("4.7", Optional.of(resolution));
        Mobile mobile = new Mobile(2015001, "Apple", "iPhone 6s", Optional.of(displayFeatures));
        int width = mService.getMobileScreenWidth(Optional.of(mobile));
        System.out.println("Apple iPhone 6s Screen Width = " + width);

        Mobile mobile2 = new Mobile(2015001, "Apple", "iPhone 6s", Optional.empty());
        int width2 = mService.getMobileScreenWidth(Optional.of(mobile2));
        System.out.println("Apple iPhone 16s Screen Width = " + width2);
    }
}