package com.moving.admin.dao;

import com.moving.admin.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubjectDao extends JpaRepository<Subject, Long>, JpaSpecificationExecutor<Subject> {

}
