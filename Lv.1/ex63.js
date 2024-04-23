//프로그래머스 소수 만들기
function solution(nums) {
    var answer = 0;
    
    let sum = 0;
    for(let i=0; i<nums.length-2; i++){
        for(let j=i+1; j<nums.length-1; j++){
            for(let k = j+1; k<nums.length; k++){   //오타가 있던부분, k를 j로
                sum = nums[i]+nums[j]+nums[k];
                if(isPrime(sum))
                    answer++;
            }
        }
    }
    
    return answer;
}
function isPrime(n){
    if(n <= 1){
        return false;
    }
    for(let i=2; i<n; i++){
        if(n%i ===0)
            return false;
    }
    return true;
}
//주어진 배열 nums에서 3개를 골라 더한 값이 소수인 갯수를 리턴시키는문제로, 시간초과로 판별불가, 그렇지만
//이런류의 문제는 완전탐색밖에 없다는걸 알기에 내 답이 틀렸단거를 납득하질 못해 답을 찾아보았다.
//이제 보니까 isPrime함수를 선언하여 사용했지만 세 수를 더한 숫자 n을 인자로 주었기때문에 앞에 if(n<= 1)부분이 의미가 없다는게 느껴진다.
//따라서 굳이 함수를 사용하지 않아도 깔끔한 코드가 나왔을거라 생각된다.
function solution(nums) {
    var answer = 0, number=0;
    for(var i=0;i<nums.length-2;i++){
        for(var j=i+1;j<nums.length-1;j++){
            for(var l=j+1;l<nums.length;l++){
                number=nums[i]+nums[j]+nums[l];
                var count=0;
                for(var k=1;k<=number;k++){
                    if(number%k==0) count++;
                }
                if(count==2) answer++;
            }
        }
    }
    return answer;
}
//다른 답이라고하는데, 도대체 원인을 모르겠다
// -> 원인을찾았다. 8번줄 코드에서 k를 j로 쓰는 문제.