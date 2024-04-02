//프로그래머스 핸드폰 번호 가리기
function solution(phone_number) {
    var answer = '';
    let star_leng = phone_number.length-4;
    for(let i=0; i<star_leng; i++){
        answer+='*';
    }
    answer+=phone_number.slice(star_leng);
    
    return answer;
}

//마지막 4개의 번호만 제외하고 *로 바꾸면 되기때문에, slice를 사용한 풀이가 많았지만, repeat을 사용해서 전체길이의 -4만큼
//*를 채우는 코드가 눈에띄고 깔끔했다
function hide_numbers(s){
    var result = "*".repeat(s.length - 4) + s.slice(-4);
    return result;
}