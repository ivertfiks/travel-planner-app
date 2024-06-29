//package com.travel_planner_app.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.Date;
//
//@Data
//@Entity(name = "trip")
//@AllArgsConstructor
//@NoArgsConstructor
//public class Trip {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;
//    private String tripName;
//    private Date startDate;
//    private Date endDate;
//    private String location;
//
//    @OneToOne
//    @JoinColumn(name = "budget_id")
//    private Budget budget;
//
//    @OneToMany
//    @JoinColumn(name = "event_id")
//    private Event event;
//
//    public Trip(String tripName, Date startDate, Date endDate, String location, Budget budget) {
//        this.tripName = tripName;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.location = location;
//        this.budget = budget;
//    }
//}
