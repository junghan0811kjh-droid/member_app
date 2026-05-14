package com.my.member_app.dto;

import com.my.member_app.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
    private Long id;
    private String name;
    private int age;
    private String address;

    // dto를 받아서 entity로 변환을 하는 작업 빈 깡통 entity를 만들어서 받은 dto 작업
    // dto에다가 그 두개를 변환하는 작업을 한다.

    // static으로 바로 선언해도 됨 ( new 선언 안해도 됨)
    // MemberDto(DTO) -> Member Entity 로 변환
    public static Member toEntity(MemberDto dto) {
        // 빈 깡통 Member 생성 후 하나씩 넣어주고 리턴
        Member member = new Member();
        member.setId(dto.getId());
        member.setName(dto.getName());
        member.setAge(dto.getAge());
        member.setAddress(dto.getAddress());
        return member;
    }
    // Member Entity -> MemberDto(DTO)
    public static MemberDto toDto(Member member) {
        return new MemberDto(
                member.getId(),
                member.getName(),
                member.getAge(),
                member.getAddress()
        );
    }

}
