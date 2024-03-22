//프로그래머스 무작위로 K개의 수 뽑기
function solution(arr, k) {
    var answer = [];
    for(let i=0; i<arr.length; i++){
        if(!answer.includes(arr[i]) && answer.length <k){
            answer.push(arr[i]);
        }
    }
    if(answer.length < k){
        //불만족스러운 처리부분, diff라는 변수를 둬야만했을까 싶다.
        let diff = k-answer.length;
        for(let i=0; i<diff; i++){
            answer.push(-1);
        }
        return answer;
    }
    
    return answer;
}

//result.push(-1)로 모자란 길이만큼 -1을 채워넣는부분은 동일하게 만족스럽지않지만, 숏코딩 말고 직관적으로 이해가 되는 코드
//Set을 이용하여 배열의 중복을 자동으로 제외한다는점도 중요,
function solution(arr, k) {

    const nums = new Set();

    const result = [];

    for(let i=0; i<arr.length; i++){
        if(nums.has(arr[i])) continue;
        nums.add(arr[i]);
        result.push(arr[i]);
        //길이가 k에 도달하면 그냥 리턴?
        if(result.length === k) return result;
    }
    while(result.length < k){
        result.push(-1);
    }

    return result;
}