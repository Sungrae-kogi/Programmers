//프로그래머스 두 개 뽑아서 더하기
function solution(numbers) {
    var answer = [];
    for(let i=0; i<numbers.length; i++){
        for(let j=i+1; j<numbers.length; j++){
            if(!answer.includes(numbers[i]+numbers[j]))
                answer.push(numbers[i]+numbers[j]);
        }
    }
    return answer.sort((a,b) => a-b);
}
//정수배열 중 두개를 뽑아서 더한거를 중복없이 저장하는게 핵심으로
//Set이 생각났지만 어떻게 사용하는지 기억이 나지않아, includes를 사용해서 포함여부 판별 뒤에 push하여 해결
//따라서 Set에 대해서 학습하고 코드를 고쳐본다.
function solution(numbers) {
    var answer = new Set();
    for(let i=0; i<numbers.length; i++){
        for(let j=i+1; j<numbers.length; j++){
            answer.add(numbers[i]+numbers[j]);
        }
    }
    return [...answer].sort((a,b) => a-b);
}

//배운것, Set()은 정렬된 데이터구조가 아니기때문에, 내장함수로 직접 정렬이 불가능하니 전개연산자로 배열로 풀어준다음 정렬을해야했다.
//Set()에는 push가 아닌 add() 를 이용해 데이터를 추가
//Set()의 has 메서드는 값의 포함여부를 bool값으로 반환하는데 Array의 includes 메서드보다 성능이 좋다고한다. -> 언젠가 활용할때가있을것