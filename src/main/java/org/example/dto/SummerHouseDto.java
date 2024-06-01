package org.example.dto;


import java.math.BigDecimal;

public class SummerHouseDto extends HousingDto {

    public SummerHouseDto(BigDecimal amount, int width, int room, int lounge, String type) {
        super(amount, width, room, lounge, type);
    }
}
