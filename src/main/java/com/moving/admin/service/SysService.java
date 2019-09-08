package com.moving.admin.service;

import com.moving.admin.dao.ExerciseDao;
import com.moving.admin.dao.SubjectDao;
import com.moving.admin.entity.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysService {

    @Autowired
    private SubjectDao subjectDao;

    @Autowired
    private ExerciseDao exerciseDao;

    public void addExercise(Exercise exercise) {
        List<Exercise> list = exerciseDao.findAllByUserIdAndSubjectId(exercise.getUserId(), exercise.getSubjectId());
        if (list.size() > 0) {
            Exercise ex = list.get(0);
            ex.setLastStatus(exercise.getStatus());
            exerciseDao.save(ex);
        } else {
            exercise.setLastStatus(exercise.getStatus());
        }
    }

    public List<Exercise> clearError(String userId) {
        List<Exercise> list = exerciseDao.findAllByUserId(userId);
        list.forEach(item -> {
            item.setStatus(1);
        });
        exerciseDao.saveAll(list);
        return list;
    }

}
