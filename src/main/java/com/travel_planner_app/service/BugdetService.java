package com.travel_planner_app.service;

import com.travel_planner_app.entity.Budget;
import com.travel_planner_app.entity.Event;
import com.travel_planner_app.repository.BudgetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BugdetService {
    private final BudgetRepository budgetRepository;

    public Budget createBudget(int budgetAmount){
        Budget event = new Budget(budgetAmount);
        return budgetRepository.save(event);
    }

    public Budget getBudgetByName(String budgetName){
        return budgetRepository.getBudgetByName(budgetName);
    }

    public Budget minusBudget(String budgetName, int minusAmount){
        Budget budget = budgetRepository.getBudgetByName(budgetName);
        budget.setAmount(budget.getAmount() - minusAmount);
        return budgetRepository.save(budget);
    }

    public Budget plusBudget(String budgetName, int plusAmount){
        Budget budget = budgetRepository.getBudgetByName(budgetName);
        budget.setAmount(budget.getAmount() + plusAmount);
        return budgetRepository.save(budget);
    }

}
