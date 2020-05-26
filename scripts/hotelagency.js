function loadData() {
	var xmlhttp = new XMLHttpRequest();
	xmlhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			var myArr = JSON.parse(this.responseText);
			for(var obj in myArr){
				document.getElementById("rent"+myArr[obj].tariff_id+"").innerHTML = "$ " + myArr[obj].amount + ""
			}
			
		}
	};
	xmlhttp.open("GET", 'http://localhost:8080/demo/all', true);
	xmlhttp.send();
}