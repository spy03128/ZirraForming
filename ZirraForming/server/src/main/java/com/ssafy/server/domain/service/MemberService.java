package com.ssafy.server.domain.service;

import com.ssafy.server.domain.entity.Member;
import com.ssafy.server.domain.exception.MemberNotFountException;
import com.ssafy.server.domain.repository.MemberRepository;
import com.ssafy.server.oauth.utils.CookieUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public void logout(HttpServletRequest request, HttpServletResponse response){
        CookieUtil.deleteCookie(request, response, "refreshToken");
    }

    public boolean duplicatedCheck(String nickname){
        // 닉네임 중복 확인
        Member findMember = memberRepository.findByNickname(nickname);

        if(findMember == null) return true;
        else return false;
    }

    @Transactional
    public void changeNickname(Long memberId, String nickname){
        // 멤버 조회
        Member findMember = memberRepository.findById(memberId)
                .orElseThrow(() -> new MemberNotFountException(memberId));

        // 멤버 닉네임 업데이트
        findMember.updateNickname(nickname);
    }
}
