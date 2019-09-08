package com.moving.admin.dao;

import com.moving.admin.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ExerciseDao extends JpaRepository<Exercise, Long>, JpaSpecificationExecutor<Exercise> {

    List<Exercise> findAllByUserIdAndSubjectId(String userId, Long subjectId);

    List<Exercise> findAllByUserId(String userId);

}
