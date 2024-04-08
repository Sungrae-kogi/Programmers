//프로그래머스 시저 암호
function solution(s, n) {
    var answer = '';
    //ascii 97~122
    //charCodeAt()
    for(let i=0; i<s.length; i++){
        if(s[i] !== ' '){
            if(s[i].charCodeAt() + n > 122){
                answer += String.fromCharCode(s[i].charCodeAt()+n-26);
            }else{
                answer += String.fromCharCode(s[i].charCodeAt()+n);
            }
        }else{
            answer += ' ';
        }
        
    }
    return answer;
}

//샘플 테스트는 통과 -> 정확성검사는 30점대 
//바로 풀어낸것은 아니다, 하지만 딱 보고 이건 아스키코드 값을 이용하면 풀어낼수있겠다 란 생각이 들었고
//아무리 짜내봤자 모르는 함수 기능 떠오르진않는다는 생각에 아스키 코드를 얻어내는 charCodeAt() 함수와 String.fromCharCode(n) 두가지만
//참조하고서 작성했다, 아이디어는 간단했다, 97이 a고 122가 z 라면 123을 97로 맞춰준다는 아이디어로 아스키코드값이 122를 넘는경우
//코드값을 -26해서 순회하도록 하는것이었다, 다만 정확성검사에서 틀리는지라 어디서 로직이 틀렸는지 알기가 힘들었다.
//검색해서 알아낸 결과 알파벳이 소문자인경우와 대문자인 경우를 또 구분해야 했다고 한다. 테스트 케이스 3에서 B가 F로 변하는걸 보고
//아스키코드 값이 이상없이 작동하는줄알았는데 그걸보고 코드조건을 따라가보니 아스키코드 값이 122보다 작은경우에 B가 들어맞아 F로 변하기까지
//아무런 제약이 없었다는것을 알게되었고, 다시 코드를 보지않고 직접작성해보았다.
function solution(s, n) {
    var answer = '';
    //**ascii 97~122 : a~z , 65~90 : A~Z**
    //str.charCodeAt() ->  str의 ASCII 코드값을 반환, 
    //String.fromCharCode(num) -> num번인 ASCII코드값의 문자를 반환
    for(let i=0; i<s.length; i++){
        if(s[i] !== ' ' && s[i].charCodeAt() > 90){
            if(s[i].charCodeAt() + n > 122){
                answer += String.fromCharCode(s[i].charCodeAt()+n-26);
            }else{
                answer += String.fromCharCode(s[i].charCodeAt()+n);
            }
        }else if(s[i] !== ' ' && s[i].charCodeAt() <=90){
            if(s[i].charCodeAt() + n > 90){
                answer += String.fromCharCode(s[i].charCodeAt()+n-26);
            }else{
                answer += String.fromCharCode(s[i].charCodeAt()+n);
            }
        }else{
            answer += ' ';
        }
        
    }
    return answer;
}

//ASCII 코드를사용하지 않는 풀이중에 제일 좋은거같다, 알파벳은 가변요소가 아니기때문에 미리 문자열로 정의해두고 사용하는것이다.
function solution(s, n) {
    var upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    var lower = "abcdefghijklmnopqrstuvwxyz";
    var answer= '';

    for(var i =0; i <s.length; i++){
        var text = s[i];
        if(text == ' ') {
            answer += ' '; 
            continue;
        }
        var textArr = upper.includes(text) ? upper : lower;
        var index = textArr.indexOf(text)+n;
        if(index >= textArr.length) index -= textArr.length;
        answer += textArr[index];
    }
    return answer;
}