//프로그래머스 소수 찾기    효율성 테스트 실패 -> 에라토스테네스의 체를 써야한다고 한다.
function solution(n) {
    var answer = 1;
    //약수판별 알고리즘 활용??
    if(n === 2){
        return 1;
    }else{
        for(let i=3; i<=n; i++){
            let a = false;
            for(let j=2; j<=parseInt(Math.sqrt(i)); j++){
                if(i% j === 0){
                    a = true;
                    break;
                }
            }
            if(!a)
                answer++;
        }    
    }
    
    return answer;
}
//1부터 n까지의 수 중에 소수의 갯수를 반환하는 함수
//노트에 정리한 방법 3가지를 전부 다 사용해서 세번째 방법인 제곱근을 활용한 풀이로 결국 정확성 테스트를 통과해냈다.
//판별할 숫자가 정해지면 그 숫자를 2부터 제곱근까지 돌며 나눠지는 값이 있다면 flag를 true로 바꾸고 break로 루프를 종료.
//그리고 for를 빠져나온 후에는 flag 값에 따라 flag가 false이면(소수가아니면) answer를 증가.

//다른 풀이 아이디어중에, i가 짝수인지의 여부를 판별해서 더 빠르게 줄이는 방법이 있었다. -> 왜냐? j=2에서 짝수는 무조건 나눠지므로
//에라토스테네스의 체를 사용한 풀이, -> 효율성까지 패스 Set 역시 사용.
function solution(n) {
    const s = new Set();
    for(let i=1; i<=n; i+=2){
        s.add(i);
    }
    s.delete(1);
    s.add(2); // Set에 홀수만 저장 -> 1 삭제 -> 2 추가
    for(let j=3; j<=Math.sqrt(n); j++){ 
        if(s.has(j)){
             for(let k=j*2; k<=n; k+=j){ // j의 배수(k) 삭제
                s.delete(k);
             }
        }
    }
    return s.size;
}