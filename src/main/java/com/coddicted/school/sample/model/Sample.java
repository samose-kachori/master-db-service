package com.coddicted.school.sample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class Sample {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @ApiModelProperty(notes = "The database generated sample ID")
  private Integer id;

  @ApiModelProperty(notes = "Sample name")
  private String name;

  @ApiModelProperty(notes = "Sample email")
  private String email;
}
