package com.edsd.samp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edsd.samp.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}