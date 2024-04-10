//프로그래머스 콜라 문제
function solution(a, b, n) {
    var answer = 0;
    while(true){
        let quo = Math.floor(n / a)*b;
        answer += quo;
        
        let remain = n%a;
        n = Math.floor(n/a)*b + remain;
        
        
        if(n < a){
            break;
        }else if(n===a){
            answer += 1;
            break;
        }
    }
    return answer;
}

//풀긴했는데 무한루프주고 조건문으로 빠져나오는 식으로 짜느라 머리에서 너무 복잡했다.
//다른사람의 while조건문 풀이 Math.floor(실수) 와 parseInt(실수) 가 같은 효과를 낸다. 정도 학습할 수 있겠다.
function solution(a, b, n) {
    let answer = 0;
    while (n >= a) {
        answer += parseInt(n / a) * b;
        n = parseInt(n / a) * b + n % a;
    }
    return answer;
}
