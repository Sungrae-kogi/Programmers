//프로그래머스 최소직사각형
//풀이르 2번 3번 초기화를 통해 갈아엎었고 도저히 안되어서 문제를 검색해서 풀이 방향성 힌트만 보고 풀어냈다. 답코드를보진않았다.
function solution(sizes) {
    var answer = 0;
    for(let el of sizes){
        if(el[0] < el[1])
            [el[0], el[1]] = [el[1], el[0]];
    }
    let a_max = 0;
    let b_max = 0;
    for(let i=0; i<sizes.length; i++){
        a_max = Math.max(a_max,sizes[i][0]);
        b_max = Math.max(b_max,sizes[i][1]);
    }
    return a_max*b_max;
}

//다른 답 
//마찬가지로 배열의 첫번째값이 두번째값보다 큰값이 오도록 정렬을 하고 그 정렬된 배열에서 두번째값도 제일 큰값을 골라내는 방식으로
//첫번째값이 두번째값보다 크도록 정렬해야한다는 생각을 해내야 한다는게 핵심이라고 생각한다, 어떻게 생각해내야하는건지 매번 답답할뿐.
//map함수와 forEach에서 () 안에 []로 값을 전달해서 사용가능하다는것을 알게되었다.
function solution(sizes) {
    const rotated = sizes.map(([w, h]) => w < h ? [h, w] : [w, h]);

    let maxSize = [0, 0];
    rotated.forEach(([w, h]) => {
        if (w > maxSize[0]) maxSize[0] = w;
        if (h > maxSize[1]) maxSize[1] = h;
    })
    return maxSize[0]*maxSize[1];
}