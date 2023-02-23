package edu.citytech.cst.client.sample.marginaltax.model;

// SM,HH,MFJ
public enum Code {

    Single_Married_Filing_Separately("SM"),
    Married_Filing_Jointly("MFJ"),
    Heads_of_Household("HH"), SM("SM"),MFJ("MFJ"),HH("HH");


    private final String code;

    Code(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Code getCode(String code){
        if (code.equals("HH"))
            return HH;
       else if (code.equals("SM"))
            return SM;
        else if (code.equals("MFJ"))
            return MFJ;

        return SM;


    }
}
