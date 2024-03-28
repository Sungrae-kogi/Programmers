//프로그래머스 커피 심부름
function solution(order) {
    var answer = 0;
    let count = 0;
    for(let i=0; i<order.length; i++){
        switch (order[i]) {
        case "iceamericano":
        case "americanoice":
        case "hotamericano":
        case "americanohot":
        case "americano":
        case "anything":
            count += 4500;
            break;
        case "icecafelatte":
        case "cafelatteice":
        case "hotcafelatte":
        case "cafelattehot":
        case "cafelatte":
            count += 5000;
            break;
    }
    }
    return count;
}
//단순하게 case들을 때려넣어서 푼것이라 다른풀이를 찾아보았다.
function solution(order) {
    return order.reduce((acc, cur) => {
      if (cur.includes("americano")) {
        return acc + 4500;
      } else if (cur.includes("cafelatte")) {
        return acc + 5000;
      } else {
        return acc + 4500;
      }
    }, 0);
  }
  