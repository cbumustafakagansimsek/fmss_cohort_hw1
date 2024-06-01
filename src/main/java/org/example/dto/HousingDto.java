package org.example.dto;


import java.math.BigDecimal;

public class HousingDto {

    private BigDecimal amount;
    private int width;
    private int room;
    private int lounge;
    private String type;

    public HousingDto(BigDecimal amount, int width, int room, int lounge, String type) {
        this.amount = amount;
        this.width = width;
        this.room = room;
        this.lounge = lounge;
        this.type = type;
    }

    public BigDecimal getPrice() {
        return amount;
    }

    public void setPrice(BigDecimal amount) {
        this.amount = amount;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getLounge() {
        return lounge;
    }

    public void setLounge(int lounge) {
        this.lounge = lounge;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
