/*var arr = new Array();

for(var i = 0; i < 100; i++){
	arr[i] = i+1;
}
/*for(var i = 0 ; i < 100; i++){
	document.write(arr[i] + ', ');
		
}
*/
for(var i = 0 ; i < 100; i++){
	
	if(i%2){
		arr[i] = i+1;
		
	} else {
		arr[i] = 0;
		
	}
}

for(var i = 0; i<100; i++){
	if(i %10 == 0){
		document.write(arr[i]+',');
		document.write('<br>');
	} else{
		document.write(arr[i]+',');
	}
	
}
*/

document.write('<hr>');

var arr = ['이지우','장성환','오혜찬'];

var str = arr.join();
var str2 = arr.join('/');


document.write('str : ' + str);
document.write('<br>');
document.write('str2 : ' + str2);
document.write('<hr>');

var stud = ['윤요셉', '유병욱'];

arr = arr.concat(stud);

document.write('concat : ' + arr.join('-'));
document.write('<br>');
document.write('concat : ' + arr.concat('박진우','김영선').join('*'));

arrconcat= arr.concat('박진우','김영선');
document.write('<br>');

for(var i = 0 ; i < arrconcat.length; i++){
	document.write(arrconcat[i] + '<br>');
}
document.write('<hr>');
arrconcat.sort();

for(var i = 0 ; i < arrconcat.length; i++){
	document.write(arrconcat[i] + '<br>');
}

arrconcat.reverse();

for(var i = 0 ; i < arrconcat.length; i++){
	document.write(arrconcat[i] + '<br>');
}

