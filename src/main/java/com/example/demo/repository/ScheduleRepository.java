package com.example.demo.repository;

import com.example.demo.entity.Feedback;
import com.example.demo.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findFeedbackByIsDeletedFalse();

    Schedule findFeedbackById (long id);
}
