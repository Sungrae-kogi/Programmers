//모의고사
import java.util.ArrayList;
import java.util.List;

//배열의 내용물이 반복될때 (index % 배열의길이) 를 이용하여 배열의 값을 반복적으로 순회하며 사용할 수 있는 방법을 사용했다.
//다만, 풀이 과정에서 생각의 흐름에 따라 적다보니 변수의 선언과, if문의 사용이 조잡하게되었다. 
public class ex45 {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        int one_score = 0;
        int two_score = 0;
        int three_score = 0;
        for(int i=0; i<answers.length; i++){
            if(answers[i] == one[i%one.length]){
                one_score++;
            }
            if(answers[i] == two[i%two.length]){
                two_score++;
            }
            if(answers[i] == three[i%three.length]){
                three_score++;
            }
        }
        
        int max = Math.max(one_score, Math.max(two_score,three_score));
        if(max == one_score){
            answer.add(1);
        }
        if(max == two_score){
            answer.add(2);
        }
        if(max == three_score){
            answer.add(3);
        }
        
        return answer;
    }
}

//좋아요 많은 다른 코드,
//나의 코드와 굉장히 유사했다,  댓글을 보니 가독성이 좋다는 말이 많았는데 느끼는바가 크다, 나는 나의 코드를보며 조잡하다 생각했지만.
//어떻게 보면 다른사람이 보고 이해하기에는 좋은 코드가 아니었나 생각이 든다. stream()의 사용에 대해서는 자주보이지만,
//내가 자바를 처음 배우던 시절에는 보이지 않았기때문에, 우선은 제외하고 풀어보며, 추후에 따로 학습하도록 하자.
public int[] solution(int[] answer) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int[] score = new int[3];
    for(int i=0; i<answer.length; i++) {
        if(answer[i] == a[i%a.length]) {score[0]++;}
        if(answer[i] == b[i%b.length]) {score[1]++;}
        if(answer[i] == c[i%c.length]) {score[2]++;}
    }
    int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
    ArrayList<Integer> list = new ArrayList<>();
    if(maxScore == score[0]) {list.add(1);}
    if(maxScore == score[1]) {list.add(2);}
    if(maxScore == score[2]) {list.add(3);}
    return list.stream().mapToInt(i->i.intValue()).toArray();
}