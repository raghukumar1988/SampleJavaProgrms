package tdd.isbnvalidator;

public class ValidateISBN {

    public static final int LENGTH_OF_LONG_ISBN = 13;
    public static final int LENGTH_OF_SHORT_ISBN = 10;

    public boolean checkISBN(String isbn) {
        if (isbn.length() == LENGTH_OF_LONG_ISBN) {
            return isThisAValidLongISBN(isbn);
        } else if (isbn.length() == LENGTH_OF_SHORT_ISBN) {
            return isThisAValidShortISBN(isbn);
        }
        throw new NumberFormatException("ISBN should be more than 10 Digits..");
    }

    private boolean isThisAValidShortISBN(String isbn) {
        int total = 0;
        for (int i = 0; i < LENGTH_OF_SHORT_ISBN; i++) {

            if (!Character.isDigit(isbn.charAt(i))) {
                if (isbn.charAt(9) == 'X') {
                    total += 10;
                } else {
                    throw new NumberFormatException("ISBN cannot contain alphabets..");
                }
            } else {
                total += Character.getNumericValue(isbn.charAt(i)) * (LENGTH_OF_SHORT_ISBN - i);
            }
        }
        return total % 11 == 0;
        /*if (total % 11 == 0) {
            return true;
        } else {
            return false;
        }*/
    }

    private boolean isThisAValidLongISBN(String isbn) {
        int total = 0;
        for (int i = 0; i < LENGTH_OF_LONG_ISBN; i++) {
            if (i % 2 == 0) {
                total += Character.getNumericValue(isbn.charAt(i));
            } else {
                total += (Character.getNumericValue(isbn.charAt(i)) * 3);
            }
        }
        return total % 10 == 0;
        /*if (total % 10 == 0) {
            return true;
        } else {
            return false;
        }*/
    }

            /*if(!StringUtils.isNumeric(isbn)){
                throw new NumberFormatException("ISBN cannot contain alphabets..");
            }*/
}