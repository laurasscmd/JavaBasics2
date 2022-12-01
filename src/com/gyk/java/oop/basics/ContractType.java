package com.gyk.java.oop.basics;

public enum ContractType {
    NETERMINUOTAS(1, "Neterminuotas"),
    TERMINUOTAS(2, "Terminuotas");


    private final int code;
    private String contrTypeName;

    ContractType(int code, String contrTypeName) {
        this.code = code;
        this.contrTypeName = contrTypeName;
    }
    public static ContractType fromCode(int code) {
        ContractType[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            ContractType contractType = var1[var3];
            if (contractType.code == code) {
                return contractType;
            }
        }

        return null;
    }
}
