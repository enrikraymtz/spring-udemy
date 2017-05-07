package com.enrikraymtz.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enrikraymtz.entity.Course;
import com.enrikraymtz.entity.QCourse;
import com.querydsl.jpa.impl.JPAQuery;

@Repository("queryDSLExampleRepo")
public class QueryDSLExampleRepo {
	
	private QCourse qCourse = QCourse.course;
	
	@PersistenceContext
	private EntityManager em;
	
	public void find(){
		JPAQuery<Course> query = new JPAQuery<Course>(em);
		Course course1 = query.select(qCourse).from(qCourse).where(qCourse.id.eq(23)).fetchOne();
		List<Course> courses =  query.select(qCourse).from(qCourse).where(qCourse.hours.between(20, 50)).fetch();
	}
}
