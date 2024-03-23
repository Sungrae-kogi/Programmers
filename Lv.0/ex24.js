//프로그래머스 배열의 길이를 2의 거듭제곱으로 만들기
function solution(arr) {
    //deep copy
    var answer = [...arr];
    let arr_length = answer.length;
    let count = 0;
    while(true){
        // 2**0도 2의 정수 거듭제곱으로 생각해야했다.
        if(arr_length ===1){
            return answer;
        }
        //arr_length = arr_length / 2;
        arr_length = Math.floor(arr_length/2);
        count++;
        if(arr_length <= 1){
            break;
        }
    }
    
    if(answer.length - 2**count === 0)
        return answer;
    
    
    for(let i=0; i<2**(count+1) - arr.length; i++){
        answer.push(0);
    }
    return answer;
}
//더럽게 풀었다고 생각한다, 풀기는했지만 이건 풀었다고 생각하지않는다, 우선 배열의 길이가 2의 몇count 제곱보다 크거나 같은지
//파악하고싶었다, 따라서 while문을 이용해 배열의 길이를 2로 나눈 몫이 1 이하가될때까지(더이상 나눌필요가없어질때까지) 반복시켰고
//배열의 길이의범위 2**count <= arr_length < 2**(count+1) 을 구해냈고 여기에서 배열의 길이가 2**count와 일치하는경우와
//일치하지 않는 경우 두 경우를 나눠서 처리해준 후 리턴시켜 답을얻었다.
//그 과정에서 2를 나눠 몫을 얻어내는경우 Math.floor()를 이용하지않으면 if(arr_length <=1)부분에서 arr_length의 값이 3/2 = 1.5로 들어가
//조건부를 충족하지못해 count가 한 번 더 돌게되는 case를 발견하여 처리하면서 Math.floor() 및 몫,나머지값 처리에 대한 생각을 하게되었고.
//테스트케이스 22번만이 오답으로 나오는 경우를 보며 계속해서 디버깅을했지만, 틀린 부분을 발견하지못해 구글링으로 테스트케이스 22번에 대해
//조사를해보았고 2**0도 정수의 거듭제곱으로 포함된다는것을 알게되어 예외처리를 따로 해주어서 처리해냈다.
//굉장히 불만족스러운코드이지만 직접 해결방안을 생각해보고 그 과정에서 어쨌건 정답도처리되고 알게된것도 있으니 좋게 생각이된다.
const solution = (arr) => {
    let num = 1;
    while (arr.length > num){
        num *= 2;
    } 
    while(arr.length !== num){
        arr.push(0)
    }
    return arr;
}
//많은 숏코딩들과 풀어쓴 코드가있지만 제일 직관적이고 납득이 쉬운 코드예시를 가져왔다.
//자연스럽게 배열의길이가 1인경우 두 while문을 프리패스하고 리턴되며, arr.length보다 처음으로 긴 2의 거듭제곱을 첫 while문에서
//num값으로 받게되고, 두번째 while문에서 num과 arr.length의 차이만큼 배열에 0을 받게되며 간단하게 끝나버렸다.
//나의 코드는 배열의 길이보다 작은 2의 거듭제곱을 구하려고 먼저 시도하다가 예외처리등의 문제를 맞닥뜨리며 코드가 지저분해졌다고
//이 코드를보며 생각이들었다. 아예 배열의길이가 0과 1인경우를 시작부터 처리해버리고 그다음에 2의 제곱을 따지며 처음으로
//배열의 길이를 넘는 2의 거듭제곱을 찾는코드를 짰다면 비슷한 결과를 얻었을거같다.