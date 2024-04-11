//프로그래머스 카드 뭉치
function solution(cards1, cards2, goal) {
    var answer = '';
    //indexOf(n,startIdx) 사용하면 가능할거같다. goal 순회하면서 두 배열에서 모두 -1리턴이면 No
    let cards1_idx = 0;
    let cards2_idx = 0;
    
    for(let i of goal){
        if(cards1.indexOf(i,cards1_idx) !== -1){
            //카드를 사용하지 않고, 다음 카드로 넘어갈 수 없다.
            if(cards1.indexOf(i,cards1_idx) - cards1_idx > 1){
                return "No";
            }
            cards1_idx = cards1.indexOf(i,cards1_idx);
            continue;
        }
        if(cards2.indexOf(i,cards2_idx) !== -1){
            //카드를 사용하지 않고, 다음 카드로 넘어갈 수 없다.
            if(cards2.indexOf(i,cards2_idx) - cards2_idx > 1){  //차이가 1보다 크냐? -> 사용하지않고 건너뛴 카드가 있냐?란 의미
                return "No";
            }
            cards2_idx = cards2.indexOf(i,cards2_idx);
            continue;
        }
        
        if(cards1.indexOf(i,cards1_idx) === -1 && cards2.indexOf(i, cards2_idx) === -1){
            return "No";
        }
    }
    
    return "Yes";
}
//구현 문제에 자신감을 더해준 문제, 보라 이 무시무시한 for와 if 문,
//처음에는 '카드를 사용하지 않고, 다음 카드로 넘어갈 수 없다.' 라는 주석 밑의 if문없는 코드를 제출했으나
//25번 테스트케이스만 탈락처리되었다, 원인을 찾아보니 문제에서의 규칙에 있었는데 cardsn_idx가 반드시 0~cardsn.length까지 순차적으로 
//올라가야한다는 의미였다, 현재 idx가 1인데 찾는값이 3에 있다고 해서 2를 건너뛰고 찾았다! 라고 결과를 내면 안되고 "No"를 리턴시켜야한다는 의미이다.
//제시문이 긴 문제가 많아지니 독해력과 문제 이해의 중요성이 올라가고있다, 
//처음 생각했던 indexOf(n,startIdx)를 사용하면 될것이라는 아이디어는 괜찮았다, 여기서 startIdx는 탐색시작점으로, 이미 탐색해서 지나온부분은
//제외 시켜야하기때문에 생각이난것, 
function solution(cards1, cards2, goal) {
    let j = 0;
    let k = 0;
    for(let i=0;i<goal.length;i++){
        if(goal[i] == cards1[j]) j++;
        else if(goal[i] == cards2[k]) k++;
        else return "No"
    }
    return "Yes";
}
//다른풀이 중 나와 비슷하게 두 가지의 idx를 설정하고 for와 if로 풀어낸 풀이, 허망하다.
//사실은 물고기 뼈를 제출하면되는거였는데, 물고기 뼈에다가 살까지 붙여서 제출한거같다. 불필요한 코드에 대해 생각해본다.