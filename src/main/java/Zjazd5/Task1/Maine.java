package Zjazd5.Task1;

import org.apache.commons.lang3.StringUtils;

public class Maine {
    public static void main(String[] args) {

        System.out.println(StringUtils.isBlank(" "));


    }
    public static boolean verficationString(String value){
        return value == null && value.length() > 0 && value.equals(value.trim());
    }
}
