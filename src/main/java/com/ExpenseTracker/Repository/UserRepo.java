package com.ExpenseTracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExpenseTracker.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
