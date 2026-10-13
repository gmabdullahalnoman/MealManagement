package com.management.meal.service;

import com.management.meal.model.MealGroup; // Imports the MealGroup entity.
import com.management.meal.repository.MealGroupRepository; // Imports the repository for database access.
import org.springframework.stereotype.Service; // Imports the annotation that marks this class as a service.

@Service // Registers this class as a Spring-managed service component.
public class MealGroupService {

    private final MealGroupRepository mealGroupRepository; // Stores the repository dependency used to access the database.

    // Constructor injection: Spring provides the repository when creating this service.
    public MealGroupService(MealGroupRepository mealGroupRepository) {
        this.mealGroupRepository = mealGroupRepository; // Assigns the injected repository to the field.
    }

    // Creates a meal group or updates an existing one through the repository.
    public MealGroup saveMealGroup(MealGroup mealGroup) {
        return mealGroupRepository.save(mealGroup); // Saves the entity and returns the persisted result.
    }
}