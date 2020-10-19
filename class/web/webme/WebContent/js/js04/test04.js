//var kdata = new Array('서울','대구','대전','부산');

/*
var kdata = ['서울','대구','대전','부산'];

function printArr(item, index){ //매개변수 수대
	document.write('배열데이터 [ '+ index + ']: '+item+'<br>');
}/*
function printArr(index, item){ /
	document.write('배열데이터 [ '+ index + ']: '+item+'<br');
}*/
/*
printArr('부산',3);
document.write('<hr>');

function printArr2(value){ //000매개변수 하나
	document.write('배열데이터  :'+value+'<br>');
	
}

/*printArr2('대전');*/
/*
printArr('서울',0);
document.write('<hr>');
kdata.forEach(printArr);


//-------------------------------------------

	/*
		kdata 배열의 데이터를 / 로 구분자로 문자열로 연결해서 출력하는데
			forEach()를 사용해서 무자열을 하나씩 결합해서 처리하세요
			
	*/
	
document.write('------------------<hr>');
/*
var str =[];
for(var i = 0; i <kdata.length; i++){
str[i] = kdata.forEach(printArr2);
document.write(str[i].join('/'));	
}
*/
// 문자열 전역변수를 만든다.
var sdata = '';

//문자열 누적 함수를 만든다.
function calcStr(item, index){
	if(index == 0){
		sdata += item;
	} else{
		sdata += '/' +item;
	}
}
/*kdata.forEach(calcStr);*/

document.write(sdata);
 
document.write('<hr>');

var data= new Array(1,2,3,4,5,6,7,8,9,10);

function mapArr(value){
	return value * value;
}

var mapdata = data.map(mapArr);

document.write('원래 배열 : '+data+'<br>');
document.write('map 함수 적용 배열'+mapdata+'<br>');

document.write('<hr>');
/*필터함수*/
var data=[21,42,33,23,55,21,24,93];

function filterArr(value){
	return value >=30;
}

function mapArr2(value){
	return value +2;
}
var newData = data.filter(filterArr);
document.write(newData);

document.write('<br>');
var newData2 = data.filter(mapArr2);

document.write(newData2);


var data = [1,1,1,1,1,1,1];

var idx = data.indexOf(1);

document.write('data[] : '+data+'<br>');
document.write('data.indexOf(1) : '+idx+'<br>');

lidx = data.lastIndexOf(1,-2);
document.write('data.indexOf(1,-2) : '+lidx+'<br>');



var arr = new Array(1,2,3,4,5,6,7);

var mapArr = function(inArr, callback) {
	var myArr = [];
		for (var i = 0; i < inArr.length; i++) {
			myArr.push(callback(inArr[i]));	
		}
	//retrun myArr;
}
var mapthis = function(value) {
	return value + 1;
}

var newData = mapArr(arr, mapthis);

console.log(newData);

/*### 연관배열 ###*/
var smap = {'일번':'윤요셉','이번':'유병욱','삼번':'오혜찬','사번':'홍길동'};
document.write('일번 : ' + smap['일번']+'<br>');
document.write('일번 : ' + smap['이번']+'<br>');
document.write('삼번 : '+smap.삼번+'<br>');



var mArr={'score':[85,85,98,], 'no':1000,'name':'jiwoo'};

document.write('번호:' + mArr['no']+'<br>');
document.write('이름 :' + mArr.name+'<br>');
document.write('성적 :' + mArr.score+'<br>');

var total = 0;

function getTotal(score){
	total+=score;
}

mArr.score.forEach(getTotal);
document.write('총점 : '+ total +'<br>');
