package com.moving.admin.controller;

import com.moving.admin.bean.Result;
import com.moving.admin.dao.SubjectDao;
import com.moving.admin.entity.Subject;
import com.moving.admin.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/sys")
public class SysController {
    @Autowired
    private SubjectDao subjectDao;

    @PostMapping("/save")
    public Result<Boolean> save(@RequestBody Subject subject) throws Exception {
        subjectDao.save(subject);
        return ResultUtil.success(true);
    }
    @GetMapping("/all")
    public Result<List<Subject>> all() throws Exception {
        List<Subject> list = subjectDao.findAll();
        return ResultUtil.success(list);
    }

}
