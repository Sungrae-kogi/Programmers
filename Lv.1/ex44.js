//프로그래머스 이상한 문자 만들기
function solution(s) {
    var answer = '';
    
    let word_arr = s.split(' ');
    //0 idx는 짝수번째로 처리
    //한 단어씩 꺼내서 answer에 +처리??
    for(let i=0; i<word_arr.length; i++){
        //String에서 인자함수를 전달해서 처리하는방식이 있었던거같은데 찾아보도록하자
        for(let j=0; j<word_arr[i].length; j++){
            if(j%2===0){
                answer += word_arr[i][j].toUpperCase();
            }else{
                answer += word_arr[i][j].toLowerCase();
            }
        }
        //하나끝나면 공백 추가인데 맨 마지막단어 뒤에는 공백을 추가하면안된다.
        if(word_arr.indexOf(word_arr[i]) !== word_arr.length-1)
            answer += ' ';
    }
    
    return answer;
}
//정확성검사에서 68로 틀린 케이스들이 나왔다, 기존에는 아예 실행조차 틀렸으나, 맨 마지막 단어의 뒤에는 공백을 추가해서는 안된다는것을
//알게되어서 조건문으로 맨 마지막단어를 판별한 경우 공백을 추가하지 않게끔 조정을 했었다.
//그리고 그 과정에서 indexOf를 사용하여 현재 진행중인 단어가 몇번째 idx인지를 확인했는데, 이 과정에서 문제가 발생했었다.
//indexOf는 배열에 중복된 값이 있을경우, 그중 가장 처음 등장하는 값의 idx를 반환해준다, 이 점에서 정확성검사가 틀렸다.
//['tre', 'ase', 'ase', 'ere'] 의 경우 indexOf('ase')의 값이 하나의 값만을 반환하기때문.
//따라서 맞게 수정한 코드는 다음과 같다.
function solution(s) {
    var answer = '';
    
    let word_arr = s.split(' ');
    //0 idx는 짝수번째로 처리
    //한 단어씩 꺼내서 answer에 +처리??
    for(let i=0; i<word_arr.length; i++){
        //String에서 인자함수를 전달해서 처리하는방식이 있었던거같은데 찾아보도록하자
        for(let j=0; j<word_arr[i].length; j++){
            if(j%2===0){
                answer += word_arr[i][j].toUpperCase();
            }else{
                answer += word_arr[i][j].toLowerCase();
            }
        }
        //하나끝나면 공백 추가인데 맨 마지막단어 뒤에는 공백을 추가하면안된다.
        //현재 진행중인 문자의 인덱스가 맨 마지막꺼가 아니라면 공백을 추가하고 맨 마지막꺼라면 공백을 추가하지않는다.
        if(i !== word_arr.length-1)
            answer += ' ';
    }
    return answer;
}