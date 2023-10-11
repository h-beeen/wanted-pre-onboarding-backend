package kr.co.wanted.onboarding.recruitment.model.list;

import static lombok.AccessLevel.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "t_recruitment_list")
@NoArgsConstructor(access = PROTECTED)
public class RecruitmentList {
}
