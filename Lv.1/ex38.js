//프로그래머스 직사각형 별찍기
process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    const a = Number(n[0]), b = Number(n[1]);
    for(let i=0; i<b; i++){
        console.log('*'.repeat(a));
    }
});

//repeat 함수에 대해 떠올려서 문제없이 해결했으나, javascript 코딩테스트에서 표준입력을 받는 경우의 코드를 확인하는건 처음이다.
//해석해보면, 프로세스의 표준입력 인코딩을 utf8로 지정하고 사용자가 표준 입력을 할때마다 해당 데이터를 이벤트핸들러 함수의 매개변수로 전달한다.
//5 3 을 입력했다면 data 에는 '5 3'이 입력되있을것이다.
