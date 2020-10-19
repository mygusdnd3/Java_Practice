var globValue1;
globValue2 = 111;		//전역변수 선언

function func01(){
	var locValue; // 지역변수 선언
	globValue = 999; // 전역변수 초기화
	/*
		함수 내부에서 var 키워드를 생략하고 변수를 만들게 되면
		이때 그 변수는 전역변수가 된다.
		
	*/
	locValue = 10;
}

/*alert('globValue1 : ' + globValue);*/

func01();

alert('globValue2 : ' + globValue);
alert('globValue2 : ' + locValue);