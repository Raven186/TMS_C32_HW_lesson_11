package com.teachmescills.C32.HW.Lesson11;

import com.teachmescills.C32.HW.Lesson11.document_format.FormatParser;

import static com.teachmescills.C32.HW.Lesson11.document_format.FormatParser.*;

public class ApplicationRunner {

    public static void main(String[] args) {
        String string1 = "1234-acd-5678-RTY-9q8w";
        String string2 = "5554-abc-5678-RTY-1a2b";

        documentFormatNumber(string1);
        documentFormatNumber(string2);
        documentFormatNumberSecretLetter(string1);
        documentFormatNumberSecretLetter(string2);
        documentFormatNumberLetterLower(string1);
        documentFormatNumberLetterLower(string2);
        documentFormatNumberLettersSB(string1);
        documentFormatNumberLettersSB(string2);
        documentSearchABC(string1);
        documentSearchABC(string2);
        documentFormatNumberStartsWith(string1);
        documentFormatNumberStartsWith(string2);
        documentFormatNumberEndsWith(string1);
        documentFormatNumberEndsWith(string2);
    }
}
