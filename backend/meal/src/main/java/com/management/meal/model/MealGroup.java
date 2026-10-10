package com.management.meal.model;

import jakarta.persistence.Entity; // Marks this class as a JPA entity. Hibernate will map this class to a database table.
import jakarta.persistence.Table; // Allows us to explicitly define the database table name.
import jakarta.persistence.GeneratedValue; // Defines how the primary key value will be generated.
import jakarta.persistence.GenerationType; // Provides generation strategies such as IDENTITY.
import jakarta.persistence.Id; // Marks a field as the primary key.
import org.hibernate.annotations.CreationTimestamp; // Automatically sets the creation timestamp.
import org.hibernate.annotations.UpdateTimestamp; // Automatically updates the modification timestamp.
import java.time.LocalDateTime; // Represents date and time without timezone information.

@Entity // Tells JPA/Hibernate that MealGroup is a persistent entity.
@Table(name = "mealgroup") // Explicitly maps this entity to the "mealgroup" database table.
public class MealGroup {

    @Id // Marks mealGroupId as the primary key of the table.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PostgreSQL will generate the ID automatically when a row is inserted.
    private Long mealGroupId;

    private String mealGroupName; // Stores the name of the meal group.

    @CreationTimestamp // Hibernate automatically sets this value when the record is created.
    private LocalDateTime mealGroupCreateTime;

    @UpdateTimestamp // Hibernate automatically updates this value when the record is modified.
    private LocalDateTime mealGroupUpdateTime;


    public MealGroup() { // Required no-argument constructor for JPA.
    }


    public Long getMealGroupId() { // Returns the meal group's ID.
        return mealGroupId;
    }

    public void setMealGroupId(Long mealGroupId) { // Sets the meal group's ID.
        this.mealGroupId = mealGroupId;
    }


    public String getMealGroupName() { // Returns the meal group's name.
        return mealGroupName;
    }

    public void setMealGroupName(String mealGroupName) { // Sets the meal group's name.
        this.mealGroupName = mealGroupName;
    }


    public LocalDateTime getMealGroupCreateTime() { // Returns the creation timestamp.
        return mealGroupCreateTime;
    }

    public void setMealGroupCreateTime(LocalDateTime mealGroupCreateTime) { // Sets the creation timestamp.
        this.mealGroupCreateTime = mealGroupCreateTime;
    }


    public LocalDateTime getMealGroupUpdateTime() { // Returns the update timestamp.
        return mealGroupUpdateTime;
    }

    public void setMealGroupUpdateTime(LocalDateTime mealGroupUpdateTime) { // Sets the update timestamp.
        this.mealGroupUpdateTime = mealGroupUpdateTime;
    }
}