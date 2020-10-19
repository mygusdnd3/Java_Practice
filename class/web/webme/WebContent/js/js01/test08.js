document.getElementById('test').innerHTML = '여기는 #test 태그';

document.getElementsByClassName('test')[0].innerHTML = '.여기는 .test 태그';
document.getElementsByClassName('test')[2].innerHTML = '.여기는 .test 세번째 태그';
document.getElementsByName('test')[0].innerHTML = '여기는 name이 test인 태그';


/*document.querySelectorAll('p.t3')[0].innerHTML = 'ttttt';*/

document.querySelectorAll('p.t3')[0].innerText = '<strong>여기는 p.t3 태그</strong>';
document.getElementsByName('id')[0].value = 'jiwoo';

var txt = document.getElementById('title').innerHTML;
//alert('innerHTML : ' + txt);

txt = document.getElementById('title').innerText;

//alert('innerText : ' + txt);
txt = document.getElementById('title').textContent;

//alert('textContent : ' + txt);

document.getElementById('btn').onclick = function(){
	var sid = document.getElementById('id').value;
	document.getElementById('jiwoo').innerText = sid;
}