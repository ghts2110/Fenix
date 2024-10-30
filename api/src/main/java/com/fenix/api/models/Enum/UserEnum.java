package com.fenix.api.models.Enum;

public enum UserEnum {
    // juridico financeiro e psicosocial

    JURIDICO(1),
    FINANCEIRO(2),
    PSICOSOCIAL(3);

    private int code;

    private UserEnum(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static UserEnum valueOf(int code){
        for(UserEnum value: UserEnum.values()){
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid UserEnum code");
    }
}
