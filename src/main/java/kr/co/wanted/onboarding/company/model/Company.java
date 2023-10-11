package kr.co.wanted.onboarding.company.model;

import static jakarta.persistence.EnumType.*;
import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

import java.security.ProtectionDomain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kr.co.wanted.onboarding.company.model.constants.CompanyNationality;
import kr.co.wanted.onboarding.company.model.constants.CompanyRegion;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "t_company")
@NoArgsConstructor(access = PROTECTED)
public class Company {

	@Id
	@Column(
		name = "company_id")
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@Column(
		name = "company_name",
		nullable = false)
	private String name;

	@Column(
		name = "company_nationality",
		nullable = false)
	@Enumerated(STRING)
	private CompanyNationality nationality;

	@Column(
		name = "company_region",
		nullable = false)
	@Enumerated(STRING)
	private CompanyRegion region;

}
