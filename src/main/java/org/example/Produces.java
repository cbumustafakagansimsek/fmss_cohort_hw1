package org.example;


import org.example.dto.*;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Produces {

    //House Objects

    private HouseDto house1 = new HouseDto(new BigDecimal(3000000),65,1,1,"house");
    private HouseDto house2 = new HouseDto(new BigDecimal(3500000),90,2,1,"house");
    private HouseDto house3 = new HouseDto(new BigDecimal(5000000),120,3,1,"house");

    //Villa Objects
    private VillaDto villa1 = new VillaDto(new BigDecimal(6000000),150,3,1,"villa");
    private VillaDto villa2 = new VillaDto(new BigDecimal(7500000),160,4,1,"villa");
    private VillaDto villa3 = new VillaDto(new BigDecimal(9500000),210,5,1,"villa");


    //Summer House Objects
    private SummerHouseDto summerHouse1 = new SummerHouseDto(new BigDecimal(4500000),90,2,1,"summer house");
    private SummerHouseDto summerHouse2 = new SummerHouseDto(new BigDecimal(5300000),115,3,1,"summer house");
    private SummerHouseDto summerHouse3 = new SummerHouseDto(new BigDecimal(5000000),70,2,1,"summer house");


    public List<HouseDto> getHouseList(){
        return Arrays.asList(house1,house2,house3);
    }

    public List<VillaDto> getVillaList(){
        return Arrays.asList(villa1,villa2,villa3);
    }

    public List<SummerHouseDto> getSummerHouseList(){
        return Arrays.asList(summerHouse1,summerHouse2,summerHouse3);
    }

    public List<HousingDto> getHouseingList(){
        List<HousingDto> housingDtoList = Stream.
                of(getHouseList(),getSummerHouseList(),getVillaList())
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        return housingDtoList;
    }



}
