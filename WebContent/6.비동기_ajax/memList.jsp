<%@page import="com.google.gson.GsonBuilder"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

 List<MemberVO> list = (List<MemberVO>)request.getAttribute("set");

 Gson gson = new GsonBuilder().setPrettyPrinting().create();
 String result = gson.toJson(list);
 
 out.print(result);
 out.flush();
%>