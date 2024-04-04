//프로그래머스 3진법 뒤집기
function solution(n) {
    var answer = 0;
    //Number 프로토타입의 toString(진수)함수를 이용하여 몇진수인지 전달하면 간단하게 변경가능.
    let after = n.toString(3) +'';
    //reverse()를 쓰기위해서는 String타입을 Array로 바꿔야하고 다시한번 그거를 join('')으로
    //합치며 parseInt(Str,Str이 어떤진수값인지)를 사용해서 바꿔야한다.
    return parseInt([...after].reverse().join(''),3);
}

//toString()과 parseInt()의 또다른 사용법에 대해 알게되었다.
//toString()은 Number.prototype.toString 으로 인자로 몇 진수 값으로 변경할건지를 전달해주면 해당 진수의 수로 변경해주는 기능을 한다.
//parseInt()는 여태껏 숫자로 이루어진 문자열을 정수로 변환하는데에만 사용했지만, 두번째 인자로 전달된 첫 인자의 값이
//몇진수의 수인지를 전달해주면 그거를 10진수의 값으로 변경해주는 기능도 있다고 한다. 