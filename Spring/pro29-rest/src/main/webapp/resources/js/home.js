window.onload = function(){
	getList();
}

function getList(){
	 let option = {
	 	url: "/test/emp",
	 	success: function(result){
	 		console.log(result);
	 		
	 		let data = result.list;
	 		$("#emp_tbody").empty();
	 		for(let i=0; i<data.length; i++){
	 			let html = "";
	 			html += "<tr>";
	 			html += "	<td>"+data[i].empno+"</td>";
	 			html += "	<td>"+data[i].ename+"</td>";
	 			html += "	<td>"+data[i].sal+"</td>";
	 			html += "	<td>"+data[i].job+"</td>";
	 			html += "	<td>"+data[i].mgr+"</td>";
	 			html += "</tr>";
	 			
	 			$("#emp_tbody").append(html);
	 		}
	 	}
	 }
	$.ajax(option);
}