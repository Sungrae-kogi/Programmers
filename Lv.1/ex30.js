//프로그래머스 약수의 합
function solution(n) {
    var answer = 0;
    const divisor = [];
    let num = 1;
    
    while(num !== n+1){
        if(n%num ===0){
            divisor.push(num);
        }
        num++;
    }
    for(let i of divisor){
        answer += i;
    }
    return answer;
}
//new Set()으로 1부터 올라가는 num과 n을 나눈 몫(몫 역시도 약수이기때문)도 set에 add하여 2중으로 약수를 집어넣고,
//while문의 앞에 num이 n/num 보다 큰 경우 break 하여 연산속도를 줄여보려고했지만 무엇인가의 문제로 Set이 작동하지않고, 
//테스트케이스 일부에서 문제가 발생하여 일반 배열로 문제를 해결하였다.