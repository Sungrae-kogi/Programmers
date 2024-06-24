//평균 일일 대여 요금 구하기

//코딩테스트 하루 전날 안내 메일이 왔고, SQL의 경우 MySQL로 응시해야한다고 함.
//이제부터는 MySQL로 풀이를 시작.

//mysql에서 반올림을 하려는 경우, ROUND() 함수를 사용, 두번째 인자로 반올림하고 남길 소숫점자릿수를 전달가능
SELECT ROUND(SUM(DAILY_FEE)/COUNT(*)) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE='SUV';