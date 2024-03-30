//프로그래머스 정수 제곱근 판별
function solution(n) {
    var answer = 0;
    //양의 정수 n이 어떤 정수의 제곱이라면, Math.sqrt(n)의 정수부분만 추출한결과가 Math.sqrt(n)이랑 같을것이다.
    if(parseInt(Math.sqrt(n)) === Math.sqrt(n))
        return (Math.sqrt(n)+1)*(Math.sqrt(n)+1);
    else
        return -1;
}

//주어진 정수가 어떤 정수의 제곱인지 판별하는 조건을 구하는게 핵심이었다고 생각한다, n이 어떤 정수의 제곱이 아닌 경우를
//어떻게 판별해야하는지 고민을 했고, 어떤 정수의 제곱이 아니라면 parseInt()로 Math.sqrt(n)의 정수부분만 추출한 값과 Math.sqrt(n)의 값이
//다르다는걸 조건으로 삼아 구분을 했다.

//다른 코드들을 구경해보면서 어떤 수의 제곱을 구하고싶을때 두번쓰는것이아니라 Math.pow(a,b) = a**b 라는것을 알게되었다.
//괜찮은 풀이가 있다, Number.isInteger()를 이용했는데, 검색해보니 isInteger()는 전달된 값이 정수인지 여부를 bool값으로 리턴시켜준다고 한다.
//이거를 이용하면 내가 조건문에 적었던 조건식을 대체가 가능하다.
function nextSqaure(n){
    var result = 0;
    var n = Math.sqrt(n);
    result = Number.isInteger(n) ? Math.pow(n+1, 2) : 'no';
    return result;
}
