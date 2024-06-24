//12세 이하인 여자 환자 목록 출력하기

//NULL 처리방법, MySQL 에서는 값이 NULL일 경우 대체문자를 지정하는 방법으로 IFNULL(column, 'string') 사용
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO,'NONE') AS TLNO
FROM PATIENT
WHERE AGE <=12 AND GEND_CD = 'W'
ORDER BY AGE DESC, PT_NAME;