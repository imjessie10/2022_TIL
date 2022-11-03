#주석은 샾하나

from flask import Flask

#선언하는 변수 앞 자료형이 없음, 세미콜론 붙여도 안붙여도 그만
#a = 10;
#a = 'a'

#자료형 : 리스트, 튜플, 딕셔너리, 집합, 불
# 리스트
# 우리가 아는 자바의배열을 리스트라고 함
# 배열의 인덱스를 쓰는데 특이한 점이 마이너스인덱스를 쓸수있어서 뒤에서부터 알수있음
# 슬라이싱 : a[0:2] 0부터2번째 까지 앞에생략-첫번째부터, 뒤에생략-끝까지
# 파이썬에서는 더하기연산이 문자더하기문자 이런게 안됨
# 튜플
# 배열과 같지만 차이점이 소괄호, 한번 선언하면 final-즉, 수정불가
# 전달인자를 주고 받을 때 튜플을 많이 쓴다
# 딕셔너리
# JSON형식이라고 보면 됨 'key:value'

app = Flask(__name__)

#route가 requestMapping / function이 def
@app.route('/')
def home():
    return '<h1>Hello,</h1> World!'

#if문 
# 중괄호 대신 : 과 한 칸 들여쓰기
# 우리는 중괄호 열고닫고로 끝낼수 있었지만 아예 없으면 안되고 pass를 써줌
# 들여쓰기를 잘 맞춰 줘야함
# if a == 10 :
#   print('1');
#   print('1')
# elif a != 10 : 
#   pass
# else : 
#   pass
if __name__ == '__main__':
    app.run(debug=True)


#for문
# in이 있음, 향상된 포문만 지원해 준다
# 많이쓰는 range jstl에 begin,end와 비슷한 것