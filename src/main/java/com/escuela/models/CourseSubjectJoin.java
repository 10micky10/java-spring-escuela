package com.escuela.models;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

/**
* Class.
*/
@Entity
@Getter
@Setter
public class CourseSubjectJoin extends CourseSubjectFather {

  @Column(name = "course_name")
  private String courseName;

  @Column(name = "subject_name")
  private String subjectName;

  /**
  * Constructor.
  */
  public CourseSubjectJoin() {
  }
}
