var kdata = [
	'서울','부산','대구','대전','인천','광주','울산','제주','세종'
/* 	  0		1	  2    3     4     5     6     7    8	
	 -9		-8	  -7   -6   -5    -4    -3    -2   -1
*/
];

kdata.sort();
for(var i = 0; i <kdata.length; i++){
	document.write(kdata[i] + ' ');
}
document.write('<hr>');
var str1 = kdata.slice(0,4);
var str2 = kdata.slice(2,-1);
var str3 = kdata.slice(-4,-2);

document.write('전체배열   :'+ kdata+'<br>');
document.write('전체배열   :'+ '1	2	3	4	5	6	7	8	9'+'<br>');
document.write('부분배열1 : '+ str1+'<br>');
document.write('부분배열2 : '+ str2+'<br>');
document.write('부분배열3 : '+ str3+'<br>');
document.write('<hr>');

document.write('kdata 배열   :'+ kdata+'<br>');
var str1 = kdata.splice(1,2);
document.write('삭제     데이터 :' + str1+ '<br>');
document.write('kdata 배열   :'+ kdata+'<br>');

var str2 = kdata.splice(1,3,'강릉','수원');
document.write('삭제   데이터2 :' + str2+ '<br>');
document.write('kdata 배열2 :'+ kdata+'<br>');

var str3 = kdata.splice(2,Number.MAX_VALUE);
document.write('삭제   데이터3 :' + str3+ '<br>');
document.write('kdata 배열3 :'+ kdata+'<br>');
document.write('<hr>');



var kdata = [
	'서울','부산','대구','대전','인천'

];
/*,'광주','울산','제주','세종'*/
document.write('배열 데이터 : '+kdata+'<br>');
var len = kdata.push('광주','제주');
document.write('배열 길이   : '+len+'<br>');
document.write('배열 데이터 : '+kdata+'<br>');


var str = kdata.pop();
document.write('삭제된데이터   : '+str+'<br>');
document.write('배열 데이터 : '+kdata);

document.write('<hr>');


var kdata = [
	'서울','부산'
];
var len = kdata.unshift('대구','대전'); //첫번째 인덱스에 데이터를 추가

document.write('배열 길이  : '+len+'<br>');
document.write('배열 데이터 : '+kdata+'<br>');

var str = kdata.shift();
document.write('삭제 데이터 : '+str+'<br>');
document.write('배열 데이터 : '+kdata+'<br>');






