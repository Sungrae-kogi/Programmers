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