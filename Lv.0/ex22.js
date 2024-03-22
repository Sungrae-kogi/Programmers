//프로그래머스 세 개의 구분자
function solution(myStr) {
    var answer = [];
    const regExp = /[b-c]/g;
    myStr = myStr.replace(regExp, 'a');
    
    answer = myStr.split('a').filter((element) => element !== '')
    
    return answer.length === 0? ["EMPTY"]: answer;
}

//문자 'a', 'b', 'c'를 구분자로 하여 문자열을 나누고자 할때 문자 하나로만 split함수를 써봤기때문에 어떻게 접근할지
//고민하게되었고, 그에 대한 해결책으로 구분자들을 하나로 통일시킨 뒤 split 시키자는 결론을 내게되었다.
//그 과정에서 여태 눈으로만 익혀왔던 정규 표현식을 사용하여 b와 c 문자들을 포함하는 /[b-c]/g 표현식을 직접 실사용해보았으며
//모든 a,b,c 문자들을 a로 바꾼 결과로 생긴 문제인 공백들을 filter함수로 걸러내는 불필요한 작업을 또 하게되었다.
//결과로보자면 정답이었지만, 쓸데없이 생긴 공백을 제거하는 불필요한 과정을 거쳤기에 다른 정답들을 찾아보게되었다.
function solution(myStr) {
    const list = myStr.split(/[a|b|c]/).filter(str => str);
    return list.length ? list : ["EMPTY"];
}

// ** 여러가지 문자열을 기준으로 분리하는게 고민이었는데, 정규표현식으로 그 해결법이 있었다.
// /[a|b|c]/ 를 이용하면 a,b,c 중 하나의 문자로 분할을 한다. 그치만 그냥 /[abc]/를 해도 구분이 되는거같다.
// filter(str => str)은 배열에서 공백을 제거하는 코드로 작동을 한다, filter함수는 주어진 반환값이 참인 요소만을 모아 새로운 배열로
// 반환을하기 때문에 배열에서 공백인 ''가 존재한다면 그것은 false로 제외되므로 filter(str => str)을 사용하면 공백만이 제거된
// 새로운 배열을 반환하게 된다.
// 여러모로 배울점이 많았던 문제였다.