//프로그래머스 나누어 떨어지는 숫자 배열
function solution(arr, divisor) {
    var answer = [];
    for(let i of arr){
        if(i%divisor ===0)
            answer.push(i);
    }
    
    if(answer.length === 0)
        return [-1];
    
    return answer.sort((a,b) => a-b);
}

// sort((a,b) => a-b); 없이 sort() 만하면 테스트케이스에 (10,5)는 오름차순으로 정렬되지않는다는걸 알게되었다.
// 검색결과 -> sort()는 기본적으로 문자열로 변환한 각 요소를 비교하여 정렬하므로 (10, 5)는 문자열로 변환된 후 각 자리의 첫 번째
// 숫자를 비교하고 그다음으로 넘어가기때문에 수를 정렬할때는 정렬함수를 지정해서 오름차순, 내림차순을 정해줘야한다.
function solution(arr, divisor) {
    var answer = [];
    arr.map((o) => {
        o % divisor === 0 && answer.push(o);
    })
    return answer.length ? answer.sort((a, b) => a - b) : [-1];

}
//이거는 별 특별한 코드는 아니지만, o % divisor === 0 && answer.push(o); 부분이 특이해서 가져왔다.
//map에서 o % divisor === 0 이 참이라면 &&의 뒤에부분은 무조건 실행된다고한다