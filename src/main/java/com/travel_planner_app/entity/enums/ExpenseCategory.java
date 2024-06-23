package com.travel_planner_app.entity.enums;

public enum ExpenseCategory {

    AIRFARE("Airfare"),
    TRAIN_TICKETS("Train tickets"),
    BUS_TICKETS("Bus tickets"),
    CAR_RENTAL("Car rental"),
    TAXI("Taxi"),
    FUEL("Fuel"),
    PARKING("Parking"),

    HOTELS("Hotels"),
    HOSTELS("Hostels"),
    APARTMENT_RENTAL("Apartment rental"),
    CAMPING("Camping"),
    GUESTHOUSES("Guesthouses"),

    RESTAURANTS("Restaurants"),
    CAFES("Cafes"),
    FAST_FOOD("Fast food"),
    GROCERY_STORES("Grocery stores"),
    BARS_AND_CLUBS("Bars and clubs"),
    STREET_FOOD("Street food"),

    MUSEUMS_AND_GALLERIES("Museums and galleries"),
    TOURS_AND_EXCURSIONS("Tours and excursions"),
    CONCERTS_AND_EVENTS("Concerts and events"),
    AMUSEMENT_PARKS("Amusement parks"),
    THEATERS_AND_CINEMAS("Theaters and cinemas"),
    SPORTS_EVENTS("Sports events"),
    BEACHES_AND_SWIMMING_POOLS("Beaches and swimming pools"),

    SOUVENIRS("Souvenirs"),
    CLOTHING_AND_FOOTWEAR("Clothing and footwear"),
    ELECTRONICS_AND_GADGETS("Electronics and gadgets"),
    BOOKS_AND_MAGAZINES("Books and magazines"),
    GIFTS("Gifts"),

    MOBILE_PHONE("Mobile phone"),
    INTERNET("Internet"),
    EQUIPMENT_RENTAL("Equipment rental"),

    MEDICAL_INSURANCE("Medical insurance"),
    TRAVEL_INSURANCE("Travel insurance"),
    CAR_RENTAL_INSURANCE("Car rental insurance"),

    VISA_FEES("Visa fees"),
    CONSULAR_FEES("Consular fees"),
    ADMINISTRATIVE_FEES("Administrative fees"),

    PERSONAL_EXPENSES("Personal expenses"),
    CHARITY_AND_DONATIONS("Charity and donations"),
    UNEXPECTED_EXPENSES("Unexpected expenses");

    private final String displayName;

    ExpenseCategory(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
