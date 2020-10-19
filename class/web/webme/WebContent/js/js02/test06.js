document.getElementById('reset').onclick = function(){

var list = document.getElementsByName('t01');

var arr = document.getElementsByName('t01');

for(var i=0; i<arr.length;i++){
	//alert(arr[i].value);
	document.getElementsByName('t01')[i].value='';
}

}

console.log(list);

document.getElementById('read').onclick = function(){
	var id = document.getElementById('id').value;
	var pw = document.getElementById('pw').value;
	var name = document.getElementById('name').value;
	alert(id);
	document.getElementById('sid').innerText=''+sid;
	document.getElementById('spw').value=spw;
	document.getElementById('sname').value=sname;
}

/*for(var i = 0; i<list; i++){
	document.getElementsByName('t01').[i].value='';
}

};*/
var list = document.getElementsByClassName('btn');

for(var i = 0 ; i < list.length; i++){
	list[i].onclick = function(){
		var txt = this.innerText;
		//alert(txt)
		
//		var tid = this.getAttribute('class'); //this는 눌러진버튼
		var tid = this.getAttribute('id'); //this는 눌러진버튼
		alert(tid);
	}
}