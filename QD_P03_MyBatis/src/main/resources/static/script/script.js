$(() => {
	let path = location.pathname;
	const fileName = path.substring(path.lastIndexOf('/') + 1);
	if (fileName == "list") {
		$("span#headerName").text("상품 목록");
	} else if (fileName == "reg") {
		$("span#headerName").text("상품 등록");
	}
	$("input#all").on("click",function(){
		let checkVal =  $(this).prop("checked");

		if(checkVal){
			$("input[name=num]").prop("checked", true);
		}else{
			$("input[name=num]").prop("checked", false);
		}
	})
	

	$("#goList").click(function() {
		location.href = "/list";
	});
	$("#goRegst").click(function() {
		location.href = "/reg";
	});
	$("#searchBtn").click(function() {
		let searchKey = $("#searchKey").val();
		location.href = "/search?searchKeyword=" + searchKey;
	});
	$("#selectDel").click(function() {
		let checked = $("input[name=num]:checked")
		.map(function() {
			return $(this).val();
		})
		.get();
		if (checked.length == 0) {
			alert("삭제할 항목을 선택해라");
		}
		let deleteChk = confirm(checked.length+"개를 삭제할꺼냥?");
		if(deleteChk){
			
		$.ajax({
			url: '/delete',
			method: 'get',
			contentType: 'application/json',
			data: {
				nums: checked,
				},
				success: function(res) {
					alert('삭제 되었습니다.');
					location.href = "/list";
				},
				error: function() {
					alert('삭제 중 오류가 발생했습니다.');
				}
			});
		}
	});
})