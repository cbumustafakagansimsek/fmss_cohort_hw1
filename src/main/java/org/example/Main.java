package org.example;

import org.example.Service;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();

        System.out.println("-----------------------" + "\nResult\n"+ "-----------------------");

        System.out.println("Total price of houses : "+service.getTotalPriceForHouse());
        System.out.println("Total price of villas : "+service.getTotalPriceForVilla());
        System.out.println("Total price of summer houses: "+service.getTotalPriceForSummerHouse());
        System.out.println("Total price of housings : "+service.getTotalAllHousingPride());

        System.out.println("Avarage width of houses : "+service.getAverageWidthForHouse());
        System.out.println("Avarage width of villas : "+service.getAverageWidthForVilla());
        System.out.println("Avarage width of houses summer houses : "+service.getAverageWidthForSummerHouse());
        System.out.println("Avarage width of houses housings : "+service.getAverageAllHousingWidth());

        System.out.println("Filter by room and lounge(3+1) :");
        service.filterByRoomAndLounge(3,1).forEach( housing -> {
                    System.out.println("Type : " + housing.getType() + "\n" +
                            "Number Of Rooms : " + housing.getRoom() + "+" + housing.getLounge() + "\n" +
                            "Width : " + housing.getWidth() + "\n" +
                            "Price : " + housing.getPrice() + "\n"
                    );
                }
        );
    }
}