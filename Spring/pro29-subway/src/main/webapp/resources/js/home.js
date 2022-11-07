$(function(){
	bind();
})

function bind(){
	$("#btn").off("click").on("click", fnBtnClick);
}

function fnBtnClick(){
	let station = $("#station").val();
	let url = 
	url += station;
	
	$.ajax({
		url: url
		,success: function(data){
			let list = data.realtimeArrivalList;
			
			$("#info").empty();
			for(item of list){
				html = "";
	            html += "<div class='train_info'>";
	            html += "도착지방면 : "+ item.trainLineNm +"<br>";
	            html += "열차도착예정시간 : "+ item.barvlDt +"<br>";
	            html += "첫번째도착메세지 : "+ item.arvlMsg2 +"<br>";
	            html += "두번째도착메세지 : "+ item.arvlMsg3 +"<br>";
	            html += "</div>";
	            
				$("#info").append(html);
			}
			
			saveInfo(list);
		}
	});
}

function saveInfo(data){
   let url = "/subway/api/subway";
   
   $.ajax({
      url: url
      ,type: "POST"
      ,contentType: "application/json"
      ,data: JSON.stringify(data)
      ,success: function(data, a, resp){
         console.log(data);
      }
   });
}