//프로그래머스 예산
function solution(d, budget) {
    var answer = 0;
    //오름차순으로 정렬하면 밑에서부터가 우선순위로 선정되지않을까.
    d= d.sort();
    let sum = 0;
    for(let i=0; i<d.length; i++){
        if(sum+d[i] > budget){
            return answer;
        }else if(sum+d[i] === budget){
            return ++answer;
        }
        sum = sum + d[i];
        answer++;
    }
    return answer;
}

//정확성테스트의 반이 틀리는걸 보아서 우려했던 부분이 역시 계산했어야했음을 떠올렸다.
//오름차순으로 정렬해서 작은수부터 차례대로 더하면서 검색한 경우 최대 수치와 다르게 실제로 가장작은수를 제외했을때에가 최대의 경우인 
//케이스같은것이 숨겨져있는것이다, 따라서 학부때 학습했던 brute force 완전탐색을 시행해서 budget을 넘지않는 부분합 배열중
//가장 길이가 긴 것을 찾아보아야한다고 생각이들었다.
function solution(d, budget) {
    var answer = 0;
    let max_count =0;
    for(let left=0; left<d.length; left++){
        for(let right=left; right<d.length; right++){
            //budget과 비교할 부분배열합
            let arr_sum = 0;
            let count = right-left +1;  //배열의갯수, 불확실
            for(let i=left; i<=right; i++){
                arr_sum = arr_sum + d[i];
            }
            if(arr_sum >budget){
                continue;
            }else{
                max_count = Math.max(max_count, count);
            }
        }
    }
    return max_count;
}
//bruteforce로 풀은 두번째풀이로, 이것역시 정확성검사에서 오답, 추후에 다시풀거나 해설을 찾아본다.
//0405 다시 풀은 결과 -> 풀리지않아 검색을 해보았고 어이가없게도 처음 생각했던 대로 배열을 오름차순으로 정렬하고 밑에서부터
//하나씩 뽑는게 최대의 결과를 내지않을까? 라는 생각이 옳았다고 한다.
//이유를 찾아봤는데 너무나도 간단해서 허탈함이 크다, sort()함수를 그대로 사용했기때문으로, 자꾸 javascript의 정렬에는 
//정렬함수를 전달해줘야한다는것을 까먹는일이 생기는거같다, 첫 코드에서 sort((a,b) => a-b)로 적어주면 마찬가지로 정답이 도출된다.
//그냥 sort()를 하면 오답이 나오는 이유는 그냥 sort()함수는 2와 11을 비교했을때 문자순으로 정렬해버리기때문에 11과 2 로 정렬을 해버리기
//때문에 오답을 도출하게되는거였다.
function solution(d, budget) {
    var answer = 0;
    let count = 0;
    let sorted_d = d.sort((a,b) => a-b);
    for(let i=0; i<sorted_d.length; i++){
        answer = answer + d[i];
        count++;
        if(answer > budget){
            return count-1;
        }else if(answer === budget){
            return count;
        }
    }
    return count;
}