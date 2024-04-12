//프로그래머스 명예의 전당(1)
function solution(k, score) {
    var answer = [];
    let arr = [];
    for(let i=0; i<score.length; i++){
        if(answer.length <k){
            answer.push(score[i]);
        }else{
            if(answer[0] < score[i]){
                answer[0] = score[i];
            }
        }
        answer.sort((a,b) => a-b);
        arr.push(answer[0]);
    }
    return arr;
}
//명예의 전당의 크기가 k가 될때까지는 무조건 push하고, 그게아니라면 명예의전당의 최소값과 비교하여 최소값을 갱신
//이 과정에서는 배열이 정렬상태를 유지해야한다, 따라서 조건문 이후에 sort()
//자동으로 요소 삽입시 정렬상태를 유지하는 배열 자료구조가 내장되어있지 않을까 했지만 javascript에는 존재하지않는다.