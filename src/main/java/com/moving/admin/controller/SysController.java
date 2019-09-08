package com.moving.admin.controller;

import com.moving.admin.bean.Result;
import com.moving.admin.dao.ExerciseDao;
import com.moving.admin.dao.SubjectDao;
import com.moving.admin.entity.Exercise;
import com.moving.admin.entity.Subject;
import com.moving.admin.service.SysService;
import com.moving.admin.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sys")
public class SysController {

    @Autowired
    private SubjectDao subjectDao;

    @Autowired
    private ExerciseDao exerciseDao;

    @Autowired
    private SysService sysService;

    @GetMapping("/all")
    public Result<List<Subject>> all() throws Exception {
        List<Subject> list = subjectDao.findAll();
        return ResultUtil.success(list);
    }
    @GetMapping("userExercise")
    public Result<List<Exercise>> userExercise(String userId) throws Exception {
        List<Exercise> list = exerciseDao.findAllByUserId(userId);
        return ResultUtil.success(list);
    }
    @PostMapping("/save")
    public Result<Boolean> save(@RequestBody Subject subject) throws Exception {
        subjectDao.save(subject);
        return ResultUtil.success(true);
    }
    @PostMapping("/exercise")
    public void saveExercise(@RequestBody Exercise exercise) throws Exception {
        sysService.addExercise(exercise);
    }
    @PostMapping("/clearError")
    public Result<List<Exercise>> clearError(@RequestBody String userId) throws Exception {
        List<Exercise> list = sysService.clearError(userId);
        return ResultUtil.success(list);
    }

}
