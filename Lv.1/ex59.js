//프로그래머스 폰켓몬
function solution(nums) {
    var answer = 0;
    let hash = {};
    const choice = Math.floor(nums.length/2);
    
    for(let i =0; i<nums.length; i++){
        if(!hash[nums[i]]){
            hash[nums[i]] = 1;
            answer++;
        }
        if(answer===choice)
            return answer;
    }
    
    return answer;
}

//N개중에서 N/2개를 선택하고자 하는데, 만일 같은것들이 많아서 N/2개를 채우지 못하고 배열 순회가 끝날 경우, 또는 N/2개를 조건에 맞게
//다 고른경우를 처리해야하는데
//N/2개를 채우지 못한 경우의 처리를 위해 집합 자료구조를 사용하여 집합에 해당 key값이 존재하지 않는다면 집합에 해당 key값을 갱신시키고
//answer을 늘려 현재 선택한 갯수를 늘려나가게 작성하여 해결하였다, 