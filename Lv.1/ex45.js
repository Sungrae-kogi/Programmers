//프로그래머스 삼총사
function solution(number) {
    var answer = 0;
    let sum = 0;
    for(let i=0; i<number.length-2; i++){
        for(let j=i+1; j<number.length-1; j++){
            for(let k=j+1; k<number.length; k++){
                if(number[i] + number[j] + number[k] ===0)
                    answer++;
            }
        }
    }
    return answer;
}
//주어진 정수배열에서 3개를 골랐을때 합이 0이되는 경우의 수를 찾는것으로
//brute force방식으로 해결했다, 당연히 이렇게하면 성능이 저하되기때문에 다른방법을생각해봤으나 찾을수가 없어서
//일단은 3중for문으로 3개의 수를 고르는식으로 풀었다, 찾는 수가 3개에 number의 길이가 최대 13으로 제한되었기때문에
//결과가 가능했다고 생각한다.
