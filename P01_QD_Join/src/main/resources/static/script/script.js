$(function () {
	$("input").blur(function(){
		let val = $(this).val().trim();
		if(val == ""){
			$(this).attr("placeholder","비어있습니다.");
			$(this).focus();
		}
	})
});