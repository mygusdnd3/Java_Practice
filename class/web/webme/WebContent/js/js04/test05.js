/*var jiwoo ={
	name: '이지우',
	age: 26,
	score: [85,90,70],
	gender: '남자',
	work: function(){
		return this.name + ' 씨가 열씸히 공부합니다';
	},
	total2: function(){
		var jumsu;
		jumsu+=score.forEach()
		return jumsu;
		}
	

	
}
*/

var jiwoo = new Object();
jiwoo.name ='이지우';
jiwoo.age= 26,
jiwoo.score= [85,90,70],
jiwoo.gender= '남자',
jiwoo.work= function(){
		return this.name + ' 씨가 열씸히 공부합니다';
	}
jiwoo.total = function(){
	
	var total = 0;
	jiwoo.score.forEach(function(value){
		total += value;
	})
	return total;
}
jiwoo.plus = function(){
	jiwoo.score.map(function(value){
		return value+10;
	})
}
/*
var total = 0;
function getTotal(value){
	total += value;
	console.log(value);
	
}*/
/*jiwoo.score.forEach(getTotal);

jiwoo.total = total;*/

/*document.write('<div class="w3-center"');
document.write('이름 : ' +jiwoo.name+'<br>');
document.write('나이 : ' +jiwoo['age']+'<br>');
document.write('성별 : ' +jiwoo.gender+'<br>');
document.write('점수 : ' +jiwoo.score+'<br>');
//document.write('점수2 : ' +jiwoo+'<br>');
var total = 0;
function getTotal(value){
	total += value;
	console.log(value);
}
jiwoo.score.forEach(getTotal);
document.write('총점 : ' +total+'<br>');
document.write(jiwoo.work+'<br>');
document.write('</div>');;*/

function func01(){

document.getElementById('name').innerHTML = jiwoo.name;
document.getElementById('age').innerText = jiwoo['age'];
document.getElementById('gen').innerText = jiwoo['gender'];
document.getElementById('score').innerHTML = jiwoo.score;
document.getElementById('work').innerHTML = jiwoo.work();
document.getElementById('total').innerHTML = jiwoo.total();
document.getElementById('score2').innerHTML = jiwoo.plus();

}