package com.enrikraymtz.service;

import java.util.List;

import com.enrikraymtz.entity.Course;

public interface CourseService {
	
	public abstract List<Course> getAllCourses();
	public abstract Course addCourse(Course course);
	public abstract int removeCourse(int id);
	public abstract Course updateCourse(Course course);
	
}
