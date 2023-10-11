package kr.co.wanted.onboarding.user;

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
@Table(name = "t_user")
@NoArgsConstructor(access = PROTECTED)
public class User {

	@Id
	@Column(
		name = "user_id")
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
}
