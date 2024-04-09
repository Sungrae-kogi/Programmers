//프로그래머스 문자열 내 마음대로 정렬하기
//정렬함수에 대해서 알아야 하는 문제
function solution(strings, n) {
    var answer = [];
    strings.sort((a, b) => {
        //오름차순 정렬은 a>b? 1: -1; ,내림차순 정렬은 a>b? -1: 1;만 기억
        if(a[n] > b[n]){  
            return 1;
        }else if(a[n] < b[n]){
            return -1;
        }else{//같을경우 사전순으로 앞선문자열이 앞쪽
            return a > b? 1: -1;
        }
    });
    return strings;
}

//정렬함수에 대해 어떻게 해야 오름차순, 내림차순인지 학습하고 풀수있었다, 이 내용은 note에 기록.