//프로그래머스 크기가 작은 부분 문자열
function solution(t, p) {
    var answer = 0;
    let partleng = p.length;
    for(let left=0; left<=t.length-partleng; left++){
        let part_t = t.slice(left,left+partleng);
        //부분문자열이 나타내는수가 p보다 작거나 같으면 answer++;
        if(parseInt(part_t) <= parseInt(p))
            answer++;
    }
    
    return answer;
}

//p와 길이가 같은 부분문자열이라는 조건을 보고 idx가 0부터시작해서 t.length-p.length까지 p.length 길이만큼 slice한 부분문자열들이
//비교 대상으로 좁혀진다는것을 떠올려 코드를 작성했다, 배열명을 좀더 깔끔하게 정리하면 좋지않을까 생각이든다.
//다른 풀이에서 가장 높은 추천을 받은 코드가 나의 코드와 동일했는데, 숏코딩을 한것도아니고 for, if만을 사용해서 풀이했기때문에
//별다른 좋은 풀이는 적지 않고 넘어가도록 하겠다.