//package com.travel_planner_app.entity;
//
//import com.travel_planner_app.entity.enums.ExpenseCategory;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity(name = "expense")
//public class Expense {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;
//
//    private String name;
//    private ExpenseCategory expenseCategory;
//
//    @ManyToOne
//    @JoinColumn(name = "budget_id")
//    private Budget budget;
//
//    public Expense(String name, ExpenseCategory expenseCategory, Budget budget) {
//        this.name = name;
//        this.expenseCategory = expenseCategory;
//        this.budget = budget;
//    }
//}
