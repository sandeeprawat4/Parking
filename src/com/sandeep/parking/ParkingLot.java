package com.sandeep.parking;

import java.util.UUID;

public class ParkingLot {
    private UUID ID;
    private String name;
    private Location address;
    private ParkingRate parkingRate;

    private int compactCarSpotCount;
    private int largeCarSpotCount;
    private int electricSpotCount;
    private int bikeSpotCount;
}
