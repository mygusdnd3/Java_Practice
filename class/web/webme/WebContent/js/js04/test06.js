function Stud(name, age, gender, score){
	this.name = name,
	this.age = age,
	this.gender = gender,
	this.score = [],
	this.work = function(){
		return this.name + '씨가 열씸히 공부합니다.';
	}
	this.tototal = function(){
		var total=0;
		score.forEach(function(value){
			total+=value;
		})
		return total;
	}
}

var jiwoo = new Stud('이지우',26,'남자',[94,44,32]);
var sunhwan = new Stud('장성환',27,'남자',[43,65,54]);

jiwoo.total = function(){
	return 250;
}
Stud.prototype.total = function(){
	return 250;
}
Stud.prototype.score2=[];

jiwoo.score2=[100,80,34];
sunhwan.score2=[99,60,76];
Stud.prototype.total2 = function(){
	var tmp=0;
	this.score2.forEach(function(value){
		tmp+=value;
	})
	return tmp;
}

document.write('jiwoo name :' + jiwoo.name + '<br>');
document.write('jiwoo age :' + jiwoo.age + '<br>');
document.write('jiwoo gender :' + jiwoo['gender'] + '<br>');
document.write('jiwoo work :' + jiwoo.work() + '<br>');
document.write('jiwoo total :' + jiwoo.total() + '<br>');
document.write('jiwoo tototal :' + jiwoo.tototal() + '<br>');
document.write('jiwoo total2 :' + jiwoo.total2() + '<br>');

document.write('<hr>');

document.write('sunhwan name :' + sunhwan.name + '<br>');
document.write('sunhwan age :' + sunhwan.age + '<br>');
document.write('sunhwan gender :' + sunhwan['gender'] + '<br>');
document.write('sunhwan work :' + sunhwan.work() + '<br>');
document.write('sunhwan total :' + sunhwan.total() + '<br>');
document.write('sunhwan tototal :' + sunhwan.tototal() + '<br>');
document.write('sunhwan total2 :' + sunhwan.total2() + '<br>');