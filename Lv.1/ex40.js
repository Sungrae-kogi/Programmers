//프로그래머스 같은 숫자는 싫어
function solution(arr)
{
    var answer = [];
    answer.push(arr[0]);
    //for로 돌면서 before_num과 같은값이 나오면 넘어가고 다른값이 나오면 answer에 push해보자
    //다른값이 나오면 그 다른값을 before_num에, i는 1부터 시작 0 idx는 push하고 시작
    let before_num = arr[0];
    for(let i=1; i<arr.length; i++){
        if(arr[i] !== before_num){
            answer.push(arr[i]);
            before_num = arr[i];
        }
    }
    
    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    console.log('Hello Javascript')
    
    return answer;
}
//Lv.1부터는 약간 버벅임도 있고, 다시한번 상기되는 문제도 많기때문에 모두 vsCode에 남겨보기로 했다.
//학부과정 중 코딩문제 풀이에 이전 idx의 값을 기억했다가 활용하는 방법이 떠올라 적용해보았고 맞는 방식이었다고 생각된다.
//다만 다른 풀이중 숏코딩이지만 js함수 하나에 대해서 다시한번 상기하고 학습할 만한 코드가 있어서 참고한다.
function solution(arr)
{
    return arr.filter((val,index) => val != arr[index+1]);
}

//filter 함수 하나만을 가지고 풀어냈다, filter 함수는 인자로주어진 함수를 만족하는 값만을 남긴 배열을 리턴시키는 함수로
//현재의 값 val이 현재의 idx+1과 다른 값들만 남기는거로 간단하게 풀어냈다, 내가 생각해냈던 아이디어인 이전 idx의 값을 기억하는
//방식과 방향성은 일치한다고 생각한다. 