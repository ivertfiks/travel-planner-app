package com.travel_planner_app.repository;

import com.travel_planner_app.entity.Budget;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepository extends CrudRepository<Budget, Integer> {

    Budget getBudgetByName(String name);

}
