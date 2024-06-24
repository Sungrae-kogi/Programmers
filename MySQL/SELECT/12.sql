//Python 개발자 찾기

// OR 문을 여러개 사용했으나, WHERE 'Python' IN (SKILL3, SKILL2, SKILL1) 도 가능하다, 오히려 이쪽이 더 깔끔.
select ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPER_INFOS
WHERE SKILL_1 = 'Python' OR SKILL_2 = 'Python' OR SKILL_3 = 'Python'
ORDER BY ID;