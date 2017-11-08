package com.czes.samp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.czes.samp.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}