//package com.travel_planner_app.service;
//
//import com.travel_planner_app.entity.Budget;
//import com.travel_planner_app.entity.Trip;
//import com.travel_planner_app.repository.TripRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//
//@Service
//@RequiredArgsConstructor
//public class TripService {
//    private final TripRepository tripRepository;
//
//    public Trip createTrip(String tripName, Date startDate, Date endDate, String location, Budget budget){
//        Trip trip = new Trip(tripName, startDate, endDate, location, budget);
//        return tripRepository.save(trip);
//    }
//
//    public Trip changeBudget(String tripName, Budget budget){
//        Trip trip = tripRepository.getTripByName(tripName);
//        trip.setBudget(budget);
//        return tripRepository.save(trip);
//    }
//
//
//
//}
