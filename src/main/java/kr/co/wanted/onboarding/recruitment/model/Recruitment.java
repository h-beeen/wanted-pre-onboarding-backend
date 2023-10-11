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
import kr.co.wanted.onboarding.company.model.constants.CompanyNationality;
import kr.co.wanted.onboarding.company.model.constants.CompanyRegion;
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
	@Enumerated(STRING)
	private Long reward;

	@Column(nullable = false)
	@Enumerated(STRING)
	private CompanyRegion region;

	@Column(nullable = false)
	private String technology;
}
