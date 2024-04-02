//프로그래머스 제일 작은 수 제거하기
function solution(arr) {
    var answer = [];
    if(arr.length <= 1)
        return [-1];
    else{
        //Math.min()에는 (1,2,3,4) 같이 배열형식이 들어가는게아니다.
        arr.splice(arr.indexOf(Math.min(...arr)),1);
        return arr
    }
    
}
//처음엔 제일 작은수를 정렬로 구했지만, 문제의 조건에서 정렬은 요구하지않기때문에 정렬해버리면 답이틑리게되었다.
//따라서 Math.min()으로 최소값을 구해야하는데 이 과정에서 Math.min()의 인자로 배열을 받지않고 spread연산자 ...로 풀어진
//값들이 들어가야 올바른결과가 나온다는것을 알게되었다.
//그리고 splice함수는 값을 리턴시키는게아니라 원본을 변화시킨다는것을 다시한번 상기시켰다.