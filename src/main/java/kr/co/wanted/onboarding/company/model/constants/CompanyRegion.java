package kr.co.wanted.onboarding.company.model.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CompanyRegion {

	SEOUL("서울"),
	PANGYO("판교");

	private final String value;
}
