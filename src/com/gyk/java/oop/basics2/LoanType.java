package com.gyk.java.oop.basics2;



public enum LoanType {
    LIZINGAS(1, "Lizingas"),
    VARTOJIMO(2, "Vartojimo");


    private final int code;
    private String loanTypeName;

    LoanType(int code, String loanTypeName) {
        this.code = code;
        this.loanTypeName = loanTypeName;
    }
    public static LoanType fromCode(int code) {
        LoanType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            LoanType LoanType = var1[var3];
            if (LoanType.code == code) {
                return LoanType;
            }
        }

        return null;
    }
}
