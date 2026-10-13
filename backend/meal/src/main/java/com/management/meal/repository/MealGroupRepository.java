package com.management.meal.repository;

import com.management.meal.model.MealGroup; // Imports the entity this repository will manage.
import org.springframework.data.jpa.repository.JpaRepository; // Imports built-in JPA database operations.

// Declares a repository interface for performing database operations on MealGroup.
public interface MealGroupRepository extends JpaRepository<MealGroup, Long> {

    // JpaRepository provides built-in CRUD operations.
    // MealGroup specifies the entity type.
    // Long specifies the primary key type.
    // Spring Data JPA generates the implementation automatically at runtime.

}