//자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기

//옵션이 통풍시트, 열선시트, 가죽시트 중 하나 이상의 옵션을 보유한다는 조건을 표현할때
//OR을 이용하여 연결할 수 있다.
SELECT CAR_TYPE, COUNT(CAR_TYPE) AS CARS
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE '%통풍시트%' OR OPTIONS LIKE '%열선시트%' OR OPTIONS LIKE '%가죽시트%'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE;