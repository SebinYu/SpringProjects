<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" type="text/css" href="/common.css" />
  <style>
    form { width: 600px; margin: auto;
      box-shadow: 0 0 4px lightgray, 2px 2px 4px gray; overflow: auto; }
    div.title { font-size: 20pt; padding: 10px; background-color: #eee; }
    table { margin: 20px; }
    td { min-width: 100; padding: 5px; }
    td:nth-child(1) { text-align: right; }
    button { margin: 5px 0 20px 20px; }
  </style>
</head>
<body>
  <div class="container">
    <form method="post">
      <div class="title">학과 정보</div>
      <table>
        <tr>
          <td>id</td>
          <td><input type="text" value="${ studygroup.studyGroup_id }" readonly disabled /></td>
        </tr>
        <tr>
          <td>스터디명</td>
          <td><input type="text" name="title" value="${ studygroup.title }" /></td>
        </tr>
                <tr>
          <td>상세설명</td>
          <td><input type="text" name="contents" value="${ studygroup.contents }" /></td>
        </tr>
                <tr>
          <td>스터디 리더 닉네임</td>
          <td><input type="text" name="leader" value="${ studygroup.leader }" /></td>
        </tr>
                <tr>
          <td>최대 모집인원</td>
          <td><input type="number" name="totalNum" value="${ studygroup.totalNum }" /></td>
        </tr>
        
      </table>
      <button type="submit" class="btn">저장</button>
      <c:if test="${ studygroup.studyGroup_id > 0 }">
        <a href="delete?studyGroup_id=${ studygroup.studyGroup_id }" class="btn">삭제</a>
      </c:if>
    </form>
 </div>
</body>
</html>
