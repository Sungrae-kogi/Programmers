//프로그래머스 흉부외과 또는 일반외과 의사 목록 출력
SELECT DR_NAME, DR_ID, MCDP_CD, HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD = 'CS' OR MCDP_CD = 'GS'
ORDER BY HIRE_YMD DESC, DR_NAME

//처음 풀이 결과, 고용 일자를 내림차순으로 정렬하고, 고용일자가 같다면!! ** 이름을 기준으로 오름차순으로 정렬한다.
//이 부분에서 ORDER BY 를 ,로 구분하여 적는다는 것을 떠올릴 수 있었다.
//그리고 출력 결과 요구에서 HIRE_YMD를 DATE_FORMAT을 이용하여 주어진 형식으로 포매팅하여 제출해야하며 Alias를 HIRE_YMD로 변경도 해야했따.
SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD = 'CS' OR MCDP_CD = 'GS'
ORDER BY HIRE_YMD DESC, DR_NAME

//과거에 학부에서 수강했던 DB 수업을 조금씩 떠올리며 문제를 하나하나 풀어나갈 계획아다.
//아예 배경지식이 전무한것은 아니기에 조금 더 수월할것이라 생각하며, 코딩테스트와 마찬가지로 떠올리거나 알게된 부분에 대해서는
//주석을 통해 정리를하겠다.