//프로그래머스 기사단원의 무기
function solution(number, limit, power) {
    var answer = 1;
    
    for(let i=2; i<=number; i++){
        let atk = 0;
        for(let j=1; j<=i/2; j++){
            if(i%j ===0){
                atk++;
            }
        }
        //i/2까지 약수탐색한다면 마지막에 자기 자신도 약수의 갯수로 넣어주는걸 빼먹기때문
        atk++;
         
        if(atk > limit){
            atk = power;
        }
        
        answer += atk;
    }
    return answer;
}

//약수 판별 알고리즘 정리, 약수 판별과정 중 무작정 모든 범위를 조사하면 시간초과가 뜨고, i/2로 약수판별의 범위를 반으로 줄이니 
//아슬하게? 시간초과가 뜨지않고 결론이났다.
