//프로그래머스 모의고사
function solution(answers) {
    var answer = [];
    const first = [1,2,3,4,5];
    const second = [2,1,2,3,2,4,2,5];
    const third = [3,3,1,1,2,2,4,4,5,5];
    
    let first_idx=0;
    let second_idx =0;
    let third_idx =0;
    
    let first_score = 0;
    let second_score = 0;
    let third_score = 0;
    
    for(let i=0; i<answers.length; i++){
        if(first[first_idx] === answers[i]){
            first_score++;
            first_idx = (first_idx+1) % first.length;
        }else{
            first_idx = (first_idx+1) % first.length;
        }
        if(second[second_idx] === answers[i]){
            second_score++;
            second_idx = (second_idx+1) % second.length;
        }else{
            second_idx = (second_idx+1) % second.length;
        }
        if(third[third_idx] === answers[i]){
            third_score++;
            third_idx = (third_idx+1) % third.length;
        }else{
            third_idx = (third_idx+1) % third.length;
        }
        
    }
    answer.push(first_score, second_score, third_score);
    let max_val = Math.max(...answer);
    const result = [];
    for(let i=0; i<answer.length; i++){
        if(answer[i] === max_val){
            result.push(i+1);
        }
    }
    
    return result;
}

//나는 완전탐색, brute force 문제가 싫다
//분명 이렇게 푸는게 아닐거라 생각해서 참고하고자 다른풀이들을 찾아봤지만 나의풀이가 정석중 하나였음에 놀랐다. 
//if else 부분만 간략하게만 줄였을 뿐 나머지의 핵심적인 구성요소는 동일했다.
//이번 문제에서 활용한 부분은, 배열의 idx를 순회하면서 범위를 초과했을때 0 idx로 돌아가기위해 (idx+1)% n.length라는 자주쓰이는 형식을
//떠올려 활용하였고, Math.max를 이용해 배열에서 최대값을 얻어내기위해서는 Math.max(answer)가 아닌 Math.max(...answer)로 
//answer가 아무리 배열일지라도 전개연산자로 풀어서 전달해야한다는것 역시 떠올려내 풀어냈다.