//프로그래머스 전국 대회 선발 고사
function solution(rank, attendance) {
    var answer = 0;
    const attend_people = []
    
    const merged = rank.map((num,idx) => [num, attendance[idx]]);
    merged.sort((a,b) => a[0] - b[0]);
    
    for(let i=0; i<merged.length; i++){
        if(merged[i][1] === true){
            attend_people.push(i);
        }
    }
    //10000*attend_people[0] + 100*attend_people[1] + attend_people[2]
    return merged;
}
//문제 해석 및 이해가 이상하게 꼬여있어서 오답으로 이끌렸다.
//rank에 담긴거는 해당 번호(idx) 학생들의 등수가 담겨있고 
//문제에서 '전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로 각각 a, b, c번이라고 할 때'  라고 적혀있어서
//나는 답을 rank[idx]값을 이용하여 도출해내면 되겠다 라고 생각했다, 하지만 정답을얻기위한 계산에서는 rank[idx]의 값이 아닌 idx의 값을
//요구하고있었고, 이로인해 풀이가 틀리게되었다, 다만 나의 첫 해석으로 인한 문제풀이방식이 괜찮았기에 적어보았다.
//**나는 두 배열의 길이가 같고 등수가 높은(즉, 등수가 낮은게 높은의미니까) 두 배열을 2차원배열식으로 map함수로 묶은 다음
//i가 순회할 때 merged[i][1]의 값이 true 인 값들을 순서대로 a,b,c로 할당시키면 끝이라고 생각했고 실제로 위와같이 풀은 결과
//답은 아니지만 생각하고 의도한대로 작동했음을 확인하였다. 

//옳게된 풀이
function solution(rank, attendance) {
    var answer = 0;
    const abcarr = [];
    //1등 학생부터 차례대로 올려가며 참석가능여부 true를 확인하여 answer에 더할것이다.
    let idx = 1;
    // attendance의 원소 중 적어도 3개는 true이기 때문에 옳게 풀었다면 answer의 길이가 3이될것
    while(abcarr.length !==3){
        if(attendance[rank.indexOf(idx)] === true){
            abcarr.push(rank.indexOf(idx));
            idx++;
        }else{
            idx++;
        }
    }
    
    return 10000*abcarr[0] + 100*abcarr[1] + abcarr[2];
}
//문제 해석 이해를 수정한 뒤에 다행히 한번에 풀었다, 문제 조건을 생각하여 풀이방향성을 옳게 떠올렸다.