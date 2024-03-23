//프로그래머스 문자열 묶기
function solution(strArr) {
    var answer = 0;
    //문자열의 길이를 담을 객체
    let str_length = {};
    for(let i=0; i<strArr.length; i++){
        let key = strArr[i].length;
        if(str_length[key] === undefined){
            str_length[key] = 1;
            continue;
        }
        str_length[key] +=1;
    }
    
    return Math.max(...Object.values(str_length));
}

//딱 보고 객체를 사용해야 한다고 떠올랐다는 점에서 나에게 좋은평가를 주고싶다, 
//각 문자열들의 길이를 key값으로 삼아 객체에 대입하는데 값이 없는 undefined 상태라면 1을 기본값으로, 그 외에는 +1씩 해주었고.
//바로 그중 가장 큰값을 리턴시키면되지만 깔끔하게 할 방법이 떠오르지않아 어차피 그거 구하는방법을 틀릴리가없으니 구글링으로 
//방법을 검색했고 Object 객체의 values 메서드에 대해 배우게되었다. 아래는 ChatGPT 내용
//Object.values()는 주어진 객체의 열거 가능한 속성 값들로 이루어진 배열을 반환하는 메서드입니다. 즉, 객체의 값들을 배열로 변환해줍니다.
//key-values 쌍의 객체에서 values값들을 배열로 반환해준다~ 이거를 ... 전개연산자로 분해해 Max값을 구하는 코드를 알게되었다.