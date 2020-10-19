stdName = '이지우';
jsScore = 60;
/*
var stdName; // 변수 재선언
var jsScore; // 변수 재선언
	변수 호이스팅됨 자바스크립트가 위로 끌어올림
*/
document.write('<div class="w3-content w3-center" style="max-width: 500px">')
document.write('<h1 class="w3-amber w3-card-4 w3-padding">')
document.write('학생이름 : ' + stdName);
document.write('<br>');
document.write('과목점수 : ' + jsScore);
document.write('</h1></div>')