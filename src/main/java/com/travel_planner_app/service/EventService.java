package com.travel_planner_app.service;

import com.travel_planner_app.entity.Event;
import com.travel_planner_app.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventRepository eventRepository;

    public Event createEvent(String eventName){
        Event event = new Event(eventName);
        return eventRepository.save(event);
    }

    public Event getEventByName(String eventName){
        return eventRepository.getEventByName(eventName);
    }

    public List<Event> getAll(){
        return (List<Event>) eventRepository.findAll();
    }


}
