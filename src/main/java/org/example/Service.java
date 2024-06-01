package org.example;


import org.example.dto.HousingDto;

import java.math.BigDecimal;
import java.util.List;

public class Service {

    private final Produces produces= new Produces();


    public BigDecimal getTotalPriceForHouse(){
        return produces.getHouseList().stream()
                .map(house->house.getPrice())
                .reduce(BigDecimal.ZERO,BigDecimal::add)
                ;
    }

    public BigDecimal getTotalPriceForVilla(){
        return produces.getVillaList().stream()
                .map(house->house.getPrice())
                .reduce(BigDecimal.ZERO,BigDecimal::add);
    }

    public BigDecimal getTotalPriceForSummerHouse(){
        return produces.getSummerHouseList().stream()
                .map(house->house.getPrice())
                .reduce(BigDecimal.ZERO,BigDecimal::add);
    }

    public BigDecimal getTotalAllHousingPride(){
        return produces.getHouseingList().stream()
                .map(housing -> housing.getPrice())
                .reduce(BigDecimal.ZERO,BigDecimal::add);
    }

    public double getAverageWidthForHouse(){
        return produces.getHouseList().stream()
                .mapToInt(house->house.getWidth())
                .average()
                .getAsDouble();
    }

    public double getAverageWidthForVilla(){
        return produces.getVillaList().stream()
                .mapToInt(house->house.getWidth())
                .average()
                .getAsDouble();
    }

    public double getAverageWidthForSummerHouse(){
        return produces.getSummerHouseList().stream()
                .mapToInt(house->house.getWidth())
                .average()
                .getAsDouble();
    }

    public double getAverageAllHousingWidth(){
        return produces.getHouseingList().stream()
                .mapToInt(housing-> housing.getWidth())
                .average()
                .getAsDouble();
    }

    public List<HousingDto> filterByRoomAndLounge(int room, int loung){
        return produces.getHouseingList().stream()
                .filter(housing -> housing.getRoom()==room && housing.getLounge()==loung)
                .toList();
    }

}
