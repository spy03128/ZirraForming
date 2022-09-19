package com.ssafy.server.api;

import com.ssafy.server.api.dto.common.ResultDto;
import com.ssafy.server.api.dto.member.DuplicatedCheckResultResponse;
import com.ssafy.server.domain.service.MemberService;
import com.ssafy.server.oauth.utils.CookieUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MemberApiController {

    private final MemberService memberService;

    @PostMapping("/logout")
    public ResponseEntity<ResultDto> logout(HttpServletRequest request, HttpServletResponse response){
        CookieUtil.deleteCookie(request, response, "refreshToken");
        return ResponseEntity.ok(ResultDto.of("로그아웃이 완료되었습니다."));
    }

    @GetMapping("/duplicatedcheck")
    public ResponseEntity<DuplicatedCheckResultResponse> duplicatedCheck(@RequestParam("nickname") String nickname){
        if(memberService.duplicatedCheck(nickname)) {
            return ResponseEntity.ok(DuplicatedCheckResultResponse.of(true, "사용가능한 닉네임입니다."));
        }
        else {
            return ResponseEntity.ok(DuplicatedCheckResultResponse.of(false, "이미 사용 중인 닉네임입니다."));
        }
    }

    @PatchMapping("/member/{memberId}/changenickname")
    public ResponseEntity<ResultDto> changeNickname(@PathVariable("memberId") Long memberId, @RequestBody Map<String,String> req){
        memberService.changeNickname(memberId, req.get("nickname"));
        return ResponseEntity.ok(ResultDto.of("닉네임이 변경되었습니다."));
    }

    @DeleteMapping("/member/{memberId}")
    public ResponseEntity<ResultDto> deleteMember(HttpServletRequest request, HttpServletResponse response, @PathVariable("memberId") Long memberId){
        CookieUtil.deleteCookie(request, response, "refreshToken");
        return ResponseEntity.ok(ResultDto.of("회원탈퇴가 완료되었습니다."));
    }
}