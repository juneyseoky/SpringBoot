$(function () {
	$("#goSubMain").click(function(){
		location.href = "/sub/SubMain.html";
	});
	
	$("#goMain").click(function(){
		location.href = "/";
	});
	
	if($("span#goMain").attr("id") == "goMain"){
		$("figure").prepend("<img src='/images/springBootLogo.png' alt='스프링로고'>");		
	}else {
		$("figure").prepend("<img src='/images/springLogo.png' alt='스프링부트로고'>");		
	}
	


});