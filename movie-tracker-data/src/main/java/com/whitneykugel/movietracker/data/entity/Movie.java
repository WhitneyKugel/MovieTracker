package com.whitneykugel.movietracker.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Movie implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String title;
	private String plot;
	private String director;
	private Integer lengthInMinutes;
	private Integer yearReleased;
	private String rating;
	private String genre;
	private String trailer;

}
