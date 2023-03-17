package basicPrograms;

import org.apache.commons.lang3.StringUtils;

class RemoveWhiteSpaces3
{
    public static void main(String[] args)
    {
        String str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
        removeWhiteSpaces1(str);
        removeWhiteSpaces2(str);
        removeWhiteSpaces3(str); // using Apache commons lib
    }

    private static void removeWhiteSpaces1(String str) { //1. Using replaceAll() Method
        String strWithoutSpace = str.replaceAll("\\s", "");
        //String strWithoutSpace = str.replaceAll("\\s+", "");
        /*when the number of consecutive spaces increases, “\\s+” is slightly faster than “\\s”. Because, it replaces set of consecutive
        multiple spaces with the replacement string at a time rather than replacing one by one.*/
        System.out.println(strWithoutSpace);         //Output : CoreJavajspservletsjdbcstrutshibernatespring
    }

    private static void removeWhiteSpaces2(String str) {
        //2. Without Using replaceAll() Method
        char[] strArray = str.toCharArray();
        StringBuffer sb = new StringBuffer();// using SB as we are dealing with manipulation
        for (char c : strArray) {  //simplified version
            if(c!=' ' && c != '\t')
                sb.append(c);
        }

        /* for (int i = 0; i < strArray.length; i++)  // Traditional version
        {
            if( (strArray[i] != ' ') && (strArray[i] != '\t') )
            {
                sb.append(strArray[i]);
            }
        } */
        System.out.println(sb);           //Output : CoreJavajspservletsjdbcstrutshibernatespring
    }
    private static void removeWhiteSpaces3(String str) {
        System.out.println(StringUtils.deleteWhitespace(str));
        System.out.println(StringUtils.normalizeSpace(str));  // removes extra spaces - check output
    }

}