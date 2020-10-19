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
document.write('	<h1 class="w3-deep-orange w3-padding">구 구 단</h1>');
document.write('	<div class="w3-col w3-border ">'); //다른데로 칸이 벗어나지않게 틀을 잡아준다.
for(var k=0; k<8;k++){
document.write('		<div class="w3-quarter w3-padding w3-border">'); // 단을감싸는 칸보다 큰 칸나누기칸
document.write('			<div class="w3-col w3-padding '+color[k]+' w3-border txt">'+(k+2)+'단</div>');
document.write('			<div class="w3-col padding w3-border">'); //단을 감싸는 칸
for(var i =0; i<9 ; i++){
document.write('				<div class="w3-col">'+(k+2)+' x '+(i+1)+' = '+((k+2)*(i+1))+'</div>');
1
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

