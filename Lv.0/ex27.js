//프로그래머스 두 수의 합
function solution(a, b) {
    var answer = '';
    //return parseInt(b);
    return (parseInt(a)+parseInt(b)).toString();
}
//간단해보여서 이렇게 처리했으나, 테스트케이스에서 오류가발생, 이유를 찾아보니
//parseInt 함수의 기능에서 문제가 발생하는거같아 구글링과 ChatGPT에게 물어본 결과
// JavaScript에서는 정수형 숫자의 표현 범위가 제한되어 있습니다. 
// parseInt() 함수는 숫자로 변환할 때 정밀도에 제한이 있습니다. 
// 따라서 JavaScript는 숫자를 이를 표현할 수 있는 가장 가까운 값으로 반올림합니다. 
// 따라서 매우 큰 숫자의 경우 정밀도 제한으로 인해 정확한 값을 유지하지 못할 수 있습니다.
// 이 경우, parseInt(287346502836570928366)을 호출하면 JavaScript는 숫자를 정밀하게 나타낼 수 있는
// 한계까지만 값을 표현하고 나머지는 버립니다. 
// 따라서 287346502836570928366은 정밀도 한계를 넘어가므로 결과는 287346502836570900000이 됩니다.
//라는 이유를 알게 되었다, 해결방안으로는 BigInt 함수를 사용하는것이 있었다.
function solution(a, b) {
    var answer = BigInt(a) + BigInt(b);
    
    return answer.toString();
} 