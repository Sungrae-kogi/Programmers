//프로그래머스 2016년
function solution(a, b) {
    var answer = '2016-';
    const weekday = ['SUN','MON','TUE','WED','THU','FRI','SAT'];
    
    answer += a+'-'+b;
    let day = new Date(answer);
    console.log(day);
    return weekday[day.getDay()];
}

//Date() 내장객체 활용에 대해
//weekday를 상수로 설정해서 이용하는건 자주있는사례, 이 문제의 경우 많은사람들이 각 월별로 요일이 몇일까지있나 역시도 상수로 선언하는데
//나는 그거까지는 생각하고싶지않았다.
//따라서 Date() 내장객체 활용방법에 대해서 한번 정리해본다
//중요부분 -> 선언할때 new Date('xxxx-xx-xx') 이렇게 선언할 경우 월 부분을 그냥 숫자로 선언하면 된다,
//하지만, new Date(xxxx, xx, xx) 이렇게 선언할 경우는 월 부분이 0부터시작한다고 한다, 따라서
//a월 b일을 선언하려면 new Date(xxxx, a-1, b) 이렇게 선언해야하는 차이가있다.
//그리고 생성된 Date객체에서 b일을 가져오는 메서드 getDate(), 요일에 대한 idx를 가져오는 getDay() 메서드
//여기에서는 getDay() 메서드가 유용했다, 미리 sun~sat에 대한 상수배열을 선언해놓고 getDay()로 리턴되는 idx값을 이용해 해당되는 요일값을 리턴.