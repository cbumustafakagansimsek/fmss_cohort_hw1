package org.example.dto;


import java.math.BigDecimal;

public class VillaDto extends HousingDto {

    public VillaDto(BigDecimal amount, int width, int room, int lounge, String type) {
        super(amount, width, room, lounge, type);
    }
}
