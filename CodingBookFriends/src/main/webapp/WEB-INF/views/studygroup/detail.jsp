<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" type="text/css" href="/common.css" />
  <style>
    a.btn { float: right; margin: -20px 0 5px 0; }
    td:nth-child(1) { text-align: center; }
  </style>
</head>
<body>
<div class="container">
  <h1>${ studygroup.title }</h1>
          <a href="edit?studyGroup_id=${ studygroup.studyGroup_id }">수정</a>
          <a href="delete?studyGroup_id=${ studygroup.studyGroup_id }">삭제</a>
  <hr><br>
  <a href="create" class="btn">학과등록</a>
  <table class="list">
    <thead>
      <tr>
        <th>id</th>
        <th>스터디명</th>
        <th>스터디 리더 닉네임</th>
        <th>모집인원 현황</th>
        <th></th>
        <th></th>
      </tr>
    </thead>
    
    <tbody>
      <c:forEach var="studygroup" items="${ studygroups }">
        <tr>
          <td>${ studygroup.studyGroup_id }</td>
          <td><a href="edit?studyGroup_id=${ studygroup.studyGroup_id }">${ studygroup.title }</a></td>
          <td>${ studygroup.leader }</td>
          <td>${ studygroup.currentNum }/${ studygroup.totalNum }</td>
          <td><a href="edit?studyGroup_id=${ studygroup.studyGroup_id }">수정</a></td>
          <td><a href="delete?studyGroup_id=${ studygroup.studyGroup_id }">삭제</a></td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>