$(function () {
	$("input").on("focusin",function(){
		$(this).parent().css("border-color", "#2DB400");
	})
	$("input").on("focusout",function(){
		if($(this).val().trim() == ""){
			$(this).attr("placeholder","비어있습니다.");
			$(this).parent().css("border-color", "red");
		}else{		
			$(this).parent().css("border-color", "#aaa");
		}
	})

//	$("input").blur(function(){
//		let val = $(this).val().trim();
//		if(val == ""){
//			$(this).attr("placeholder","비어있습니다.");
//			$(this).focus();
//		}
//	})
});