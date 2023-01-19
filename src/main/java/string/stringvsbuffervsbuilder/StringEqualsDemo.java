package string.stringvsbuffervsbuilder;

class StringEqualsDemo {

    public static void main(String[] args) {

        //String fstr= new String("Javatutorials");
        //String sstr= new String("Javatutorials"); // Uncomment to know the diff
        String fstr = "Javatutorials";
        String sstr = "Javatutorials";


        System.out.println(fstr.equals(sstr));
        System.out.println(fstr == sstr);

        System.out.println(fstr.hashCode());
        System.out.println(sstr.hashCode());

        System.out.println(Integer.toHexString(System.identityHashCode(fstr)));
        System.out.println(Integer.toHexString(System.identityHashCode(sstr)));
    }
}
