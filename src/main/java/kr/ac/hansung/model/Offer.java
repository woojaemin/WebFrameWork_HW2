package kr.ac.hansung.model;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Offer {


	
	private String year;
	
	private String semester;
	
	@NotEmpty(message="Not be empty")
	private String code;

	@NotEmpty(message="Not be empty")
	private String name;
	
	@NotEmpty(message="Not be empty")
	private String devision;
	
	@NotEmpty(message="Not be empty")
	private String score;
	
	
}
