$(()=>{
	$("td").click(function(){
		let num = $(this).attr("id");
		if(num != null){
			let chk = confirm("삭제할꺼닝?")
			if(chk){
				location.href = "/boarDelete?num="+num;				
			}else{
				alert("취소했냥?");
			}
		}
	})
});