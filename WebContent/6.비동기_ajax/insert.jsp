<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% //???????????????????하는 이유>???????????????????????????
//controller에서 저장한 값 꺼내기
int cnt = (Integer)request.getAttribute("result");
//getAttribute는 Object타입임 -> 형변환 

//cnt로 응답데이터생성 - json형식의 문자열로 
if(cnt>0){ //성공
%>

	{
		"flag" : "가입성공"
	}
	
<% }else{ //실패%>

	{
		"flag" : "가입실패"
	}

<%	
}
%>    