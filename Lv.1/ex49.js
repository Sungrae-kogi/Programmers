//프로그래머스 K번째수
function solution(array, commands) {
    var answer = [];
    for(let [a,b,c] of commands){
        answer.push(array.slice(a-1,b).sort((x,y) => x-y)[c-1]);
    }
    return answer;
}
//별 문제는없었다, for(let of) 문에서 commands의 요소들이 길이가 3인 배열들만으로 고정되어 있었기때문에
//[a,b,c] 로 선언을 하고 사용해보았다는 점, 그리고 sort() 함수 사용시 인자함수를 전달하지않으면 사전순으로 정렬된다는것을 다시한번 상기했다.