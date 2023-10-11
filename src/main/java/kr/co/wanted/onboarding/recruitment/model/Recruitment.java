package kr.co.wanted.onboarding.recruitment.model;

import static jakarta.persistence.EnumType.*;
import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kr.co.wanted.onboarding.company.model.constants.CompanyRegion;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "t_recruitment")
@NoArgsConstructor(access = PROTECTED)
public class Recruitment {

	@Id
	@Column(name = "recruitment_id")
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String position;

	@Column(nullable = false)
	private Long reward;

	@Column(nullable = false)
	private String technology;

	@Column(nullable = false)
	private String content;

	@Builder(access = PRIVATE)
	private Recruitment(
		final String position,
		final Long reward,
		final String technology,
		final String content
	) {
		this.position = position;
		this.reward = reward;
		this.technology = technology;
		this.content = content;
	}

	public Recruitment create(
		final String position,
		final Long reward,
		final String technology,
		final String content
	) {
		return Recruitment.builder()
			.position(position)
			.reward(reward)
			.technology(technology)
			.content(content)
			.build();
	}
}
