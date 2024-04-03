//프로그래머스 부족한 금액 계산하기
function solution(price, money, count) {
    var answer = 0;
    let c = 1;
    while(count >= c){
        money = money - price*c;
        
        
        c++;
    }
    return money >=0? 0: Math.abs(money);
}

//처음 풀이로는 틀렸으나 수정하여 정답, while 문 안에서 money가 음수가 되는 순간 return 처리를 했으나 문제의 조건에서는
//놀이기구를 count번 타게 될때! 라고 정의했기 때문에 money가 음수가 되던 말던 c가 count에 도달할때까지 루프를 돌린 다음에
//money의 값을 처리했어야 했다.
//오늘의 코딩 문제들은 5문제가량 별다른거없이 통과되었기에 마지막 문제였던 이거를 정리, 굳이 다른 풀이를 볼 필요성은 느끼지못하였다.