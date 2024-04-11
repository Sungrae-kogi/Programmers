//프로그래머스 추억 점수
function solution(name, yearning, photo) {
    var answer = [];
    for(let i of photo){
        let sum = 0;
        for(let j=0; j<i.length; j++){
            let idx = name.indexOf(i[j]);
            if(idx !== -1){
                sum += yearning[idx];
            }
        }
        answer.push(sum);
    }
    
    return answer;
}

//2중 for에 인자 3개를 다루다보니 머리가 복잡해 시간이 오래걸렸다. 
//arr.indexOf() 함수가 탐색하고자 하는 값이 없다면 -1을 반환한다는 것도 다시한번 상기, 
//이에 대한 처리를 해주는것이 핵심