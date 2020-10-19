//칼라 클래스 변수
var color = [
	'w3-red',//0
	'w3-pink',//1
	'w3-purple',//2
	'w3-deep-purple',//3
	'w3-indigo',//4
	'w3-blue',//5
	'w3-aqua',//6
	'w3-teal'//7
	] //변수만들때 대괄호

document.write('<div class="w3-content w3-padding w3-center" style="max-width: 800px">');
document.write('	<h1 class="w3-deep-orange w3-padding"style="border:2px dotted green;">구 구 단</h1>');
document.write('	<div class="w3-col" style="border:4px dotted aqua;">'); //다른데로 칸이 벗어나지않게 틀을 잡아준다.
for(var k=0; k<8;k++){
document.write('		<div class="w3-quarter w3-padding" style="border:4px dotted red;">');
document.write('			<div class="w3-col w3-padding '+color[k]+'  txt"style="border: 3px solid lime;"><span id="'+(k+2)+'dan"></span>단</div>');
document.write('			<div class="w3-col padding"style="border:2px solid blue;">');
for(var i =0; i<9 ; i++){
document.write('				<div class="w3-col" id="'+(k+2)+(i+1)+'gap"></div>');
/*
	21gap
	22gap
	23gap
*/
}
/*document.write('				<div class="w3-col">2 x 2 = 4</div>');
document.write('				<div class="w3-col">2 x 3 = 6</div>');
document.write('				<div class="w3-col">2 x 4 = 8</div>');
document.write('				<div class="w3-col">2 x 5 = 10</div>');
document.write('				<div class="w3-col">2 x 6 = 12</div>');
document.write('				<div class="w3-col">2 x 7 = 14</div>');
document.write('				<div class="w3-col">2 x 8 = 16</div>');
document.write('				<div class="w3-col">2 x 9 = 18</div>');*/
document.write('			</div>');
document.write('		</div>');
}
document.write('	</div>');
document.write('</div>');

//-------------------------------------------------

for(var j=0; j<=7; j++){
	 
	document.getElementById((j+2)+'dan').innerText=j+2;	
	for(var l=0; l<9; l++){
		document.getElementById(''+(j+2)+(l+1)+'gap').innerText = (j+2)+'*'+(l+1)+'='+((j+2)*(l+1));
		//document write
		document.write('<div class="w3-container">Loop check : '+ l+'</div>');
		if(l==8){
			document.write('<br>Loop done--');
		}
	}
	
}
/*
for(var j=2; j<=9; j++){
	document.write(j);
	for(var l=1; l<=9; l++){
		document.getElementById(''+(j)+(l)+'gap').innerText = (j)+'*'+(l)+'='+((j)*(l));
		//document write
		document.write(l);
	}
	
}*/
