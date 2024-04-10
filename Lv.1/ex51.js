//프로그래머스 [1차] 비밀지도 카카오 블라인드채용 코딩테스트
function solution(n, arr1, arr2) {
    var answer = [];
    for(let i=0; i<n; i++){
        let str = '';
        let arr1_str = arr1[i].toString(2).length === n? arr1[i].toString(2): arr1[i].toString(2).padStart(n,'0');
        let arr2_str = arr2[i].toString(2).length === n? arr2[i].toString(2): arr2[i].toString(2).padStart(n,'0');
        //.padStart(자리수, 채울문자) 함수 
        // if(arr1_str.length<n)
        //     arr1_str = arr1_str.padStart(n,'0');
        // if(arr2_str.length<n)
        //     arr2_str = arr2_str.padStart(n,'0');
        for(let j=0; j<n; j++){
            if(arr1_str[j] === '1' || arr2_str[j] === '1'){
                str += '#';
            }else if(arr1_str[j]==='0' && arr2_str[j] === '0'){
                str += ' ';
            }
        }
        answer.push(str);
    }
    return answer;
}

//대기업 코딩테스트나 부트캠프 코딩테스트에서 복잡한 알고리즘보다 주로 구현문제가 나온다고하는데 이런느낌이라고 생각하면 되겠다.
//padStart()함수를 알고있으면 코드가 쉬워진다
//대상 '문자열'.padStart(자릿수, 채울문자) 의 구성으로 문자열이 4자리수이고 자릿수가 5라면 채울문자 1개를 문자열의 앞에 붙여서 리턴
//