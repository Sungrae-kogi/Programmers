//프로그래머스 최대공약수와 최소공배수
function solution(n, m) {
    var answer = [];
    //최대공약수는 1부터 Math.min(n,m)까지 for로 돌려보면서 둘 모두 나눠떨어지는 수가 최대공약수
    let max_divisor = 1;
    for(let i=1; i<=Math.min(n,m); i++){
        if(n%i ===0 && m%i ===0)
            max_divisor = Math.max(max_divisor, i);
    }
    answer.push(max_divisor);
    
    //최소공배수 ? 생각은 Math.max(n,m)부터 += Math.max(n,m) 씩하면서 둘다 나눠떨어지는수?
    let min_multi = Math.max(n,m);
    while(true){
        let num = 0;
        if(min_multi % n ===0 && min_multi % m ===0){
            answer.push(min_multi);
            break;
        }
        //틀렸던부분 주의
        min_multi += Math.max(n,m);
    }
    
    return answer;
}
//실력이 미숙해서 Lv.1 문제에서도 버벅임을 느끼고있다, 왜 더 열심히하지않았을까 후회가된다.
//아이디어 착안에서 시작했다, 두 수의 최대공약수는 결국 아무리 크더라도 둘중 작은값에서 끝나기때문에 1에서부터 Math.min(n,m)까지의 반복을
//돌리면서 두 수 모두 나머지없이 나눠지는 수 i를 Math.max를 이용해 찾아내었고
//최소공배수는 결국 두 수중 큰값의 배수여야지만 한다는 점을 생각해 while루프를 돌리며 Math.max(n,m)의 배수중에서 두 수를 모두 나머지없이
//나누어지게 하는 수를 찾아내었다, 다만 이 과정에서 
//증감식을, min_multi += min_multi;로 적었기 때문에 지속적인 오답을 하였으나, 생각해보니 증감으로 같은 변수명을 사용한다면
//그 증감이 반영된 변수가 다음 증감때 그대로 증감된채로 전달된다는 점을 생각지도 못하고있었다. 따라서 고정값인 Math.max(n,m)으로
//증감수치를 변경해주었다.