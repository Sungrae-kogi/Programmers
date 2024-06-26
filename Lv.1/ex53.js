//프로그래머스 푸드 파이트 대회
function solution(food) {
    var answer = '';
    for(let i=1; i<food.length; i++){
        answer = answer + String(i).repeat(Math.floor(food[i]/2));
    }
    let answer_reverse = [...answer].reverse().join('');
    answer += '0';
    answer += answer_reverse;
    return answer;
}

//그냥 이렇게 하면 풀리지않을까~ 하면서 생각나는대로 적어 풀어낸 풀이, 코드가 보면 그냥 막무가내이지만 
//한번에 정답이 맞아서 오히려 불안한 느낌.
//어차피 어떤 값이든 존재하는 food 배열에서 idx 0은 무조건 물이고 중간에 한번 들어가고 끝이란 조건을 봤으니
//한사람이 먹어야하는 음식들을 나열한뒤, 0을 붙이고, 먹어야하는 음식들을 뒤집은거를 붙이면 끝이라 생각했다.
//이 과정에서, 가져온 음식들을 반으로 나눠서 더해야하는데 음식이 홀수인경우 남는부분은 버려야하므로 Math.floor(food[i]/2) 를 생각해냈다.
//또한 음식의 절반만큼 그저 더하는작업을 반복해야하므로 예전에 학습했던 repeat() 함수를 떠올려 활용해보았고 성공적으로 작동했다.

//풀이가 깔끔해보이지 않아서 다른 풀이를 참고했으나, 정확하게 최다 추천 풀이와 코드 스타일만 다를뿐, 아이디어가 같았다. 
//따라서 막무가내 코드긴 하지만 깔끔하게 코드만 정리하면 좋은 풀이라고 생각된다.