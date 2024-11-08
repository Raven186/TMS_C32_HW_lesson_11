package com.teachmescills.C32.HW.Lesson11.document_format;


import java.util.Arrays;

public class FormatParser {

    public static void documentFormatNumber(String documentNumber) {
        System.out.println(documentNumber.substring(0, 4) + documentNumber.substring(8, 13));
    }

    public static void documentFormatNumberSecretLetter(String documentNumber) {
        System.out.println(documentNumber.substring(0, 4) +
                "-***-" + documentNumber.substring(8, 13) +
                "-***-" + documentNumber.charAt(18) +
                "*" + documentNumber.charAt(20) + "*");
    }

    public static void documentFormatNumberLetterLower(String documentNumber) {
        System.out.println(documentNumber.toLowerCase().substring(5, 8) + "/"
                + documentNumber.toLowerCase().substring(14, 17) + "/"
                + documentNumber.toLowerCase().charAt(19) + "/"
                + documentNumber.toLowerCase().charAt(21) + "/"
        );
    }

    public static void documentFormatNumberLettersSB(String documentNumber) {
        StringBuilder sb = new StringBuilder("Letters: ");
        sb.append(documentNumber.toUpperCase(), 5, 8);
        sb.append("/");
        sb.append(documentNumber.toUpperCase(), 14, 17);
        sb.append("/");
        sb.append(documentNumber.toUpperCase().charAt(19));
        sb.append("/");
        sb.append(documentNumber.toUpperCase().charAt(21));
        System.out.println(sb.toString());
    }

    public static void documentSearchABC(String documentNumber) {
        if (Arrays.stream(documentNumber.split("-")).anyMatch("abc"::equalsIgnoreCase)) {
            System.out.println("Document contains 'abc'");
        } else {
            System.out.println("Document does not contain 'abc'");
        }
    }

    public static void documentFormatNumberStartsWith(String documentNumber) {
        String pattern = "555";
        System.out.println(documentNumber.startsWith(pattern) ? "Yes" : "No");
    }

    public static void documentFormatNumberEndsWith(String documentNumber) {
        String pattern = "1a2b";
        System.out.println(documentNumber.endsWith(pattern) ? "Yes" : "No");
    }
}
