//프로그래머스 문자열 다루기 기본
function solution(s) {
    var answer = true;
    
    if(s.length === 4 || s.length === 6){
        if(isNaN(parseInt(s)))
            return false;
        return true;
    }
    
    return false;
}
//s의 길이가 4 또는 6이고 모두 숫자로만 이루어져있으면 true를 리턴하고, 아니면 false를 리턴하는데
//s에 e가 있으면 지수로 인식이되어서 테스트케이스가 통과하지못한다고한다,
//이런 예외상황을 어떻게 구분해 내야하는지가 막막하다.

//아닌것들만 걸러내는 좋은 풀이가 있다. for와 if만 사용해서 해당조건이 아닌것들 은 return false시킴으로 해결
function solution(s) {
    if(s.length != 4 && s.length != 6) return false;
    for(var i = 0; i < s.length; i++) {
        if(isNaN(Number(s[i]))) return false;
    }
    return true;
}