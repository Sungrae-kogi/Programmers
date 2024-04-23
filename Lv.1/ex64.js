//프로그래머스 로또의 최고 순위와 최저 순위
function solution(lottos, win_nums) {
    var answer = [];
    const rank = {'6': 1, '5': 2, '4': 3, '3': 4, '2': 5, '1': 6, '0':6};
    let count = 0;
    let zero_count = 0;
    for(let i=0; i<6; i++){
        if(win_nums.includes(lottos[i])){
            count++;
        }else if(lottos[i] === 0){
            zero_count++;
        }
    }
   
    return [rank[count+zero_count], rank[count]];
}

//맞은 숫자가 높을수록 순위의 절대값이 낮고, 0의 갯수에 따라 가능한 순위의 최대 최소값이 달라져서 너무 생각하기 복잡했던문제였다.
//좋은 로직이있을지 모르지만 일단 탐색 범위의 값이 6으로 정해져있기때문에 구현문제에서 자주 사용되는방법인
//상수값 집합 rank를 선언하여 이용.
//이때 includes함수를 사용하여 로또번호가 일치하는 수의 갯수 count와 숫자0의 갯수 zero_count를 구하고.
//최대순위 = count+zero_count, 최소순위 = count 이므로 맞는값을 할당하여 리턴.

function solution(lottos, win_nums) {
    const rank = [6, 6, 5, 4, 3, 2, 1];

    let minCount = lottos.filter(v => win_nums.includes(v)).length;
    let zeroCount = lottos.filter(v => !v).length;

    const maxCount = minCount + zeroCount;

    return [rank[maxCount], rank[minCount]];
}
//번호가 일치하는 수를 찾는과정에서 filter함수를 사용한 풀이가 있다, zero를 찾는과정의 filter(v => !v)는 어찌보면 이상하지만,
//v => !v가 0을 골라내는 로직이라고 배운적이 있다, 다시한번 상기하고 넘어간다.