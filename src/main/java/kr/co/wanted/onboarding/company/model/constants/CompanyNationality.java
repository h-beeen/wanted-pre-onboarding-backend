package kr.co.wanted.onboarding.company.model.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CompanyNationality {

	KOREA("한국"),
	CHINA("중국"),
	JAPAN("일본"),
	USA("미국"),
	MULTI_NATIONALITY("다국적");

	private final String value;
}
