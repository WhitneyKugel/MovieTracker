package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Movie implements Serializable {

	private String title;
	private String plot;
	private String director;
	private Integer lengthInMinutes;
	private Integer yearReleased;
	private String rating;
	private String genre;
	private String trailer;

}
