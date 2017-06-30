$(function(){
	$("#mid").on("blur",function(){
		validateMid();
	});
	$("#password").on("blur",function(){
		validatePassword();
	});
	$("#loginForm").on("submit",function(){
		return validateMid() && validatePassword();
	})
})

function validateMid(){
	return validateEmpty("mid");
}
function validatePassword(){
	return validateEmpty("password");
}


function validateEmpty(eleId){
	if($("#" + eleId).val ==""){
		$("#" + eleId + "Div").attr("class","form-group has-error");
		$("#" + eleId + "Span").html("<span class='text-danger'>该字段不能为空</span>");
		return false;
	} else{
		$("#" + eleId + "Div").attr("class","form-group has-success");
		$("#" + eleId + "Span").html("<span class='text-success'>该字段合法</span>");
		return true;
	}
}

