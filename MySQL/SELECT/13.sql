//조건에 맞는 개발자 찾기

//2진수로 표현할때 비트로 구분되는 값이 주어졌을때 비트연산자를 사용하여 해결이 가능하다
//원리 -> 1100 에 0100이 있는지 (스킬코드에 Python이 있는지) 판단하려면 1100 & 0100 하면 0100이 결과로 나온다. 
//이 뜻은 그사람이 Python 스킬을 가지고있다는 의미, 없다면 0000밖에 나오지않는다.
//따라서 WHERE 조건은 ,서브쿼리로 Python과 C#의 코드값을 가져와서 DEVELOPERS 테이블의 각 사람들의 스킬코드를 비트& 연산자로
//그 기술을 가지고있는지 판별하는 작업을 수행.

//비트 & 연산자 사용법
SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS
WHERE SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'Python')
OR SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'C#')
ORDER BY ID;